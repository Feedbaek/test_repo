package bonus00;

public class INT {
    public int value;
    INT(int num) {
        this.value = num;
    }

    public int prevIncrease() {
        this.value += 1;
        return this.value;
    }

    public int postIncrease() {
        int tmp = this.value;
        this.value += 1;
        return tmp;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
