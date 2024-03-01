package sgmdi1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	

	
	@Bean
	public Course courseBean() {
	return new Course();
	}
	@Bean
	public Student studentBean() {
	return new Student(courseBean());

	}

	}