package lessons.services;

/**
 * Created by ALEX on 03.05.2016.
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
