package chap2_6.inner.sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {

    public static void main(String[] args) {


        JFrame frame = new JFrame("인스턴스 내부 클래스 예제");
        JButton button = new JButton("클릭하세요");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭했을 때 해야할 일
                JOptionPane.showMessageDialog(null, "버튼이 클릭되었습니다!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
