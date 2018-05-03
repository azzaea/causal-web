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
package edu.pitt.dbmi.ccd.web.model.d3;

import java.util.List;

/**
 *
 * Apr 7, 2015 1:06:29 PM
 *
 * @author Kevin V. Bui (kvb2@pitt.edu)
 */
public class Node {

    private String source;

    private String target;

    private String type;

    private List<String> bootstrap;

    private List<String> edgeProps;

    public Node() {
    }

    public Node(String source, String target, String type) {
        this.source = source;
        this.target = target;
        this.type = type;
    }

    public Node(String source, String target, String type, List<String> edgeProps) {
        this.source = source;
        this.target = target;
        this.type = type;
        this.edgeProps = edgeProps;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(List<String> bootstrap) {
        this.bootstrap = bootstrap;
    }

    public List<String> getEdgeProps() {
        return edgeProps;
    }

    public void setEdgeProps(List<String> edgeProps) {
        this.edgeProps = edgeProps;
    }

}
