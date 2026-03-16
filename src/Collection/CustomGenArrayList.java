package Collection;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;

    public CustomGenArrayList() {
        data =  new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return  size == data.length;
    }

    private void resize() {
        Object temp[] = new Object[data.length*2];
        for (int i =0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T remove = (T)data[--size];
        return remove;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size()
    {
        return size;
    }

    public void set(int index,T value ){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
//        list.add("shsjs");
        System.out.println(list);
    }
}
