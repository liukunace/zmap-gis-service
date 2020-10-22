package api.zmap.modules.sys.controller;


import api.zmap.modules.sys.entity.PolygonEntity;
import api.zmap.modules.sys.service.PointEntityService;
import api.zmap.modules.sys.service.PolygonEntityService;
import api.zmap.common.utils.R;
import api.zmap.modules.sys.entity.PointEntity;
import api.zmap.modules.sys.entity.PolygonMsEntity;
import api.zmap.modules.sys.entity.SysUserEntity;
import api.zmap.modules.sys.service.PolygonMsEntityService;
import api.zmap.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mas")
public class MashanController extends AbstractController{
    @GetMapping("/test")
    public String test(){
        return "mas-sys-oauth-test";
    }

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private PointEntityService pointEntityService;

    @Autowired
    private PolygonEntityService polygonEntityService;

    @Autowired
    private PolygonMsEntityService polygonmsEntityService;

    @GetMapping("/user")
    public R queryUser(){
        List<SysUserEntity> list=sysUserService.list();
        //SysUserEntity user = sysUserService.queryByUserName(name);
        return R.ok().put("user", list);
    }

    @GetMapping("/user/{name}")
    public R queryUser(@PathVariable("name") String name){
        SysUserEntity user = sysUserService.queryByUserName(name);
        return R.ok().put("user", user);
    }

    @GetMapping("/poi")
    public R queryPointTest(){
        List<PointEntity> list=pointEntityService.queryPoint();
        return R.ok().put("point", list);
    }

    @GetMapping("/poly")
    public R queryPolygonTest(){
        List<PolygonEntity> list=polygonEntityService.queryPolygon();
        //SysUserEntity user = sysUserService.queryByUserName(name);
        return R.ok().put("poly", list);
    }

    @GetMapping("/ins")
    public R insertPolygonTest(){
        String id="D555555";
        String poly="POLYGON((121.71436091670316 31.38080337674083,121.70173615072089 31.388605486784197,121.70751628677645 31.4199972067024,121.71832867120243 31.437168981489133,121.73193985623796 31.37984624401758,121.71436091670316 31.38080337674083))";
         id="D66666";
        poly="MULTIPOLYGON(((116.769721237499 36.385702663353,116.769507748062 36.3856702010786,116.769492001504 36.3856997411046,116.769442412832 36.3857854361069,116.769386416579 36.3858685156796,116.769324223464 36.3859486671873,116.769256067525 36.3860255890132,116.769182205237 36.386098991694,116.769102914551 36.3861685990093,116.769018493844 36.386234149021,116.768621534751 36.386523995019,116.768524912012 36.3865899816803,116.768423094982 36.3866506531501,116.768316531019 36.3867057428545,116.768205688336 36.3867550087443,116.768091053944 36.3867982343585,116.767973131516 36.3868352297757,116.767852439172 36.386865832448,116.7677295072 36.3868899079157,116.76760487573 36.3869073503976,116.767566766985 36.3869116381901,116.76737608141 36.3869330931127,116.767285875075 36.3871161970017,116.767634005669 36.3870770272064,116.767758712131 36.3870599180341,116.767881937958 36.3870368306749,116.76800324457 36.3870078473007,116.768122200216 36.3869730710682,116.768238381512 36.3869326257517,116.768351374951 36.3868866553029,116.768460778369 36.3868353233383,116.768566202382 36.386778812557,116.768667271767 36.3867173240902,116.768763626803 36.3866510767858,116.769160585897 36.3863612307878,116.769254386682 36.3862883974415,116.769342487444 36.38621105598,116.769424556652 36.3861294974457,116.769500285474 36.3860440287503,116.769569388935 36.3859549715195,116.769631606994 36.3858626608832,116.769686705518 36.385767444214,116.769721237499 36.385702663353)))";
        polygonEntityService.insertPolygon(id,"SRID=4326;"+poly);
        //SysUserEntity user = sysUserService.queryByUserName(name);
        return R.ok().put("poly", "insert OK");
    }

    @GetMapping("/query")
    public R queryPolygonByPolygonTest(){
        String poly="Polygon((116.769442412832 36.3857854361069,116.769386416579 36.3858685156796,116.769324223464 36.3859486671873,116.769256067525 36.3860255890132,116.769182205237 36.386098991694,116.769102914551 36.3861685990093,116.769018493844 36.386234149021,116.768621534751 36.386523995019,116.769442412832 36.3857854361069))";
        poly="'"+poly+"'";
        //poly="SRID=4326;"+poly;
       // System.out.println(poly);
        List<PolygonEntity> list=polygonEntityService.queryPolygonByPolygon(poly);
        //SysUserEntity user = sysUserService.queryByUserName(name);
        return R.ok().put("p_q_list", list);
    }

    @GetMapping("/poly2")
    public R queryPolygon2Test(){
        List<PolygonMsEntity> list=polygonmsEntityService.queryPolygon();
        return R.ok().put("poly2", list);
    }

    @GetMapping("/poly3")
    public R queryPolygon3Test(){
        List<PolygonMsEntity> list=polygonmsEntityService.queryPolygon();
        return R.ok().put("poly2", list);
    }

}
