package api.zmap.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import api.zmap.modules.sys.entity.PointEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointEntityDao extends BaseMapper<PointEntity> {

    List<PointEntity> queryPoint();

}
