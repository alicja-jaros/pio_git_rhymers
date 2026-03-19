package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int RHYMER_SIZE = 12;
    public static final int EMPTY_RHYMER = -1;

    private final int[] numbers = new int[RHYMER_SIZE];

    public int total = EMPTY_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return total == (RHYMER_SIZE - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER;
        return numbers[total--];
    }

}
