package Project3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicServer2 {
    ArrayList clientOutputStreams;

    public static void main(String[] args) {

        new MusicServer2().go();
    }

    public class ClientHandler implements Runnable {
        ObjectInputStream in;
        Socket sock;

        public ClientHandler(Socket clientSOcket) {
            try {
                sock = clientSOcket;
                in = new ObjectInputStream(sock.getInputStream());

            } catch (Exception ex) { ex.printStackTrace(); }
        }

        public void run() {
            Object o1;
            Object o2;
            try {
                while ((o1 = in.readObject()) != null) {
                    o2 = in.readObject();
                    System.out.println("read two objects");
                    tellEveryone(o1, o2);
                }
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }



    public void go() {
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while(true) {
                System.out.println("MusicServer Started");
                System.out.println("2019250059 한민욱");
                Socket clientSocket = serverSock.accept();
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                clientOutputStreams.add(out);

                Thread t = new Thread(new MusicServer2.ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    public void tellEveryone(Object one, Object two) {
        Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()) {
            try {
                ObjectOutputStream out = (ObjectOutputStream) it.next();
                out.writeObject(one);
                out.writeObject(two);
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }
}
