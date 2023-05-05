package LinkedList;

public class Basicll {

    public static class Node{
        int data; //value
        Node next;// address of next Node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(2);
        Node e = new Node(10);

        a.next = b; // a -> b c d
        b.next = c; // a -> b -> c
        c.next = d; // a -> b -> c -> d
        //a -> b -> c-> d

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(b.next.data);
        System.out.println(c.next.data);





    }
}
