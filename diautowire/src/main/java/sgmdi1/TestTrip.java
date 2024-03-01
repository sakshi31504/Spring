package sgmdi1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTrip {
public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(TripConfig.class);
Trip tripBean=context.getBean("tripBean",Trip.class);
tripBean.displayTrip();
}
}

//removed @component annotation in Trip(bean class)-no annotation at all
//ad @Bean annotation in config class above the method that creates the bean
//method name is the bean id