package behavioral.command;

public class Room {
    // If we put the light inside Room any changes on light might break a subclass of room
    // We just need to switch the light
    // We also have some other objects like FloorLamp that need switch command
    // They can not extend room, So without command pattern we need to duplicate switch code
    // Using Command pattern we decoupled the operation from associated classes
    Command command;

    public Room(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
