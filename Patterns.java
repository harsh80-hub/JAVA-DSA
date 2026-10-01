public class Patterns{
    public static void main(String args[]){
    
//Using  for loop to print rectriangle pattern:-
// for(int i=1;i<=4;i++){
//     for(int x=1;x<=5;x++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//Make hollow rectangle patterrn using nested loops:-
// int n=4;
// int m=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if(i==1||j==1||i==n||j==m){
//     System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
        
//     }
//     System.out.println("");
// }

//Make a half pyrimed pattern using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//     System.out.print("*");
//     }
//     System.out.println("");
// }

//make a invert half pyrimid pattern using loop:-
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//make a invert  half pyramid in right side using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//         for(int x=1;x<=i;x++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

//make a half pyramid pattern in numbers form using loop:-
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

//make a inveted number pyramid using loop:-
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//      System.out.print(j);
//     }
// System.out.println();
// }

//make a floyd's Trianglr pattern:-
// int number=1;
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(number);
//         number++;
//     }
//     System.out.println( );
// }

//make a 0-1 Triangle pattern using loop:-
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("");
    }
}
    }
}