package com.example.gcpDashBoard.gcpApis;

import com.example.gcpDashBoard.AuthTokenGenerator;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetGreenSwitchApi {
    public static void deleteInstance(String projectId, String zone, String instanceName) throws Exception{
        String deleteInstanceApi = String.format("https://cloudresourcemanager.googleapis.com/v1/projects/%s/zones/%s/instances/%s", projectId,zone,instanceName);
        String token = AuthTokenGenerator.getAccessToken();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        //Delete Instance
        ResponseEntity<String> deleteInstanceResponse = restTemplate.exchange(deleteInstanceApi, HttpMethod.DELETE, entity, String.class);
        System.out.println(deleteInstanceResponse.getBody());
    }
}