##Item 7: Avoid finalizers
Finalizers are unpredictable, often dangerous, and generally unnecessary.

Don’t be seduced by the methods System.gc and System.runFinalization.
They may increase the odds of finalizers getting executed, but they don’t guarantee
it. The only methods that claim to guarantee finalization are System.runFinalizersOnExit
and its evil twin, Runtime.runFinalizersOnExit. These
methods are fatally flawed and have been deprecated

###Examples of Terminiation methods - Terminate method pattern
Typical examples of explicit termination methods are the close methods on
InputStream, OutputStream, and java.sql.Connection. Another example is
the cancel method on java.util.Timer, which performs the necessary state
change to cause the thread associated with a Timer instance to terminate itself
gently. Examples from java.awt include Graphics.dispose and Window.dispose.
These methods are often overlooked, with predictably dire performance
consequences. A related method is Image.flush, which deallocates all the
resources associated with an Image instance but leaves it in a state where it can
still be used, reallocating the resources if necessary.

###try-finally
Explicit termination methods are typically used in combination with the
try-finally construct to ensure termination. Invoking the explicit termination
method inside the finally clause ensures that it will get executed even if an
exception is thrown while the object is being used:
// try-finally block guarantees execution of termination method
```
Foo foo = new Foo(...);
try {
// Do what must be done with foo
...
} finally {
foo.terminate(); // Explicit termination method
}
```

