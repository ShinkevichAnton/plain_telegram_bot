package by.uniqo.telegrambot.processor;

import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor {

    @Override
    public String run() {
        return "Nothing I can help you now, sorry...";
    }
}