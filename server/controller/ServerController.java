package server.controller;

import server.service.ServerService;

// controller layer
public class ServerController {

    ServerService service = new ServerService();

    public void startServer() {
        service.start();
    }
}
