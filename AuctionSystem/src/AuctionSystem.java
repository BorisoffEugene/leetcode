import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class AuctionSystem {
    private HashMap<Integer, HashMap<Integer, Integer>> itemsByUser;
    private HashMap<Integer, TreeMap<Integer, TreeSet<Integer>>> itemsByAmount;
    private HashMap<Integer, Integer> user;
    private TreeMap<Integer, TreeSet<Integer>> amount;
    private TreeSet<Integer> amountUsers;

    public AuctionSystem() {
        itemsByUser = new HashMap<>();
        itemsByAmount = new HashMap<>();
    }

    public void addBid(int userId, int itemId, int bidAmount) {
        if (!itemsByUser.containsKey(itemId)) {
            // items by user create
            user = new HashMap<>();
            user.put(userId, bidAmount);
            itemsByUser.put(itemId, user);

            // items by amount create
            amountUsers = new TreeSet<>();
            amountUsers.add(userId);
            amount = new TreeMap<>();
            amount.put(bidAmount, amountUsers);
            itemsByAmount.put(itemId, amount);
        } else {
            updateBid(userId, itemId, bidAmount);
        }
    }

    public void updateBid(int userId, int itemId, int newAmount) {
        // items by user update
        user = itemsByUser.get(itemId);
        Integer amountVal = user.put(userId, newAmount);

        // items by amount remove old
        amount = itemsByAmount.get(itemId);
        if (amountVal != null) {
            amountUsers = amount.get(amountVal);
            amountUsers.remove(userId);
            if (amountUsers.isEmpty()) amount.remove(amountVal);
        }

        // items by amount create
        if (!amount.containsKey(newAmount)) {
            amountUsers = new TreeSet<>();
            amountUsers.add(userId);
            amount.put(newAmount, amountUsers);
        // items by amount update
        } else {
            amountUsers = amount.get(newAmount);
            amountUsers.add(userId);
        }
    }

    public void removeBid(int userId, int itemId) {
        // items by user remove
        user = itemsByUser.get(itemId);
        int amountVal = user.get(userId);
        user.remove(userId);

        // items by amount remove
        amount = itemsByAmount.get(itemId);
        amountUsers = amount.get(amountVal);
        amountUsers.remove(userId);
        if (amountUsers.isEmpty()) amount.remove(amountVal);
    }

    public int getHighestBidder(int itemId) {
        amount = itemsByAmount.get(itemId);
        if (amount == null || amount.isEmpty()) return -1;

        return amount.lastEntry().getValue().last();
    }
}