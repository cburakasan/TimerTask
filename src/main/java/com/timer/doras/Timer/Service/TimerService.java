package com.timer.doras.Timer.Service;

import org.springframework.stereotype.Service;

@Service
public interface TimerService {
    public <E> void setTimer(E instanceNames, String methodName, Integer cagirimSikligi, Boolean tekrar) throws InterruptedException;

    public void startTimer()throws InterruptedException;

    public void stopTimer();
}
