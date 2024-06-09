Flyweight Design Pattern 

If you have a class whose objects demonstrate intrinsic
and extrinsic behaviour, and you notice extra memory usage because 
of that consider flyweight design pattern.

Steps :
1) divide the class into two classes 
 1.1) Intrinsic ( the attributes that remain the same).
 1.2) Extrinsic( the attributes which changes).
2) Use Intrinsic reference in your extrinsic class to refer to all intrinsic attributes
3) This will reduce the size of your object and saves memory.