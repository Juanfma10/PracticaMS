package ec.edu.epn.tdd.calculador;

public class Calculador {

    private int ans;
    public int addition(int a, int b) {
return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int division(int a, int b) {
        return a/b;
    }

    public int multiplication(int a, int b) {
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        return a*b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
