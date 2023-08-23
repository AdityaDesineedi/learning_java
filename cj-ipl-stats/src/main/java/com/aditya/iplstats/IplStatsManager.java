package com.aditya.iplstats;

import com.aditya.iplstats.service.IplStatService;
import com.aditya.iplstats.service.IplStatsServiceImpl;

public class IplStatsManager {
    public static void main(String[] args) {
        IplStatService iplStatService = new IplStatsServiceImpl();
        iplStatService.getTeamBasicDetails().forEach(ele->{
            System.out.println(ele.getTeam()+" "+ele.getTeamName());
        });
    }
}
