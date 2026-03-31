package edu.kis.vh.nursery;

/**
 * Implementacja stosu przechowującego liczby całkowite w kolejności LIFO
 */
public class DefaultCountingOutRhymer {

    public static final int RHYMER_CAPACITY = 12;
    public static final int EMPTY_RHYMER = -1;
    public static final int DEFAULT_VALUE = -1;


    private final int[] numbers = new int[RHYMER_CAPACITY];

    private int total = EMPTY_RHYMER;

    /**
     * Sprawdza czy struktura nie jest pełna, jeśli nie to dodaje element do struktury
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza czy struktura jest pusta.
     * @return true jeśli pusta, false jesli nie
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }
    /**
     * Sprawdza czy struktura jest pełna
     * @return true jeśli pełna, false jeśli nie
     */
    public boolean isFull() {
        return total == (RHYMER_CAPACITY - 1);
    }
    /**
     * Zwraca ostatni dodany element ale go nie usuwa
     * @return Jeśli struktura jest pusta to domyślna wartośc, inaczej ostatnia wartość
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }
    /**
     * Usuwa i zwraca ostatni dodany element.
     * @return Jeśli struktura jest pusta to domyślna wartośc, inaczej ostatnia wartość
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
    /**
     * Zwraca indeks ostatniego elementu w strukturze
     * @return indeks ostatniego elementu lub -1 jeśli struktura jest pusta
     */
    public int getTotal() {
        return total;
    }
}
