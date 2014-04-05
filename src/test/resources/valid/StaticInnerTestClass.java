import java.util.RandomAccess;

import io.higgs.spi.ProviderFor;

public class StaticInnerTestClass {
	@ProviderFor(RandomAccess.class)
	public static class Inner implements RandomAccess {
		
	}
}
