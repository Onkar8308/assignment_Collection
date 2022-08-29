package Finzly_assignmets;


public class Csv implements Comparable<Csv>{
	
	private String Ccy1;
	private String Ccy2;
	private int Spotdays;
	private String WeekendDays;
	private double Precision;
	private String LastUpdatedTime;
	

	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
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
	public int getSpotdays() {
		return Spotdays;
	}
	public void setSpotdays(int spotdays) {
		Spotdays = spotdays;
	}
	public String getWeekendDays() {
		return WeekendDays;
	}
	public void setWeekendDays(String weekendDays) {
		WeekendDays = weekendDays;
	}
	public double getPrecision() {
		return Precision;
	}
	public void setPrecision(double precision) {
		Precision = precision;
	}

	
	public Csv(String ccy1, String ccy2, int spotdays, String weekendDays, double precision, String lastUpdatedTime) {
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
		return "Csv [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", Spotdays=" + Spotdays + ", WeekendDays=" + WeekendDays
				+ ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + "]";
	}
	@Override
	public int compareTo(Csv o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
