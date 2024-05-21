import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args)
            throws IOException {

        // Default port number we are going to use
        int portnumber = 1234;
        if(args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        //create a MulticastSocket
        MulticastSocket chatMulticastCocket = new MulticastSocket(1234);

        //Determine the IP adress of host
        InetAddress group = InetAddress.getByName("225.4.5.6");

        //Joins a multicast group
        chatMulticastCocket.joinGroup(group);

        //Prompt a user to enter a message
    }
}