package demo.api.center.auth.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for properties defined at classpath:resource
 *
 * @author Sandeep.Kumar
 *
 */
@ConfigurationProperties("application")
public class ApplicationUsers {

    private List<ApplicationUser> users = new ArrayList<>();

    public List<ApplicationUser> getUsers() {
        return users;
    }

    @Data
    static public class ApplicationUser {
        private String username;
        private String password;
        private String[] roles;
    }
}
