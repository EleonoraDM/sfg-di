package elldimi.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("BGN")
@Service("i18nService")
public class I18nBulgarianGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Спринг може да създаде нов обект за теб! Използвай го!";
    }
}
