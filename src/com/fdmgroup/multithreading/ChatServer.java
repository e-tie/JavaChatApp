package com.fdmgroup.multithreading;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

	// A list of sockets for connected clients
	private static List<Socket> clients = new ArrayList<>();

	// A main method to start the server
	public static void main(String[] args) throws IOException {
		try (// Create a server socket on port 8080
				ServerSocket serverSocket = new ServerSocket(8080)) {
			System.out.println("Chat server started on port 8080");

			// Loop forever to accept new connections
			while (true) {
				// Wait for a client to connect
				Socket clientSocket = serverSocket.accept();
				System.out.println("New client connected: " + clientSocket);

				// Add the client socket to the list
				clients.add(clientSocket);

				// Create a new thread for the client

			}
		}
	}

	// A nested class that extends Thread and handles communication with a client
	private static class ServerThread {

		// A socket for the client
		private Socket clientSocket;

		// A constructor that takes a socket as a parameter
		public ServerThread(Socket clientSocket) {
			this.clientSocket = clientSocket;
		}

		// A run method that overrides the one in Thread class

	}
}