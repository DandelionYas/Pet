package behavioral.state.states;

import behavioral.state.Phone;
import behavioral.state.State;

public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHome() {
        phone.setState(new ReadyState(phone));
        phone.unlock();
    }

    @Override
    public void onOffOn() {
        phone.setState(new OffState(phone));
        phone.lock();
    }
}
