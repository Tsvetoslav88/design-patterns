package org.example;

public class SingletonTest {
    public static void main(String[] args) {
        EarlyInstantiation earlyInstantiation = EarlyInstantiation.getInstance();
        earlyInstantiation.doWork();

        LazyInstantiation lazyInstantiation = LazyInstantiation.getInstance();
        lazyInstantiation.doWork();
    }
}
