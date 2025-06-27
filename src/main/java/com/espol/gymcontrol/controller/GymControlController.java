package com.espol.gymcontrol.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.espol.gymcontrol.view.GymControlView;

public class GymControlController {
    private GymControlView view;

    public GymControlController(GymControlView view) {
        this.view = view;
    }

    public void run() {
        view.setVisible(true);
    }
}
