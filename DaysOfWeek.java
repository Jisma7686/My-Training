package sample_maven;

public class DaysOfWeek {

	public String getDay(int a)
	{
	 String day = "";
	 switch(a)
	 {
	 case 1:
		 day="Sunday";
		 break;
	 case 2:
		 day="Monday";
		 break;
	 case 3:
		 day="Tuesday";
		 break;
	 case 4:
		 day="Wednesday";
		 break;
	 case 5:
		 day="Thursday";
		 break;
	 case 6:
		 day="Friday";
		 break;
	 case 7:
		 day="Saturday";
		 break;
	 default:
	     day="Invalid Entry";
	}
	 return day;
	 
	}
}
