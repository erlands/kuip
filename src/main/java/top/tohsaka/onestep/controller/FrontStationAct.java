package top.tohsaka.onestep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.tohsaka.onestep.entity.Station;
import top.tohsaka.onestep.manager.StationMng;

@RestController
@RequestMapping("/front/station")
public class FrontStationAct {
    @Autowired
    private StationMng manager;

    @GetMapping("/{id}")
    public Station get(@PathVariable("id") Integer id){
        return manager.get(id);
    }
}
