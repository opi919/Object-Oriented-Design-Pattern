package practice.proxy_pattern;

public class Main {
    public static void main(String[] args) {
        OnlineRetailStore onlineRetailStore = new ProxyOnlineRetailStore();
        onlineRetailStore.displayProducts();

        onlineRetailStore.purchaseProduct("laptop", 20);
    }
}
