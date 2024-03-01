package sgmdi1;

import org.springframework.stereotype.Component;

@Component("myfriends")
//if we dont provide the name the object will be created with an id friend
//first letter is a lower case
public class Friend {

public void display() {
System.out.println("friends accross the Globe");
}

}

