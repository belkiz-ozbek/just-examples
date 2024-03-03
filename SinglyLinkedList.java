package linkedlist;

public class SinglyLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    void insert(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;

    }

    void print(){

        if(head == null){
            System.out.println("list is empty");
        }else{
            Node temp = head;

            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    void insertHead(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            node.next = null;
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    void insertTail(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            node.next = null;
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void insertMiddle(int indis, int data){
        Node node = new Node();
        node.data = data;

        if(head == null && indis  == 0){
            node.next = null;
            head = node;
            tail = node;
        }else if(head != null && indis == 0){
            node.next = head;
            head = node;
        }else{
            Node temp = head;
            Node temp2;

            for(int i = 0; i < indis - 1; i++){
                temp = temp.next;
            }

            temp2 = temp.next;
            temp.next = node;
            node.next = temp2;

        }

    size++;
    }

    void deleteHead(){
        if(head == null){
            System.out.println("list is empty!");
        }else if(head.next == null){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        size--;
    }

    void deleteTail(){

        if(head == null){
            System.out.println("list is empty");
        }else if(head.next == null){
            head = null;
            tail = null;
            size--;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp = null;
            size--;
        }

    }

    void deleteFromMiddle(int indis){
        if(head == null && indis == 0){
            System.out.println("The list is empty!");
        }else if(head != null && indis == 0){
            head = head.next;
        }else{
            Node current = head;
            Node prev = head;
            int counter = 0;
            while(current.next != null){
                counter++; //List'in size'ından bir eksik.
                current = current.next;
                if(counter == indis){
                    prev.next = current.next;
                    break;
                }
                prev = prev.next;
            }

            if(indis > counter){
                System.out.println( indis + ". eleman yok!!");
            }
        }
    }

    public static void main(String[] args) {

    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    singlyLinkedList.insert(12);
    singlyLinkedList.insertMiddle(0, 16);
    singlyLinkedList.insert(15);
    singlyLinkedList.insert(42);
    singlyLinkedList.insert(32);
    singlyLinkedList.insertMiddle(3, 3);
    singlyLinkedList.deleteHead();
    singlyLinkedList.deleteTail();
    singlyLinkedList.deleteFromMiddle(3);
    singlyLinkedList.deleteFromMiddle(0);
    singlyLinkedList.deleteFromMiddle(5);
    singlyLinkedList.print();

    }
}