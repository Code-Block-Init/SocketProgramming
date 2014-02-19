import java.io.*; 
import java.net.*; 
public class dcclient 
{ 
public static void main(String[] args) throws Exception 
{
//Create a client socket
Socket sock = new Socket("127.0.0.1", 3000);
Socket sock1 = new Socket("127.0.0.1", 4000);
Socket sock2 = new Socket("127.0.0.1", 5000);
//Accepting contents from keyboard
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
BufferedReader keyRead1 = new BufferedReader(new InputStreamReader(System.in));
BufferedReader keyRead2 = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream(); 
OutputStream ostream1 = sock1.getOutputStream();
OutputStream ostream2 = sock2.getOutputStream();
//Receiving from server
PrintWriter pwrite = new PrintWriter(ostream, true);
PrintWriter pwrite1 = new PrintWriter(ostream1, true);
PrintWriter pwrite2 = new PrintWriter(ostream2, true);
InputStream istream = sock.getInputStream(); 
InputStream istream1 = sock1.getInputStream();
InputStream istream2 = sock2.getInputStream();
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
BufferedReader receiveRead1 = new BufferedReader(new InputStreamReader(istream1));
BufferedReader receiveRead2 = new BufferedReader(new InputStreamReader(istream2));
System.out.println("Online Communication System");
//Main part
String receiveMessage, sendMessage;
String receiveMessage1, sendMessage1;
String receiveMessage2, sendMessage2;

// Decentralized server 1
System.out.print("Type 1 to start the test \n");
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
// Decentralized server 2
sendMessage1 = keyRead1.readLine();
pwrite1.println(sendMessage1);
System.out.flush(); 
if((receiveMessage1 = receiveRead1.readLine()) != null)
{ 
System.out.println(receiveMessage1);
}
if((receiveMessage1 = receiveRead1.readLine()) != null)
{ 
System.out.println(receiveMessage1);
}
sendMessage1 = keyRead1.readLine();
if((receiveMessage1 = receiveRead1.readLine()) != null)
{
System.out.println(receiveMessage1);
}
pwrite.println(sendMessage);
System.out.flush();
//Decentralized server 3
sendMessage2 = keyRead2.readLine();
pwrite2.println(sendMessage2);
System.out.flush(); 
if((receiveMessage2 = receiveRead2.readLine()) != null)
{ 
System.out.println(receiveMessage2);
}
if((receiveMessage2 = receiveRead2.readLine()) != null)
{ 
System.out.println(receiveMessage2);
}
sendMessage2 = keyRead2.readLine();
if((receiveMessage2 = receiveRead2.readLine()) != null)
{ 
System.out.println(receiveMessage2);
}
System.out.flush();
} }
