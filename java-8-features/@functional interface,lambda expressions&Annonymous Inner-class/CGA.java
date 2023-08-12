
package server.control.net.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Update implements Runnable {

    private final static int serverPort = 5555;
    private final static String fileInput = "C:\\Users\\Alexander\\Documents\\update.zip";

    public static void main(String args[]) throws IOException{
        ServerSocket servsock = new ServerSocket(serverPort);
        File myFile = new File(fileInput);
        while (true) {
          Socket sock = servsock.accept();
          byte[] mybytearray = new byte[(int) myFile.length()];
          BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
          bis.read(mybytearray, 0, mybytearray.length);
          OutputStream os = sock.getOutputStream();
          os.write(mybytearray, 0, mybytearray.length);
          os.flush();
          sock.close();
        }
    }

    public static void start(){
        Update upd = new Update();  
        Thread tupd = new Thread(upd);  
        tupd.start(); 
    }

    @Override
    public void run() {

    }
}
Client

package server.control.net;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    private final static String serverIP = "127.0.0.1";
    private final static int serverPort = 5555;
    private final static String fileOutput = "C:\\Users\\Alexander\\Documents\\updateoutput.zip";

    public static void main(String args[]) throws UnknownHostException, IOException {
        Socket sock = new Socket(serverIP, serverPort);
        byte[] mybytearray = new byte[1024];
        InputStream is = sock.getInputStream();
        FileOutputStream fos = new FileOutputStream(fileOutput);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int bytesRead = is.read(mybytearray, 0, mybytearray.length);
        bos.write(mybytearray, 0, bytesRead);
        bos.close();
        sock.close();
    }
}