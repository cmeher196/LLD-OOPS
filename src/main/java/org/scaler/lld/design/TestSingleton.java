package org.scaler.lld.design;

public class TestSingleton {
    public static void main(String[] args) {
        DemoSingleton demoSingleton = DemoSingleton.getDemoSingleton();

        DemoSingleton demoSingleton1 = DemoSingleton.getDemoSingleton();

        System.out.println("Dem1::"+demoSingleton+"...."+demoSingleton1);
        System.out.println("Dem1::"+demoSingleton.getWhatEverYouSend("Hello I m from singleton class")
        +"...."+demoSingleton1.getWhatEverYouSend("Byeeee"));
    }
}
