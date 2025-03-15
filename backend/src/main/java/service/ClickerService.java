package service;

import model.Clicker;

public class ClickerService {
    public Long getClicksById(Long id) {
        Clicker clicker = new Clicker(1L, 100L);
        return clicker.getClicks();
    }
}
