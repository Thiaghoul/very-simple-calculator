import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        String option = "s";
        System.out.println("Enter the first number");
        calculator.setFinalNumber(scanner.nextFloat());
        scanner.nextLine();

        do{
            System.out.println(calculator.getFinalNumber());
            System.out.println(main.calculatorInput(scanner, calculator));
            System.out.println("press n to stop(or anything else to continue)");
            option = scanner.nextLine();

        } while (!option.equalsIgnoreCase("n"));

        scanner.close();

    }
    public String calculatorInput(Scanner scanner, Calculator calculator){

        String signAndNumber= """
                press 
                 +  -  *  / 
                press space
                then press the number you want to ...
                """;

        try{

            System.out.println(signAndNumber);
            String inputCalculator = scanner.nextLine();

            String outputSeparated[] = inputCalculator.split(" ");
            String inputSign = outputSeparated[0];
            float inputNumber = Float.parseFloat(outputSeparated[1]);

            switch (inputSign){
                case ("+") -> calculator.addNumber(inputNumber);
                case ("-") -> calculator.subNumber(inputNumber);
                case ("*") -> calculator.multNumber(inputNumber);
                case ("/") -> calculator.divNumber(inputNumber);
                default -> {
                    return "";
                }
            }

            String newValue = "new value is: " + calculator.getFinalNumber();
            return newValue;

        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){

            return "please enter a valid sequence of commands as explained before.";

        }
    }
}