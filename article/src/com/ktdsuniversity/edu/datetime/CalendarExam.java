package com.ktdsuniversity.edu.datetime;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH);
		System.out.println(month);
		
		int date = now.get(Calendar.DATE);
		System.out.println(date);
		
		//1(일요일) ~ 7(토요일)
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weekDays = {"일","월", " 화 ", "수","목","금","토"};
		System.out.println(weekDays[week - 1] + "요일");
		
		//1999 - 08 -21
		Calendar birthdate = Calendar.getInstance();
		birthdate.set(1995, 11 -1, 16);
		week = birthdate.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDays[week - 1] + "요일");
		
		// 오늘 날짜부터 56일 후는 몇월 며칠 무슨 요일?
		Calendar now2 = Calendar.getInstance();
		now2.add(Calendar.DAY_OF_MONTH, 56); // .add 무엇을 얼마나 더하고 뺼꺼냐
		//now2에서 연월 일 요일 출력
		
		//2025년 2월 4일은 2026년 2월 4일 보다 과거인가?
		Calendar now3 = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		past.set(2025, 2 - 1, 4);
		
		//now3의 시간이 1970년 1월  1일 0시 0분 0초부터 얼마나 흘렀나?
		long nowTime = now3.getTimeInMillis();
		System.out.println(nowTime);
		long pastTime = past.getTimeInMillis();
		System.out.println(pastTime);
		
		if(pastTime < nowTime) {
			System.out.println("더 과거 입니다.");
		}
		// 2026년 2월 4일부터 2026년 7월 14일까지 며칠이 걸리나?
		Calendar now4 = Calendar.getInstance();
		int daysCounts = 0;
		while(true) {
			now4.add(Calendar.DAY_OF_MONTH, 1); //하루씩 증가
			daysCounts++;
			
			if(now4.get(Calendar.YEAR) == 2026
					&& now4.get(Calendar.MONTH) == 6 
					&& now4.get(Calendar.DAY_OF_MONTH) == 14) {
				break;
			}
			System.out.println(daysCounts + "일 걸렸습니다");
		}
		//오늘부터 7영업일 이후는 몇년 몇월 며칠 무슨요일?  실무에서 많이나옴
		Calendar now5 = Calendar.getInstance();
		Calendar spast = Calendar.getInstance();
		now5.set(2026, 2, 6); // 날짜 셋팅
		int weekday = 0; // 날짜카운트
		int worksDays = 7; //7일 뒤
		while(true) {
			now5.add(Calendar.DAY_OF_MONTH, 1); //
			weekday = now5.get(Calendar.DAY_OF_WEEK);// 
			
			if (weekday != 1 && weekday !=7) { // 만약에 남은 카운트수가 1,또는 7이 아닐경우
				worksDays--;	// 하루씩 차감
			}
			int nextYear = now5.get(Calendar.YEAR);
			int nextMonth = now5.get(Calendar.MONTH) + 1 ;
			int nextDate = now5.get(Calendar.DAY_OF_MONTH);
			weekday = now5.get(Calendar.DAY_OF_WEEK);
			
			System.out.println( nextYear+  "-"+ nextMonth+ "-" + nextDate + "-" + weekday[weekday-1] + "요일 입니다.");	
		}
		
		
		
	}
}
