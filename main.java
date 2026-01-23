import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.print("enter first constants:");
        interpreter eq = new interpreter(inn.nextLine());
        while (true){
            System.out.println(eq.getLatex()+"\nchose bruh");
            String choice = inn.nextLine();
            if (choice.equals("add")){
                System.out.println("by:");
                eq.add(inn.nextLine());
            }
            if (choice.equals("subtract")){
                System.out.println("by:");
                eq.subtract(inn.nextLine());
            }
            if (choice.equals("multiply")){
                System.out.println("by:");
                eq.multiply(inn.nextLine());
            }
            if (choice.equals("divide")){
                System.out.println("by:");
                eq.divideBy(inn.nextLine());
            }
            if (choice.equals("parens")){
                eq.parens();
            }
            if (choice.equals("q")){
                inn.close();
                break;
            }
        }
    }
}
