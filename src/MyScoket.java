import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class MyScoket {

	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("169.254.151.12", 6666);
		OutputStream os=s.getOutputStream();
		Scanner scanner=new Scanner(System.in);
		String sr=scanner.next();
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bWriter=new BufferedWriter(osw);
		//scanner.close();
		bWriter.write(sr);
		bWriter.newLine();
		bWriter.close();
		osw.close();
		os.close();
	}

}
