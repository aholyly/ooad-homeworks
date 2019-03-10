public class NeedSleepState implements State {
    private StudentLifeCycle cycle;

    public NeedSleepState(StudentLifeCycle cycle) {
        this.cycle = cycle;
    }

    @Override
    public void sleep() {
        System.out.println("Needing sleep --> Ready");
        cycle.setState(cycle.getReadyState());
    }

    @Override
    public void exercise() {
        System.out.println("Can't exercise!");
    }

    @Override
    public void hardWork() {
        System.out.println("Can't hardWork!");
    }

    @Override
    public void outTillLate() {
        System.out.println("Can't outTillLate!");
    }

    @Override
    public void coffeeAndWork() {
        System.out.println("Needing sleep --> Chronic Illness");
        cycle.setState(cycle.getChronicIllnessState());
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
