package com.msr.eventbusdemo.events;

/**
 * Created by Sandeep on 29-10-2017.
 */

public class SettingsEvent {
    private boolean bottomLeftStatus;
    private boolean bottomRightStatus;

    public boolean isBottomLeftStatus() {
        return bottomLeftStatus;
    }

    public void setBottomLeftStatus(boolean bottomLeftStatus) {
        this.bottomLeftStatus = bottomLeftStatus;
    }

    public boolean isBottomRightStatus() {
        return bottomRightStatus;
    }

    public void setBottomRightStatus(boolean bottomRightStatus) {
        this.bottomRightStatus = bottomRightStatus;
    }

}
