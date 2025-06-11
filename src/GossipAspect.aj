import interfaces.Subscriber;

public aspect GossipAspect {
    pointcut gossipUpdate(String news): 
        call(void Subscriber.receiveUpdate(String)) && args(news);

    before(String news): gossipUpdate(news) {
        System.out.println("[AspectJ] ¡Atención! Se viene un chisme caliente...");
    }

    after(String news): gossipUpdate(news) {
        System.out.println("[AspectJ] El chisme fue entregado con éxito.");
    }
}
