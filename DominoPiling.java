import java.util.Scanner;

public class DominoPiling {
    public int solution(int M, int N){
        int soln = 0;

        soln = (M*N)/2;

        return soln;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        DominoPiling dp = new DominoPiling();
        System.out.println(dp.solution(M, N));
    }
}
