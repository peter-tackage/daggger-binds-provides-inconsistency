Possible Dagger 2 @Binds vs @Provides Error Report Inconsistency
=================

Observation of a possible error reporting inconsistency when using either `@Binds` or `@Provides`.

See `GreeterComponent` to switch between the modules used.

When using `GreetingModuleWithBinds`, no error is generated, but the instance injected is a `HelloWorldGreetingService`.

When using `GreetingModuleWithProvides`, the following error is generated:

```
17:48:05: Executing external task 'build'...
./daggger-binds-provides-inconsistency/src/main/java/com/petertackage/daggerbinds/GreeterComponent.java:15: error: com.petertackage.daggerbinds.GreetingService is bound multiple times:
    GreetingService getGreetingService();
                    ^
      @Provides com.petertackage.daggerbinds.GreetingService com.petertackage.daggerbinds.GreetingModuleWithProvides.bindGreetingService(com.petertackage.daggerbinds.HelloWorldGreetingService)
      @Provides com.petertackage.daggerbinds.GreetingService com.petertackage.daggerbinds.GreetingModuleWithProvides.bindAnotherGreetingService(com.petertackage.daggerbinds.AnotherGreetingService)
1 error
:compileJava FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 0.927 secs
Compilation failed; see the compiler error output for details.
17:48:06: External task execution finished 'build'.

```