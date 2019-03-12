package demo.api.command.service.api;

import lombok.Data;

import java.util.List;

@Data
public class UpdateItemRequest {

    private Long dueDate;

    private Integer requiredTime;

    private List<String> tags;

    private String associatedList;

    private String description;

    public String getDescription() {

        return description;
    }
    public void setDescription(String description) {

        this.description = description;
    }
}
