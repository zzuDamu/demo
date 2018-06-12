package com.imooc.demo.dao.AreaDao;

import com.imooc.demo.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AreaDao {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);
}
