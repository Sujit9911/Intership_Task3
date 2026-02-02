package server;

import server.controller.ServerController;

// main server start
public class ServerMain {
    public static void main(String[] args) {
        ServerController controller = new ServerController();
        controller.startServer();
    }
}
