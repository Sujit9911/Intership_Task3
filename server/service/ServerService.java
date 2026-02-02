package server.service;

import server.dao.ServerDAO;

// service layer
public class ServerService {

    ServerDAO dao = new ServerDAO();

    public void start() {
        dao.openServer();
    }
}
