package at.htldornbirn._4cwi.swp.observer;

import java.util.ArrayList;

public class NewsAgency {

    private final String name;
    private final List<NewsChannel> newsChannelList;

    public NewsAgency(String name) {
        this.name = name;
        this.newsChannelList = new ArrayList<NewsChannel>();
    }

    public void registerNewsChannel(NewsChannel newsChannel) {

    }

    public void broadcastMessage(String message) {

    }

    @Override
    public String toString() {
        return this.name;
    }
}
