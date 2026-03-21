package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int RHYMER_CAPACITY = 12;
    public static final int EMPTY_RHYMER = -1;
    public static final int DEFAULT_VALUE = -1;

    private final int[] numbers = new int[RHYMER_CAPACITY];

    public int total = EMPTY_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return total == (RHYMER_CAPACITY - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
