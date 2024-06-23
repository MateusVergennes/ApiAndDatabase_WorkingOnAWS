package com.eventostec.api.config;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {
    @Value("${aws.region}")
    private String awsRegion;

    //criar a instancia baseado na regiao
    @Bean//para identificacao que este metodo cria instancia do objeto AMAZON s3
    public AmazonS3 createS3Instance(){
        return AmazonS3ClientBuilder
                .standard()//p/utilizar as credenciais standarts da maquina
                .withCredentials(new DefaultAWSCredentialsProviderChain())
                .withRegion(awsRegion)
                .build();
    }

}
