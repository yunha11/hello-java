package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {

	public Date planDate;
	public String detail;
	public String peoples="";
	
	public static Date getDatefronString(String s_date)
	{
		Date date=null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(s_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public PlanItem(String date, String detail) throws ParseException
	{
	//	planDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		this.planDate =  getDatefronString(date);
		this.detail = detail;
	}
	
	public Date getDate()
	{
		return planDate;
	}
	public void addPeople(String name)
	{
		peoples += name + ",";
	}

	public String saveString() {
		
		return planDate.toString() + "," + detail + "\n";
	}
}
