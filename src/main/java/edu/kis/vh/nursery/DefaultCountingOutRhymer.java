package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY = -1;
    public static final int CAPACITY = 11;
    private int[] numbers = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY;
    }

    protected boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaTop() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
