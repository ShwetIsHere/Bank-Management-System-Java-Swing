/*
+-------------------Developed by ShwetIsHere---------------------+
|                                                                |
|   Name: Shwet Patel                                            |
|   Git-Hub: https://github.com/ShwetIsHere                      |
|   Linked In: https://www.linkedin.com/in/shwetishere/          |
|   Email: contactshwetishere@gmail.com                          |
|                                                                |
+----------------------------------------------------------------+
*/
// First read README.md for how to run project

package bankmanagementsystem;

//importing libraries
import javax.swing.*; //use for creating ui
import java.awt.*; //use image class
import java.awt.event.*; //  for implement ActionListener
import java.sql.*;

// actionlistener will notice that user click on any function (Buttons)
public class Login extends JFrame implements ActionListener {

    // we have to declare this variable and text fields globally because we want to
    // use that in actionPerform class
    JButton login, signup, clear, exit;
    JTextField cardTextField;
    JPasswordField pinTextField;

    // create constructer for first run this block of code
    Login() {

        setTitle("Shwet Bank");

        // set bank logo
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader
                .getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        // add text in interface
        JLabel text = new JLabel("Welcome Back...!");
        text.setFont(new Font("Osward", Font.BOLD, 38)); // giving font styles
        text.setBounds(200, 40, 400, 40); // giving location to that text
        add(text);

        // add card number lebel and text field
        JLabel cardno = new JLabel("Card No: ");
        cardno.setFont(new Font("Releway", Font.BOLD, 28)); // giving font styles
        cardno.setBounds(120, 150, 150, 30); // giving location to that text
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        // add pin label and text field
        JLabel pin = new JLabel("Pin: ");
        pin.setFont(new Font("Releway", Font.BOLD, 28)); // giving font styles
        pin.setBounds(120, 220, 250, 30); // giving location to that text
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        // add buttons (sign in, clear and sign up)
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK); // give color to font and background
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK); // give color to font and background
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK); // give color to font and background
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        // exit button
        exit = new JButton("Exit");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Raleway", Font.BOLD, 14));
        exit.setBounds(300, 400, 230, 30);
        exit.addActionListener(this);
        add(exit);

        // giving backgroud color
        getContentPane().setBackground(Color.WHITE);

        // giveing size, visibility and location from top left
        setSize(800, 500);
        setLocation(350, 200);
        setVisible(true);

    }

    // this function we must have to create for perform certain task on user
    // interaction. that why we import java.awt.event.*; class
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == clear) {

            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
                conn.s.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == signup) {
            setVisible(false); // disappear login page and appear signup page new SignupOne().setVisible(true);
            new SignupOne().setVisible(true);
        } else if (ae.getActionCommand().equals("Exit")) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {

        new Login();

    }
}
