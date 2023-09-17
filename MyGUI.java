import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI{
    public MyGUI() {
        int randomNumber = ( (int) Math.ceil(Math.random() * 100 + 0.000001) ); // generate a random number between 1 and 100


        JFrame frame = new JFrame();
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Number Guesser");

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel prompt = new JLabel("Enter your guess between 1 and 100 inclusive:");
        prompt.setBounds(30, 40, 450, 25);
        panel.add(prompt);

        JTextField numberField = new JTextField(5);
        numberField.setBounds(325, 40, 55, 25);
        panel.add(numberField);

        JLabel message = new JLabel("");
        message.setBounds(75, 125, 250, 25);
        panel.add(message);

        JButton button = new JButton("Enter");
        button.setBounds(23, 70, 75,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberGuessed = Integer.parseInt(numberField.getText());

                if (numberGuessed == randomNumber) {
                    message.setText("You guessed the correct number!");
                    return;
                }

                if (randomNumber - 1 <= numberGuessed && numberGuessed <= randomNumber + 1) {
                    message.setText("You are about to touch the sun");
                    return;
                }

                if (randomNumber - 5 <= numberGuessed  && numberGuessed <= randomNumber + 5) {
                    message.setText("OMG it's blazing hot in here...");
                    return;
                }

                if (randomNumber - 10 <= numberGuessed  && numberGuessed <= randomNumber + 10) {
                    message.setText("You're really getting warmer now!");
                    return;
                }

                if (randomNumber - 25 <= numberGuessed && numberGuessed <= randomNumber + 25) {
                    message.setText("You're getting kind of warmer...");
                    return;
                }

                if (randomNumber - 50 <= numberGuessed || numberGuessed <= randomNumber + 50) {
                    message.setText("You're really cold...");
                    return;
                }
            }
        });


        panel.add(button);
        frame.setVisible(true);
    }
}
