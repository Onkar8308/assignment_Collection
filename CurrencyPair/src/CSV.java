import java.util.ArrayList;

public class CSV {
	
	private String Ccy1;
	private String Ccy2;
	private String Spotdays;
	private String WeekendDays;
	private String Precision;
	private String LastUpdatedTime;
	
	public CSV() {
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
	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
	}
	
	
	public CSV(String ccy1, String ccy2, String spotdays, String weekendDays, String precision, String lastUpdatedTime) {
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
		return "CSV [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", Spotdays=" + Spotdays + ", WeekendDays=" + WeekendDays
				+ ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + "]";
	}


	public void Sortbycurrency(ArrayList<CSV> cs) {
		cs.sort((CSV d1,CSV d2) -> ((d1.getCcy1()+d1.getCcy2()).compareTo(d2.getCcy1()+d2.getCcy2())));

		
	}
	
	public void sortbytime(ArrayList< CSV> cs) {
		cs.sort((CSV d1,CSV d2) -> (d1.getLastUpdatedTime().compareTo(d2.getLastUpdatedTime())));

	}
}
