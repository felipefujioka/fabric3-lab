package com.mycompany.prodCon;

import org.fabric3.api.annotation.model.Component;
import org.fabric3.api.annotation.Producer;

import org.fabric3.api.implementation.timer.annotation.Timer;
import org.fabric3.api.implementation.timer.model.TimerType;

@Timer(type = TimerType.RECURRING)
@Component(composite= "{urn:mycompany.com}ChannelComposite")
public class BuyComponent2 implements Runnable {

    @Producer(target="BuyChannel")
    private BuyChannel buyChannel;

    public void run() {
        System.out.println("sending bleh");
        buyChannel.publish("bleh");
    }

    public long nextInterval() {
        return 1000;
    }

}
