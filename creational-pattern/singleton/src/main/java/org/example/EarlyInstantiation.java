package org.example;

/**
 * Hello world!
 */
public class EarlyInstantiation {
   private static EarlyInstantiation obj = new EarlyInstantiation();//Early, instance will be created at load time
   private EarlyInstantiation() {

   }

   public static EarlyInstantiation getInstance() {
       return obj;
   }

   public void doWork() {
        System.out.println("Singleton Early Instantiation");
   }
}
