package at.refugeescode.mp11piratesofthecodebean3.initialise;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

@Configurable
public class Starter {

    @Bean
    ApplicationRunner startPoint() {
        return args -> {

        };
    }

}
