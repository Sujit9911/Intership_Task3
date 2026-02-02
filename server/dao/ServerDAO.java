package server.dao;

import java.io.*;
import java.net.*;
import java.util.*;

// DAO layer - real socket work
public class ServerDAO {

    static List<ClientHandler> clients = new ArrayList<>();

    public void openServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server Started...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client Connected");

                ClientHandler handler = new ClientHandler(socket);
                clients.add(handler);
                handler.start(); // thread start
            }

        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }

    // thread class
    static class ClientHandler extends Thread {
        Socket socket;
        BufferedReader in;
        PrintWriter out;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                String msg;

                while ((msg = in.readLine()) != null) {
                    broadcast(msg);
                }

            } catch (Exception e) {
                System.out.println("Client Disconnected");
            }
        }

        // send to all clients
        void broadcast(String message) {
            for (ClientHandler c : clients) {
                c.out.println(message);
            }
        }
    }
}
