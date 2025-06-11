import classes.GossipChannel;
import classes.GossipSubscriber;

public class Main {
    public static void main(String[] args) {
        GossipChannel channel = new GossipChannel();

        GossipSubscriber alice = new GossipSubscriber("Alice");
        GossipSubscriber bob = new GossipSubscriber("Bob");

        channel.registerSubscriber(alice);
        channel.registerSubscriber(bob);

        channel.notifySubscribers("¡Viste lo que pasó en la fiesta anoche!");
    }
}
