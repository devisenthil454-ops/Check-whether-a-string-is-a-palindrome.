import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] arr=s.toCharArray();
String rev=""; 
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+arr[i]; 
}
if(s.equals(rev))
{
System.out.print("Palindrome"); 
}
else
{
System.out.print("Not Palindrome");
}
}
}
