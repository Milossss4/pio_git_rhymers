package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }
    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaTop())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

}
