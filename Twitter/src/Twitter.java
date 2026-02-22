import java.util.*;

class Twitter {
    private HashMap<Integer, HashSet<Integer>> follows;
    private Stack<int[]> tweets;
    private HashSet<Integer> set;
    private int start;
    private int[] val;
    private List<Integer> list;

    public Twitter() {
        follows = new HashMap<>();
        tweets = new Stack<>();
        list = new ArrayList<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!follows.containsKey(userId)){
            set = new HashSet<>();
            set.add(userId);
            follows.put(userId, set);
        }

        tweets.push(new int[] {userId, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        list.clear();
        if (!follows.containsKey(userId)) return list;

        start = tweets.size() - 1;
        set = follows.get(userId);
        for (int i = start; i >= 0 && list.size() < 10; i--) {
            val = tweets.get(i);
            if (set.contains(val[0])) list.add(val[1]);
        }

        return list;
    }

    public void follow(int followerId, int followeeId) {
        if (follows.containsKey(followerId))
            set = follows.get(followerId);
        else {
            set = new HashSet<>();
            set.add(followerId);
        }

        set.add(followeeId);
        follows.put(followerId, set);
    }

    public void unfollow(int followerId, int followeeId) {
        if (follows.containsKey(followerId)) {
            set = follows.get(followerId);
            set.remove(followeeId);
        } else {
            set = new HashSet<>();
            set.add(followerId);
        }

        follows.put(followerId, set);
    }
}