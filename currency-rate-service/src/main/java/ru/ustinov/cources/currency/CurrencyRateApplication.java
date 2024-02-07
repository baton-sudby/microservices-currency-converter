package ru.ustinov.cources.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import ru.ustinov.cources.currency.config.CurrencyClientCfg;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(CurrencyClientCfg.class)
public class CurrencyRateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyRateApplication.class, args);
	}

}
