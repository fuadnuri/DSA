import java.io.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res=new ArrayList<Integer>();
        int round_to;
        for(int grade : grades){
            if(grade % 5 != 0){
                round_to = grade-(grade % 5) + 5;
                if(round_to - grade < 3 && (round_to >= 40)){
                    res.add(round_to);
                }else{
                    res.add(grade);
                }
            }
            else{
                res.add(grade);
            }
        }
        return res;

    }

}
