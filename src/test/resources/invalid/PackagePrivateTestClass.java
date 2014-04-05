import java.util.RandomAccess;

import io.higgs.spi.ProviderFor;

@ProviderFor(RandomAccess.class)
class PackagePrivateTestClass {
	String value();
}
