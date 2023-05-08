import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BubbleSort {
 
    public static void countSwaps(List<Integer> a) {
        int size = a.size();
        int count=0;
        for(int i = 0; i <=size; size--){
            for(int j = 0; j < size-1; j++){
                if(a.get(j) > a.get(j+1) ){
                    int temp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1, temp);
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Array is sorted in "+count +" swaps.");
            System.out.println("First Element: "+a.get(0));
            System.out.println("Last Element: "+a.get(a.size()-1));
        }
        else{
            System.out.println("Array is sorted in "+count+" swaps.");
            System.out.println("First Element: "+a.get(0));
            System.out.println("Last Element: "+a.get(a.size()-1));
        }
    }

}
