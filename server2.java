
import java.io.*; 
import java.net.*; 
public class server2
{
public static void main(String[] args) throws Exception
{
//create server socket
ServerSocket sersock2 = new ServerSocket(5000);
System.out.println("DeCentralized Server ready for communication");
//Make the server wait till a client accepts connection
Socket sock2 = sersock2.accept( );
//Sending to client
BufferedReader keyRead2 = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream2 = sock2.getOutputStream();
//To accept contents from client
PrintWriter pwrite2 = new PrintWriter(ostream2, true);
InputStream istream2 = sock2.getInputStream();
BufferedReader receiveRead2 = new BufferedReader(new InputStreamReader(istream2));
//Read contents from the client
String receiveMessage2, sendMessage2;
while(true)
{
if((receiveMessage2 = receiveRead2.readLine()) != null) 
{ 
System.out.println(receiveMessage2);
}
sendMessage2 = keyRead2.readLine();
pwrite2.println(sendMessage2);
System.out.flush();
} } }
