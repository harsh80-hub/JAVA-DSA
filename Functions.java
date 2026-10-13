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

  //make a function that taje an input from user and return and print the product of two numbers:-
  int calculateProduct(int a,int b){
    int product=a*b;
    return product;
  }

  //make a function to find the sum of a number given by user:-
  void calculateFactorial(int a){
    if (a<0){
      IO.println("inva4lid input");
      return;
    }
    int factorial=1;
    for(int i=1;i<=a;i++){
        factorial=factorial*i;
    }
    IO.println(factorial);
    return;
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

     int z=Integer.parseInt(IO.readln());
     calculateFactorial(z);
    }