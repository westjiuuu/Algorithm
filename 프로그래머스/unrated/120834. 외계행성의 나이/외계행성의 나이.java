class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        String answer = "abcdefghij";
         while (age > 0) {
            int remainder = age % 10; 
            result.insert(0, answer.charAt(remainder)); 
            age /= 10; 
        }
        return result.toString();
    }
}