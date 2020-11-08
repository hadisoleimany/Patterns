package com.nbms.factory;

public class Technical extends Staff {
    private String subject;
    private String licence;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "Technical{}";
    }
}
