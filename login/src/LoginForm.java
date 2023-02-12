import javax.swing.*;
import java.awt.*;

public class LoginForm<jFrame> extends JDialog {
    private JTextField Temail;
    private JTextField textField1;
    private JButton btnok;
    private JButton btncancel;
    private JPanel loginpanel;


    public LoginForm(jFrame parent){

        super((Frame) parent);
        setTitle("Login");
        setContentPane(loginpanel);
        setMaximumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo((Component) parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true );
    }
    public static void main(String[] args) {
        LoginForm loginForm = new LoginFormBuilder().setParent(null).createLoginForm();
    }


}
