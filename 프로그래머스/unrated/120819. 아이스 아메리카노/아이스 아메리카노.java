class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 0;
        int res = money;

        if (money >= 5500) {
            count = money / 5500; 
            res = money - count * 5500; 
        }

        answer[0] = count;
        answer[1] = res;

        return answer; 
    }
}
