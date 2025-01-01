package banque;
import jakarta.xml.ws.Endpoint;
public class lunch {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Endpoint.publish("http://localhost:2020/", new banqueService());


    }
}
