package com.aditya.cj.day21.playerstats;

import com.aditya.cj.day21.EmployeeManager;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil { //cannot inherit the class
    private CsvReaderUtil(){
        //cannot create the methods
    }
    public static List<Player> loadPlayers() throws IOException {
        List<Player> players = new ArrayList<>();

        String fileName = EmployeeManager.class.getResource("/players.csv").getFile();
        Reader in = new FileReader(fileName);
        final String[] HEADERS ="name,role,amount,country,team".split(",");
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(HEADERS)
                .setSkipHeaderRecord(true)
                .build();
        Iterable<CSVRecord> records = csvFormat.parse(in);
        for(CSVRecord csvRecord: records){
            String name = csvRecord.get("name");
            String role = csvRecord.get("role");
            double amount =Double.parseDouble(csvRecord.get("amount"));
            String country = csvRecord.get("country");
            String team = csvRecord.get("team");
            //Player player = new Player();
            //player.setName(name);
            //player.setAmount(amount);
            //player.setCountry(country);
            //player.setTeam(team);
            //player.setRole(role);
            //players.add(player);
            Player player = Player.builder()
                    .name(name)
                    .amount(amount)
                    .country(country)
                    .team(team)
                    .role(role)
                    .build();
            players.add(player);
        }

        return players;
    }

}
