import java.io.*; 
import java.net.*; 
public class cserver
{
public static void main(String[] args) throws Exception
{
//create server socket
ServerSocket sersock = new ServerSocket(2000);
System.out.println("Centralized Server ready for communication");
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
receiveMessage = receiveRead.readLine();
pwrite.println("Start Mathematics Test \n 2+2=");
while(true)
{
if(receiveMessage.equals("4"))
{
pwrite.println("answer is correct");
}
else
{
pwrite.println("answer is wrong");
} // end of if else loop
} // end of while loop
} // end of main
} // end of class
