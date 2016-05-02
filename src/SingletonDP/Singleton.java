package SingletonDP;

/**
 * Created by root on 14.03.16.
 */
public class Singleton {

    private static Singleton ourInstance = null;


    //good practice for thread safe, lazy instation of a Singleton
    static boolean firstThread = true;


    public static Singleton getInstance() {

        if (firstThread){
            firstThread = false;

            //eventual thread stuff

        }

        synchronized (Singleton.class) {
            if(ourInstance == null){
                ourInstance = new Singleton();
            }
        }

        return ourInstance;
    }

    public void singletonMessage(){
        System.out.println("You are accesing a sigleton method");
    }

    private Singleton() {

    }
}
