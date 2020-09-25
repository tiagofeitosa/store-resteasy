package br.com.tgf.store.resteasy.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.tgf.store.controller.ApplicationStoreController;

@ApplicationPath("/rest")
public class RestEasyServices extends Application {
 
    private Set<Object> singletons = new HashSet<Object>();
 
    public RestEasyServices() {
        singletons.add(new ApplicationStoreController());
    }
 
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}