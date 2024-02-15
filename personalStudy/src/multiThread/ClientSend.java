package multiThread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSend implements Runnable{ //멀티 쓰레드로 사용하기 위해서 추상클래스Runnable의 run메소드를 오버라이딩 해줘야한다.
private Socket socket;
	
	
	public ClientSend(Socket socket) {
		super();
		this.socket = socket;
	}

	//aaaaaa
	@Override
	public void run() { // I/O Stream은 예외처리가 필수 !
		try (PrintWriter writer = new PrintWriter(socket.getOutputStream(),true); //출력 통로 만들어주고!
			Scanner sc = new Scanner(System.in))  {
			
			while(true) {
				String message = sc.nextLine();
				writer.println(message); //버퍼에 메세지 입력하고!
				writer.flush(); //flush로 밀어서 보내기!
			}
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
