import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        // Validates inpit
        if (direction != 'R' && direction != 'L') return array; 
        if (array.length == 0) return array; 
        
        int n = array.length;
        move = move % array.length;

        // Negetive moves change to positive and their direction changes also
        if (move < 0){  
            move = -1 * move;
            direction = (direction == 'L') ? 'R' : 'L';
        }   
        
        // Converts left shift to it's equal right shift (checks if move doesn't equal to zero to not make unnecessary loops)
        if (direction == 'L' && move > 0){
            move = n - move;
        }

        // Shifts array move times
        for (int i = 0; i < move; i++){
            int last = array[n - 1]; // Save last number
            // Shift all element one step to the right (walking backwards)
            for (int j = n - 1; j > 0; j--){
                array[j] = array[j - 1];
            }
            array[0] = last; // saves the last elemnt at the front
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}