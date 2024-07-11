import java.util.*;

class SalesCommission
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the sales amount:");
double salesAmount = scanner.nextDouble();
double commissionRate;
if(salesAmount <= 20000)
{
commissionRate = 0.03;
}
else if(salesAmount <= 50000)
{
commissionRate = 0.12;
}
else
{
commissionRate = 0.31;
}
double commission = salesAmount * commissionRate;
System.out.println("Commission earned: Rs." + commission);
}
}
