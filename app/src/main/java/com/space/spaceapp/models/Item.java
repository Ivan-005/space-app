package com.space.spaceapp.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "item", strict = false)
public class Item implements Serializable {

    @Element(name = "title")
    private String title;

    @Element(name = "link")
    private String link;

    @Element(name = "enclosure")
    private Enclosure enclosureImgObject;

    public Item() {

    }

    public Item(String title, String link, Enclosure enclosureImgObject) {
        this.title = title;
        this.link = link;
        this.enclosureImgObject = enclosureImgObject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Enclosure getEnclosureImgObject() {
        return enclosureImgObject;
    }

    public void setEnclosureImgObject(Enclosure enclosureImgObject) {
        this.enclosureImgObject = enclosureImgObject;
    }
}
