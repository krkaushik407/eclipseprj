package oops.dateTime.examples.a1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		// LocalDateTime.now()
		// returns LocalDateTime object
		// returns current date-time from the system clock in the default time zone.
		LocalDateTime timestamp = LocalDateTime.now();
		System.out.println(timestamp);

		// getDayOfWeek()
		// returns the day-of-week field, which is an enum DayOfWeek
		DayOfWeek dayOfWeek = timestamp.getDayOfWeek();
		System.out.println(dayOfWeek);

		// getDayOfMonth()
		// returns the primitive int value for the day-of-month
		int dayOfMonth = timestamp.getDayOfMonth();
		System.out.println(dayOfMonth);

		// getDayOfYear()
		// returns the primitive int value for the day-of-year
		int dayOfYear = timestamp.getDayOfYear();
		System.out.println(dayOfYear);

		// getHour()
		// returns the hour-of-day from 0 to 23
		int hour = timestamp.getHour();
		System.out.println(hour);

		// getMinute()
		// returns the minute-of-hour, from 0 to 59
		int minute = timestamp.getMinute();
		System.out.println(minute);

		// getSecond()
		// returns the second-of-minute, from 0 to 59
		int second = timestamp.getSecond();
		System.out.println(second);

		// getNano()
		// returns the nano-of-second, from 0 to 999,999,999
		int nano = timestamp.getNano();
		System.out.println(nano);

		// getYear()
		// returns the primitive int value for the year.
		int year = timestamp.getYear();
		System.out.println(year);

		// getMonth()
		// returns the month-of-year field using the Month enum.
		Month month = timestamp.getMonth();
		System.out.println(month);

	}
}
