import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private boolean hasPeeked;
    private Integer peekedElm;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!hasPeeked) {
            peekedElm = iterator.next();
            hasPeeked = true;
        }

        return peekedElm;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (hasPeeked) {
            hasPeeked = false;
            return peekedElm;
        }

        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return hasPeeked || iterator.hasNext();
    }
}