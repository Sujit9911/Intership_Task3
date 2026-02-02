package client.dao;

import java.io.*;
import java.net.*;
import java.util.Scanner;

// DAO layer - socket logic
public class ClientDAO {

    public void connect() {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to Server");

            BufferedReader in =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            // receive thread
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println("Message: " + msg);
                    }
                } catch (Exception e) {}
            }).start();

            // send loop
            while (true) {
                String text = sc.nextLine();
                out.println(text);
            }

        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
