
public class SingleLinkedList<E> {


    public class Node {
        E data;
        Node next = null;
    }

    private Node start;//Head of the linked list
    private Node last;// tail of the linked list

    public SingleLinkedList() {
        /**
         *  Default constructor  of Single linked List class
         */

    }
// prob 1 kholna

    public void add(E object) {
        /**
         *  this method will simply add a object to linked list !!
         */

        if (start == null) {
            start = new Node();
            start.data = object;
            last = start;
        } else {
            last.next = new Node();
            last = last.next;
            last.data = object ;
        }
    }


    public E remove(int index)  {

        /**
         * this method will remove the entry at specific index given
         */

        Node temp ;
        Node tempPrev;
        if (index == 0) {// case when head is removing !!
            temp = start;
            start = start.next;
            return temp.data;
        } else {  // case when other part then head is removing ..!!
            tempPrev = start;
            for (int i = 0; i < index - 1; i++) {
                tempPrev = tempPrev.next;
            }
            if(index == size()) // taking care of last !! i.e tail of the linked list
                last = tempPrev ;

            temp = tempPrev.next ;
            tempPrev.next = temp.next;
        }
      return  temp.data;
    }


    public E get(int index)  {
        /**
         * this method will return the entry at specific index !!
         */

        Node temp ;

        if (index == 0) {// case when head is popped !!
            temp = start;
            return temp.data;
        } else {  // case when other part then head is popped ..!!
            temp = start;
            for (int i = 0; i < index ; i++) {

                temp = temp.next;
            }
        }
        return  temp.data;
    }


    public Node getNode(int index) {

        /**
         * this method will return node at specific index !!
         */

        Node temp ;

       if (index == 0) {// case when head is popped !!
            temp = start;
            return temp;
        } else {  // case when other part then head is popped ..!!
            temp = start;
            for (int i = 0; i < index ; i++) {

                temp = temp.next;
            }
        }
        return  temp;
    }


    @Override
    public String toString(){
        /**
         * this method will convert a linked list int a string!!
         */

        Node temp = start ;
        String toString = "" ;

        while (temp != null){
            toString = toString + "->" + temp.data ;
            temp = temp.next;
        }
        return  toString ;
    }

    public int size(){
        /**
         * this method will return the size of the linked list !!
         */
        int size = 0 ;
        Node temp = start ;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        return  size ;
    }

    public void setStart(Node start) {
        /**
         * this method will replace the start node
         */

        this.start = start;
    }

}
