package com.aditya.cj.day21.playerstats;

import java.util.List;
import java.util.function.Predicate;

public interface PlayerService {

    double maxAmount();
    List<Player> getPlayers(Predicate<Player> predicate);
    List<TeamStatsDto> getTeamAmountStats();
    List<RoleAmountDto> getTeamRolesStats();
    List<Player> getTopPaidPlayers(int n);
    List<String> getTeamNames();


}
