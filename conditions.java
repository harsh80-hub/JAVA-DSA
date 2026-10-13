void main(){
    
     //example 1:-(check age usin if-else statement)
     int a=Integer.parseInt(IO.readln());
     if (a>=18){
        IO.println("Adult");
     }
     else{
        IO.println("Teenager");
     }
      
    //example 2:-(check the input number is even or odd using if-else statement):-
      int num=Integer.parseInt(IO.readln());
    if(num%2==0){
        IO.println("it an even number");
    }
    else{
        IO.println("its an odd number");
    }

    //example 3:-(using if-elseif-else ,to check more than one condition):-
    int x=Integer.parseInt(IO.readln());
    int y=Integer.parseInt(IO.readln());
    if (x==y){
        IO.println("number is equal");
    }
        else if(x>y){
            IO.println("a is greater than b");
        }
        else{
            IO.println("b is greater than a");
        }

    //Switch Statement:-
    int button=Integer.parseInt(IO.readln());
    switch(button){
        case 1->IO.println("hello");
        case 2->IO.println("Namaste");
        case 3->IO.println("Pranam");
        default->IO.println("invalid input");
    }
}