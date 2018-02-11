package issue.pogo

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GroovyBeanImpl implements GroovyBean {
    @Override
    String greeting() {
        'I am a POGO'
    }
}
