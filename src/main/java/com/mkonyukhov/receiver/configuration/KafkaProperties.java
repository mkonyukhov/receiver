package com.mkonyukhov.receiver.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.kafka")
public class KafkaProperties {
    private String bootstrapServers;
    private String inTopicName;
    private String groupId;
    private String maxPollRecords;
    private String offsetResetConfig;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getInTopicName() {
        return inTopicName;
    }

    public void setInTopicName(String inTopicName) {
        this.inTopicName = inTopicName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMaxPollRecords() {
        return maxPollRecords;
    }

    public void setMaxPollRecords(String maxPollRecords) {
        this.maxPollRecords = maxPollRecords;
    }

    public String getOffsetResetConfig() {
        return offsetResetConfig;
    }

    public void setOffsetResetConfig(String offsetResetConfig) {
        this.offsetResetConfig = offsetResetConfig;
    }
}
