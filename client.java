import java.io.*; 
import java.net.*; 
public class client 
{ 
public static void main(String[] args) throws Exception 
{
//Create a client socket
Socket sock = new Socket("127.0.0.1", 3000);
Socket sock1 = new Socket("127.0.0.1", 4000);
//Accepting contents from keyboard
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
BufferedReader keyRead1 = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream(); 
OutputStream ostream1 = sock1.getOutputStream();
//Receiving from server
PrintWriter pwrite = new PrintWriter(ostream, true);
PrintWriter pwrite1 = new PrintWriter(ostream1, true);
InputStream istream = sock.getInputStream(); 
InputStream istream1 = sock1.getInputStream(); 
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
BufferedReader receiveRead1 = new BufferedReader(new InputStreamReader(istream1));
System.out.println("Online Communication System");
//Main part
String receiveMessage, sendMessage;
String receiveMessage1, sendMessage1;

sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
System.out.flush(); 
if((receiveMessage = receiveRead.readLine()) != null)
{ 
System.out.println(receiveMessage);
}
sendMessage1 = keyRead1.readLine();
pwrite1.println(sendMessage1);
System.out.flush(); 
if((receiveMessage1 = receiveRead1.readLine()) != null)
{ 
System.out.println(receiveMessage1);
}
} }
