package sgmdi1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
	
	
	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
	Student studentBean=context.getBean("studentBean",Student.class);
	studentBean.displayCourse();
	}
	}
