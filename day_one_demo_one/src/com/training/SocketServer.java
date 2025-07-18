package com.training;

import java.io.*;
import java.net.*;

public class SocketServer {

    private static ServerSocket server;
    private static int port = 9876;


    public static void server() throws IOException, ClassNotFoundException {
    	
        server = new ServerSocket(port);
        boolean flag = true;
        while(true){
            System.out.println("Waiting for the client request");
            Socket socket = server.accept();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            String message = (String) ois.readObject();
            System.out.println("Message Received: " + message);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("Hi Client "+message);
            ois.close();
            oos.close();
            socket.close();
            if(message.equalsIgnoreCase("exit")) { flag= false; }
        }
}
        
    	
    	
            
    public static void main(String args[]) {
    	
    	try {
			server();
			server.close();
	        System.out.println("Shutting down Socket server!!");

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
     }

}
