public class Main {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 1);
        System.out.println(twitter.getNewsFeed(1));
        twitter.follow(2, 1);
        System.out.println(twitter.getNewsFeed(2));
        twitter.unfollow(2, 1);
        System.out.println(twitter.getNewsFeed(2));
    }
}