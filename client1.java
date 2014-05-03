package com.Socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;




class client1 {
	public static void main(String argv[]) throws Exception  { 
		 
		
		Socket clientSocket = new Socket("localhost", 6790);  
		
		clientsender send=new clientsender(clientSocket);
		

		clientlistener receive=new clientlistener(clientSocket);
		
		send.start();
		receive.start();
		
		
		} 
	} 