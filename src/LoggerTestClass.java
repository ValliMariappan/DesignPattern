import static org.junit.Assert.*;

import org.junit.Test;

public class LoggerTestClass {

	@Test
	public void test() {
		LoggerPattern mylogger=LogPatternImpl.getInstance();
		mylogger.log("Hai");
		
		LoggerPattern mylogger1=LogPatternImpl.getInstance();
		mylogger1.log("hello");
	}

}
