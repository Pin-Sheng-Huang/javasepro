package D_genericity_interface;

public interface Data<E> {
    void add(E s);
    void delete(int d);
    void update(E e);
    E queryById(int id);
}
