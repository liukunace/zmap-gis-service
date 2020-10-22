package api.zmap.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class PolygonEntity {

    private String id;

    private double area;

    private String geom;

}
