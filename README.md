## This is a project to show the problem when using Weld (CDI) Decorator with Groovy

### Execute the test by
>./gradlew run --info

You will see the GroovyUserSpecification will be failed because of
>Exception in thread "main" org.jboss.weld.exceptions.DefinitionException: WELD-000061: The delegate type does not extend or implement the decorated type. 
   Decorated type: interface groovy.lang.GroovyObject
   Decorator: Decorator [class issue.pogo.decorator.GroovyBeanDecorator] decorates [GroovyObject, GroovyBean] with delegate type [GroovyBean] and delegate qualifiers [@Any]
 	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
 	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
 	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
 	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
 	at java.util.concurrent.ForkJoinTask.getThrowableException(ForkJoinTask.java:593)
 	at java.util.concurrent.ForkJoinTask.get(ForkJoinTask.java:1005)
 	at org.jboss.weld.executor.AbstractExecutorServices.checkForExceptions(AbstractExecutorServices.java:72)
 	at org.jboss.weld.executor.AbstractExecutorServices.invokeAllAndCheckForExceptions(AbstractExecutorServices.java:58)
 	at org.jboss.weld.executor.AbstractExecutorServices.invokeAllAndCheckForExceptions(AbstractExecutorServices.java:66)
 	at org.jboss.weld.bootstrap.ConcurrentValidator.validateDecorators(ConcurrentValidator.java:89)
 	at org.jboss.weld.bootstrap.Validator.validateDeployment(Validator.java:477)
 	at org.jboss.weld.bootstrap.WeldStartup.validateBeans(WeldStartup.java:480)
 	at org.jboss.weld.bootstrap.WeldBootstrap.validateBeans(WeldBootstrap.java:90)
 	at org.jboss.weld.environment.se.Weld.initialize(Weld.java:800)
 	at org.jboss.weld.environment.se.StartMain.go(StartMain.java:46)
 	at org.jboss.weld.environment.se.StartMain.main(StartMain.java:55)
 Caused by: org.jboss.weld.exceptions.DefinitionException: WELD-000061: The delegate type does not extend or implement the decorated type. 
   Decorated type: interface groovy.lang.GroovyObject
   Decorator: Decorator [class issue.pogo.decorator.GroovyBeanDecorator] decorates [GroovyObject, GroovyBean] with delegate type [GroovyBean] and delegate qualifiers [@Any]
 	at org.jboss.weld.util.Decorators.checkDelegateType(Decorators.java:140)
 	at org.jboss.weld.bootstrap.Validator.validateDecorator(Validator.java:577)
 	at org.jboss.weld.bootstrap.ConcurrentValidator$3.doWork(ConcurrentValidator.java:91)
 	at org.jboss.weld.bootstrap.ConcurrentValidator$3.doWork(ConcurrentValidator.java:89)
 	at org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:62)
 	at org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:55)
 	at java.util.concurrent.ForkJoinTask$AdaptedCallable.exec(ForkJoinTask.java:1424)
 	at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
 	at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
 	at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
 	at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)  