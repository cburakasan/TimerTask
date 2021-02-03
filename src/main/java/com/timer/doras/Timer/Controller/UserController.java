package com.timer.doras.Timer.Controller;

import com.timer.doras.Timer.Service.TimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    TimerService timerService;

    /**
     * timer start methodu. Burada önce setTimer() methodu doldurulur.
     * Ardından start methodu çalıştırılır.
     **/
    @GetMapping(value = "/starttimer")
    public void timerStart() throws InterruptedException {

        timerService.setTimer(new UserController(),"timerStart()",500,false);
        timerService.startTimer();
    }

    /**
     * timerı durduran servis
     */
    @GetMapping("/stoptimer")
    public void timerStop(){
        timerService.stopTimer();
    }

}
