import java.util.*;
import java.lang.*;

public class Complex{
private Float real;
private Float imaginary;

public Complex(Float real,Float imaginary){
this.real = real;
this.imaginary = imaginary;
}
public Float getReal(){
return this.real;
}
public Float getImaginary(){
return this.imaginary;
}
//adds Complex Numbers together 
public Complex add(Complex a,Complex b){
return new Complex(a.getReal()+b.getReal(),a.getImaginary()+b.getImaginary());
}
//subtracts complex numbers together
public Complex subtract(Complex a,Complex b){
return new Complex(a.getReal()-b.getReal() , a.getImaginary()-b.getImaginary());
}
// multiplies the complex #s together
public Complex multiply(Complex a,Complex b){
Float realVal = ((a.getImaginary() * b.getImaginary()) * -1) + (a.getReal() * b.getReal());
Float imgVal = (a.getImaginary() * b.getReal()) +(b.getImaginary()*a.getReal());
return new Complex(realVal,imgVal);
}
//returns the flooting number that represents the modulus
public Float getModulus(){ 
return new Float(Math.sqrt((Math.pow(this.real.doubleValue(),2)+Math.pow(this.imaginary.doubleValue(),2))));
}
//returns a complex Object containing the conjugate
public Complex conjugate(){
return new Complex(this.real,(-imaginary));
}
public String toString(){
if(this.imaginary <0){
return this.real+"+"+Math.abs(this.imaginary)+"i";
}
else{
return this.real+"+"+Math.abs(this.imaginary)+"i";
}
}
}
