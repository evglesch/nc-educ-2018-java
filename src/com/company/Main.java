package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {
        urlExample();
    }

    private static void urlExample() throws IOException {
        URL url = new URL("https://bash.im");
        URLConnection connection = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void socketExample() throws IOException {
        Socket socket = new Socket("http://localhost", 8080);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.println("Thanks for " + line);

        }
    }


    private static void datagramExample() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = new byte[1024];

        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.send(packet);
    }

    private static void serverExample() throws IOException {
        int serverPort = 8080;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server socket created on " + serverPort);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            //do something
        }
    }
}


