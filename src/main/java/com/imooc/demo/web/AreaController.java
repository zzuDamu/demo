package com.imooc.demo.web;


import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superAdmin")
public class AreaController {
    @Autowired
    private AreaService areaService ;

    @GetMapping("listArea")
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Area> areaList = areaService.getArealist();
        modelMap.put("areaList",areaList);
        return modelMap ;
    }

    @GetMapping("getAreaById/{id}")
    private Map<String,Object> getAreaById(@PathVariable("id") Integer areaId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Area areaById = areaService.getAreaById(areaId);
        modelMap.put("area",areaById);
        return modelMap ;
    }

    @PostMapping("addArea")
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap ;
    }


    @PutMapping("modifyArea")
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap ;
    }

    @DeleteMapping("removeArea")
    private Map<String,Object> removeArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap ;
    }

}
