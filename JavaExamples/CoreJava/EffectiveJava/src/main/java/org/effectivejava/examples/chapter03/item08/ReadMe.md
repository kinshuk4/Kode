##Item 8: Obey the general contract when overriding equals
###Equals method follows equivalence relation
- Reflexive
- Symmetric
- Transitive
- Consistent
- x.equals(y) should return false if x is not null, and y is null
###Reflexivity - x is equal to x.
This will be generally be the case, but take the case of ```FooNonReflexive``` class. (Not taken from Effective java, but theme is still the same)
```FooNonReflexive.equals()``` will return false. 
And when you put it into a list and call list.contains(foo) it will return false, 
because none of the elements in the list was equal to the one you passed. 
This is so because list.contains(..) iterates the elements and for each of them checks if (elem.equals(arg))

###Symmetric - x.equals(y) = y.equals(x)
check the case of CaseInsensitiveString.

###Transitivity
Consider the class Point, and ColorPoint extending Point. 
Equals method of ColorPoint is broken, as it is not symmetric. See ColorPointTest
```
        Point p1 = new Point(1,0);
        Point p2 = new ColorPoint(1,0, Color.BLUE);

        System.out.println(p1.equals(p2) + " "+ p2.equals(p1));
```
