
package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.KeyRequest;
import com.model.KeyResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

 
@Path("/v1.0")
@Api(value = "/", description = "RequestHandler")
public class RequestHandler {

    private static Logger LOG = LoggerFactory
            .getLogger(RequestHandler.class);

    @Path("/swagRequest")
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "Returns a keyResponse", notes = "Returns a keyResponse")
    public KeyResponse processMasterKeyRequest(KeyRequest keyRequest)
              {

        KeyResponse keyResponse = new KeyResponse();
        keyResponse.setReturnCode("200");
        return keyResponse;
    }

}
