import org.junit.Test;
import proxy.ProxyFactory;
import proxy.Service;
import proxy.SuperStarLiu;
import static_proxy.SingProxy;
import static_proxy.SuperStarZhou;

public class Client {
    public static void main(String[] args) {
        SingProxy singProxy = new SingProxy(new SuperStarZhou());
        singProxy.sing();
    }

    @Test
    public void ProxyFactoryTest(){
        ProxyFactory proxyFactory = new ProxyFactory(new proxy.SuperStarZhou());
        Service agent = (Service) proxyFactory.getAgent();
        agent.sing();
    }
}
