package com.project_dslist.dslist.projections;

import java.net.Inet4Address;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
