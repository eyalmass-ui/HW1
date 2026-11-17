public class Assignment01Q01 {
    public static void main(String[] args) {
        // a loop that goes through every string from the argument given
        for (String str : args){ 
            char firstCh = str.charAt(0); // first char of the string

            //if the first char of the string is divisble by 5 print it
            if (firstCh % 5 == 0){ 
                System.out.println(firstCh);
            }
        }
    }
}
