package sk.holic.sos;

public class Main {

    public static void main(String[] args) {
        System.out.println(Test.calc());

        int i = 0;

        while(true) {
            if(i++ > 5) {

                break;
            }
        }
        System.out.println(i);
        //print 7

        Test test = new Test();
        int count = test.getCount(); // getCount = 10

        GeneralTest generalTest = new Test();
        count += generalTest.getCount(); // // getCount + getCount = 20

        generalTest = new GeneralTest();
        count += generalTest.getCount(); // getCount = 1

        System.out.println(count); //sum 21
    }

}