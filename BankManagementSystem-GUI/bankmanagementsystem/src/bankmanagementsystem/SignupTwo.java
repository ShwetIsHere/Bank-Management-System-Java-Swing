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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JComboBox religionCombo, categoryCombo, incomeCombo, occupationCombo, educationCombo;
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionDetailes = new JLabel("Page 2: Additional Details");
        additionDetailes.setFont(new Font("Raleway", Font.BOLD, 22));
        additionDetailes.setBounds(290, 80, 400, 30);
        add(additionDetailes);

        // religion
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String valReligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "other" };
        religionCombo = new JComboBox(valReligion);
        religionCombo.setBounds(300, 140, 400, 30);
        religionCombo.setBackground(Color.WHITE);
        add(religionCombo);

        // category
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String valCategory[] = { "General", "OBC", "SC", "ST", "Other" };
        categoryCombo = new JComboBox(valCategory);
        categoryCombo.setBounds(300, 190, 400, 30);
        categoryCombo.setBackground(Color.white);
        add(categoryCombo);

        // income
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String incomeCategory[] = { "No Income", "< 1,650,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000" };
        incomeCombo = new JComboBox(incomeCategory);
        incomeCombo.setBounds(300, 240, 400, 30);
        incomeCombo.setBackground(Color.white);
        add(incomeCombo);

        // educational
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        // qualification
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String educationValues[] = { "Non-Graduation", "Graduate", "Post-Graduate", "Doctrate", "Other" };
        educationCombo = new JComboBox(educationValues);
        educationCombo.setBounds(300, 315, 400, 30);
        educationCombo.setBackground(Color.white);
        add(educationCombo);

        // occupation
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String occupationValues[] = { "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other" };
        occupationCombo = new JComboBox(occupationValues);
        occupationCombo.setBounds(300, 390, 400, 30);
        occupationCombo.setBackground(Color.white);
        add(occupationCombo);

        // Pan number
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        // aadhar number
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        // senior citizen
        JLabel citizen = new JLabel("Senior Citizen: ");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup citizenGroup = new ButtonGroup();
        citizenGroup.add(syes);
        citizenGroup.add(sno);

        // existing account
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existGroup = new ButtonGroup();
        existGroup.add(eyes);
        existGroup.add(eno);

        // next button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        // giving size of interface
        getContentPane().setBackground(Color.WHITE); // set background color of ui to white
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String religion = (String) religionCombo.getSelectedItem();
        String category = (String) categoryCombo.getSelectedItem();
        String income = (String) incomeCombo.getSelectedItem();
        String education = (String) educationCombo.getSelectedItem();
        String occupation = (String) occupationCombo.getSelectedItem();

        // Get Gender
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        // Get Marital Status
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }
        // Get Address, City, State, Pin
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();

        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) "
                    +
                    "VALUES ('" + formno + "', '" + religion + "', '" + category + "', '" + income + "', '" + education
                    + "', '"
                    + occupation + "', '" + pan + "', '" + aadhar + "', '" + seniorcitizen + "', '" + existingaccount
                    + "')";

            c.s.executeUpdate(query);
            c.s.close();
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
