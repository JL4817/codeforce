import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ID_160A {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfCoins = input.nextInt();
        input.nextLine();
        String valueCoin = input.nextLine();

        String[] strArray = null;   
        strArray = valueCoin.split("(?!^)"); 
        Arrays.sort(strArray, Collections.reverseOrder());

        String[] otherHalf = strArray.clone();
        Arrays.sort(otherHalf);

        ArrayList<Integer> equal1 = new ArrayList<Integer>();

        int finaleValue1 = 0;
        int twin = 0;
        int count =0;

        if((numberOfCoins)%2==0){

        for (int i = 0; i<strArray.length; i++){
        
                finaleValue1 = finaleValue1 + Arrays.asList(strArray).indexOf(i);
        }

        for (int j = 0; j<otherHalf.length; j++){
        
            twin = twin + Arrays.asList(strArray).indexOf(j);;
        }

        if(finaleValue1 < twin || finaleValue1 == twin){

            for (int i = 0; i<strArray.length; i++){
         
        }

        }

    }else{
        
    }

    


    }
    
}
