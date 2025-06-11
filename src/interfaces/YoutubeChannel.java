package interfaces;

public interface YoutubeChannel {
    void registerSubscriber(Subscriber s);

    void removeSubscriber(Subscriber s);

    void notifySubscribers(String news);
}
