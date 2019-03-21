import java.lang.*;
import java.util.Scanner;

 class checker {
void fun(char ch){
if(ch == 'a'|| ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i')
{System.out.println("VOWEL");}
else 
{
System.out.println("INVALID");
}
}
}

public class vowel{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("INPUT:");
char ch = scan.next().charAt(0);
checker o = new checker();
o.fun(ch);
} 
}
