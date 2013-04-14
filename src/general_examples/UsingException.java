/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;


/**
 *
 * @author angelos
 */
class UsingException implements a, b, c {

     int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        UsingException obj = new UsingException();
        child ch = new child();
        a[] anarray = new a[2];
        anarray[0] = obj;
        anarray[1]=ch;
        anarray[0].test1();

        try {
            System.out.println(obj.divide(3, 0));
        } catch (Exception ex) {
            System.out.println("divide by zero");
            System.out.println(obj.divide(3, 1));
        }


    }

    @Override
    public void test1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void test2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void test3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

interface a {

    void test1();
}

interface b extends a {

    void test2();
}

interface c extends a, b {

    void test3();
}

class child extends UsingException {
          @Override
          int divide(int a, int b) {
        return a / b;
    }
}
