// State (Context)
class Message {
    private State state;

    public Message() {
        state = new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void updateState() {
        state.updateState(this);
    }

    public String getStateName() {
        return state.getStateName();
    }
}