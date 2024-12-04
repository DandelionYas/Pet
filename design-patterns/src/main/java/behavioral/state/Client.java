package behavioral.state;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        State state = phone.getState();
        state.onOffOn();
        state = phone.getState();
        state.onHome();
        state = phone.getState();
        state.onOffOn();
    }
}
