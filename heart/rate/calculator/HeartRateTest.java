/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Xingcheng Zhang
//zhangxingcheng5@gmail.com
//09/29/2017
//Second attempt to improve my grade
package target.heart.rate.calculator;
import java.util.Scanner;
/**
 *
 * @author jason
 */
public class HeartRateTest {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your First Name: ");
    String FirstName=input.nextLine();
    System.out.println("Enter your Last Name: ");
    String LastName=input.nextLine();
    System.out.println("Enter your Day of Birth(Follow by Month, Day, Year with white space): ");
    int month=input.nextInt();
    int day=input.nextInt();
    int year=input.nextInt();
    HeartRates info=new HeartRates("","",month,day,year);
    info.setFirstName(FirstName);
    info.setLastName(LastName);
    System.out.println("Heart Rate Test Start.....");
    System.out.printf("%s%s%s",info.getFirstName()," ",info.getLastName());
    System.out.println();
    System.out.printf("%02d/%02d/%02d",info.getMonth(),info.getDay(),info.getYear());
    System.out.println();
    System.out.printf("%d",info.getAge());
    System.out.println();
    System.out.printf("%.2f",info.HeartRateMaximun());
    System.out.println();
    System.out.println("The target-heart-rate range is: ");
    System.out.printf("%.2f %s %.2f" ,info.TargetHeartRateRangeMin(),"-",info.TargetHeartRateRangeMax());
    System.out.println();
    }
}
