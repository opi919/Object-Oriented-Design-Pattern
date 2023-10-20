package Assignment_5;

public class ProxyOnlineRetailStore implements OnlineRetailStore{
    private RealOnlineRetailStore realOnlineRetailStore;

    public ProxyOnlineRetailStore(){
        realOnlineRetailStore = new RealOnlineRetailStore();
        realOnlineRetailStore.addProduct("ProductA", 100);
        realOnlineRetailStore.addProduct("ProductB", 10);
    }
    @Override
    public void purchase(String productName, int quantity) {
        realOnlineRetailStore.purchase(productName,quantity);
        System.out.println("Shipping " + quantity + " " + productName + " from the nearest warehouse.");
    }
}
