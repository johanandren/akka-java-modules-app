package com.example;

import akka.actor.AbstractLoggingActor;
import akka.actor.Props;

public class WohoActor extends AbstractLoggingActor {

  public static Props props() {
    return Props.create(WohoActor.class, WohoActor::new);
  }

  @Override
  public void preStart() throws Exception {
    log().info("Woho");
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().build();
  }
}
