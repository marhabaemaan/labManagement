public class Driver {
    public static void main(String args[]) {

        // Nesting of Classes
        // System.out.println(new A(7, new B(7)).bObj.getB());
        // int b = 7;
        B bObj = new B();
        // aObj == new A()

        // A aObj = new A();
        // aObj.bObj.getB();


        // Test test1 = new Test("Marhaba", "Eman", 103);
        // Test test2 = new Test("Marhaba", "Rashid", 123);

        // if (test1.equals(test2) == true) {
        //     System.out.println("equal to each other");
        // } else {
        //     System.out.println("not equal to each other");
        // }


        Test cloneTest = new Test("kahskdf", "ajshgdjhd", 123456);
        // Test cloneTest2 = cloneTest.clone();

        // System.out.println("Test2: " + cloneTest2.fname);
        // System.out.println("Test1: " + cloneTest.fname);
        
        // cloneTest2.setFname("abc");
        
        // System.out.println("Test2: " + cloneTest2.fname);
        // System.out.println("Test1: " + cloneTest.fname);



        Test cloneTest3 = new Test(cloneTest);
    }
}