package behavioral.command;

import behavioral.command.commands.SwitchLightsCommand;
import behavioral.command.rooms.LivingRoom;

import java.util.List;

public class House {
    private List<Room> rooms;

    public static void main(String[] args) {
        House house = new House();
        SwitchLightsCommand command = new SwitchLightsCommand(new Light());
        LivingRoom livingRoom = new LivingRoom(command);
        house.rooms = List.of(livingRoom);
        livingRoom.executeCommand();
    }
}
