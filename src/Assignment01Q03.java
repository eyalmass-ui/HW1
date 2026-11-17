public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int prevNum = 0;
        int currNum = 1;
        int temp = 0; // temporery num to change curr and prev values after every loop
        int numOdd = 0;

        // Fibonacci sequence
        for (int i = 0; i < x; i++) {
            System.out.print(currNum);

            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space

            if (currNum % 2 != 0) numOdd++; //adds one to odd count in sequnce if current num is odd

            temp = prevNum;
            prevNum = currNum; //changes previous to current num
            currNum = temp + currNum; // changes current num to next num in the sequence

        }
        System.out.println();
        
        
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
