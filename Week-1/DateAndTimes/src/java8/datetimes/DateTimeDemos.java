package java8.datetimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		System.out.println("Date Time information");
		
		System.out.println(date1.getDayOfWeek());
		
		System.out.println(date1.getDayOfMonth());
		
		System.out.println(date1.getDayOfYear());
		
		System.out.println(date1.getMonth());
		
		System.out.println(date1.plusMonths(1));
		
		System.out.println(date1.minusMonths(1));
		
		LocalDate date2 = LocalDate.of(2001, 4, 17);
		
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.parse("2023-01-01");
		
		System.out.println(date3);
		
		DateTimeFormatter givenFormat=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		String formattedDate = date3.format(givenFormat);
		
		System.out.println(formattedDate);
		
		DateTimeFormatter userFormat = DateTimeFormatter.ofPattern("yy-MM-dd");
		
		String userFormatDate = date3.format(userFormat);
		
		System.out.println(userFormatDate);
		
		
	}

}
