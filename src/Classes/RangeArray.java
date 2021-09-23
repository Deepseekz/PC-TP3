package Classes;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class RangeArray<T> implements Iterable<T>{
    private int userIndexMin;
    private int userIndexMax;

    private int naturalIndexMin;
    private int naturalIndexMax;
    private T[] array;

    public RangeArray(int userIndexMin, int userIndexMax)
    {
        this.userIndexMin = userIndexMin;
        this.userIndexMax = userIndexMax;

        this.naturalIndexMin = naturalFromUserIndex(userIndexMin);
        this.naturalIndexMax = naturalFromUserIndex(userIndexMax);

        Object[] arrayObject = new Object[rangeSize()];
        this.array = (T[]) arrayObject;
    }

    public int getIndexMin()
    {
        return userIndexMin;
    }

    public int getIndexMax()
    {
        return userIndexMax;
    }

    public T get(int userIndex)
    {
        int naturalIndex = naturalFromUserIndex(userIndex);
        return array[naturalIndex];
    }

    public void set(int userIndex, T newValue)
    {
        int naturalIndex = naturalFromUserIndex(userIndex);
        array[naturalIndex] = newValue;
    }

    public int rangeSize()
    {
        return userIndexMax - userIndexMin + 1;
    }

    public int naturalFromUserIndex(int userIndex)
    {
        return userIndex - userIndexMin;
    }

    public int userFromNaturalIndex(int naturalIndex)
    {
        return naturalIndex + userIndexMin;
    }

    @Override
    public Iterator<T> iterator() {
        return new RangeArrayIterator<>(this);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
