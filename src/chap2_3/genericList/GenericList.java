package chap2_3.genericList;

import java.util.Arrays;

// 제네릭 배열을 관리하는 제네릭 리스트 클래스
public class GenericList<T> {

    // 속성
    private T[] arr;

    // 생성자
    public GenericList() {
        // !! 생성할 때는 바로 new T[]로는 생성 불가
        arr = (T[]) new Object[0];
    }
    public GenericList(T... initItems) {
        arr = initItems;
    }

    // 원본을 복제하는 기능
    public T[] copy(int capacity) {
        T[] newSizeArray = (T[]) new Object[arr.length  + capacity];
        int loopCount = (capacity >= 0) ? arr.length : newSizeArray.length;
        for (int i = 0; i < loopCount; i++) {
            newSizeArray[i] = arr[i];
        }
        return newSizeArray;
    }

    // 데이터를 맨 끝에 추가
    public void push(T newItem) {
        T[] temp = copy(1);
        temp[temp.length - 1] = newItem;
        arr = temp;
    }
    // 데이터를 맨 끝에서 제거
    public T pop() {
        if (arr.length == 0) {
            System.out.println("더 이상 제거할 수 없습니다.");
            return null;
        }
        T deletedElem = arr[arr.length - 1];
        arr = copy(-1);
        return deletedElem;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}











