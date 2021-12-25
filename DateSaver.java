import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DateSaver {
    private static Exception ioe;

    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6013);
            while (true) {
                Socket client = sock.accept();
                PrintWriter pout =new PrintWriter(client.getOutputStream(),true);
                pout.println(new java.util.Date().toString());
                client.close();
            }
        } catch (Exception ioe) {
            DateSaver.ioe = ioe;
            System.err.println(DateSaver.ioe);
        }
    }

}
