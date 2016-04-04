package com.kj;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
public class CloudConfig extends AbstractCloudConfig {
	  @Bean
	  public MongoDbFactory documentMongoDbFactory() {
	      return connectionFactory().mongoDbFactory();
	  }
}
