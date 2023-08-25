//package webapplication.gatewayapi.Configuration;
//
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//
//@Component
//public class NoCorsGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {
//    public NoCorsGatewayFilterFactory() {
//        super(Object.class);
//    }
//
//    @Override
//    public GatewayFilter apply(Object config) {
//        return (exchange, chain) -> {
//            ServerHttpRequest request = exchange.getRequest().mutate()
//                    .header(HttpHeaders.ORIGIN, "http://localhost:63343") // Replace with the specific origin
//                    .header(HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD, "GET, POST")
//                    .header(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "http://localhost:63343") // Replace with the specific origin
//                    .header(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "*")
//                    .header(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET, POST") // Adjust allowed methods
//                    .build();
//
//
//            return chain.filter(exchange.mutate().request(request).build());
//        };
//    }
//}
