package command;

public class Light {
    private boolean switchedOn;

    public void switchLights() {
        switchedOn = !switchedOn;
        System.out.println("Light switched: " + switchedOn);
    }
}
