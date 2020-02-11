package no.hvl.dat110.messaging;

import java.io.IOException;
import java.net.Socket;

public class MessagingClient {

	private String server = MessageConfig.MESSAGINGHOST;
	private int port = MessageConfig.MESSAGINGPORT;

	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}

	// connect to messaging server
	public Connection connect() {
		Connection connection = null;
		Socket clientSocket;
		try {
			clientSocket = new Socket(server, port);
			connection = new Connection(clientSocket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO
		// create TCP socket for client and connection
		// create connection object
		
		

		return connection;
	}
}
