import java.util.*;
class studentdetails
{
public static void main(String args[])
{
int rollnumber,semester;
String name,branch;
char gender;
float marks;
Scanner sc=new Scanner(System.in);
System.out.println("enter student name");
name=sc.nextLine();
System.out.println("enter student branch");
branch=sc.nextLine();
System.out.println("enter student gender");
gender=sc.next().charAt(0);
System.out.println("enter student rollnumber");
rollnumber=sc.nextInt();
System.out.println("enter student semester");
semester=sc.nextInt();
System.out.println("enter student marks");
marks=sc.nextFloat();
System.out.println("student details are:");
System.out.println("enter student rollnumber:" +rollnumber);
System.out.println("enter student semeter:" +semester);
System.out.println("enter student name:" +name);
System.out.println("enter student branch:" +branch);
System.out.println("enter student gender:" +gender);
System.out.println("enter student marks:" +marks);
}
}