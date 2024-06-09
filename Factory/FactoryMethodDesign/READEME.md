Factory Design patterns are of three Types

1) Factory Method 
2) Abstract Factory 
3) Practical Factory 

Factory Method: Create new object of a corresponding class based on something.

Factory Method says when we have a use case of 1 object we might
have to create an associated object. 

Problem Statement: From one object I need to get the corresponding object of 
another class.


Say For example UserService(Database db){
// Here simply you will call db.createQuery();
}

Mysql implements Query{

public Mysql createQuery(){
  return new Mysql();
}

}