package com.espol.gymcontrol;

import com.espol.gymcontrol.controller.GymControlController;
import com.espol.gymcontrol.view.GymControlView;

public class Main {
    public static void main(String[] args) {
        GymControlController controller = new GymControlController(new GymControlView());
        
        controller.run();
    }
}