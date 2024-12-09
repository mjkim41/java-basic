package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 바이트 기반 스트림: 이미지, 영상, 소스코드 파일 등등의 모든 데이터를 전송
// 그런데 전송단위가 1바이트 단위라 바이트 스트림이라 불림
public class FileOutputExample {

    public static void main(String[] args) {

        // 바이트 기반 출력 스트림 : 파일을 내보낸다 - Save기능
        try {
            FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/pet.txt");
            // FileOutputStream.write(byte[] b)
            fos.write(new byte[] {97, 99, 101});
            // 문자열을 그대로 저장하려면, getBytes()를 쓰면 됨(메모장은 기본적으로 아스키 코드를 문자열로 변환해서 보여 줌)
            fos.write(new byte[] {97, 98, 99});
            fos.write("97, 98, 99".getBytes());

        } catch (Exception e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        }
    }
}
