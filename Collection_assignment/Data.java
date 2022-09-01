package Collection_assignment;

import java.time.LocalDateTime;

import Collection_assignment.Data;

public class Data {
	private String Ccy1;
	private String Ccy2;
	private String Spotdays;
	private String WeekendDays;
	private String Precision;
	public LocalDateTime LastUpdatedTime;
	
	
	public Data() {
	}
	
	public String getCcy1() {
		return Ccy1;
	}
	public void setCcy1(String ccy1) {
		Ccy1 = ccy1;
	}
	public String getCcy2() {
		return Ccy2;
	}
	public void setCcy2(String ccy2) {
		Ccy2 = ccy2;
	}
	public String getSpotdays() {
		return Spotdays;
	}
	public void setSpotdays(String spotdays) {
		Spotdays = spotdays;
	}
	public String getWeekendDays() {
		return WeekendDays;
	}
	public void setWeekendDays(String weekendDays) {
		WeekendDays = weekendDays;
	}
	public String getPrecision() {
		return Precision;
	}
	public void setPrecision(String precision) {
		Precision = precision;
	}
	public LocalDateTime getLastUpdatedTime() {
		return LastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
	}
	
	public Data(String ccy1, String ccy2, String spotdays, String weekendDays, String precision,
			LocalDateTime lastUpdatedTime) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		Spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
	}

	
	@Override
	public String toString() {
		return "Data [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", Spotdays=" + Spotdays + ", WeekendDays=" + WeekendDays
				+ ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + "]";
	}


}
