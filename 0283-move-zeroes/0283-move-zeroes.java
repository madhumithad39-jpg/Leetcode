import java.util.Arrays;

class Solution {

    public void moveZeroes(int[] current) {

        int index = 0;
        int correct = 0;
        int size = current.length;

        while (index < size) {

            if (current[index] != 0) {
                current[correct] = current[index];
                correct++;
            }

            index++;
        }

        Arrays.fill(current, correct, size, 0);
    }
}