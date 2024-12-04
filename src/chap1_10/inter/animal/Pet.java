package chap1_10.inter.animal;

public interface Pet {

    // 애완동물로서 필요한 기술
    void handle();
    boolean inject();

    // !! 뒤늦게 추상메서드를 추가할 때는
    default void sleep() {};
}
