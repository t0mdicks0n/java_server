import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws java.io.IOException {
    
    ServerSocket server = new ServerSocket(80);
    System.out.println("Server has started on localhost:80.\r\nWaiting for a connection...");
    Socket client = server.accept();
    System.out.println("A client connected.");
  }
}