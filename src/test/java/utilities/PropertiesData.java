package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesData {
	private String appURL, browserName, fromCity, toCity, departureDate, returnDate, passenger;
	
	public PropertiesData()
	{
		Properties prop = new Properties();
		FileInputStream systemInput;
		
		try {
			
			systemInput=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\files\\Ixigo.properties");
			prop.load(systemInput);
		
			setURL(prop.getProperty("ixigoURL"));
			setBrowser(prop.getProperty("browserName"));		
			setFromCity(prop.getProperty("fromCity"));
			setToCity(prop.getProperty("toCity"));
			setDepartureDate(prop.getProperty("departureDate"));
			setReturnDate(prop.getProperty("returnDate"));
			setPassengers(prop.getProperty("passenger"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public String getURL(){
		return appURL;
	}
	public String getBrowser(){
		
		return browserName;
	}
	
public String getFromCity(){
		
		return fromCity;
	}
public String getToCity(){
	
	return toCity;
}
public String getDepartureDate(){
	
	return departureDate;
}
public String getReturnDate(){
	
	return returnDate;
}
public String getPassenger(){
	
	return passenger;
}
	
	
	public void setURL(String url) {
		this.appURL = url;
	}
	
	public void setBrowser(String browser){
		this.browserName=browser;
	}
	
	public void setFromCity(String fromCity){
		this.fromCity=fromCity;
	}
	public void setToCity(String toCity){
		this.toCity=toCity;
	}
	public void setDepartureDate(String departureDate){
		this.departureDate=departureDate;
	}
	public void setReturnDate(String returnDate){
		this.returnDate=returnDate;
	}
	
	public void setPassengers(String passenger){
		this.passenger=passenger;
	}
	
	
}
