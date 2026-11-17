public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int loopTimes = Integer.parseInt(args[0]);

        // a loop that runs argument value to caculate pie
        for (int i = 0; i < loopTimes; i++){
            // if even than we add else we subtruct acording to the mathematical expression
            if (i % 2 == 0) approxPi += 1.0 / (i * 2 + 1);
            else approxPi -= 1.0 / (i * 2 + 1);
        }
        
        approxPi *= 4; // according to the mathematical expression
                
        System.out.println(approxPi + " " + actualPi);
    }
}
