void main(){

//Making simple java calculator->-
IO.print("enter your first number here->");
double first=Double.parseDouble(IO.readln());
IO.print("enter a operator symbol like->( +, - , /, %)---->");
String method=IO.readln();
IO.print("enter your second number here->");
double second=Double.parseDouble(IO.readln());

switch(method){
    case "+"->IO.println(first+second);
    case "-"->IO.println(first-second);
    case "/"->IO.println(first/second);
    case "%"->IO.println(first%second);
    default->IO.println("invalid operator selection or invalid input");
}

    }
