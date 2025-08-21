// Version on MAIN (intentionally different)
public class Calculator {
    public int add(int a, int b) { return a + b; }          // <-- will conflict
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) { return (double) a / b; }
}
