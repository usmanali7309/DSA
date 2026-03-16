package Collection;

public class LLMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertLast(99);
        list.insert(44,3);
//        list.display();
//        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();

    }
}
