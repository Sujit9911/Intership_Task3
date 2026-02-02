package client;

import client.controller.ClientController;

public class ClientMain {
    public static void main(String[] args) {
        ClientController controller = new ClientController();
        controller.startClient();
    }
}
