package com.basic.exceptionandtimer;

import java.util.Timer;

/**
 * Created by cagdas.kose on 15.12.2016.
 */
public class AppRunner {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerSample(), 1000, 1000);
    }
}
