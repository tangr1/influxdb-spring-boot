package org.springframework.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = InfluxdbProperties.INFLUXDB_PREFIX)
public class InfluxdbProperties {

    public static final String INFLUXDB_PREFIX = "spring.influxdb";

    private String host;
    private Integer port;
    private String username;
    private String password;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
