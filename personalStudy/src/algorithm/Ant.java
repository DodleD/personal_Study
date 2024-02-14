package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ant {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N1 = 0;
		int N2 = 0;
		
		N1 = Integer.parseInt(st.nextToken());
		N2 = Integer.parseInt(st.nextToken());
		
		String antN1 = br.readLine();
		String antN2 = br.readLine();
		int num = Integer.parseInt(br.readLine());
		char[] cArrN1 = new char[antN1.length()];
		char[] cArrN2 = new char[antN2.length()];
		String reverseN1 = "" ;
		for(int i =antN1.length()-1 ; i>=0; i--) {
			reverseN1 += antN1.charAt(i);
		}
		
		for(int i =0; i<antN1.length(); i++) {
			cArrN1[i]=reverseN1.charAt(i);
		}
		for(int i =3; i<antN1.length()+antN2.length(); i++) {
			cArrN2[i]=antN2.charAt(i-3);
		}
		
		for(int i = 0; i<num; i++) {
			char tmp = 
		}
		
		
//		System.out.println(N1 + " " + N2 + " " + antN1 + " " + antN2 + " " + sb);
		
		
	}

}
