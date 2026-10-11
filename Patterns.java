void main(){
//Using  for loop to print rectriangle pattern:-
// for(int i=1;i<=4;i++){
//     for(int x=1;x<=5;x++){
//         IO.print("*");
//     }
//     IO.println();
// }

//Make hollow rectangle patterrn using nested loops:-
// int n=4;
// int m=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if(i==1||j==1||i==n||j==m){
//     IO.print("*");
//         }
//         else{
//             IO.print(" ");
//         }
        
//     }
//     IO.println("");
// }

//Make a half pyrimed pattern using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//     IO.print("*");
//     }
//     IO.println("");
// }

//make a invert half pyrimid pattern using loop:-
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         IO.print("*");
//     }
//     IO.println();
// }

//make a invert  half pyramid in right side using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         IO.print(" ");
//     }
//         for(int x=1;x<=i;x++){
//             IO.print("*");
//         }
//         IO.println();
//     }

//make a half pyramid pattern in numbers form using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         IO.print(j);
//     }
//     IO.println();
// }

//make a inveted number pyramid using loop:-
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//      IO.print(j);
//     }
// IO.println();
// }

//make a floyd's Triangle pattern:-
// int number=1;
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         IO.print(number);
//         number++;
//     }
//     IO.println( );
// }

//make a 0-1 Triangle pattern using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//     int sum=i+j;
//     if(sum%2==0){
//         IO.print("1 ");
//     }
//     else{
//         IO.print("0 ");
//     }
//     }
//     IO.println();
// }

//Make a solid rhombus pattern using loop:-(Dsa Hommework)
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         IO.print(" ");   
//     }
//     for(int x=1;x<=5;x++){
//         IO.print("*");
//     }
//     IO.println();
// }

//make number pyramid pattern using loop:-(2nd H.W)
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         IO.print(" ");
//     }
//     for(int s=1;s<=i;s++){
//         IO.print(i+" ");
//     }
//     IO.println();
// }


//ADVANCED PATTERRN'S:-

//1-make a butterfly pattern using loop:-

    //upper half  code:-
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            IO.print("*");
        }
        for(int j=1;j<=2*(4-i);j++){
            IO.print(" ");
        }
        for(int j=1;j<=i;j++){
            IO.print("*");
        }
        IO.println();
    }
        //Lower half:-
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                IO.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                IO.print(" ");
            }
            for(int j=1;j<=i;j++){
                IO.print("*");
            }
            IO.println();
        }
 }

