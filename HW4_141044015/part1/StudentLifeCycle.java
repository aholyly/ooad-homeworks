public class StudentLifeCycle {
    private State chronicIllnessState;
    private State fitState;
    private State graduateState;
    private State needSleepState;
    private State readyState;
    private State unableRodForAxeState;

    private State state;

    public StudentLifeCycle() {
        chronicIllnessState = new ChronicIllnessState(this);
        fitState = new FitState(this);
        graduateState = new GraduateState(this);
        needSleepState = new NeedSleepState(this);
        readyState = new ReadyState(this);
        unableRodForAxeState = new UnableRodForAxeState(this);
        state = readyState;
    }

    public StudentLifeCycle(State state) {
        chronicIllnessState = new ChronicIllnessState(this);
        fitState = new FitState(this);
        graduateState = new GraduateState(this);
        needSleepState = new NeedSleepState(this);
        readyState = new ReadyState(this);
        unableRodForAxeState = new UnableRodForAxeState(this);
        this.state = state;
    }

    public void sleep() {
        state.sleep();
    }

    public void exercise() {
        state.exercise();
    }

    public void hardWork() {
        state.hardWork();
    }

    public void outTillLate() {
        state.outTillLate();
    }

    public void coffeeAndWork() {
        state.coffeeAndWork();
    }

    public void buyingGTX1080() {
        state.buyingGTX1080();
    }

    public void cheating() {
        state.cheating();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getChronicIllnessState() {
        return chronicIllnessState;
    }

    public void setChronicIllnessState(State chronicIllnessState) {
        this.chronicIllnessState = chronicIllnessState;
    }

    public State getFitState() {
        return fitState;
    }

    public void setFitState(State fitState) {
        this.fitState = fitState;
    }

    public State getGraduateState() {
        return graduateState;
    }

    public void setGraduateState(State graduateState) {
        this.graduateState = graduateState;
    }

    public State getNeedSleepState() {
        return needSleepState;
    }

    public void setNeedSleepState(State needSleepState) {
        this.needSleepState = needSleepState;
    }

    public State getReadyState() {
        return readyState;
    }

    public void setReadyState(State readyState) {
        this.readyState = readyState;
    }

    public State getUnableRodForAxeState() {
        return unableRodForAxeState;
    }

    public void setUnableRodForAxeState(State unableRodForAxeState) {
        this.unableRodForAxeState = unableRodForAxeState;
    }
}
