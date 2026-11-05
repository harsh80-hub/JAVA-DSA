void main(){
//     //Syntax of an Array in java(how array write and work in java):-
//     //1st Question:-(print and store the students marks of examination three subjects):-
//     //first method to write:-
// int marks[]=new int[3];
//     marks[0]=66;
//     marks[1]=98;
//     marks[2]=78;
//     // print and access the arrays values:-
//     //1st method:-using print function:-
//     IO.println(marks[0]);
//     IO.println(marks[1]);
//     IO.println(marks[2]);

//2nd method to write:-(Array):-
// int marks[]={55,78,99};
// //1st method:- using print function:-
//     IO.println(marks[0]);
//     IO.println(marks[1]);
//     IO.println(marks[2]);

// //2nd method for both methods of writing array in java  using loop:-
// for(int i=0;i<3;i++){
//     IO.println(marks[i]);
// }

// //2nd Question:-Take an input from user to get the values and size of an array:-
// int size=Integer.parseInt(IO.readln("enter size of array:-"));
// int numbers[]=new int[size];
// for(int i=0;i<size;i++){
//     numbers[i]=Integer.parseInt(IO.readln("enter" +i+ "number:-"));
// }
// for(int i=0;i<size;i++){
//     IO.println(numbers[i]);
// }

// //3rd Question:-Take an array input from the user and search for a given number x and print the
// // index at which it occurs:-
// int size=Integer.parseInt(IO.readln("Enter the size of an array:-"));
// int numbers[]=new int[size];
// for(int i=0;i<numbers.length;i++){
//     numbers[i]=Integer.parseInt(IO.readln("Enter the " + i + " value of an array:-"));
// }
// int x=Integer.parseInt(IO.readln("enter which number do you want to search:-"));
// for(int i=0;i<numbers.length;i++){
//     if(numbers[i]==x){
//         IO.println("The number is found on index no " + i);
//     }
// }

////4th Question:-Find the maximum & minimum number in an array of integers:-
// int size=Integer.parseInt(IO.readln("enter size of an array you want:-"));
// int arr[]=new int[size];
// for(int i=0;i<arr.length;i++){
//     arr[i]=Integer.parseInt(IO.readln("enter "+i+" value of an array:-"));
// }
// ////find max and min number in array:-
// int max=Integer.MIN_VALUE;
// int min=Integer.MAX_VALUE;
// ////MAX find:-
// for(int i=0;i<arr.length;i++){
//     if(arr[i]>max){
//         max=arr[i];
//     }
// }
// ////MIN find:-
// for(int i=0;i<arr.length;i++){
//     if(arr[i]<min){
//         min=arr[i];
//     }
// }
//  IO.println("The maximum value in given array is:- "+max);
//  IO.println("The maximum value in given array is:- "+min);

////5th Question:-Take an array of numbers as input and check if it is an array sorted in ascending
////order:-
int size=Integer.parseInt(IO.readln("enetr an size of an array:-"));
int arr[]=new int[size];
for(int i=0;i<arr.length;i++){
    arr[i]=Integer.parseInt(IO.readln("enter the "+i+" value of an array:-"));
}
boolean Order=true;
for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
        Order=false;
    }
}
if(Order){
    IO.println("The array is sorted in ascending order");
}
else{
    IO.println("The is not sorted in ascending order");
}
}