package D_generictiy_Demo;
// 定义一个泛型接口 List，表示列表
public interface List <E>{
    void add(E element);
    E get(int index);
}
// 实现泛型接口 List
class ArrayList<E> implements List<E> {
    private E[] array;
    private int size;

    public ArrayList() {
        array = (E[]) new Object[10];
        size = 0;
    }

    @Override
    public void add(E element) {
        array[size++] = element;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }
}

 class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println("元素第一位: " + list.get(1));
    }
}