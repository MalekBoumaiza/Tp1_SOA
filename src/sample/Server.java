package sample;

import javax.xml.ws.Endpoint;

public class Server {
    static final String url = "http://localhost:8004/";

    public static void main(String[] args) {
        Endpoint.publish(url, new Users());
    }
}
