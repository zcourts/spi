import java.util.RandomAccess;

import io.higgs.spi.ProviderFor;

@ProviderFor(RandomAccess.class)
public class NoNoArgsConstructorTestClass implements RandomAccess {
	public NoNoArgsConstructorTestClass(String name) {
	}
}
