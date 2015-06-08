##Item 3: Enforce the singleton property with a private constructor or an enum type
The main advantage of the public field approach is that the declarations make it clear that the class is a singleton:
the public static field is final, so it will always contain the same object reference.

###Serialization of singleton
To make a singleton class that is implemented using either of the previous approaches serializable (Chapter 11),
it is not sufficient merely to add imple- ments Serializable to its declaration.
To maintain the singleton guarantee, you have to declare all instance fields transient and provide a readResolve method