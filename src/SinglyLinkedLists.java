public class SinglyLinkedLists {
    class Node {
        private int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Insert at Begin
    Node head;
    public void insertAtBegin(int data){
        Node a = new Node(data);
        a.next = head;
        head = a;
    }

    //Insert at End
    public void insertAtEnd(int data){
        Node b = new Node(data);
        if(head == null){
            head = b;
            return;
        }
        b.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
            temp.next = b;
    }
    public void deleteData(int data){
        if(head == null){
            System.out.println("The List is Empty");
        }
        if(head.data == data){
            head = head.next;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found in list.");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        SinglyLinkedLists sll = new SinglyLinkedLists();
        sll.insertAtBegin(10);
        sll.insertAtBegin(20);
        sll.insertAtBegin(30);
        sll.insertAtBegin(40);
    }
}