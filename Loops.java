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
 }