package com.example;

import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(3000);
        System.out.println("Server avviato sulla porta 3000");
    }
}