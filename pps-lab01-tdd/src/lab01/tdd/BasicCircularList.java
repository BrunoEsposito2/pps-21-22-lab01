package lab01.tdd;

import java.util.LinkedList;
import java.util.Optional;

public class BasicCircularList implements CircularList {

    private final LinkedList<Integer> circularList;
    private int position;

    public BasicCircularList() {
        this.circularList = new LinkedList<>();
        this.position = -1;
    }

    @Override
    public void add(int element) {
        this.circularList.add(element);
    }

    @Override
    public int size() {
        return this.circularList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.circularList.size() == 0;
    }

    @Override
    public Optional<Integer> next() {
        if (this.position == this.size() - 1) {
            this.position = -1;
        }
        return Optional.of(this.circularList.get(++this.position));
    }

    @Override
    public Optional<Integer> previous() {
        if (this.position == -1 || this.position == 0) {
            this.position = this.size();
        }
        return Optional.of(this.circularList.get(--this.position));
    }

    @Override
    public void reset() {
        this.position = -1;
    }

    @Override
    public Optional<Integer> next(SelectStrategy strategy) {
        for (final int i : this.circularList) {
            if (strategy.apply(i)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
