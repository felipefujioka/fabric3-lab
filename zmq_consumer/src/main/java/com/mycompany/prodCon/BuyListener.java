package com.mycompany.prodCon;

import org.fabric3.api.annotation.model.Component;
import org.fabric3.api.annotation.Consumer;
 
@Component(composite= "{urn:mycompany.com}ChannelComposite")
public class BuyListener {
 
   @Consumer(source="BuyChannel")
   public void onEvent(String message) {
      System.out.println(message);
   }
}