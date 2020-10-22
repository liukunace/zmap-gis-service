package api.zmap.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import api.zmap.modules.sys.entity.PolygonEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PolygonEntityDao extends BaseMapper<PolygonEntity> {

    List<PolygonEntity> queryPolygon();

    List<PolygonEntity> queryPolygonByPolygon(String polygon);

    void insertPolygon(String id,String polygon);

}
