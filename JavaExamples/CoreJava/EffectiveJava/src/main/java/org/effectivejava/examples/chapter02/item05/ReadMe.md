##Item 5: Avoid creating unnecessary objects
###Immutability
An object can always be reused if it is immutable. Take the example of extraobjectcreation package.
String can be reused, rather than again and again using constructor.

The static factory method ```Boolean.valueOf(String)``` is almost always preferable to the constructor Boolean(String).

###Mutable objects can be reused too
In the slowversion package we are again and again creating boomstart and boomend object. 
In the fastversion, we have just create it once in static block and reusing it again and again.
the keySet method of the Map interface returns a Set view of the
Map object, consisting of all the keys in the map. Naively, it would seem that every
call to keySet would have to create a new Set instance, but every call to keySet
on a given Map object may return the same Set instance. Although the returned
Set instance is typically mutable, all of the returned objects are functionally identical:
when one of the returned objects changes, so do all the others because
they’re all backed by the same Map instance. While it is harmless to create multiple
instances of the keySet view object, it is also unnecessary.

###Issue due to autoboxing
There’s a new way to create unnecessary objects in release 1.5. It is called autoboxing.
This program gets the right answer, but it is much slower than it should be,
due to a one-character typographical error. The variable sum is declared as a Long
instead of a long, which means that the program constructs about 231 unnecessary
Long instances (roughly one for each time the long i is added to the Long sum).
Changing the declaration of sum from Long to long reduces the runtime from 43
seconds to 6.8 seconds on my machine. The lesson is clear: prefer primitives to
boxed primitives, and watch out for unintentional autoboxing.

###Issue with object pool
Conversely, avoiding object creation by maintaining your own object pool is a
bad idea unless the objects in the pool are extremely heavyweight. The classic
example of an object that does justify an object pool is a database connection.


