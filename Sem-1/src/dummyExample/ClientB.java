package dummyExample;

public class ClientB implements Client {
    private Service service = new ServiceB();

    ClientB(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getSomeInfo() + " (and client B)");
    }

    @Override
    public void setService(Service service) {
        this.service = service;
    }
}
