import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fizbuz = new ArrayList();
        for(int i = 1; i <= n; i++){
            if(i%5==0 && i%3==0){
                fizbuz.add("FizzBuzz");
            }else if(i%5==0){
                fizbuz.add("Buzz");
            }
            else if(i%3==0){
                fizbuz.add("Fizz");
            }
            else{
                fizbuz.add(Integer.toString(i));
            }
        }
        return fizbuz;
    }
}
