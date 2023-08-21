package com.aditya.cj.day14;

public class RemoteManager {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.volumeUp();
        remote.volumeUp();
        System.out.println(remote);
        remote.volumeDown();
        System.out.println(remote);
        remote.mute();
        System.out.println(remote);
    }
}
