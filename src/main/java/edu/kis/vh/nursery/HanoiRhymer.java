package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    // TODO: brak ograniczenia wartości, licznik może rosnąć bez kontroli
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
