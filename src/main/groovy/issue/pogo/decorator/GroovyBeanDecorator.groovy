package issue.pogo.decorator

import issue.pogo.GroovyBean

import javax.decorator.Decorator
import javax.decorator.Delegate
import javax.enterprise.inject.Any
import javax.enterprise.inject.Typed
import javax.inject.Inject

@Decorator
@Typed(GroovyBean)
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
