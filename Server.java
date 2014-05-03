package com.Socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) throws Exception{
		ServerSocket ss;
		Socket clientsocket=null;
		ss=new ServerSocket(8000);
		System.out.println("starting server socket");
		System.out.println("waiting for client");
		clientsocket = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
        System.out.write("client's input is: "+br.readLine());
        
		
	}

}
