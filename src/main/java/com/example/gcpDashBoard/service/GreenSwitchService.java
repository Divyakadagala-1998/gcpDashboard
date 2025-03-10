package com.example.gcpDashBoard.service;

import com.example.gcpDashBoard.gcpApis.GetGreenSwitchApi;
import com.google.auth.oauth2.GoogleCredentials;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

@Service
public class GreenSwitchService {
    public void deleteInstance(String projectId, String zone, String instanceName) throws Exception{
        GetGreenSwitchApi.deleteInstance(projectId,zone,instanceName);
    }
}
