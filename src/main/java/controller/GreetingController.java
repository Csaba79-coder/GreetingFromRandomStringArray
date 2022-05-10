package controller;

import model.Greeting;

public class GreetingController {

    public void run() {
        String result = new Greeting().getRandom();
        System.out.println(result);
    }
}
