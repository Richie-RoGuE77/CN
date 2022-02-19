import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException{
        DatagramSocket datagramSocket= new DatagramSocket();
        String Text = "HEllo";
        byte[] data =Text.getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length, InetAddress.getLocalHost(),999);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
