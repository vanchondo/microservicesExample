package client;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 * Created by vanchondo on 2/28/17.
 */
@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private CountDownLatch latch = new CountDownLatch(1);

    public void run(String... args) throws Exception {
        while(true) {
            System.out.println("Sending message...");
            rabbitTemplate.convertAndSend(Application.temperatureQueue, ((Math.random() * ((100 - 0) + 1)) + 0) + "");
            rabbitTemplate.convertAndSend(Application.lengthQueue, ((Math.random() * ((100 - 0) + 1)) + 0) + "");
            latch.await(5000, TimeUnit.MILLISECONDS);
        }

    }

}
