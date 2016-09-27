
public class go{

	/**
	public go(String firstWord, String secondWord){
		super(firstWord, secondWord);
	}
	
	public Room act(Command command, Room currentRoom){
		
		if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return null;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            //printCurrentRoomExits();
        }
        
	}
	*/
}
