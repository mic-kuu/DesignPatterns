package SingletonDP;

/**
 * Created by root on 14.03.16.
 */
public class MainSingleton {

    public static void main (String[] args) {

        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        // Singleton thirdInstance = new Singleton(); You can't do that

        System.out.println("firstInstance ID: " + System.identityHashCode(firstInstance));
        firstInstance.singletonMessage();
        System.out.println("secondInstance ID: " + System.identityHashCode(secondInstance));
        secondInstance.singletonMessage();

        if ( System.identityHashCode(firstInstance) == System.identityHashCode(secondInstance) ) {

            System.out.println("\nYou are using Singleton pattern.");
        } else {

            System.out.println("\nSomething went wrong.");
        }

    }
}
