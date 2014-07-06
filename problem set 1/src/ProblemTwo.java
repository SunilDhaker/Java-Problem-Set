public class ProblemTwo {


    private static String inputString;


    public static void main(String[] args) {

        setInput();
        String output = compressStringUsingString(inputString);
        printOutputString(output);

    }


    public static String compressStringUsingString(String inputString) {
        /**
         * This method compress a given String and returns compressed String
         */

        int frequency = 1;
        StringBuilder outputString = new StringBuilder();
        char testCharacter = inputString.charAt(0);

        for (int i = 1; i < inputString.length(); i++) {

            if (testCharacter == inputString.charAt(i))
                frequency++;

            else {
                outputString.append(testCharacter).append(frequency) ; //= outputString + testCharacter + frequency;
                testCharacter = inputString.charAt(i);
                frequency = 1;
            }

        }

        outputString = outputString.append(testCharacter).append(frequency);// + testCharacter + frequency;

        return outputString.toString();
    }


    public static void printOutputString(String outputString) {
        /**
         * This method simply prints the output String
         */

        System.out.println(outputString);

    }


    private static void setInput() {
        /**
         * this method set input String for the compression
         */

        inputString = new String("aaaaaabbbbbbbbcccccdddddddddeeffghiii");
    }

}