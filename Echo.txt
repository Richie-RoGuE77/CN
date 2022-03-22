import java.io.*;
import java.net.*;
import java.util.Calendar;
class Echo
{
public static void main(String args[])throws Exception
{
String str;
int c=0;
long t1,t2;
Socket s=new Socket();
String ip=args[0];
try
{
s.connect(new InetSocketAddress(ip,80));
System.out.println("Connected");
}
catch(Exception e)
{
System.out.println(e);
}

DataInputStream dis=new DataInputStream(s.getInputStream());
PrintStream out=new PrintStream(s.getOutputStream());

t1=System.currentTimeMillis();
str="Hello";
out.println(str);
System.out.println(dis.readLine());
t2=System.currentTimeMillis();
System.out.println("RTT="+(t2-t1)+"ms");

s.close();
}
}