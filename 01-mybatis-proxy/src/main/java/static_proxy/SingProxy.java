package static_proxy;

import java.lang.reflect.Proxy;

public class SingProxy implements Service{
    public Service service;

    public SingProxy(Service service){
        this.service = service;
    }
    public void sing() {
        tan();
        kan();
        service.sing();
        gei();
    }


    private void tan(){ System.out.println("谈价钱"); }

    private void kan(){ System.out.println("看场地"); }

    private void gei(){ System.out.println("给工资"); }
}