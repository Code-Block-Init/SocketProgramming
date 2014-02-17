import java.io.*; 
import java.net.*; 
public class cclient
{ 
public static void main(String[] args) throws Exception 
{
//Create a client socket
Socket sock = new Socket("127.0.0.1", 2000);
//Accepting contents from keyboard
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream(); 
//Receiving from server
PrintWriter pwrite = new PrintWriter(ostream, true);
InputStream istream = sock.getInputStream(); 
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
System.out.println("Online Testing System");
//Main part
String receiveMessage, sendMessage;
System.out.print("Type 1 to start Mathematics test \n");
sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
System.out.flush(); 
if((receiveMessage = receiveRead.readLine()) != null)
{ 
System.out.println(receiveMessage);
}
if((receiveMessage = receiveRead.readLine()) != null)
{ 
System.out.println(receiveMessage);
}
sendMessage = keyRead.readLine();
if((receiveMessage = receiveRead.readLine()) != null)
{ 
System.out.println(receiveMessage);
}
System.out.flush(); 
} }
