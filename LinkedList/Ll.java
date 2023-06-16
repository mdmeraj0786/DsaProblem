package LinkedList;

public class Ll {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void displayLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void recursivelyDisplay(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        recursivelyDisplay(head.next);
    }

    static void reverseLinkedList(Node head){
        if(head==null){
            return;
        }
        reverseLinkedList(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(12);
        Node f = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        //Display Linked list
        displayLinkedList(a);

        System.out.println();

        //display recursively
        recursivelyDisplay(a);

        System.out.println();

        //display in reverseOrder
        reverseLinkedList(a);

    }
}
