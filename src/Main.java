import Classes.Grid;
import Classes.RangeArray;

public class Main {

    public static void main(String[] args) {

        // Exercice 1 : Tableaux
        // 1.
        int indexMin = -3;
        int indexMax = 1;
        RangeArray squares = new RangeArray(indexMin, indexMax);

        for (int index = squares.getIndexMin() ; index <= squares.getIndexMax() ; index++)
            squares.set(index, index*index);

        for (int index = squares.getIndexMin() ; index <= squares.getIndexMax() ; index++)
            System.out.println(index + " -> " + squares.get(index));

        System.out.println(squares.rangeSize());

        // 2.
        RangeArray<String> habitations = new RangeArray<String>(3, 5);
        habitations.set(3, "Maison");
        habitations.set(4, "Immeuble");
        habitations.set(5, "Hutte");
        for (int index = habitations.getIndexMin() ; index <= habitations.getIndexMax() ; index++)
            System.out.print(habitations.get(index).length() + " ");

        // 3.
        // TODO : Fonctionnel, mais chercher le fonctionnement précis de Iterable et changer le stream par un code plus propre
        for (String habitation : habitations)
            System.out.print(habitation + " ");

        // Exercice 2 : Iterateur sur des grilles
        // 1.
        String[][] elements = {{"A","C","E","G"},{"B","D","F","H"}};
        Grid<String> grid = new Grid<>(elements);
        for (int line = 0 ; line < grid.nbLines() ; line++)
            for (int column = 0 ; column < grid.nbColumns() ; column++)
            {
                String element = grid.get(line, column);
                System.out.print(element + " ");
            }
        System.out.println();

        // 2.
        // TODO : Methodes T next() et hasNext() de Iterator<T> pour rendre cette syntaxe fonctionnelle.
        for (String element : grid)
            System.out.print(element + " ");
        System.out.println();
    }
}
