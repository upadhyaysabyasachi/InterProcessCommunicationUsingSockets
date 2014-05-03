package com.Socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		Socket cs=new Socket("localhost",8000);
		OutputStream outToServer=cs.getOutputStream();
		PrintStream
		
		
		//BufferedReader inFromServer= new BufferedReader(new InputStreamReader(cs.getInputStream()))
;
		outToServer.writeBytes("hi");
		
		
		
	}

}
