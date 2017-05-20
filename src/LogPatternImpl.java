
public class LogPatternImpl implements LoggerPattern{

	private LogPatternImpl(){
		
	}
	
	private static LogPatternImpl instance;
	
	public static LogPatternImpl getInstance(){

		if(instance ==null){
			instance = new LogPatternImpl();
		}
		return instance;
	}
	@Override
	public void log(String message) {
	
		System.out.println( message);
		
	}

	
}
