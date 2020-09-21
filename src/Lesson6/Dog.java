package Lesson6;

public class Dog extends Animal {

    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_JUMP_HEIGHT = 0.5;
    public static final int MAX_SWIM_DISTANCE = 10;

    public Dog(int maxRunDistance, int maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight, MAX_SWIM_DISTANCE);
    }

    public Dog() {
        super(MAX_RUN_DISTANCE, MAX_JUMP_HEIGHT, MAX_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.println("Собака пробежала расстояние %d. Max=%d%n", distance, maxRunDistance);
            return true;
        }

        System.out.println("Собака не смогла пробежать расстояние %n. Max=%d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (this.maxSwimDistance >= distance) {
            System.out.println("Собака проплыла расстояние %d. Max=%d%n", distance, maxSwimDistance);
            return true;
        }

        System.out.println("Собака не смогла проплыть расстояние %n. Max=%d%n", distance, maxSwimDistance);
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (this.maxJumpHeight >= height) {
            System.out.println("Собака перепрыгнула %d. Max=%d%n", height, maxJumpHeight);
            return true;
        }

        System.out.println("Собака не смогла перепрыгнуть %d. Max=%d%n", height, maxJumpHeight);
        return false;
    }



}
