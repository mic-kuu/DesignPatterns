package DecoratorDP;

/**
 * Created by michal on 27.03.16.
 */
public class ExtendEnterpriseSevice extends EnterpriseServiceDecorator {


    public ExtendEnterpriseSevice(EnterpriseService service) {
        super(service);
        System.out.println("Additional Service is being initialized");
    }

    @Override
    public void run () {
        super.run();
        System.out.println("Additional Service is running");

    }





}
