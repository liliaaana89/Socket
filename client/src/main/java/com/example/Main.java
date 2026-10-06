package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost", 3000);

        System.out.println("Connesso al server");

        Scanner scanner = new Scanner(System.in);

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        while (true) {
            System.out.println("Inserisci un messaggio: ");
            String testo = scanner.nextLine();

            out.println(testo);

            if(testo.equals("exit")){
                break;
            }

            String risposta = in.readLine();
            
            System.out.println("Risposta server: " + risposta);

            
        }
        scanner.close();
        in.close();
        out.close();
        s.close();

        System.out.println("Client terminato");
    }
}