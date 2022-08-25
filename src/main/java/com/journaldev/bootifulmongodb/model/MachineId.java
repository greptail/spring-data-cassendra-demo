package com.journaldev.bootifulmongodb.model;

import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Indexed;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class MachineId implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @PrimaryKeyColumn
    @Indexed
    private String name;
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
