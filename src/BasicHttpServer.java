import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class BasicHttpServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/api/hello", new HelloHandler());
        server.setExecutor(null); // use default executor
        server.start();
        System.out.println("Server started on http://localhost:8080");
    }

    static class HelloHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello from basic Java!";
            exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "http://localhost:3000"); // for CORS
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
