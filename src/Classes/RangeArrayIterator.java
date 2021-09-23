package Classes;

import java.util.Iterator;
import java.util.function.Consumer;

public class RangeArrayIterator<T> implements Iterator<T> {

    RangeArray<T> object;

    public RangeArrayIterator(RangeArray<T> object) {
        this.object = object;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;

        if ()


        return result;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action);
    }
}
