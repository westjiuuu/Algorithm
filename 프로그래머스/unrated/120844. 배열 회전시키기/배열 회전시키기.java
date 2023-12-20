import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }

        if (direction.equals("right")) {
            int temp = list.remove(list.size() - 1);
            list.add(0, temp);
        } else if (direction.equals("left")) {
            int temp = list.remove(0);
            list.add(temp);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}