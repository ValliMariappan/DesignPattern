
public class RoomFactoryClkient {

	@Autowired
	private Factory factory;
	
	public void createRoom(){
		
		RoomInterface r=factory.getFactory();
		r.createDoor();
		r.createFloor();
		r.createWindow();
	}
	
	
}
