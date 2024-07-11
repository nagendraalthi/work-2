//write a java prg which reads priciple amount,time period and rate of intrest from user then calculate the simple intrest
import java.util.*;
class simpleintrest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int principle_amount,time_period;
float SI,rate_of_interest;
System.out.pintln("enter the time period");
time_period=sc.nextInt();
System.out.pintln("enter the rate of intrest");
rate_of_intrest=sc.nextFloat();
SI=(principle_amount*time_period*rate_of_intrest)/100;
System.out.pintln("simple intrest="+SI);
}
}