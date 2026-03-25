package Collection;

public class DLLMain {

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertLast(77);
        list.insert(33,2);
        list.insertAfter(3,88);
        list.display();
    }
}
