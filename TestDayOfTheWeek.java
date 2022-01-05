package sample_maven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDayOfTheWeek {
 @Test
public static void  test1()
{
	int test_data=0;
	DaysOfWeek obj = new DaysOfWeek();
	String actual_result = obj.getDay(test_data);
	String expected_result="Invalid Entry";
	Assert.assertEquals(actual_result, expected_result,"test failed");
}
 public static void  test2()
 {
 	int test_data=1;
 	DaysOfWeek obj = new DaysOfWeek();
 	String actual_result = obj.getDay(test_data);
 	String expected_result="Sunday";
 	Assert.assertEquals(actual_result, expected_result,"test failed");
 }
 public static void  test3()
 {
 	int test_data=7;
 	DaysOfWeek obj = new DaysOfWeek();
 	String actual_result = obj.getDay(test_data);
 	String expected_result= "Saturday";
 	Assert.assertEquals(actual_result, expected_result,"test failed");
 }
 public static void  test4()
 {
 	int test_data=8;
 	DaysOfWeek obj = new DaysOfWeek();
 	String actual_result = obj.getDay(test_data);
 	String expected_result="Invalid Entry";
 	Assert.assertEquals(actual_result, expected_result,"test failed");
 }

}
