package practice.proxy_pattern;

public class ProxyOnlineRetailStore implements OnlineRetailStore {
    private RealOnlineRetailStore realOnlineRetailStore;

    public ProxyOnlineRetailStore() {
        this.realOnlineRetailStore = new RealOnlineRetailStore();
    }

    @Override
    public void displayProducts() {
        realOnlineRetailStore.displayProducts();
    }

    @Override
    public void purchaseProduct(String productName, int quantity) {
        realOnlineRetailStore.purchaseProduct(productName, quantity);
    }

}
