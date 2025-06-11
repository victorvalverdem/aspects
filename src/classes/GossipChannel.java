package classes;

import interfaces.YoutubeChannel;
import interfaces.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class GossipChannel implements YoutubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers(String news) {
        for (Subscriber s : subscribers) {
            s.receiveUpdate(news);
        }
    }
}
