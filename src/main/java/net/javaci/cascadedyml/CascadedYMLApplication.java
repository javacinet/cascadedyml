package net.javaci.cascadedyml;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CascadedYMLApplication {

    public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext;
		applicationContext = new SpringApplicationBuilder(CascadedYMLApplication.class)
				.properties("spring.config.location:" +
						"classpath:/sub_config_dir/," +
						"classpath:/")
				.build().run(args);

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		MutablePropertySources sources = environment.getPropertySources();
		sources.forEach(p -> System.out.println(p.getName()));
    }

}
