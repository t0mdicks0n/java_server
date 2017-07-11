import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;

public class Server {
  public static void main(String[] args) throws java.io.IOException {
 		// Instantiate the server:
    ServerSocket server = new ServerSocket(80);
    System.out.println("Server has started on localhost:80.\r\nWaiting for a connection...");
    // Make the server listen while the program is running:
    while (true) {
	    Socket client = server.accept();
	    System.out.println("A client connected: " + client.getInetAddress());
	    // Return something to the client:
	    byte[] b = {'H', 'e', 'l', 'l', 'o'};
	    OutputStream out = client.getOutputStream();
	    out.write(b);
	    // Close the socket:
	    client.close();
    }
  }
}