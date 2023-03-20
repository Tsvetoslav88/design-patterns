package org.example;

public class LazyInstantiation {
    private static LazyInstantiation obj;

    private LazyInstantiation() {
    }

    public static LazyInstantiation getInstance() {
        if (obj == null) {
            synchronized (LazyInstantiation.class) {
                if (obj == null) {
                    obj = new LazyInstantiation();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doWork() {
        System.out.println("Singleton Lazy Instantiation");
    }

}
