/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author redes
 * @version 1.0.0
 * @since febrero 2023
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    /**
    * 
    * @param a primer elemento
    * @param b segundo elemento
    */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    
    /**
     * 
     * @return resultado de la suma de dos operadores
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * 
     * @return resultado de la resta de dos operadores
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    
    /**
     * 
     * @return booleana comprueba el mayor de los operadores
     * @see resta
     * @deprecated requiere un nuevo metodo de comprobacion para JDK 1.0 y superiores versiones
     */
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    /**
     * 
     * @return resultado de la multiplicacion de dos operadores
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * 
     * @return resultado de la division de dos operadores
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * 
     * @return resultado de la division de dos operadores, null en caso de division por cero
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

    /**
     * 
     * @return resultado de la division entre dos operadores
     * @exception java.lang.ArithmeticException Division por cero
     * @throws java.lang.ArithmeticException Division por cero
     */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     * Funcion main
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
}
