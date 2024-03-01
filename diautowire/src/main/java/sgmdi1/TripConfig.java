package sgmdi1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TripConfig {
//@Bean(name="mytrip") -way to override the name instead of tripBean
//@Bean({"mytrip","mytrip1"})
@Bean
public Trip tripBean() {
Trip trip=new Trip();
return trip;
}

}
