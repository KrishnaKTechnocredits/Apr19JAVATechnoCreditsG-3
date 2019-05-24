package sonalB1;
class Swap
{
void display(int a,int b)
{
	int empty;
	empty=a;
	a=b;
	b=empty;
	System.out.println("Enter value of:"+a);
	System.out.println("Enter value of:"+b);
}
public static void main(String arg[])
{ 
	Swap A1=new Swap();
	A1.display(30,40);
}
}