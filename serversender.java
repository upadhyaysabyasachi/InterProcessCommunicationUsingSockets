package com.Socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class serversender extends Thread{
	Socket c;

	serversender(Socket welcomeSocket) throws UnknownHostException, IOException {
		c = welcomeSocket;

	}

	public void run() {
		while(true)
		{
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(
				System.in));
		DataOutputStream outToClient;
		try {
			outToClient = new DataOutputStream(c.getOutputStream());
			String sentence = inFromUser.readLine();

			outToClient.writeBytes(sentence + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}
