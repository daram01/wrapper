package wrapper;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		c.get(Calendar.YEAR);
//		System.out.println(c.get(Calendar.YEAR) + "년 ");
//		System.out.println((c.get(Calendar.MONTH)+1) + "월 "); // 0 ~ 11
//		System.out.println(c.get(Calendar.DATE) + "일");
//		System.out.println(c.get(Calendar.HOUR) + "시 ");
//		System.out.println(c.get(Calendar.MINUTE) + "분 ");
//		System.out.println(c.get(Calendar.SECOND) + "초 ");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "요일 "); //1. 일요일
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년 입력");
		int year = sc.nextInt(); //2022년
		System.out.println("월 입력");
		int month = sc.nextInt(); //10월
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDAY = Calendar.getInstance(); // 오늘 날짜를 기준으로 객체 생성됨
		Calendar eDAY = Calendar.getInstance();
		
		sDAY.set(year, month-1,1); // 시작하는 달의 1일 날짜로 초기화
		eDAY.set(year, month,1);   // 다음달 1일 날짜로 초기화
		
		eDAY.add(Calendar.DATE, -1); // 전달의 마지막 날짜
		
		START_DAY_OF_WEEK = sDAY.get(Calendar.DAY_OF_WEEK); // 7 : 토요일
		END_DAY = eDAY.get(Calendar.DATE);  // 31일
		
		System.out.println("       " + year +"년 " + month +"월");
		System.out.println(" SU MO TU WE TH FR SA ");
		
		for(int i=1; i<START_DAY_OF_WEEK;i++) {
			System.out.print("   ");
		}
		
		for(int i=1, n = START_DAY_OF_WEEK ; i<=END_DAY;i++,n++) {
			System.out.print((i < 10 ? "  " + i:" " +i));
			if(n % 7 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
