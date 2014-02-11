import java.io.*; 
import java.net.*; 
public class server
{
public static void main(String[] args) throws Exception
{
//create server socket
ServerSocket sersock = new ServerSocket(3000);
System.out.println("DeCentralized Server ready for communication");
//Make the server wait till a client accepts connection
Socket sock = sersock.accept( );
//Sending to client
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream();
//To accept contents from client
PrintWriter pwrite = new PrintWriter(ostream, true);
InputStream istream = sock.getInputStream();
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
//Read contents from the client
String receiveMessage, sendMessage;
while(true)
{
if((receiveMessage = receiveRead.readLine()) != null) 
{ 
System.out.println(receiveMessage);
}
sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
System.out.flush();
} } }
