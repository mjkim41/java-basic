
package chap1_3.arrayList;

public class ListMain {

    public static void main(String[] args) {

        // 문자열 데이터를 배열로 모아서 보관
        StringList students = new StringList("고길동", "마이콜");
        students.push("김또또");
        students.push("박삐삐");
        students.pop();

        students.printArray();

        StringList hobbies = new StringList("영화감상");
        hobbies.push("수영");
        hobbies.push("축구");
        hobbies.push("낮잠");

        hobbies.printArray();


        System.out.println("students의 주소값: " + students);
        System.out.println("students sArr의 주소값: " + students.sArr);
        System.out.println("hobbies의 주소값: " + hobbies);
        System.out.println("hobbies sArr의 주소값: " + hobbies.sArr);

    }
}
