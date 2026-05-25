package com.nt.collectionenhancements;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		
		//This is before java 8
		System.out.println("This is before java 8");
		Date d=new Date();
		System.out.println(d);
		
		//Date
		System.out.println("This is after java 8 only date");
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		//Time
		System.out.println("This is after java 8 only time");
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		//DateTime
		System.out.println("This is after java 8 only date and time");
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		//Date after 32 days
		System.out.println(ld.plusDays(32));
		
		//Date before 32 days
		System.out.println(ld.minusDays(32));
		
		System.out.println("Printing date by numbers by of method");
		LocalDate d1=LocalDate.of(2026, 7, 29);
		LocalDate d2=LocalDate.of(2026, Month.MAY, 26);
		System.out.println(d1);
		System.out.println(d2);
		
		//Duration dur=Duration.between(d1,ld); //duration is supported only for LocalDateTime,LocalTime that's why error
		Period pr=Period.between(ld,d1); //can be used with LocalDate
		System.out.println(pr.getMonths());
		
		//With localDateTime duration usage rem between
		LocalDateTime ldt1=LocalDateTime.now();
		LocalDateTime ldt2=LocalDateTime.of(2026, 7, 29, 0, 0);
		Duration dur=Duration.between(ldt1, ldt2);
		System.out.println(dur.toDays());
		System.out.println(dur.toHours());
		System.out.println(dur.toMinutes());
		System.out.println(dur.toMinutes());
		System.out.println(dur.getSeconds());
		
		//Converting string date to date format
		LocalDateTime ldt3=LocalDateTime.now();
		System.out.println(ldt3);
		
		DateTimeFormatter ft= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter onlydate= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(ft.format(ldt3)); //this is string we are converting datetime to string
		
		String date="2026-07-29 12:30:55";
		String date1="2026-07-29";
		System.out.println(LocalDateTime.parse(date,ft)); //to convert string to datetime format
		System.out.println(LocalDate.parse(date1,onlydate)); //to convert string to only date format
		
		
	}
}
