package racingcar;

public class Car {
    private int location;
    private final String name;

    private final static int MAX_NAME_LENGTH = 5;

    private final static int MOVE_POINT = 4;

    public Car(int location, String name) {
        this.location = location;
        validateName(name);
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void move() {
        location++;
    }

    public void tryToMove() {
        if (RandomNumberUtil.getRandomNumber() >= MOVE_POINT) {
            move();
        }
    }

    public void validateName(String name) {
       if (name.length() > MAX_NAME_LENGTH)
           throw new IllegalArgumentException("자동차 이름은 " + MAX_NAME_LENGTH +"자 이하로 입력해주세요 :)");
    }
}
