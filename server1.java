package com.Socket;

import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
	public static void main(String argv[]) throws Exception {
		
		
	ServerSocket welcomeSocket = new ServerSocket(6790);
	Socket connectionSocket = welcomeSocket.accept();
	  
	
	serversender send=new serversender(connectionSocket);
	

	serverlistener receive=new serverlistener(connectionSocket);
	
	send.start();
	receive.start();
	}
}
