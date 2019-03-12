package demo.api.common.domain.constants;

import lombok.Data;

public enum KafkaTopics {

    springCloudBus("springCloudBus"),
    Default("default");

    private String value;

    KafkaTopics(String value){
        this.value = value;
    }

    public static KafkaTopics getValue(String str) {
        try {
            return valueOf(str);
        }catch (Exception ex){

        }
        return Default;
    }
}
