package demo.api.command.service.api.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("item")
@Data
public class ItemProperties {

    String descriptionSuffix;
}
