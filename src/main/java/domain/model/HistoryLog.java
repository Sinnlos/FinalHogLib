package domain.model;

import sun.util.calendar.BaseCalendar.Date;

public class HistoryLog {

	private Date date;
	private double amount;
	private Account from;
	private Account to;
	private double rate;
	private enum type{
		income, outcome;
	};
	
}
