package com.space.spaceapp.models;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.List;

@Root(name = "channel", strict = false)
public class Channel implements Serializable {


    @ElementList(name = "item", inline = true)
    private List<Item> items;

    public Channel(){

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
