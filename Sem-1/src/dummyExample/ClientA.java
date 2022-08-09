package dummyExample;

public class ClientA implements Client {
    private Service service = new ServiceB();

    ClientA(Service service){
        this.service = service;
    }
    @Override
    public void doSomething() {
        System.out.println(service.getSomeInfo() + " (and client A)");
    }

    @Override
    public void setService(Service service) {
        this.service = service;
    }
}
