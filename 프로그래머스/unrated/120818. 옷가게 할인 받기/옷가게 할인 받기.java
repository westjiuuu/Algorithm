class Solution {
    public int solution(int price) {
        double sale = 0;
        if (price>=100000&&price<300000) {
            sale = (double)price*(1-0.05);
        }
        else if (price>=300000&&price<500000) {
            sale = (double)price*(1-0.1);

        }
        else if (price>=500000) {
            sale = (double)price*(1-0.2);

        }
        else {
            sale = price;
        }
        return (int)sale;
    }
}