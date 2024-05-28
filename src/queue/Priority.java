package queue;

public enum Priority {

    high(1),
    medium(2),
    low(3);

    private int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
