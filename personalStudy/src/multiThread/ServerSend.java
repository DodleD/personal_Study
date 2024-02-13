package multiThread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend implements Runnable{ //멀티 쓰레드로 사용하기 위해서 추상클래스Runnable의 run메소드를 오버라이딩 해줘야한다.
	private Socket socket;

	public ServerSend(Socket socket) {
		super();
		this.socket = socket;
	}

	
	public void run() { // I/O Stream은 예외처리가 필수 !
		try (PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			Scanner sc = new Scanner(System.in)){
			
			while(true) {
				String message = sc.nextLine();
				writer.println(message); //버퍼에 message를 쓰고
				writer.flush();			 //버퍼에 쓴 message를 flush로 밀어줘야 출력된다.
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
