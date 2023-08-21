package com.aditya.cj.day14;

public class Remote {

    int volume;
    boolean isMute;

    public Remote(){
        this.volume = 5;
        this.isMute = false;
    }

    public void volumeUp(){
        this.volume++;
        if(this.isMute){
            this.isMute=false;
        }
    }
    public void volumeDown(){
        if(this.volume>0){
            this.volume--;
        }
        if(this.volume==0){
            this.isMute=true;
        }
    }

    public void mute(){
        this.isMute=true;
        this.volume=0;

    }

    @Override
    public String toString() {
        return "Remote{" +
                "volume=" + volume +
                ", isMute=" + isMute +
                '}';
    }
}
