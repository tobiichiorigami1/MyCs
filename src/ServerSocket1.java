import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocket1 {

	
	public static void main(String[] args) throws IOException {
		//服务端
		ServerSocket serverSocket=new ServerSocket(6666);
		//接收   连接过来的对象
		System.out.println("服务器启动");
		System.out.println("等待接收连接");
		Socket scSocket=serverSocket.accept();
		System.out.println("连接建立成功"+scSocket.getInetAddress().getHostName());
		   InputStream  iStream=scSocket.getInputStream();
           InputStreamReader isr=new InputStreamReader(iStream);
           BufferedReader brBufferedReader=new BufferedReader(isr);
           String string=brBufferedReader.readLine();
           
           System.out.println("客户端发来"+string);
          
           //brBufferedReader.close();
           //isr.close();
           //iStream.close();
	       
	}

}
