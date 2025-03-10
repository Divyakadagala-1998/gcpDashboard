package com.example.gcpDashBoard.controller;

import com.example.gcpDashBoard.service.GreenSwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greenSwitch")

public class GreenSwitchController {
    private final GreenSwitchService greenSwitchService;

    @Autowired
    public GreenSwitchController(GreenSwitchService greenSwitchService) {
        this.greenSwitchService = greenSwitchService;
    }

    // API to get instance details
   /* @GetMapping("/instance/{projectId}/{zone}/{instanceName}")
    public String getInstanceDetails(@PathVariable String projectId,
                                     @PathVariable String zone,
                                     @PathVariable String instanceName) {
        return greenSwitchService.getInstanceDetails(projectId, zone, instanceName);
    }*/

    // API to delete an instance
    @DeleteMapping("/instance/{projectId}/{zone}/{instanceName}")
    public void deleteInstance(@PathVariable String projectId,
                                 @PathVariable String zone,
                                 @PathVariable String instanceName) throws Exception{
         greenSwitchService.deleteInstance(projectId, zone, instanceName);
    }
}
