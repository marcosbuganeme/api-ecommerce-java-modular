package br.com.ecommerce.java.domain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("br.com.ecommerce.java")
@EntityScan({"br.com.ecommerce.java.domain.model"})
@EnableJpaRepositories({"br.com.ecommerce.java.domain.repository"})
public class JpaConfig {

}