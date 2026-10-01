import java.util.*;
public class Calculator{
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);

//Making simple java calculator:-
System.out.print("enter your first number here:-");
double first=sc.nextDouble();
System.out.print("enter a operator symbol like:-( +, - , /, %)---->");
String method=sc.next();
System.out.print("enter your second number here:-");
double second=sc.nextDouble();

switch(method){
    case "+":System.out.println(first+second);
    break;
    case "-":System.out.println(first-second);
    break;
    case "/":System.out.println(first/second);
    break;
    case "%":System.out.println(first%second);
    break;
    default:System.out.println("invalid operator selection or invalid input");
}

    }
}