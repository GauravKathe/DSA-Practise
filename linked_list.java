class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class linked_list {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        Node node = new Node(arr[1]);
        System.out.println(node.data);
    }
}
