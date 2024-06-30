package assignment06.metric_conversion_assistant;

import javax.swing.*;

import static java.lang.StringTemplate.STR;

public class Main extends JFrame{
    //Initialized

    //Constant
    private final String MAIN_LABEL = "Metric Conversion Assistant";

    private final double MILE_TO_KILOMETER = 1.609344;
    private final double POUND_TO_KILOGRAM = 0.453592;
    private final double GALLON_TO_LITER = 3.78541;
    private final double FAHRENHEIT_TO_CENTIGRADE = 32;

    //Components
    private JPanel panelGridlMain;
    private JTextField textFieldMile;
    private JTextField textFieldKilometer;
    private JTextField textFieldPound;
    private JTextField textFieldKilogram;
    private JTextField textFieldGallon;
    private JTextField textFieldLiter;
    private JTextField textFieldFahrenheit;
    private JTextField TextFieldCentigrade;
    private JButton buttonConversion;

    //altered constructor
    public Main() {
        setContentPane(panelGridlMain);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(MAIN_LABEL);
        setSize(700,250);
        setLocationRelativeTo(null);
        setResizable(false);
        startUp();
//        setSize();
        //Action Listener Click
        buttonConversion.addActionListener(e -> {
            buttonConversion_Click();
        });
    }
    public static void main(String[] args) {
        new Main();
    }

    //start up
    public void startUp(){
        JTextField[] textLeft = {textFieldMile,textFieldPound, textFieldGallon, textFieldFahrenheit};
        JTextField[] textRight = {textFieldKilometer, textFieldKilogram,textFieldLiter,TextFieldCentigrade};

        for(JTextField textField : textLeft){
            textField.setText("0.00");
        }

        for(JTextField textField : textRight){
            textField.setEditable(false);
        }
        buttonConversion_Click();
    }


    //function click
    public void buttonConversion_Click(){
        try{
            textFieldKilometer.setText(STR."\{convertMileToKilometer(textFieldMile.getText())}");
            textFieldKilogram.setText(STR."\{convertPoundToKilogram(textFieldPound.getText())}");
            textFieldLiter.setText(STR."\{convertGallonToLiter(textFieldGallon.getText())}");
            TextFieldCentigrade.setText(STR."\{convertFahrenheitToCentigrade(textFieldFahrenheit.getText())}");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(), e.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
        }
    }
    //functionalities method
    private double convertMileToKilometer(String mile) {
        if(mile != null || mile.length() != 0 || mile.equals("0")){
            return Double.parseDouble(mile) * MILE_TO_KILOMETER;
        }
        return 0.00;
    }
    private double convertPoundToKilogram(String pound) {
        if(pound != null || pound.length() != 0 || pound.equals("0")){
            return Double.parseDouble(pound) * POUND_TO_KILOGRAM;
        }
        return 0.00;
    }
    private double convertGallonToLiter(String gallon) {
        if(gallon != null || gallon.length() != 0 || gallon.equals("0")) {
            return Double.parseDouble(gallon) * GALLON_TO_LITER;
        }
        return 0.00;
    }
    private double convertFahrenheitToCentigrade(String fahrenheit) {
        if(fahrenheit != null || fahrenheit.length() != 0) {
            return (Double.parseDouble(fahrenheit)-FAHRENHEIT_TO_CENTIGRADE) * 5/9;
        }
        return 0.00;
    }


    private double convertKilometerToMile(String kilometer) {
        if(kilometer != null || kilometer.length() != 0 || kilometer.equals("0")) {
            return Double.parseDouble(kilometer) / MILE_TO_KILOMETER;
        }
        return 0.00;
    }
    private double convertKilogramToPound(String kilogram) {
        if(kilogram != null || kilogram.length() != 0 || kilogram.equals("0")) {
            return Double.parseDouble(kilogram) / POUND_TO_KILOGRAM;
        }
        return 0.00;
    }
    private double convertLiterToGallon(String liter) {
        if(liter != null || liter.length() != 0 || liter.equals("0")) {
            return Double.parseDouble(liter) / GALLON_TO_LITER;
        }
        return 0.00;
    }
    private double convertCentigradeToFahrenheit(String centigrade) {
        if(centigrade != null || centigrade.length() != 0) {
            return (Double.parseDouble(centigrade)) * 9 / 5 + FAHRENHEIT_TO_CENTIGRADE;
        }
        return 0.00;
    }
}
