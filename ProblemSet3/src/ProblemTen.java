public class ProblemTen {

    private static  SingleLinkedList<Integer> inputLinkedList;
    public static void main(String args[]) {

        setInput();
        System.out.print(isPalindrome(inputLinkedList));

    }


    public static void setInput(){
        /**
         * this method will set the input for the problem
         */

        inputLinkedList = new SingleLinkedList<Integer>();
        inputLinkedList.add(5);
        inputLinkedList.add(25);
        inputLinkedList.add(30);
        inputLinkedList.add(15);
        inputLinkedList.add(30);
        inputLinkedList.add(25);
        inputLinkedList.add(55);
    }


    private static boolean isPalindrome(SingleLinkedList<Integer> inputLinkedList) {

        int size = inputLinkedList.size();
        for(int i = 0 ; i < inputLinkedList.size() / 2 ; i++){
           if(inputLinkedList.get(i) != inputLinkedList.get(size - 1 -i))
               return  false;
        }
        return true ;
    }
}

