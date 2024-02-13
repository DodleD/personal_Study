package multiThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver2 {
	public static void main(String[] args) {
		int port = 3000; //임의의 포트번호 설정
		
		try {
			ServerSocket serverSocket = new ServerSocket(port); //ServerSocket 클래스에 port번호를 넣어서 객체 생성
			System.out.println("서버 연결준비 완료....");
			
			Socket socket = serverSocket.accept(); //accept 메소드를 사용하여 입력대기 !
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결 함...");//입력이 오게 되면 나에게 입력한 사람의 주소 출력!
			
			
			//클라이언트에게 메세지를 받는 구역
			ServerReceive receive = new ServerReceive(socket); //우리가 위에 만들었던 ServerReceive 클래스에 socket 넣어서 객체생성
			Thread receiveTask = new Thread(receive); //Thread로 실행하기 위해 방금 만들었던 receive 객체를 넣어준다.
			receiveTask.start(); // start 메소드를 사용하면 main의 run과 같이 실행된다!
	
			//클라이언트로부터 메세지를 보내는 쓰레드
			ServerSend send =new ServerSend(socket); // 메세지를 보내기위해 만들었던 ServerSend클래스에 Socket객체인 socket을 넣어서 객체생성
			Thread sendTask = new Thread(send); // Thread로 실행하기위해 마지막으로 만든 객체 send를 넣어주고
			sendTask.start(); //start 메소드로 멀티쓰레드 실행
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
