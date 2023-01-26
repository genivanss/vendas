package io.github.genivanss;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Retention(RetentionPolicy.RUNTIME) //annotation obrigatória quando se cria uma annotation
@Target(ElementType.TYPE) //annotation obrigatória quando se cria uma annotation
@Configuration
@Profile("development")
public @interface Development {
    //herda as propriedades da annotation @Configuration e @Profile
}
