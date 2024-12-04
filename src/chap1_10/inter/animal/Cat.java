package chap1_10.inter.animal;

public class Cat implements Wild, Pet {

    // 애완동물로 키울 수 있음
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    // 난폭한 행동
    @Override
    public void violent() {

    }


    // 사냥 불가
}
