package socrate.calendar;

import java.util.Calendar;

public enum DayOfTheWeek {
	
	MONDAY(Calendar.MONDAY),
	TUESDAY(Calendar.TUESDAY),
	WEDNESDAY(Calendar.WEDNESDAY),
	THURSDAY(Calendar.THURSDAY),
	FRIDAY(Calendar.FRIDAY);
	
	private int day;
	
	private DayOfTheWeek(int day) {
		this.day = day;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		switch (day) {
		case Calendar.MONDAY:
			return "Monday";
		case Calendar.TUESDAY:
			return "Tuesday";
		case Calendar.WEDNESDAY:
			return "Wednesday";
		case Calendar.THURSDAY:
			return "Thursday";
		case Calendar.FRIDAY:
			return "Friday";
		default:
			return "Otherday";
		}
	}
}