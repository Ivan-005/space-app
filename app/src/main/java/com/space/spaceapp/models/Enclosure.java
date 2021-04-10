package com.space.spaceapp.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "enclosure", strict = false)
public class Enclosure implements Serializable {

    @Attribute(name = "url", empty = "", required = true)
    private String imageUrl;

    public Enclosure(){

    }

    public Enclosure(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

