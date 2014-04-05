import java.util.RandomAccess;

import io.higgs.spi.ProviderFor;

@ProviderFor(RandomAccess.class)
public @interface AnnotationTestClass {
	String value();
}
