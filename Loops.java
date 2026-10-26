void main(){
//FOR loop:-(print numbers from 1 to 10)
for(int counter=0;counter<=10;counter++){
    IO.println(counter);
}
// while Loop in java:-(print numbers 1 to 10)
int counter=0;
while(counter<=10){
    IO.println(counter);
    counter++;//also write-->counter=counter+1;
}

//do-while loop:-
do{
IO.println(counter);
counter++;
}while(counter<=10);

int n=Integer.parseInt(IO.readln("enter your number here:-"));

//sum of n numbers using for loop:-
int sum=0;
for(int count=1;count<=n;count++){
   sum=sum+count;
}
IO.println(sum);

//sum of n numbers using while loop:-
int sum2=0;
int count=1;
while(count<=n){
    sum2=sum2+count;
    count++;
}
IO.println(sum);

//sum of two numbers using do-while loop:-
int sum3=0;
int count2=1;
do{
    sum=sum3+count2;
    count++;
}while(count<=n);
IO.println(sum);

//DSA Question:- 1st--> write an infinite loop using do while condition:-
int i=1;
do {
    IO.println("hello");
} while(i>0);
 

//DSA Question:-2nd--> write a program to enter a numbers till the user wants and at the end it
// should display the count of positive and negative and zeros entered:-
int positive=0;
int negative=0;
int zeros=0;
char want;
do{
   int n=Integer.parseInt(IO.readln("enter a number:-"));
    if(n>0){
        positive++;
    }
    else if(n<0){
        negative++;
    }
    else{
        zeros++;
    }
   want=IO.readln("do you wnat to add more numbers:- (y/n)-->").charAt(0);
}while(want=='y'||want=='Y');

IO.println("total positive numbers are:-"+positive);
IO.println("total negative numbers are:-"+negative);
IO.println("total zeros:-"+zeros);
}