package com.recogition_project.face_recognition.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String parentMenuId;
    private String menuId;
    private String menuNm;
    private String menuUrl;
    private List<Menu> subMenu = new ArrayList<Menu>();

    public String getParentMenuId(){
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId){
        this.parentMenuId = parentMenuId;
    }

    public String getMenuId(){
        return menuId;
    }

    public void setMenuId(String menuId){
        this.menuId = menuId;
    }

    public String getMenuNm(){
        return menuNm;
    }

    public void setMenuNm(String menuNm){
        this.menuNm = menuNm;
    }

    public String getMenuUrl(){
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl){
        this.menuUrl = menuUrl;
    }

    public List<Menu> getSubMenu(){
        return subMenu;
    }

    public void setSubMenu(List<Menu> subMenu){
        this.subMenu = subMenu;
    }
}
