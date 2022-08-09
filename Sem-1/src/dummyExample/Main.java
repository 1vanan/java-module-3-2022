package dummyExample;

public class Main {
    public static void main(String[] args) {
        Service serviceB = new ServiceB();
        Service serviceC = new ServiceC();
        Service serviceD = new ServiceD();

        Client clientA = new ClientA(serviceB);
        Client clientB = new ClientB(serviceC);

        clientA.doSomething();
        clientB.doSomething();

        clientA.setService(serviceD);
        clientA.doSomething();

    }
}
