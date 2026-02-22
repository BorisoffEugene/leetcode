public class Main {
    public static void main(String[] args) {
        AuctionSystem auctionSystem = new AuctionSystem(); // Initialize the Auction system
        auctionSystem.addBid(1, 7, 5); // User 1 bids 5 on item 7
        auctionSystem.addBid(2, 7, 6); // User 2 bids 6 on item 7
        System.out.println(auctionSystem.getHighestBidder(7)); // return 2 as User 2 has the highest bid
        auctionSystem.updateBid(1, 7, 8); // User 1 updates bid to 8 on item 7
        System.out.println(auctionSystem.getHighestBidder(7)); // return 1 as User 1 now has the highest bid
        auctionSystem.removeBid(2, 7); // Remove User 2's bid on item 7
        System.out.println(auctionSystem.getHighestBidder(7)); // return 1 as User 1 is the current highest bidder
        System.out.println(auctionSystem.getHighestBidder(7)); // return 1 as User 1 is the current highest bidder
        System.out.println(auctionSystem.getHighestBidder(7)); // return 1 as User 1 is the current highest bidder
        System.out.println(auctionSystem.getHighestBidder(3)); // return -1 as no bids exist for item 3
    }


}