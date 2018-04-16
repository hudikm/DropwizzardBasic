/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dropwizzardhelloword;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author hudik3
 */
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class ReqresInResource {
    
    @GET @Path("/users/{id}")
    public User getUser(@PathParam("id") int id){
        
        if(id < 0) 
             throw new WebApplicationException(Status.NOT_FOUND);
        
        return new User().withFirstName("Janko").withLastName("Hrasko").withId(id);
    }
}
