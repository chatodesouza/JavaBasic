package com.basic.exceptionandtimer;

import java.util.TimerTask;

/**
 * Created by cagdas.kose on 15.12.2016.
 */
public class TimerSample extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timertask devrede.");
    }

}
