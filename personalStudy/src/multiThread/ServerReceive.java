package multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive implements Runnable{ //멀티 쓰레드로 사용하기 위해서 추상클래스Runnable의 run메소드를 오버라이딩 해줘야한다.
	private Socket socket;
	
	public ServerReceive(Socket socket) {
		this.socket=socket;
	}
	
	
	
	public void run() {
		try { //I/O Stream은 오류예외처리가 필수적이다
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //I/O를 사용하여 입력받는 통로 열어준다.
			while(true) { //한쪽의 연결이 끝날 때 까지 계속에서 실행
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달된 메세지 :" + message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
