package issue.pojo.decorator;

import issue.pojo.JavaBean;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Priority(Interceptor.Priority.APPLICATION)
@Decorator
public abstract class JavaBeanDecorator implements JavaBean {
    @Inject
    @Delegate
    @Any
    private JavaBean javaBean;

    @Override
    public String greeting() {
        return String.format("decorated: %s", javaBean.greeting());
    }
}
