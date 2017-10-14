
//Xingcheng Zhang
//zhangxingcheng5@gmail.com
//09/29/2017
//Second attempt to improve my grade
package target.heart.rate.calculator;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author jason
 */
public class HeartRates {
      private String FirstName;
      private String LastName;
      private int Day;
      private int Month;
      private int Year;
      
      Scanner input=new Scanner(System.in);
      public HeartRates(String F,String L,int M,int D,int Y){
          FirstName=F;
          LastName=L;
          Month=M;
          Day=D;
          Year=Y;
      }
     
      
      public void setFirstName(String F){
      FirstName=F;
      }
      
      public void setLastName(String L){
      LastName=L;
      }
      
      public void setDay(int D){
      Day=D;
      }
      
      public void setMonth(int M){
      Month=M;
      }
      
      public void setYear(int Y){
      Year=Y;
      }
      
      public String getFirstName(){
      return FirstName;
      }
      
      public String getLastName(){
      return LastName;
      }
      
      public int getMonth(){
      return Month;
      }
      
      public int getDay(){
      return Day;
      }
      
      public int getYear(){
      return Year;
      }
     
      public int getAge(){
      Calendar Birth = new GregorianCalendar(Year,Month,Day);
      Calendar NowDate = new GregorianCalendar();
      int Age = NowDate.get(Calendar.YEAR)-Birth.get(Calendar.YEAR);
      if(NowDate.get(Calendar.MONTH)<Birth.get(Calendar.MONTH)){
          Age++;
      }else if(NowDate.get(Calendar.MONTH)==Birth.get(Calendar.MONTH)){
          if(NowDate.get(Calendar.DAY_OF_MONTH)<Birth.get(Calendar.DAY_OF_MONTH)){
              Age++;
          }
      }
      return Age;
      }
      
      public double HeartRateMaximun(){
      int MHR=220-getAge();
      return MHR;
      }
      
      public double TargetHeartRateRangeMin(){
      double THRRM=HeartRateMaximun()*0.50;
      return THRRM;
      }
      
      public double TargetHeartRateRangeMax(){
      double THRRM=HeartRateMaximun()*0.85;
      return THRRM;
      }
      
    
}
