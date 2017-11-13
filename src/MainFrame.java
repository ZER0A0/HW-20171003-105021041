import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame{
    public MainFrame(){
        initComp();
    }
    private Container cp;
    private JPanel jpa = new JPanel(new GridLayout(3,3,3,3));

    private JTextField jtf = new JTextField();
    private JButton jbtn[] = new JButton[9];

    private Random ran = new Random();

    private void initComp(){
        this.setBounds(400,400,600,800);

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2,2));
        cp.add(jtf,BorderLayout.NORTH);
        cp.add(jpa,BorderLayout.CENTER);
        for(int x = 0 ; x < 9 ; x++){
            jbtn[x] = new JButton(Integer.toString(ran.nextInt(9)+1));
            for (int y = 0 ; y <= x ; y ++){
            if (x != 0 && jbtn[x].getText() == jbtn[y].getText()){
                jbtn[x] = new JButton(Integer.toString(ran.nextInt(9)+1));
                }}
            jpa.add(jbtn[x]);
            jbtn[x].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton jbt = (JButton)e.getSource();
                    jtf.setText(jtf.getText() + jbt.getText());
                }
            });
        }

    }
}
