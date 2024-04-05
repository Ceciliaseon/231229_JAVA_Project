package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Date02 {

	public static void main(String[] args) {
		
		// LocalDateTime
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); // LocalDateTime 형태 
		System.out.println(today.getYear());
		String t = today.toString(); // toStrimg() 스트링으로 객체를 변환
		System.out.println(t); // String 형태
	
		System.out.println("------------");
		
		// 날짜 2024-01-26 / 시간 17:03:39
		System.out.println(t.substring(0,10));
		System.out.println(t.substring(11,19));
		
		System.out.println("------------");
		String date = t.substring(0,t.indexOf("T"));
		String time = t.substring(t.lastIndexOf("T")+1,t.indexOf("."));
		System.out.println(date + " / " + time);
		System.out.println();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2003, 04, 20, 8, 30);
		System.out.println(sDate.format(dtf));
		
		
	}

}

