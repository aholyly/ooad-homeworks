public class ReadyState implements State {
    private StudentLifeCycle cycle;

    public ReadyState(StudentLifeCycle cycle) {
        this.cycle = cycle;
    }

    @Override
    public void sleep() {
        System.out.println("Can't sleep!");
    }

    @Override
    public void exercise() {
        System.out.println("Ready --> Fit");
        cycle.setState(cycle.getFitState());
    }

    @Override
    public void hardWork() {
        System.out.println("Ready --> Graduate");
        cycle.setState(cycle.getGraduateState());
    }

    @Override
    public void outTillLate() {
        System.out.println("Ready --> Needing sleep");
        cycle.setState(cycle.getNeedSleepState());
    }

    @Override
    public void coffeeAndWork() {
        System.out.println("Can't coffeeAndWork!");
    }

    @Override
    public void buyingGTX1080() {
        System.out.println("Ready --> Unable to become a rod for an axe");
        cycle.setState(cycle.getUnableRodForAxeState());
    }

    @Override
    public void cheating() {
        System.out.println("Ready --> Unable to become a rod for an axe");
        cycle.setState(cycle.getUnableRodForAxeState());
    }
}
