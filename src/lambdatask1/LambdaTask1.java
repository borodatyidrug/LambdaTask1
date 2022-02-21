/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdatask1;

/**
 *
 * @author aurumbeats
 */
public class LambdaTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(45, 789);
        int b = calc.minus.apply(74, 563);
        int c = calc.multiply.apply(7, 777);
        int d = calc.devide.apply(a, b);
        int e = calc.devide.apply(8, 0);
        int f = calc.pow.apply(55);
        int g = calc.abs.apply(-78);
        boolean h = calc.isPositive.test(-20);
        
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
        calc.println.accept(g);
        System.out.println(h);
    }
    
}
