package behavioral.state.states;

import behavioral.state.Phone;
import behavioral.state.State;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHome() {
        phone.home();
    }

    @Override
    public void onOffOn() {
        phone.setState(new OffState(phone));
        phone.lock();
    }
}
