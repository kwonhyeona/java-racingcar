package racingcar;

public class Car {
    private static final int LIMIT_NUM = 4;
    private int position;
    private String name;

    public Car() {
    }

    Car(int position) {
        this.position = position;
    }

    public Car(int position, String name) {
        this.position = position;
        this.name = name;
    }

    int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    int move(int randomValue) {
        if (randomValue >= LIMIT_NUM)
            this.position++;
        return this.position;
    }

}
