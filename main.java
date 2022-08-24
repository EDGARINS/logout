import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello, world!");

        frame.setTitle("My application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);


        JPanel Dashbord = new JPanel();
        Dashbord.setLayout(null);

        JLabel textD = new JLabel("Hello, world!");
        textD.setBounds(1,1,80,25 );
        Dashbord.add(textD);

        JButton SignOut = new JButton("Sign OUT");
        SignOut.setBounds(1,25,100,20);
        Dashbord.add(SignOut);



        JLabel username = new JLabel("Username: ");
        username.setBounds(1,1,80,25 );
        panel.add(username);

        TextField usernameField = new TextField();
        usernameField.setBounds(80,5,100,20);
        panel.add(usernameField);

        JButton okButton = new JButton("Sign IN");
        okButton.setBounds(5,120,100,20);
        panel.add(okButton);

        JLabel Error = new JLabel("");
        Error.setBounds(5,140,160,25 );
        panel.add(Error);

        okButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String UserN = usernameField.getText();
                if (UserN.isEmpty()){
                    Error.setText("Error");
                } else if (UserN.equals("edgars")){
                    Error.setText("Correct");
                    frame.remove(panel);
                    frame.add(Dashbord);
                    frame.repaint();
                    frame.setTitle("Welcome " + UserN );
                }
            }
        });
        SignOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(Dashbord);
                frame.add(panel);
                frame.repaint();
                Error.setText("You are logged out!");
            }
        });


    }

}
