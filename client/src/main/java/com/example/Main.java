package com.example;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost", 3000);

        System.out.println("Connesso al server");

        Scanner scanner = new Scanner(System.in);

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            System.out.println("Inserisci un messaggio: ");
            String testo = scanner.nextLine();

            out.println(testo);

            if(testo.equals("exit")){
                break;
            }
            
        }
    }
}