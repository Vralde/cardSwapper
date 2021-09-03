/*
Pseudokode:
arrayListe : 6, 2, 29, 13, 3, 9, 22

Start:
1. Start fra plads 2 [1]
2. Tjek om værdien fra den tidligere plads er større end den nuværende plads
3. Hvis ja, så byt rundt på pladserne, og start fra step 1, hvis nej, så gå videre til den næste plads, og gentag step 2.
Slut
*/

public class CardSorter{

    public static boolean cardSwapper(int[] arr, int index1, int index2){
        boolean swapmade = false;
        if(arr[index1] < arr[index2]){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            swapmade = true;
        }
        return swapmade;
    }
    public static void main(String[] args){
        int[] arr = {6, 2, 29, 13, 3, 9, 22};
        for(int j = 1; j < arr.length; j++){
            if(cardSwapper(arr, j, j-1)){
                j = 1;
            }
        }
         for(int a : arr){
             System.out.println(a);
         }
    }
}

//temp = arr[index1];
//arr[index1] = arr[index2];
//arr[index2] = tempp;