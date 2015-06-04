/*
 * Copyright (C) 2015 University of Pittsburgh.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package edu.pitt.dbmi.ccd.web.ctrl;

/**
 *
 * May 14, 2015 12:40:49 PM
 *
 * @author Kevin V. Bui (kvb2@pitt.edu)
 */
public interface ViewController {

    public static final String LOGIN = "login";

    public static final String LOGOUT = "logout";
    
    public static final String NOT_FOUND = "404";
    
    public static final String HOME = "home";

    public static final String REDIRECT_HOME = "redirect:/home";

    public static final String REDIRECT_LOGIN = "redirect:/login";

    public static final String SETUP = "setup";

    public static final String REDIRECT_SETUP = "redirect:/setup";
    
    public static final String REGISTRATION = "registration";

    public static final String REDIRECT_REGISTRATION = "redirect:/registration";

    public static final String ERR0R = "err0r";
    
    public static final String REDIRECT_ERR0R = "redirect:/err0r";
    
    public static final String USERPROFILE = "userprofile";
    
    public static final String REDIRECT_USERPROFILE = "redirect:/userprofile";
    
    public static final String SETTING = "setting";
    
    //Data & Result Management
    public static final String DATASET = "dataset";

    public static final String REDIRECT_DATASET = "redirect:/data";
    
    public static final String UPLOAD_DATASET = "upload";

    public static final String DATAUPLOAD = "dataUpload";
    
    public static final String DELETE = "delete";
    
    public static final String UPLOAD_CHUNK = "upload/chunk";

    public static final String RUNRESULTS = "runResults";
    
    public static final String REDIRECT_RESULTS = "redirect:/results";
    
    public static final String D3GRAPH = "d3graph";
    
    public static final String PLOT = "plot";
    
    public static final String DOWNLOAD = "download";
    
    //Algorithm
    public static final String PCSTABLE = "pcStable";
    
    public static final String GES = "ges";

    public static final String ALGORITHMRUNNING = "algorithmRunning";

}
