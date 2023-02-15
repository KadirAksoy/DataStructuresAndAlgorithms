package data_structures.linkedlist;

public class OurLinkedList<T> {

    Node headNode;

    public OurLinkedList() {
        this.headNode = headNode;
    }

    public void add(Object value){
        Node newNode = new Node(value , null);
        if (headNode == null){
            headNode = newNode;
        }else {
            newNode.next = headNode;
            headNode = newNode;

        }
    }

    public void delete(){
        headNode = headNode.next;
    }

    public void display(){
        Node node = headNode;
        while (node!=null){
            System.out.println((T)node.value);
            node = node.next;
        }
    }
}
