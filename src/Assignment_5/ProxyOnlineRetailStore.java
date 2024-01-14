package Assignment_5;

import java.util.Map;

public class ProxyOnlineRetailStore implements OnlineRetailStore {
    private RealOnlineRetailStore realOnlineRetailStore;

    public ProxyOnlineRetailStore() {
        realOnlineRetailStore = new RealOnlineRetailStore();
    }

    @Override
    public Map<String, Integer> getAvailableProducts(String product) {
        return realOnlineRetailStore.getAvailableProducts(product);
    }

    @Override
    public String getShippingLocation() {
        return realOnlineRetailStore.getShippingLocation();
    }
}
