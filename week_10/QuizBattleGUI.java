import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    JLabel lblQuestion;
    JLabel lblResult;

    JButton btnNew;
    JButton btnClass;

    Questions question;

    public QuizBattleGUI() {

        question = new Questions(
                "Which keyword creates an object?",
                "new",
                "class",
                "new"
        );

        setTitle("Programming Quiz Battle");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        lblQuestion = new JLabel(question.getQuestion());

        btnNew = new JButton("new");
        btnClass = new JButton("class");

        lblResult = new JLabel("Answer the question!");

        btnNew.addActionListener(this);
        btnClass.addActionListener(this);

        add(lblQuestion);
        add(btnNew);
        add(btnClass);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}