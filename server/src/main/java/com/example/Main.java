package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(3000);
        System.out.println("Server avviato sulla porta 3000");

        Socket s = ss.accept();
        System.out.println("Client connesso");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            String testo = in.readLine();

            if(testo.equals("exit")) {
                break;
            }

            System.out.println("Messaggio ricevuto: " + testo);

            String maiuscolo = testo.toUpperCase();

            out.println(maiuscolo);
        }
    }


}