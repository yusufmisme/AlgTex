import java.util.Scanner; 
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first constants:");
        interpreter eq = new interpreter(in.nextLine());
        while (true){
            System.out.println(eq.getLatex()+"\nchose bruh");
            String choice = in.nextLine();
            if (choice.equals("add")){
                System.out.println("by:");
                eq.add(in.nextLine());
            }
            if (choice.equals("subtract")){
                System.out.println("by:");
                eq.subtract(in.nextLine());
            }
            if (choice.equals("multiply")){
                System.out.println("by:");
                eq.multiply(in.nextLine());
            }
            if (choice.equals("divide")){
                System.out.println("by:");
                eq.divideBy(in.nextLine());
            }
            if (choice.equals("parens")){
                eq.parens();
            }
        }
    }
}
