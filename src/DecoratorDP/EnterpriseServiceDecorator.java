package DecoratorDP;

/**
 * Created by michal on 27.03.16.
 */
abstract class EnterpriseServiceDecorator implements EnterpriseService {

    private EnterpriseService service;

    public EnterpriseServiceDecorator(EnterpriseService service) {
        this.service = service;
    }


    public void run() {
        
        service.run();

    }

}
