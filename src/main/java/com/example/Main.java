package com.example;

import akka.actor.ActorSystem;

public class Main {

  public static void main(String[] args) {
    System.out.println("Running with " + Runtime.version());
    var actorSystem = ActorSystem.create();
    actorSystem.log().info("woho");

    actorSystem.actorOf(WohoActor.props());
  }
}
