import java.util.RandomAccess;

import io.higgs.spi.ProviderFor;

public class NonStaticTestClass {

	@ProviderFor(RandomAccess.class)
	public class InnerNonStaticTestClass {
		String value();
	}
}
