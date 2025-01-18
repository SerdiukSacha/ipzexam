// State (ConcreteState)
class DeliveredState implements State {
    @Override
    public void updateState(Message message) {
        // кінцевий стан
    }

    @Override
    public String getStateName() {
        return "Delivered";
    }
}
