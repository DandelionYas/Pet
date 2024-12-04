package behavioral.state;

import behavioral.state.states.OffState;

public class Phone {
    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void lock() {
        System.out.println("Phone is locked.");
    }

    public void home() {
        System.out.println("Going to home-screen.");
    }

    public void unlock() {
        System.out.println("Phone is unlocked.");
    }

    public void turnOn() {
        System.out.println("Phone is turned on.");
    }
}
