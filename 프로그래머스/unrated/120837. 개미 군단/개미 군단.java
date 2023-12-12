class Solution {
    public int solution(int hp) {
        int answer = 0;
        int 장군 = hp/5;
        int 병정 = hp%5/3;
        int 일 = hp%5%3;
        answer = 장군 + 병정 + 일;
        return answer;
    }
}