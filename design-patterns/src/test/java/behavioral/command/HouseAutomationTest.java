package behavioral.command;

import behavioral.command.commands.SwitchLightsCommand;
import behavioral.command.rooms.LivingRoom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseAutomationTest {

    @Test
    public void testHouseAutomation() {
        SwitchLightsCommand command = new SwitchLightsCommand(new Light());
        LivingRoom livingRoom = new LivingRoom(command);
        Assertions.assertDoesNotThrow(livingRoom::executeCommand);
    }
}
