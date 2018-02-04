package calculatorhm;
import javax.swing.JOptionPane;

public class CalculatorhmModal {
   private int result;
   public void add(int firstnum,int secnum) {
	   result=firstnum+secnum;
   }
   public void sub(int firstnum,int secnum) {
	   result=firstnum-secnum;
   }
   public void mul(int firstnum,int secnum) {
	   result=firstnum*secnum;
   }
   public void div(int firstnum,int secnum) {
	   if(secnum==0) {
		   JOptionPane.showMessageDialog(null, "you can not div over zero");
		   result=-0;
	   }
	   else { result=firstnum/secnum;}
   }
   public void mod(int firstnum,int secnum) {
	   result=firstnum%secnum;
   }
   public void squer(int num) {
	   if(num<0) {
		   JOptionPane.showMessageDialog(null, "you can not find squre root for negative number");
		   result=-0;
	   }
	   else { result=(int) Math.sqrt(num);}
   }
   public int getresult() {
	   
	return result;
	   
   }
}