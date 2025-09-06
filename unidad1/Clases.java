package unidad1;

public class Clases {
     public static void main(String[] args) {
    
    int num1=3;
    int num2=5;
    int num3=1;

    int nummax=num1;

    for (int i=0; i<5; i++){
        if(num1>num2 && num1>num3){
            nummax=num1;
        }
        else if(num2>num1 && num2>num3){
            nummax=num2;
        }
        else{
            nummax=num3;
        }
        }
    }
}



    


