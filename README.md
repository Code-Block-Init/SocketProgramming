Centralization and De-Centralization of servers
=================
***
Centralization and De-Centralization of servers in a client-server computing
***
```
ALGORITHM:

(I) Centralization concept in Client/Server application:

(a) Centralized Client:
1. Create a client socket
Socket <socket name> = new Socket("<IP address>", <port number>);
2. Accepting contents
BufferedReader <BufferedReader name> = new BufferedReader(new InputStreamReader(System.in));
OutputStream <OutputStream name> = <socket name>.getOutputStream(); 
3. Receiving from server
PrintWriter <PrintWriter name> = new PrintWriter(<OutputStream name>, true);
InputStream <InputStream name> = <socket name>.getInputStream(); 
BufferedReader <server BufferedReader name> = new BufferedReader(new InputStreamReader(<InputStream name>));

(b) Centralized Server:
1. Create server socket
ServerSocket <Server Socket name> = new ServerSocket(<port number>);
2. Server waits until client accepts connection
Socket <client socket name> = <server socket name>.accept( );
3. Sending contents to client
BufferedReader <client BufferedReader name> = new BufferedReader(new InputStreamReader(System.in));
OutputStream <OutputStream name> = <client socket name>.getOutputStream();
4. Accepting contents from client
PrintWriter <PrintWriter name> = new PrintWriter(<OutputStream name>, true);
InputStream <InputStream name> = <client socket name>.getInputStream();
BufferedReader <server BufferedReader name> = new BufferedReader(new InputStreamReader(<InputStream name>));
5. Read contents from the client
receiveMessage = <server BufferedReader name>.readLine();

(II) DeCentralization concept in Client/Server application:

(a) DeCentralized Client:
1. Create a client socket
Socket <socket name> = new Socket("<IP address>", <port number>);
2. Accepting contents
BufferedReader <BufferedReader name> = new BufferedReader(new InputStreamReader(System.in));
OutputStream <OutputStream name> = <socket name>.getOutputStream(); 
3. Receiving from server
PrintWriter <PrintWriter name> = new PrintWriter(<OutputStream name>, true);
InputStream <InputStream name> = <socket name>.getInputStream(); 
BufferedReader <server BufferedReader name> = new BufferedReader(new InputStreamReader(<InputStream name>));

(b) DeCentralized Servers:
1. Create server socket
ServerSocket <Server Socket name> = new ServerSocket(<port number>);
2. Server waits until client accepts connection
Socket <client socket name> = <server socket name>.accept( );
3. Sending contents to client
BufferedReader <client BufferedReader name> = new BufferedReader(new InputStreamReader(System.in));
OutputStream <OutputStream name> = <client socket name>.getOutputStream();
4. Accepting contents from client
PrintWriter <PrintWriter name> = new PrintWriter(<OutputStream name>, true);
InputStream <InputStream name> = <client socket name>.getInputStream();
BufferedReader <server BufferedReader name> = new BufferedReader(new InputStreamReader(<InputStream name>));
5. Read contents from the client
receiveMessage = <server BufferedReader name>.readLine();
```
```
Source Code:

I. Centralization
cclient.java
cserver.java

II. De-Centralization
dcclient.java
dcserver.java
dcserver1.java
dcserver2.java
```
```
Wrote it during MTech 2nd semester (2014)
```
