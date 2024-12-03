package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Light;

public class SwitchLightsCommand implements Command {
    private Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLights();
    }
}
