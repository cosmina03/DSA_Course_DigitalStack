import java.util.*;

public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add("" + i);
                //answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> result = sol.fizzBuzz(15);
        
        for (String s : result) {
            System.out.println(s);
        }
    }
}
