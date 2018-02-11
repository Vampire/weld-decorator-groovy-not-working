package issue

import groovy.util.logging.Slf4j
import issue.pogo.GroovyBean
import issue.pojo.JavaBeanImpl
import org.jboss.weld.environment.se.bindings.Parameters
import org.jboss.weld.environment.se.events.ContainerInitialized

import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes
import javax.inject.Inject

@ApplicationScoped
@Slf4j
class BootLoader {
    @Inject
    GroovyBean groovyBean

    @Inject
    JavaBeanImpl javaBean

    /**
     * Listens to ContainerInitialized event.
     * This is send out by the weld bootstrap loader after successful start up
     */
    void bootListener(@Observes ContainerInitialized event, @Parameters List<String> cmdLineArgs) {
        log.info('cmdLineArgs: {}', cmdLineArgs)
        log.info('groovyBean.greeting: {}', groovyBean.greeting())
        log.info('javaBean.greeting: {}', javaBean.greeting())
    }
}
