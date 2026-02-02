package client.controller;

import client.service.ClientService;

// controller
public class ClientController {

    ClientService service = new ClientService();

    public void startClient() {
        service.start();
    }
}
