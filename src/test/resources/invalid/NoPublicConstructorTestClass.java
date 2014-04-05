import java.util.RandomAccess;

import io.higgs.spi.ProviderFor;

@ProviderFor(RandomAccess.class)
public class NoPublicConstructorTestClass implements RandomAccess {
	private NoPublicConstructorTestClass() {
	}
}
