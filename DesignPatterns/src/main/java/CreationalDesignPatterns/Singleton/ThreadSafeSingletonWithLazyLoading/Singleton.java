package CreationalDesignPatterns.Singleton.ThreadSafeSingletonWithLazyLoading;

public final class Singleton {
    // The filed must be declared volatile so that doulbe check lock would work correctly.
    private static volatile Singleton instance;

    public String value;

    public Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It exist to prevent race condition between multiple threads that may attempt to get singleton instance at the same time, creating separate instance as a result.

        // It may seem that having the 'result' variable here is completely pointless. There is, however, a very important caveat when implementing double-checked locking in Java, which is solved by introducing this local variable.

        Singleton result = instance;
        if(result != null) {
            return result;
        }

        synchronized (Singleton.class) {
            if(instance == null) {
                instance = new Singleton(value);
            }

            return instance;
        }
    }
}
