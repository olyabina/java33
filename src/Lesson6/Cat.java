package Lesson6;

public class Cat extends Animal {

    public static final int MAX_RUN_DISTANCE = 200;
    public static final int MAX_JUMP_HEIGHT = 2;
    public static final int MAX_SWIM_DISTANCE = 0;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight, MAX_SWIM_DISTANCE);
    }

    public Cat() {
        super(MAX_RUN_DISTANCE, MAX_JUMP_HEIGHT, MAX_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.println("Кот пробежал расстояние %d. Max=%d%n", distance, maxRunDistance);
            return true;
        }

        System.out.println("Кот не смог пробежать расстояние %n. Max=%d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
            System.out.println("Кот не умеет плавать", distance, maxRunDistance);
            return false;
    }

    @Override
    public boolean jump(int height) {
        if (this.maxJumpHeight >= height) {
            System.out.println("Кот перепрыгнул %d. Max=%d%n", height, maxJumpHeight);
            return true;
        }

        System.out.println("Кот не смог перепрыгнуть %d. Max=%d%n", height, maxJumpHeight);
        return false;
    }
}
