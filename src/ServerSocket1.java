import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocket1 {

	
	public static void main(String[] args) throws IOException {
		//�����
		ServerSocket serverSocket=new ServerSocket(6666);
		//����   ���ӹ����Ķ���
		System.out.println("����������");
		System.out.println("�ȴ���������");
		Socket scSocket=serverSocket.accept();
		System.out.println("���ӽ����ɹ�"+scSocket.getInetAddress().getHostName());
		   InputStream  iStream=scSocket.getInputStream();
           InputStreamReader isr=new InputStreamReader(iStream);
           BufferedReader brBufferedReader=new BufferedReader(isr);
           String string=brBufferedReader.readLine();
           
           System.out.println("�ͻ��˷���"+string);
          
           //brBufferedReader.close();
           //isr.close();
           //iStream.close();
	       
	}

}
