import java.rmi.*;
public class RMICalServer
{
    public static void main(String args[])
    {
        try
        {
            RMICalImpl si = new RMICalImpl();
            Naming.rebind("calserver",si);
        }
        catch(Exception e){}
    }
}