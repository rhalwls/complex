package homework3;

public class Complex {
	private int real_part;
	private int imaginary_part;
	
	public Complex() {
		setReal_part(0);
		setImaginary_part(0);
	}
	public Complex(int real,int imaginary) {
		setReal_part(real);
		setImaginary_part(imaginary);
	}
	public int getReal_part() {
		return real_part;
	}
	public void setReal_part(int real_part) {
		this.real_part = real_part;
	}
	public int getImaginary_part() {
		return imaginary_part;
	}
	public void setImaginary_part(int imaginary_part) {
		this.imaginary_part = imaginary_part;
	}
	public void printComplex() {

		if(imaginary_part==0) {
			System.out.println("\""+real_part+"\"");
		}
		else
		System.out.println("\""+real_part+(imaginary_part>0?"+":"")+imaginary_part+"i\"");
	}
	public Complex addComplex(Complex added) {
		return new Complex(this.real_part+added.real_part,this.imaginary_part+added.imaginary_part);
	}
	public Complex substractComplex(Complex drop) {
		return new Complex(this.real_part-drop.real_part,this.imaginary_part-drop.imaginary_part);
	}
	public Complex multiplyComplex(Complex multiplier) {
		return new Complex((real_part*multiplier.real_part-imaginary_part*multiplier.imaginary_part),
				(this.real_part*multiplier.imaginary_part+this.imaginary_part*multiplier.real_part));
	}
	public Complex addInteger(int added) {
		return new Complex(this.real_part+added,this.imaginary_part);
	}
	public Complex substractInteger(int drop) {
		return new Complex(this.real_part-drop,this.imaginary_part);
	}
	public Complex multiplyInteger(int multiplier) {
		return new Complex(this.real_part*multiplier,this.imaginary_part*multiplier);
	}
	public static void main(String[] args) {
		Complex c1=new Complex(1,2);
		Complex c2= new Complex(3,-5);
		
		System.out.println("First number is : ");
		c1.printComplex();
		System.out.println("Second number is : ");
		c2.printComplex();
		System.out.println("Result of addition is : ");
		c1.addComplex(c2).printComplex();
		System.out.println("Result of subtraction is : ");
		c1.substractComplex(c2).printComplex();
		System.out.println("Result of multiplication is : ");
		c1.multiplyComplex(c2).printComplex();
		
		int i=3;
		
		System.out.println("First number is : ");
		c1.printComplex();
		System.out.println("Second number is : "+i);
		
		System.out.println("Result of addition is : ");
		c1.addInteger(i).printComplex();
		System.out.println("Result of subtraction is : ");
		c1.substractInteger(i).printComplex();
		System.out.println("Result of multiplication is : ");
		c1.multiplyInteger(i).printComplex();
	}
}
