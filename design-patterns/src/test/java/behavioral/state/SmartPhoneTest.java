package behavioral.state;

import behavioral.state.states.ReadyState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartPhoneTest {

    @Test
    public void testSmartPhone() {
        Phone phone = new Phone();
        State state = phone.getState();
        state.onOffOn();
        state = phone.getState();
        state.onHome();
        state = phone.getState();
        state.onOffOn();
        Assertions.assertInstanceOf(ReadyState.class, state);
    }
}
