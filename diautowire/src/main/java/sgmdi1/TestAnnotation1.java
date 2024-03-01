package sgmdi1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation1 {
	

	

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
	Friend myfriend=context.getBean("myfriends",Friend.class);
	myfriend.display();

	}

	}
		

