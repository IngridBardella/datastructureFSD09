package customarray;

public class CustomArrayGeneric<E> {
    private Object[] data;
    private int size = 0;

    public CustomArrayGeneric(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
        }
        else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    public void add(E e) {
        //ensureSpaceForNewElement();
        data[size] = e;
        size = size + 1;
    }
}
