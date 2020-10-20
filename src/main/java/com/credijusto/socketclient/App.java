package com.credijusto.socketclient;

import java.io.IOException;
import java.net.ServerSocket;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    for (int port = 1; port <= 65535; port++) {
      try {
        ServerSocket sSocket = new ServerSocket(port);
      } catch (IOException e) {
        System.err.println("Le port " + port + " est déjà utilisé ! ");
      }
    }
  }
}
