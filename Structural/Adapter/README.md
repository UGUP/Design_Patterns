Adapter Design Pattern 

An intermediate layer that transforms one form to another.Adapter 
Api ensures codebase remains maintainable when talking to the third party apis.


Problem Statement : 
1) I want to change third Party provider 
2) The third party we are using might get out of maintenance.
3) If your code base has tight coupling with third party application .
   This can effect maintainability.

Solution 
Whenever you are connecting with a third party api never connect directly
always use an interface 


Steps
1) Create an interface implementing the functions 
   your application needs.
2) Create adapter classes implementing those interfaces
3) Now these adapter classes will talk to the third party libraries.
