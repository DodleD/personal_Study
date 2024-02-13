package multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive implements Runnable{ //멀티 쓰레드로 사용하기 위해서 추상클래스Runnable의 run메소드를 오버라이딩 해줘야한다.
	private Socket socket;
	
	public ClientReceive(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() { // I/O Stream은 예외처리가 필수!
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Input 스트림 열어주고!
			while(true) { //한쪽의 연결이 끝날 때 까지 실행
				String message = br.readLine();
				System.out.println("서버부터 전달된 메세지 :" + message);
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
