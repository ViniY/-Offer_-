import com.sun.jdi.ArrayReference;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

/***
 * This is the third question in the book
 * The program aims to find the repeat number in the input list
 *
 *
 * The specialty of this problem is that we only consider n numbers and we already know all the number is from 0~n-1
 *
 * So we dont need to use commonly know sorting algorithms like bubble sorts quick sorts etc. Since these sorting algorithms has
 * Time Complexity of O(nlogn) we can use a better one which can have time complexity of O(logn)
 */


public class Q3FindRepeatNumber {
    ArrayList<Integer> inputList = new ArrayList<>();
    int[]  memSet;
    int barometer = 0;
    int length = 0;

    public Q3FindRepeatNumber(ArrayList<Integer> input) {
        this.inputList = input;
        this.length = this.inputList.size();
        this.memSet = new int[this.length];
    }
    private boolean solve(){
//        ArrayList<Integer> toSolve = this.sorting(this.inputList);
        ArrayList<Integer> toSolve = this.inputList;
        memSet[toSolve.get(0)] = toSolve.get(0);// put the number at the first to the right position of the number in the list
        for(int i =1; i < this.length; i++){
            this.barometer++;
//            if (memSet.length<= i ){
                int pointer = toSolve.get(i);// variable holding the value pointing at in the input list
                try {// here we are inserting the value being pointed to the memSet with correct position
                    int checker = memSet[pointer];

                    if (checker == pointer){
                        System.out.println(pointer);
                        return true;
                    }

                    else{
                        memSet[pointer] = pointer;
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(pointer);

                    return false;
                }
            }
//        }
        return false;
    }
//
//    private ArrayList<Integer> sorting(ArrayList<Integer> toSort){
//       int length = toSort.size();//get the length of the input list
//       // then we start the sorting
//        for (int i =0; i < length; ++i){
//            while()
//        }
//
//
//        return null;
//    }

    public static void main(String[] args) {
//        ArrayList<Integer> input = new ArrayList<>();
//        for(String i : args){
//            int f = Integer.parseInt(i);
//            input.add(f);
//        }
        ArrayList<Integer> input = new ArrayList<>();
        // testing with the given case [0,2,3,1,0,2,5,3]
        input.add(0);
        input.add(2);
        input.add(3);
        input.add(1);
        input.add(0);
        input.add(2);
        input.add(5);
        input.add(3);
        Q3FindRepeatNumber q3 = new Q3FindRepeatNumber(input);
//
        boolean ans = q3.solve();
        System.out.println("The result of the input list is : "+  Boolean.toString(ans));
        System.out.println("The time complexity of this program is : "+  Integer.toString(q3.barometer));
    }
}
