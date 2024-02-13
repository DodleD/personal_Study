package multiThread;

import java.io.IOException;
import java.net.Socket;

public class TCPClient2 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",3000); //내가 접속하고자 하는 Server의 IP주소를 입력해준다.
			// localhost는 자기자신의 IP를 가져온다.
			
			//서버로부터 메세지를 받는 쓰레드
			ClientReceive task1 = new ClientReceive(socket); //메세지를 받기위해 접속할 IP와 포트번호를 가지고 ClientRecevie클래스로 객체 생성
			Thread t1 = new Thread(task1); //멀티쓰레드로 돌리기 위해 Thread 클래스로 다시 객체 생성
			t1.start(); //start메소드로 멀티쓰레드 진행
			//서버에 메세지를 보내는 쓰레드
			ClientSend task2 = new ClientSend(socket); //메세지를 보내기위해 ClientSend에 socket객체를 보내어 task2 객체생성
			Thread t2 = new Thread(task2); //멀티쓰레드로 진행시키기위해 task2 객체를 넣어줌
			t2.start(); //start메소드
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
