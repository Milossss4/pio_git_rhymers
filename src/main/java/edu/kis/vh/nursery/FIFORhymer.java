package edu.kis.vh.nursery;

/**
 * The type FIFORhymer.
 * This class implements a FIFO (First In, First Out) rhymer using a temporary DefaultCountingOutRhymer
 * to manage the order of elements.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * The temporary rhymer used to implement FIFO behavior.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the countOut method to provide FIFO behavior.
     *
     * @return the value at the front of the rhymer
     */
    @Override
    protected int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}
