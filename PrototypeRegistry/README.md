When to use Prototype Registry Design Pattern

We already have the object of the class, and we want to create the copy of that object.

Possible solutions 
1) We can create a new Object and then manually copy all teh attributes
   Issues with the approach
   1.1) There is a chance of incorrect copy of the attributes which can introduce a bug.
   1.2) I in future a new attribute is being introduced in teh class then we have to change where we are copying it also.

2) Create a copy Constructor in the class 
   Issues with teh approach are:- 
   2.1) If say there is a class called Student and you have another class called Intelligent student extending that class
        in that case we can write teh code as Student s= new Intelligent Student.
        so either teh client is expecting teh copy of intelligent student so in this case ww will always return 
        Student object which is wrong.
        2.2) You check which type of object it is using if else and return the object but this will violate SRP and OCP principle

3) So ideally we need a solution where the object itself returns us the copy of itself therefore implies a clone() method.
   So we can create a clone method in Student Class 
   Issue with this approach is:
   3.1) So in this case if Intelligent class object is created it will always give object of student class 

4) The above problem implies we have to implement Clone method in child class always 
   So we create a clone method in child class 
   Issue with this approach:-
   4.1) If we create a clone method in child class it will look something like this 
       IntelligentStudent clone(){ 
       now how to set the attributes of student class in this method ??? They are private and we cannot access private attributes 
       }
5) This implies we need to implement copy constructor in child class also which will call teh copy constructor of Parent class.
   public IntelligentStudent(IntelligentStudent instance){
          super(instance);
         this.psp= instance.psp;
   }

The above explains how the protoptype design Pattern works 

Registry Design Pattern 

This design pattern is used when you want to store the object and keep creating the clone or return ing the same object again and again.
For example in a lot of apis say you want to set the URL , set the query parameters again and again 
you can store it in a registry to either retrieve them directly or retrieve teh clone of that object. for example in springboot we have 
Springboot application context.

How to implement Registry 

1) Create a Hashmap<String,Object> string to store the name of the object and give the class whose object you want to store.
2) It will have two methods one to register which is map.out("name of object",IntelligentStudent);
3) It will have another method to get the object which is map.get(name).clone();===>>> map.get(IntelligentStudent) will return object of IntelligentStudent 
   and this way you can clone teh object of it using clone method present in Intelligent Student.
4) The clone method should be implemented to get the clone from teh registry.

Use case
1) used heavily in JUNITS for testing 