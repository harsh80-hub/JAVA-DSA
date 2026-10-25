//make a function that take the input from user and return and print his name:-
void printMyName(String n){
    IO.println(n);
    return;
 }

 //make a function that take an input and return and print sum of two numbers:-
  int calculateSum(int a, int b){
      int sum=a+b;
      return sum;
  }

  //make a function that take an input from user and return and print the product of two numbers:-
  int calculateProduct(int a,int b){
    int product=a*b;
    return product;
  }

  //make a function to find the sum of all number(Factorial) given by user:-
  void calculateFactorial(int a){
    if (a<0){
      IO.println("invalid input");
      return;
    }
    int factorial=1;
    for(int i=1;i<=a;i++){
        factorial=factorial*i;
    }
    IO.println(factorial);
    return;
  }

//DSA Questions:-

//1st:- Enter 3 numbers from user & make a function to print their average:-
float calculateAverage(int a,int b,int c){
    float average=(a+b+c)/3;
    return average;
}

//2nd:- Write a function to print the sum of all odd numbers from 1 to n:- 
 int sum=0; 
int oddSum(int n){
    for(int i=1;i<=n;i++){
        if(i%2!=0){
           sum=sum+i;
        }
    }
    return sum;
 }

//3rd:- Write a function which takes in 2 numbers and returns the greater of those two:-
int calculateGreatest(int a,int b){
    if(a>b){
        return a;
    }
    else{
        return b;
    }
}

// 4th:-
double calculateCircumference(double r){
    double circumference=2*22/7*r;
    return circumference;
}

//5th:- Write a function that takes in age as input and returns if that person is eligible to 
// vote or not.A person of age >18 is eligible to vote:-
String checkAge(int age){
    if (age>18){
    return "eligible";
    }
    else{
     return "not eligible";
    }
    }

    void main(){
    
    //1st function calling:-
    String name=IO.readln("enter your name:-");
    printMyName(name);

    //2nd function calling:-
    int a=Integer.parseInt(IO.readln());
    int b=Integer.parseInt(IO.readln());
    int sum=calculateSum(a, b);
    IO.println(sum);

    //3rd function calling:-
      int x=Integer.parseInt(IO.readln());
      int y=Integer.parseInt(IO.readln());
      int product=calculateProduct(x, y);
      IO.println("The product of two numbers is:- 2 "+product);

     int z=Integer.parseInt(IO.readln("enter the number:-"));
     calculateFactorial(z);

    //DSA QUESTIONS:-
    //1st Question calling:-
    int a=Integer.parseInt(IO.readln("enter first number:-"));
    int b=Integer.parseInt(IO.readln("enter second number:-"));
    int c=Integer.parseInt(IO.readln("enter third number:-"));
    float averge=calculateAverage(a, b, c);
    IO.println(averge);

    //2nd Question:-
    int n=Integer.parseInt(IO.readln("enter number here :-"));
    int sum=oddSum(n);
    IO.println(sum);

   //3rd Question:-
    int a=Integer.parseInt(IO.readln("enter first number:-"));
    int b=Integer.parseInt(IO.readln("enter second number:-"));
    int max=calculateGreatest(a, b);
    IO.println(max);

    //4th Question:-
    double r=Double.parseDouble(IO.readln("enter radius here:-"));
    double radius=calculateCircumference(r);
    IO.println(radius);

    //5th Question:-
    int age=Integer.parseInt(IO.readln("enter your age here:-"));
    String a=checkAge(age);
    IO.println(a);
    }