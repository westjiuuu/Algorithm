class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i=1; i<51; i++){
            if (6*i%n==0){
                result = i;
                break;
            }
        }
        return result;
    }
}