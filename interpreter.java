public class interpreter {
    //goals: build cursor mechanism and allow for more intricate manipulation
    private String latex;

    public interpreter(String initial){
        latex = initial;
    }

    public String getLatex(){
        return latex;
    }

    public void add(String n){
        latex += " + "+n;
    }

    public void subtract(String n){
        latex += " - "+n;
    }

    public void equal(String n){
        latex += " = "+n;
    }

    public void divideBy(String dividend){
        latex = "\\frac{%s}{%s}".formatted(latex, dividend);
    }

    public void parens(){
        latex = "(%s)".formatted(latex);
    }

    public void multiply(String factor){
        if (isNum(factor)){
            latex = latex+" \\cdot "+factor;
        }
        else{
            latex = latex+" "+factor;
        }
    }

    public void exponent(String n){
        if (latex.charAt(0)=='(' && count(latex, '(')%2==1){
            latex+="^"+n;
        }
        else{
            latex = "(%s)^%s".formatted(latex,n);
        }
    }

    public void log(String base){
        latex = "\\log{%s}(%s)".formatted(base, latex);
    }

    public void log(){
        latex = "\\log(%s)".formatted(latex);
    }

    public void ln(){
        latex = "\\ln(%s)".formatted(latex);
    }

    public void root(){
        latex = "\\sqrt{%s}".formatted(latex);
    }
    
    public void root(String n){
        latex = "\\sqrt[%s]{%s}".formatted(n, latex);
    }

    private boolean isNum(String a){
        try {
            Float.parseFloat(a);
            return true;
        }
        catch (Throwable t) {
            return false;
        }
    }

    private long count(String a, char targ){
        // Source - https://stackoverflow.com/a
        // Posted by Slava Vedenin, modified by community. See post 'Timeline' for change history
        // Retrieved 2026-01-19, License - CC BY-SA 3.0

        long java8 = a.chars().filter(ch -> ch == targ).count();
        return java8;

    }
}
