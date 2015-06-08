##Item 6: Eliminate obsolete object references


##Sources of memory leaks
###Object reference is not dereferenced
Nulling out object references should be the exception rather than the norm.
Eliminate obsolete reference. Check method ```popWithoutMemoryLeak``` to find the issue.

###Another source of memory leaks is cache

###A third common source of memory leaks is listeners and other callbacks.
