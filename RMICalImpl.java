import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class RMICalImpl extends UnicastRemoteObject implements RMICalIntf
{
    RMICalImpl() throws RemoteException
    {
    }
    public double add(double a, double b)throws RemoteException
    {
        return(a+b);
    }
    public double sub(double a,double b)throws RemoteException
    {
        return(a-b);
    }
    public double mul(double a,double b)throws RemoteException
    {
        return(a*b);
    }
    public double div(double a,double b)throws RemoteException
    {
        return(a/b);
    }
}