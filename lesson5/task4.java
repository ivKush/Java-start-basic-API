package lesson5;

import java.util.Objects;

public class task4 {
    protected int x;
    protected int y;

    public task4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // (2, 3) (3, 2)
//        return x + y;
//        return x * 21 + y * 37;
        return Objects.hash(x, y);
    }
}
