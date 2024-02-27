

        import javax.swing.*;
        import java.awt.*;

        public class PasswordGeneratorGUI extends JFrame {


            public PasswordGeneratorGUI()
            {//  Platform of the Password Generation Tool
                super("Password Generator");
                setSize(540,570);
                setResizable(false);
                setLayout(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLocationRelativeTo(null);

                addGuiComponents();
            }
            private void addGuiComponents()
            {   // Label or Title of the Password Generation Tool
                JLabel titleLabel= new JLabel("Password Generator");
                titleLabel.setFont(new Font("Dialog",Font.BOLD,32));
                titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
                titleLabel.setBounds(0,10,540,39);
                add(titleLabel);
                // Output Box for the Password Generation Tool
                JTextArea passwordOutput = new JTextArea();

                passwordOutput.setEditable(false);
                passwordOutput.setFont(new Font("Dialog",Font.BOLD,32));
                JScrollPane passwordOutputPane = new JScrollPane(passwordOutput);
                passwordOutputPane.setBounds(25,97,479,78);
                passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                add(passwordOutputPane);
                // Password Length Input box
                JLabel passwordLengthLable= new JLabel("Password Length :" );
                passwordLengthLable.setFont(new Font("Dialog",Font.PLAIN,32));
                passwordLengthLable.setBounds(25,210,272,40);
                add(passwordLengthLable);

                JTextArea passwordLengthInputArea=new JTextArea();
                passwordLengthInputArea.setFont(new Font("Dialog",Font.PLAIN,32));
                passwordLengthInputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                passwordLengthInputArea.setBounds(310,215,192,39);
                add(passwordLengthInputArea);

                //UPPER CASE TOGGLE BUTTON

                JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
                uppercaseToggle.setFont(new Font("Dialog",Font.PLAIN,26));
                uppercaseToggle.setBounds(25,302,225,56);
                add(uppercaseToggle);

                // LOWER CASE TOGGLE BUTTON

                JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
                lowercaseToggle.setFont(new Font("Dialog",Font.PLAIN,26));
                lowercaseToggle.setBounds(282,302,225,56);
                add(lowercaseToggle);

                // NUMBERS TOGGLE BUTTON

                JToggleButton numbersToggle = new JToggleButton("Numbers");
                numbersToggle.setFont(new Font("Dialog",Font.PLAIN,26));
                numbersToggle.setBounds(25,373,225,56);
                add(numbersToggle);

                // SPECIAL SYMBOLS TOGGLE BUTTON

                JToggleButton symbolsToggle = new JToggleButton("Symbols");
                symbolsToggle.setFont(new Font("Dialog",Font.PLAIN,26));
                symbolsToggle.setBounds(282,373,225,56);
                add(symbolsToggle);

                // GENERATE TOGGLE BUTTON

                JButton generateButton=new JButton("Generate");
                generateButton.setFont(new Font("Dialog",Font.PLAIN,32));
                generateButton.setBounds(155,477,222,41);
                add(generateButton);






            }
        }










