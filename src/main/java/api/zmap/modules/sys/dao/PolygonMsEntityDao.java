package api.zmap.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import api.zmap.modules.sys.entity.PolygonMsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PolygonMsEntityDao extends BaseMapper<PolygonMsEntity> {

    List<PolygonMsEntity> queryPolygon();

}
