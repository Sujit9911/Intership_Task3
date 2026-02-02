Intership_Task3

Multithreaded Chat Application

Company

Codtech IT Solutions

Intern Details

Name: Prathmesh Vijay Thakare
Intern ID: CTIS2283
Domain: Java Programming
Duration: 4 Weeks
Mentor: Neela Santosh Kumar

Project Description

The Multithreaded Chat Application is a Java-based console application developed to demonstrate real-time communication between multiple clients using Java Socket Programming and Multithreading.

This project follows a layered MVC (Model–View–Controller) architecture, ensuring proper separation of concerns and clean code structure. Each connected client is handled using a separate thread, enabling simultaneous message exchange without blocking other users.

The application allows multiple clients to connect to a server and communicate with each other in real time via message broadcasting.

Features

Real-time chat communication

Multiple client support using multithreading

Server–client architecture

Message broadcasting to all connected clients

Console-based interface

Layered MVC architecture

Proper exception handling

Project Architecture

The project follows a three-layer architecture:

Controller Layer

Handles client/server startup logic and user interaction flow.

Service Layer

Acts as an intermediary between Controller and DAO layers and manages application flow.

DAO Layer

Handles low-level socket communication, input/output streams, and multithreading logic.

Technologies Used

Java

Java Socket Programming (java.net)

Java IO Package

Java Util Package

Multithreading

Object-Oriented Programming Concepts

Working Flow

Server starts and listens on a specified port.

Multiple clients connect to the server.

Each client is handled by a separate thread.

Messages sent by one client are broadcast to all connected clients.

Clients receive messages in real time.



Conclusion

This project demonstrates important Java concepts such as multithreading, socket-based communication, client-server architecture, and layered MVC design. It provides a strong foundation for understanding real-time communication systems and concurrent programming in Java.

Sample Output>>>>>>
