/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.cofares;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author pfares
 */
@Path("smb215")
public class Ex {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Ex
     */
    public Ex() {
    }

 
    
    @GET
    @Produces({"application/xml", "application/json"})
    public X getXmlg() {
        X x = new X();
        x.setPx(10);
        x.setPy(20);
        
        return x;
    }
    
    @PUT
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    public X putXml(X in) {
        in.setPx(in.getPy());
        in.setPy(in.getPy()*2);    
        
        return in;
    }
    
    

    
}
