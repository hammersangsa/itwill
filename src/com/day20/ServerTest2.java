package com.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<>();
	
	public void serverStart() {
		
		try {
			
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 시작...");
			
			while(true) {
				
				Socket sc = ss.accept();
				
				WorkerThread th = new WorkerThread(sc);//sc가 th로 감
				th.start();
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	class WorkerThread extends Thread{//스레드는 소켓이 필수 요소
		
		private Socket sc;
		
		public WorkerThread(Socket sc) {//기본생성자 없이 생성자 오버로딩
			//의존성 주입
			this.sc = sc;
		}
		
		@Override
		public void run() {

			String ip = null;
			String msg = null;
			
			try {
				
				BufferedReader br = new BufferedReader(
						new InputStreamReader(sc.getInputStream()));
				//초기화한 sc
				ip = sc.getInetAddress().getHostAddress();
				
				clients.add(sc);
				
				//다른 클라이언트에게 접속 사실을 알린다.(본인 제외)
				msg = ip + "] 가 입장했습니다";
				
				//중요부분
				for(Socket s : clients) {
					
					if(s==sc) {
						continue;//이번만 패스한다
					}
					
					PrintWriter pw = 
							new PrintWriter(s.getOutputStream(), true);
					
					pw.println(msg);				
				}
				System.out.println(msg);//서버에 대화 보임(채팅창에 띄워봐라)
				
				//메세지 전송
				while((msg=br.readLine())!=null) {
					
					for(Socket s : clients) {
						
						if(s==sc) {
							continue;//이번만 패스한다
						}
						
						PrintWriter pw = 
								new PrintWriter(s.getOutputStream(), true);
						
						pw.println(msg);				
					}
					System.out.println(msg);
					
				}
				
			} catch (Exception e) {
				
				msg = ip + "] 가 퇴장했습니다";
			
				try {

					for(Socket s : clients) {
						
						if(s==sc) {
							continue;//이번만 패스한다
						}
						
						PrintWriter pw = 
								new PrintWriter(s.getOutputStream(), true);
						
						pw.println(msg);				
					}
					System.out.println(msg);
					sc = null;
					
				} catch (Exception e2) {

				}
				
			}
							
			}
	}
	
	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}

}
