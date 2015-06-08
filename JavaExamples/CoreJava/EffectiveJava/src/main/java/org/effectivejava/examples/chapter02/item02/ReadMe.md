Item 2: Consider a builder when faced with many constructor parameters
First see - Telescoping constructor , then java beans and then builder.
JavaBean may be in an inconsistent state partway through its construction.
the JavaBeans pattern precludes the possibility of making a class immutable
The Builder pattern simulates named optional parameters as found in Ada and Python.