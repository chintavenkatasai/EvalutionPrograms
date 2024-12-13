package Evalutionprograms;

public class Table 
{
int Sai(int a)
{
	System.out.println((9*a));
	return 9*a;
}
public static void main(String[] args) 
{
for (int i=1;i<=10;i++)
{
Table T=new Table();
T.Sai(i);
}
}
}
