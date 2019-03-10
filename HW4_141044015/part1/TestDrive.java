public class TestDrive {

    public static void main(String[] args) {
        StudentLifeCycle c1 = new StudentLifeCycle();
        StudentLifeCycle c2 = new StudentLifeCycle();
        StudentLifeCycle c3 = new StudentLifeCycle();
        StudentLifeCycle c4 = new StudentLifeCycle();
        StudentLifeCycle c5 = new StudentLifeCycle();
        StudentLifeCycle c6 = new StudentLifeCycle();
        StudentLifeCycle c7 = new StudentLifeCycle();

        StudentLifeCycle cycle = new StudentLifeCycle();

        System.out.println("---------------------");
       	System.out.println("TESTING 'VALID' WAYS");
       	System.out.println("---------------------");
       	System.out.println("Default Start state: READY");
       	System.out.println("---------------------");
       	System.out.println("outTillLate");
       	cycle.outTillLate();
       	System.out.println("---------------------");
       	System.out.println("sleep");
       	cycle.sleep();
       	System.out.println("---------------------");
       	System.out.println("exercise");
       	cycle.exercise();
       	System.out.println("---------------------");
       	System.out.println("hardWork");
       	cycle.hardWork();
       	System.out.println("---------------------");
       	System.out.println("END");
       	System.out.println("---------------------\n\n");


        System.out.println("---------------------");
       	System.out.println("TESTING 'READY' STATE");
       	System.out.println("---------------------");
       	System.out.println("Default Start state: READY");
       	System.out.println("---------------------");
       	System.out.println("sleep");
       	c1.sleep();
       	System.out.println("---------------------");
       	System.out.println("exercise");
       	c2.exercise();
       	System.out.println("---------------------");
       	System.out.println("hardWork");
       	c3.hardWork();
       	System.out.println("---------------------");
       	System.out.println("outTillLate");
       	c4.outTillLate();
       	System.out.println("---------------------");
       	System.out.println("coffeeAndWork");
       	c5.coffeeAndWork();
       	System.out.println("---------------------");
       	System.out.println("buyingGTX1080");
       	c6.buyingGTX1080();
       	System.out.println("---------------------");
       	System.out.println("cheating");
       	c7.cheating();
       	System.out.println("---------------------\n\n");


       	System.out.println("---------------------");
       	System.out.println("TESTING 'FIT' STATE");
       	System.out.println("---------------------");
       	System.out.println("Start state: FIT");
       	System.out.println("---------------------");
       	System.out.println("sleep");
       	c2.sleep();
       	System.out.println("---------------------");
       	System.out.println("exercise");
       	c2.exercise();
       	System.out.println("---------------------");
       	System.out.println("hardWork");
       	c2.hardWork();
       	System.out.println("---------------------");
       	System.out.println("outTillLate");
       	c2.outTillLate();
       	System.out.println("---------------------");
       	System.out.println("coffeeAndWork");
       	c2.coffeeAndWork();
       	System.out.println("---------------------");
       	System.out.println("buyingGTX1080");
       	c2.buyingGTX1080();
       	System.out.println("---------------------");
       	System.out.println("cheating");
       	c2.cheating();
       	System.out.println("---------------------\n\n");


       	System.out.println("------------------------");
       	System.out.println("TESTING 'GRADUATE' STATE");
       	System.out.println("------------------------");
       	System.out.println("Start state: GRADUATE");
       	System.out.println("------------------------");
       	System.out.println("sleep");
       	c2.sleep();
       	System.out.println("------------------------");
       	System.out.println("exercise");
       	c2.exercise();
       	System.out.println("------------------------");
       	System.out.println("hardWork");
       	c2.hardWork();
       	System.out.println("------------------------");
       	System.out.println("outTillLate");
       	c2.outTillLate();
       	System.out.println("------------------------");
       	System.out.println("coffeeAndWork");
       	c2.coffeeAndWork();
       	System.out.println("------------------------");
       	System.out.println("buyingGTX1080");
       	c2.buyingGTX1080();
       	System.out.println("------------------------");
       	System.out.println("cheating");
       	c2.cheating();
       	System.out.println("------------------------\n\n");

    }


}
