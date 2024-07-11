import java.util.*;
class strongnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int i,n,x,temp,rem,fact,sum=0;
System.out.println("enter array size a");
n=sc.nextInt();
System.out.println("enter array a elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
x=a[i];
temp=x;
while(temp>0)
{
rem=temp%10;
if(rem==0)
fact=1;
else
{
fact=1;
for(i=1;i<=rem;i++)
{
fact=fact*i;
}
sum=sum+fact;
temp=temp/10;
}
if(sum==x)
System.out.println("strong numbers:" +x);
}
}
}
}