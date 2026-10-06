package com.example;

import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost", 3000);

        System.out.println("Connesso al server");
    }
}