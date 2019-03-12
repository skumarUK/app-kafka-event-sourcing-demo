package demo.api.common.domain.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssignDesc extends ItemCommand {

    private final String description;

    public AssignDesc(final String itemId, final String description) {
        super(itemId);
        this.description = description;
    }

}
