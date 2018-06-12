package com.imooc.demo.service;

import com.imooc.demo.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AreaService {

    List<Area> getArealist();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int areaId);
}
