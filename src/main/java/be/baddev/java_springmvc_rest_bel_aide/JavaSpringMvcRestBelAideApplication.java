package be.baddev.java_springmvc_rest_bel_aide;

import be.baddev.java_springmvc_rest_bel_aide.il.configs.ConstValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaSpringMvcRestBelAideApplication {
    //@Autowired
    //private ConstValues constValues;

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringMvcRestBelAideApplication.class, args);
    }

    //@EventListener(ApplicationStartedEvent.class)
    public void startedEvent() {
        //System.out.println(this.constValues.getBlop());
    }

}
