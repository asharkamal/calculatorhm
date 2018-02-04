package calculatorhm;
public class Calculatorhm {
public static void main( String argv []) {
	CalculatorhmModal m=new CalculatorhmModal();
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
}
}