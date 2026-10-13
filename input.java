void main(){
    // input only one word:-
    String name=IO.readln();
    IO.println(name);

    //input more than one words:-
    String twoWords=IO.readln();
    IO.println(twoWords);

    //input integer values:-
    int age=Integer.parseInt(IO.readln());
    IO.println(age);

    //input float values:-
    float height=Float.parseFloat(IO.readln());
    IO.println(height);

    //take input from user and find sum of two numbers:-
    int a=Integer.parseInt(IO.readln("enter first number here:-"));
    int b=Integer.parseInt(IO.readln("enter second number here:-"));
    int sum=a+b;
    IO.println(sum);
    }
 