package Collection;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

   public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
       if(head != null){
           head.prev = node;
       }
       head = node;
   }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;
        }
//       Node node = new Node(val,temp.next);
//        temp.next = node;
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    public void insertAfter(int after,int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Node Not Found");
            return;
        }
        Node node = new Node(val);
        p.next = node;
        node.next = p.next;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node find(int val){
       Node node = head;
        while (node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }

        return null;
    }


    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            last = temp;
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();

        System.out.println("Print In Reverse");
        while (last!=null){
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.print("Start");
    }





    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next,Node prev) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
