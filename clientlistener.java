package com.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientlistener extends Thread {
	Socket c;
	
	clientlistener(Socket clientSocket) throws UnknownHostException, IOException
	{
		 c=clientSocket;
		
	}
	public void run()
	{
		
		BufferedReader inFromServer;
		while(true)
		{
			try {
				inFromServer = new BufferedReader(new InputStreamReader(c.getInputStream()));
				String sentence = inFromServer.readLine();
				System.out.println(sentence);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
		   
		
	}

}
