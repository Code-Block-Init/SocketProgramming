import java.io.*; 
import java.net.*; 
public class server1
{
public static void main(String[] args) throws Exception
{
//create server socket
ServerSocket sersock1 = new ServerSocket(4000);
System.out.println("DeCentralized Server ready for communication");
//Make the server wait till a client accepts connection
Socket sock1 = sersock1.accept( );
//Sending to client
BufferedReader keyRead1 = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream1 = sock1.getOutputStream();
//To accept contents from client
PrintWriter pwrite1 = new PrintWriter(ostream1, true);
InputStream istream1 = sock1.getInputStream();
BufferedReader receiveRead1 = new BufferedReader(new InputStreamReader(istream1));
//Read contents from the client
String receiveMessage1, sendMessage1;
while(true)
{
if((receiveMessage1 = receiveRead1.readLine()) != null) 
{ 
System.out.println(receiveMessage1);
}
sendMessage1 = keyRead1.readLine();
pwrite1.println(sendMessage1);
System.out.flush();
} } }
