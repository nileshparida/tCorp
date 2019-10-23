import java.util.*;
class area
{
float PI=3.14f;
void areaOfcircle(int x)
{
 float area=PI*x*x;
System.out.println("Area Circle="+area);
}
void areaOfcylinder(int x,int y)
{
float area=PI*x*x*y;
System.out.println("Area Cylinder="+area);
}
public static void main(String...k)
{
int r,r1,h;
Scanner sc= new Scanner(System.in);
r=sc.nextInt();
r1=sc.nextInt();
h=sc.nextInt();
area ob= new area();
ob.areaOfcircle(r);
ob.areaOfcylinder(r1,h);
}}