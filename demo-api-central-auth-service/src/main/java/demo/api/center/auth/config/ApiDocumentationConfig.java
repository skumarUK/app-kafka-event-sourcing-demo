package demo.api.center.auth.config;

import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
    info = @Info(
        description = "Central Auth Service Resources",
        version = "V1.1",
        title = "Central Auth Resource API",
        contact = @Contact(
            name = "Sandeep Kumar",
            email = "er.sandeep1983@gmail.com",
            url = "http://developerzone/sandeep.kumar"
        ),
        license = @License(
            name = "Apache 2.0",
            url = "http://www.apache.org/licenses/LICENSE-2.0"
        )
    ),
    consumes = {"application/json", "application/xml"},
    produces = {"application/json", "application/xml"},
    schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
    externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://developerzone/sandeep.kumar")
)
public interface ApiDocumentationConfig {

}
