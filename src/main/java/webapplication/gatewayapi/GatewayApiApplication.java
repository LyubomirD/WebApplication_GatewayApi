package webapplication.gatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GatewayApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApiApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("usersRegistration", r -> r.path("/usersRegistration/**")
                        .uri("http://usersRegistration:8081")) // Replace with your microservice URL
                .route("userAccount", r -> r.path("/userAccount/**")
                        .uri("http://userAccount:8082")) // Replace with your microservice URL
                .build();
    }

}
