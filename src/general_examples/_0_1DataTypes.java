/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

/**
 *
 * @author angelos
 */
public class _0_1DataTypes {
    byte b;
    short sh;
    int integ;
    long lon;
    float fl;
    double dou;
    char ch;
    boolean boo;

   
     
    public static void main(String[] args) {
        // Default initial values
        _0_1DataTypes dt=new _0_1DataTypes();
        System.out.println(dt.b);
        System.out.println(dt.b);
        System.out.println(dt.sh);
        System.out.println(dt.integ);
        System.out.println(dt.lon);
        System.out.println(dt.fl);
        System.out.println(dt.dou);
        System.out.println(dt.ch);
        System.out.println(dt.boo);
        
        //min max and sizes
        String a="min byte="+Byte.MIN_VALUE;
        System.out.println(a);
        System.out.println("max byte="+Byte.MAX_VALUE);
        System.out.println("size byte="+Byte.SIZE);
        
        System.out.println("");
        System.out.println("min short="+Short.MIN_VALUE);
        System.out.println("max short="+Short.MAX_VALUE);
        System.out.println("size short="+Short.SIZE);
        
        System.out.println("");
        System.out.println("min int="+Integer.MIN_VALUE);
        System.out.println("max int="+Integer.MAX_VALUE);
        System.out.println("size int="+Integer.SIZE);
        
        System.out.println("");
        System.out.println("min long="+Long.MIN_VALUE);
        System.out.println("max long="+Long.MAX_VALUE);
        System.out.println("size long="+Long.SIZE);
        
        System.out.println("");
        System.out.println("min float="+Float.MIN_VALUE);
        System.out.println("max float="+Float.MAX_VALUE);
        System.out.println("size float="+Float.SIZE);
        
        System.out.println("");
        System.out.println("min double="+Double.MIN_VALUE);
        System.out.println("max double="+Double.MAX_VALUE);
        System.out.println("size double="+Double.SIZE);
        
        System.out.println("");
        System.out.println("min char="+Character.MIN_VALUE);
        System.out.println("max char="+Character.MAX_VALUE);
        System.out.println("size char="+Character.SIZE);
        
    }
}
