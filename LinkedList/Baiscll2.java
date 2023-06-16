package LinkedList;

public class Baiscll2 {

    static void recursivePrint(Node head){
        if(head == null){
            return;
        }
        System.out.println(head);

    }
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(15);
        Node b = new Node(16);
        Node c = new Node(18);
        Node d = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }
}
