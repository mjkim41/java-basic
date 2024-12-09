package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {


        /* try() : try 안에 있는 객체의 메모리를 해제해줌.
                    => 아래 코드를 쓴 것가 동일한 효과

            finally {
                 try {
                      if(fis != null) fis.close();
                 } catch (IOException e) {
                      e.printStackTrace();
                 }
             }

        */

        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/pet.txt")) {

            int data = 0;

            // fis.read() : 파일의 내용을 순서대로 한글자씩 int로 가져옴
            //              가져올 내용이 더 이상 없을 경우 -1을 반환
            //       => 즉, 아래 코드는 더 이상 내용이 없을 때까지 반복하라는 말임
            while ((data = fis.read()) != -1) {
                // 아스키 코드를 문자로 출력
                // println 으로 출력하면 아스키 코드로 출력됨(println(byte b)메소드는 오버라이딩에 의해 아스키코드로 출력)
                System.out.write(data);
            }

            // 출력 버퍼 비우기
            System.out.flush();

        } catch (Exception e) {
            System.out.println("파일 로드에 실패했습니다");
        }

    }
}
