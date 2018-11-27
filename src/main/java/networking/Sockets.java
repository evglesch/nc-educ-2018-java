package main.java.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class Sockets {

    public void socketExample() throws IOException {
        Socket socket = new Socket("http://localhost", 8080);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.println("Thanks for " + line);

        }
    }

    public void datagramExample() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = new byte[1024];

        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.send(packet);
    }

    public void serverExample() throws IOException {
        int serverPort = 8080;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server socket created on " + serverPort);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            //do something
        }
    }
}
