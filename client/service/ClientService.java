package client.service;

import client.dao.ClientDAO;

// service
public class ClientService {

    ClientDAO dao = new ClientDAO();

    public void start() {
        dao.connect();
    }
}
