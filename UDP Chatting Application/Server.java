import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket= new DatagramSocket(999);
        DatagramPacket datagramPacket= new DatagramPacket(new byte[10],10);

        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData()));
        System.out.println("obtained from IP"+datagramPacket.getAddress());
        System.out.println("Obtained from port"+datagramPacket.getPort());

        datagramSocket.close();

    }


}
