package com.journaldev.bootifulmongodb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("machine")
public class Machine {

    @PrimaryKey
    private MachineId machineId;
    private Date creationDate = new Date();
    private Map<String, String> setting = new HashMap<>();
    private List<Transition> transitions = new ArrayList<Transition>();

    public MachineId getMachineId() {
        return machineId;
    }

    public void setMachineId(MachineId machineId) {
        this.machineId = machineId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, String> getSetting() {
        return setting;
    }

    public void setSetting(Map<String, String> setting) {
        this.setting = setting;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

}
