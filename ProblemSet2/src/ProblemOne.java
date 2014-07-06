public class ProblemOne {

    private static String inputString;


    public static void main(String args[]) {
        setInput();
        printOutput(inputString);

    }


    private static void printOutput(String inputString) {
        /**
         * this method will print output for the given question
         */

        if(containsSingleCharacter(inputString))
            System.out.println("The give String contains only single character");
        else{
            System.out.println("The given string contains multiple same characters ");
        }
    }


    private static void setInput() {
        /**
         * this method will set the input ...
         */

         inputString = new String("asdfghjklqwertyty");
    }


    private static boolean containsSingleCharacter(String inputString) {
        /**
         * this method will return true if the values string contains only single character
         */

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
