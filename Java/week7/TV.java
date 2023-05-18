package week7;

public class TV {
    int channel = 1;
    int volunmelevel = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }

    public void setChannel(int newchannel) {
        if (on && newchannel >= 1 && newchannel <= 120)
            channel = newchannel;
    }

    public void setVolume(int newVolume) {
        if(on && newVolume >= 1 && newVolume<= 7)
        volunmelevel = newVolume;
    }
}
