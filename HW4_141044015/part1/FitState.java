public class FitState implements State {
    private StudentLifeCycle cycle;

    public FitState(StudentLifeCycle cycle) {
        this.cycle = cycle;
    }

    @Override
    public void sleep() {
        System.out.println("Can't sleep!");
    }

    @Override
    public void exercise() {
        System.out.println("Can't exercise!");
    }

    @Override
    public void hardWork() {
        System.out.println("Fit --> Graduate");
        cycle.setState(cycle.getGraduateState());
    }

    @Override
    public void outTillLate() {
        System.out.println("Can't outTillLate!");
    }

    @Override
    public void coffeeAndWork() {
        System.out.println("Can't coffeeAndWork!");
    }

    @Override
    public void buyingGTX1080() {
        System.out.println("Can't buyingGTX1080!");
    }

    @Override
    public void cheating() {
        System.out.println("Can't cheating!");
    }
}
