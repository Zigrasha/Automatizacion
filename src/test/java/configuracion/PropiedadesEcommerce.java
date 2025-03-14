package configuracion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:admin.properties")
@Configuration
public class PropiedadesEcommerce {

    @Value("${ecommerce.url.base.vida}")
    private String urlBaseVida;

    public String getUrlBaseVida() {
        return urlBaseVida;
    }
}
