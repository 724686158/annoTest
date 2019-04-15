import javax.xml.crypto.Data;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLData {

    String name() default "";

    Constraints constraint() default @Constraints;
}
