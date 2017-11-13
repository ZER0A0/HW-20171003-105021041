import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
    public LoginFrame(){
        initComp();
    }
    private Container cp;

    private JLabel jlbID = new JLabel("ID：");
    private JLabel jlbPA = new JLabel("Password：");
    private JTextField jtf = new JTextField("OAO");
    private JPasswordField jpf = new JPasswordField("33433");
    private JButton jbtEX = new JButton("Exit");
    private JButton jbtEN = new JButton("Enter");

    public void initComp(){
        this.setBounds(400,400,400,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,3,3));
        cp.add(jlbID);
        cp.add(jtf);
        cp.add(jlbPA);
        cp.add(jpf);
        cp.add(jbtEX);
        cp.add(jbtEN);

        jbtEX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtEN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jtf.getText().equals("OAO") && new String(jpf.getPassword()).equals("33433")){
                    MainFrame MF = new MainFrame();
                    MF.setVisible(true);
                    LoginFrame.this.setVisible(false);}
                    else JOptionPane.showMessageDialog(null,"Wrong ID or Password"); }
        });
    }
}
