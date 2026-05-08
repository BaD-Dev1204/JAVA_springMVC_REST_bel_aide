package be.baddev.java_springmvc_rest_bel_aide.il.configs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "const")
@Data
public class ConstValues {
    //private Integer blop;
}
