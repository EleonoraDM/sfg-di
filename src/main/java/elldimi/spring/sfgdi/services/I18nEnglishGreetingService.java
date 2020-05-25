package elldimi.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Spring can create a new object for you! Use it!";
    }
}
