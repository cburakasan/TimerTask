package com.timer.doras.Timer.Service;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicBoolean;


@Component
public class TimerServiceImpl <T> implements TimerService{

    T instanceName;
    String methodName;
    Integer cagirimSikligi;
    Boolean tekrar;
    AtomicBoolean isStop = new AtomicBoolean(false);

    /**
     * Farklı farklı servislerden bu methoda çağrım olacaktır.
     * Bu sebeple instanceName generic olarak tanımlandı.
     * @param instanceNames
     * @param methodName
     * @param cagirimSikligi
     * @param tekrar
     * @param <E>
     * @throws InterruptedException
     */
    public <E> void setTimer(E instanceNames, String methodName, Integer cagirimSikligi, Boolean tekrar) throws InterruptedException {

        this.instanceName= (T) instanceNames;
        this.methodName=methodName;
        this.cagirimSikligi=cagirimSikligi;
        this.tekrar=tekrar;

    }

    /**
     * stop butonuna basılmadığı sürece verilen çağrım sıklığına göre çalışan method
     * isStop değer AtomicBoolean tanımlandı. thread safety sağlanmış oldu.
     * @throws InterruptedException
     */
    public void startTimer() throws InterruptedException {

        while (!isStop.get()){
            System.out.println(System.currentTimeMillis()+"\n");
            Thread.sleep(cagirimSikligi);
        }

    }

    /**
     * start ile başlamış olan sayım döngüsünü bitiren method.
     */
    public void stopTimer(){
        isStop.set(true);
    }
}
