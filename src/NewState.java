// State (ConcreteState)
class NewState implements State {
    @Override
    public void updateState(Message message) {
        message.setState(new SentState());
    }

    @Override
    public String getStateName() {
        return "New";
    }
}
