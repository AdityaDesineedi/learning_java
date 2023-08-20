package com.aditya.cj.day10;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Manager {
    public static void main(String[] args) throws URISyntaxException, IOException {
        PlayerService playerService = new PlayerService();
        String team = "RCB";
        List<Player> rcbPlayers = playerService.getPlayerByTeam(team);
        System.out.println(String.format("%s has total %s players",team,rcbPlayers.size()));
        System.out.println("-".repeat(50));
        double maxAmount = playerService.getMaxAmount();
        List<Player> maxPaidPlayersList = playerService.getMaxPaidPlayers();
        System.out.println(String.format("Total %s player(s) getting max amount %s",maxPaidPlayersList.size(),maxAmount));
        for(Player p:maxPaidPlayersList){
            System.out.println(p);
        }
    }
}
