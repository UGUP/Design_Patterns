When to use Builder design Pattern
1) Whenever a class has too many attributes.
2) If there are many validations that needs to be done before creation of the object.

Issues
1) The Client code becomes difficult to read.
2) Possibility of bugs.

Possible Solutions
1) Do Validations inn setter methods
   Problem with the solution:
   1.1) Some Classes might not have setter methods
   1.2) Setter methods are called only after object creation and will not work if we want to do validations before
   creating object
   1.3) Client might not know to call setter methods to do teh validations.
   1.4) What if objects are immutable.
2) Do Validations in a Constructor
   Problems with this approach
   2.1)Too many attributes are prone to error.
   2.3) Difficult to understand the code.
   2.4)What if Client sets a lot of attributes to null
   2.5)Constructor overloading might not be possible.
   2.6) Difficult to constructor overloading for different combinations of parameters.
   2.7) It will lead to the issue of Telescoping Constructors.
3) Pass Object as a parameter
   Problems with this approach
   3.1) Type safety is the biggest problem with this approach.
   3.2) Converting compile time issue to run time issues which are much costlier.

Final Solution to all the mentioned problems is to use Builder design Pattern
Steps to implement Builder Design Pattern
1) You create a Helper class normally a builder class.
2) This helper class is tighly coupled with your main class and becomes the inner static class containing all teh attributes of the class.
3) Now this class will have a builder method that will return the object of the main class
4) Main class constructor will be expecting the builder class object in its constructor and will have a method to get teh object of builder class.
5) Refer the code to understand better.


Uses
1) While calling an api and setting parameters for an api
2) Query builders 
3) Configuration classes.
4) Making student class immutable advantage--
-- use case to be implemented 
 lombok builder library @Builder its done automatically 

