package com.journaldev.bootifulmongodb.model;

import org.springframework.data.cassandra.mapping.UserDefinedType;

@UserDefinedType
public class Transition {
    private String source;
    private String destination;
    private String action;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
