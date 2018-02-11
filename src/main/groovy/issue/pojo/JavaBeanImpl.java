package issue.pojo;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JavaBeanImpl implements JavaBean {
    @Override
    public String greeting() {
        return "I am a POJO";
    }
}
