package com.foo.servlets;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Charlie
 */
@WebServlet(name = "selectBeerAction",
        urlPatterns = {"/actions/selectBeer", "/actions/selectBeer.xml"},
        initParams = {@WebInitParam(name = "darkBeers", value = "Indio,Guinness,Dark Rito"),
                        @WebInitParam(name = "lagerBeers", value = "XX,Juay Lager")})
public class BeerServlet extends HttpServlet {
    
}
