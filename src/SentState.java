// State (ConcreteState)
class SentState implements State {
    @Override
    public void updateState(Message message) {
        message.setState(new DeliveredState());
    }

    @Override
    public String getStateName() {
        return "Sent";
    }
}
