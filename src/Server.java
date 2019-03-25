import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(Config.PORT);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        

    }
}
