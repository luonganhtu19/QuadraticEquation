import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation equation=new QuadraticEquation();
        do {
            System.out.println();
            System.out.println("Solve of equation ax^2 +bx+c=0" );
            menu();
            System.out.println("Choice menu ");
            int choice= (int) checkNumber(" value of choice is number");
            switch (choice){
                case 1:
                    double coefficientA;
                    while (true) {
                        System.out.print("Input coefficient a: ");
                         coefficientA= checkNumber("value coefficient A is number");
                         if (coefficientA!=0) break;
                         else System.out.println("Please value a is different 0 ");
                    };
                    System.out.print("Input coefficient b: ");
                    double coefficientB=checkNumber("value coefficient B is number");
                    System.out.print("Input coefficient c: ");
                    double coefficientC=checkNumber("value coefficient C is number");
                    equation.setCoefficient(coefficientA,coefficientB,coefficientC);
                    System.out.printf("The equation: %.2f*x^2 + %.2f*x + %.2f=0",equation.getCoefficientA(),equation.getCoefficientB(),equation.getCoefficientC());
                    System.out.println("\n");
                    break;
                case 2:
                    display(equation);
                    break;
                default:
                    System.out.println(" Please choice menu");
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Input coefficient ");
        System.out.println("2. Display root of equation");
        System.out.println("0. Exit");
    }

    public static double checkNumber(String mess) {
        boolean check = true;
        double number = 0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                number = Double.parseDouble(input.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println(" Please try again" + mess);
            }
        } while (check);
        return number;
    }
    public static void display(QuadraticEquation equation){
        double discriminant=equation.getDiscriminant();
        if (discriminant<0){
            System.out.println(" The equation has no real roots");
        }else if (discriminant==0){
            System.out.println(" The equation has roots: "+equation.getRoot1(discriminant));
        }else {
            System.out.println(" The equation has roots: "+equation.getRoot1(discriminant)+" "+equation.getRoot2(discriminant));
        }
    }
}

