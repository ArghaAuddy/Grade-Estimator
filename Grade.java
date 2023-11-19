import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grade {
    private JButton PROCEEDButton;
    private JTextField TXTNAME;
    private JTextField TXTMARKS1;
    private JTextField TXTMARKS2;
    private JTextField TXTMARKS3;
    private JTextField TXTTOTAL;
    private JTextField TXTAVERAGE;
    private JTextField TXTGRADE;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grade");
        frame.setContentPane(new Grade().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Grade() {
        PROCEEDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){

                int marks1,marks2,marks3,total;
                double avg;
                marks1=Integer.parseInt(TXTMARKS1.getText());
                marks2=Integer.parseInt(TXTMARKS2.getText());
                marks3=Integer.parseInt(TXTMARKS3.getText());
                total=marks1+marks2+marks3;
                TXTTOTAL.setText(String.valueOf(total));
                avg=total/3;
                TXTAVERAGE.setText(String.valueOf(avg));
                if(avg>50)
                {
                    TXTGRADE.setText("PASS");
                }
                else
                {
                    TXTGRADE.setText("FAIL");
                }
            }
        });
    }
}

