package assignment06.string_utility;

import javax.swing.*;

import static java.lang.StringTemplate.STR;

public class Main extends JFrame{
    //Initialized

    //Constant
    private final String MAIN_LABEL = "String Utility";

    //Components
    private JButton buttonCountLetter;
    private JButton buttonReverseLetters;
    private JButton buttonRemoveDuplicate;
    private JTextField textFieldInput;
    private JPanel PanelMain;
    private JPanel LeftPanel;
    private JPanel RightPanel;
    private JTextField textFieldOutput;

    public Main() {
        setContentPane(PanelMain);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(MAIN_LABEL);
        setSize(700,200);
        setLocationRelativeTo(null);
        startUp();
        setResizable(false);
//        setSize();
        //Action Listener Click
        buttonCountLetter.addActionListener(e -> {
            textFieldOutput.setText(STR."\{counterLetters(textFieldInput.getText())}");
        });
        buttonReverseLetters.addActionListener(e -> {
            textFieldOutput.setText(STR."\{reverseLetters(textFieldInput.getText())}");
        });
        buttonRemoveDuplicate.addActionListener(e -> {
            textFieldOutput.setText(STR."\{removeDuplicates(textFieldInput.getText())}");
        });
    }
    public void startUp(){
        textFieldOutput.setEditable(false);
    }

    public String counterLetters(String str){
        if(str != null){
            return STR."\{str.length()}";
        }
        else return "0";
    }
    public String reverseLetters(String str){
        if(str == null){ return null;}
        if(str.isEmpty()) return str;
        else{
            return reverseLetters(str.substring(1)) + str.charAt(0);
        }
    }
    public String removeDuplicates(String str){
        if(str == null){ return null;}
        if(str.isEmpty()) return str;
        else{
            return removeDuplicatesHelper(str, "");
        }
    }
    private String removeDuplicatesHelper(String str, String str2){
        boolean isExist = false;
        if(str.isEmpty()) return str2;
        else{
            for(char c : str2.toCharArray()){
                if (str.charAt(0) == c) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist) str2 = str2 + str.charAt(0);
            return removeDuplicatesHelper(str.substring(1), str2);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
