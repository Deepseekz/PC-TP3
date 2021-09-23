package Classes;

import java.util.Arrays;
import java.util.Iterator;

public class Grid<T> implements Iterable<T> {

    private T[][] elements;

    public Grid(T[][] elements)
    {
        this.elements = elements;
    }

    public T get(int line, int column)
    {
        return elements[line][column];
    }

    public int nbLines()
    {
        return elements.length;
    }

    public int nbColumns()
    {
        return elements[0].length;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> element = null;
        for (int line = 0 ; line > nbLines() ; line++)
            element = Arrays.stream(elements[line]).iterator();
        return element;
    }
}
