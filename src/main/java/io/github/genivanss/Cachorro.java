package io.github.genivanss;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME) //annotation obrigatória quando se cria uma annotation
@Target(ElementType.FIELD) //annotation obrigatória quando se cria uma annotation
@Autowired
@Qualifier("cachorro")
public @interface Cachorro {
    //herda as propriedades da annotation 
}