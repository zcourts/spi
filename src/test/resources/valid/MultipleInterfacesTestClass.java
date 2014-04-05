import java.util.RandomAccess;
import java.io.Serializable;

import io.higgs.spi.ProviderFor;

@ProviderFor({RandomAccess.class, Serializable.class})
public class MultipleInterfacesTestClass implements RandomAccess, Serializable {
	private static final long serialVersionUID = 1L;
}
