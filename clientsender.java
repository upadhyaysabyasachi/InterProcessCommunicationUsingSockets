package com.Socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientsender extends Thread{
	Socket c;

	clientsender(Socket clientSocket) throws UnknownHostException, IOException {
		c = clientSocket;

	}

	public void run() {
		while(true)
		{
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(
				System.in));
		DataOutputStream outToServer;
		try {
			outToServer = new DataOutputStream(c.getOutputStream());
			String sentence = inFromUser.readLine();

			outToServer.writeBytes(sentence + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}
