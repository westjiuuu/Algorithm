class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<rsp.length(); i++){
            if (rsp.charAt(i) == '2') {
                char win = '0';
                result.append(win);
            }
            else if (rsp.charAt(i) == '0') {
                char win = '5';
                result.append(win);
            }
            else if (rsp.charAt(i) == '5') {
                char win = '2';
                result.append(win);
            }
        }
        return result.toString();
    }
}