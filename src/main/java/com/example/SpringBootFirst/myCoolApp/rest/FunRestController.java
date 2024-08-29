package com.example.SpringBootFirst.myCoolApp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting the values from application properties here
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name: " + coachName + ", Team Name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello(){
      return "Hello World";
    }

    //expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your Lucky Day";
    }
}
