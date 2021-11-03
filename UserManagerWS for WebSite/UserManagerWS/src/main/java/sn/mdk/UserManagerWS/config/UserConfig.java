package sn.mdk.UserManagerWS.config;


import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sn.mdk.UserManagerWS.service.UtilisateurWebServiceImpl;

@Configuration
public class UserConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(bus, new UtilisateurWebServiceImpl(entityManagerFactory));
        endpoint.publish("/UserWebService");
        return endpoint;
    }
}
