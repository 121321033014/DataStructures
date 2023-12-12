package org.example.Youtube;

public class Channeldetails {
    private String key;
    private String channelname;
    private String description;
    private String subscription;

    public Channeldetails(String key, String channelname, String description, String subscription) {
        this.key = key;
        this.channelname = channelname;
        this.description = description;
        this.subscription = subscription;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Channeldetails{" +
                "key='" + key + '\'' +
                ", channelname='" + channelname + '\'' +
                ", description='" + description + '\'' +
                ", subscription='" + subscription + '\'' +
                '}';
    }
}
