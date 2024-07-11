//write a java program which reads marks of three subjects of a student and find sum and average
import java.util.*;
class sumandaverage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m1,m2,m3,sum;
float avg;
System.out.pintln("enter the marks of three subjects of a student");
m1=sc.nextLine();
m2=sc.nextLine();
m3=sc.nextLine();
sum=m1+m2+m3;
avg=sum/3.0f;
System.out.pintln("sum of three subjects="+sum);
System.out.pintln("avarage of three subjects =" +avg);
}
}
