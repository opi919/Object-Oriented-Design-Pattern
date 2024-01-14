package Assignment_5;

import java.util.Map;

interface OnlineRetailStore {
    Map<String,Integer> getAvailableProducts(String product);
    String getShippingLocation();
}
