package classes;

import interfaces.Subscriber;

public class GossipSubscriber implements Subscriber {
    private String name;

    public GossipSubscriber(String name) {
        this.name = name;
    }

    public void receiveUpdate(String news) {
        System.out.println(name + " escuchó un chisme: " + news);
    }
}
