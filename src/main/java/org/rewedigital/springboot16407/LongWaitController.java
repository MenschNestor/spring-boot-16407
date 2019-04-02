package org.rewedigital.springboot16407;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class LongWaitController {
    @GetMapping(path = "/")
    public String waitForALongTime() {
        try {
            Thread.sleep(TimeUnit.MINUTES.toMillis(10L));
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Waited";
    }
}
