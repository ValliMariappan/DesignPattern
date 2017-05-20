
public class ConferenceRoomFactory implements RoomInterface{

	@Override
	public Door createDoor() {
	System.out.println("create door");
		return null;
	}

	@Override
	public Window createWindow() {
		System.out.println("Create window");
		return null;
	}

	@Override
	public Floor createFloor() {
		System.out.println("create floor");
		return null;
	}

}
