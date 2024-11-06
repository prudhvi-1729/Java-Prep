package algorithms;

public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        Node() {
        }
        Node(int d) {
            data = d;
        }
        Node(int d, Node n) {
            data = d;
            next = n;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

        Node curr = head;
        Node Previous = null;
        Node next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=Previous;
            Previous=curr;
            curr=next;
        }

        System.out.println(Previous);
        //iterate
        while(Previous!=null){
            System.out.println(Previous.data);
            Previous=Previous.next;
        }
    }
}
