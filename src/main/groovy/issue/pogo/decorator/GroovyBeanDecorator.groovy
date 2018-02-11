package issue.pogo.decorator

import issue.pogo.GroovyBean

import javax.decorator.Decorator
import javax.decorator.Delegate
import javax.enterprise.inject.Any
import javax.inject.Inject

@Decorator
abstract class GroovyBeanDecorator implements GroovyBean {
    @Inject
    @Delegate
    @Any
    GroovyBean groovyBean

    @Override
    String greeting() {
        "decorated: ${groovyBean.greeting()}"
    }
}
