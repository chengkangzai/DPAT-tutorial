package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        MaxisDriver obj = new MaxisDriver();
        CommunicationService objS = obj.getService("collaboration");
        objS.Registration("group");
        System.out.println("Information: " + objS.getServiceInfo());
    }
}

interface CommunicationService {
    String service = null;

    void Registration(String group);

    String getServiceInfo();
}

//concrete class
class MaxisFibre implements CommunicationService {
    private String service;
    private String setup;

    @Override
    public void Registration(String s) {
        this.service = s;
        this.setup = "line installation";
    }

    @Override
    public String getServiceInfo() {
        return "Current service: " + service + "\n Internet setup: " + setup;
    }
}

class MaxisMobile implements CommunicationService {
    private String service;
    private String plan;

    @Override
    public void Registration(String s) {
        service = s;
        if (Objects.equals(service, "group"))
            plan = "business / commercial";
        else
            plan = "individual";
    }

    @Override
    public String getServiceInfo() {
        return "Current service: " + service + "\nMobile Plan: " + plan;
    }
}

class MaxisPartner implements CommunicationService {
    private String service;
    private String description;

    @Override
    public void Registration(String partner) {
        service = "Collaboration with " + partner;
        if (Objects.equals(partner, "Astro"))
            description = "This service include phone call and various TV Channel";
        else if (Objects.equals(partner, "Government"))
            description = "This service help to reduce the communities network and financial burden";
        else
            description = "Please refer to our sales representative for more information";
    }


    @Override
    public String getServiceInfo() {
        return "Collaboration : " + service + "\n Description: " + description;
    }

}

class MaxisDriver {
    public CommunicationService getService(String data) {
        if (data == null) {
            return null;
        } else if (data.equals("mobile")) {
            return new MaxisMobile();
        } else if (data.equals("fibre")) {
            return new MaxisFibre();
        } else if (data.equals("collaboration")) {
            return new MaxisPartner();
        } else
            return null;
    }
}