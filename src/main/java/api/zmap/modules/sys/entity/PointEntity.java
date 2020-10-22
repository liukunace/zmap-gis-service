package api.zmap.modules.sys.entity;

import lombok.Data;

@Data
//@TableName("mashan_point_table3")
//@TableName("mashan_masterplans")
public class PointEntity {

    //@TableId
    private long id;

    //private String name;
    //private MyGeometryTypeHandler point;
    private String point;

    //SRID=4490;MULTIPOLYGON(((120.075362920772 30.2956581115747,120.078442096721 30.2955132722879,
    // 120.078903436672 30.294268727305,120.075647234928 30.2941828966165,.....)))

    // 正常的getter/setter

    // 自定义wktsetter
//    public void setPoint() throws SQLException {
//        this.point = new PGgeometry(new Point(wkt));
//    }
//
//    // 自定义wktgetter
//    public String getPoint() {
//        PGgeometry geomtry = (PGgeometry) point;
//        if (geomtry == null) {
//            return null;
//        }
//        StringBuffer sb = new StringBuffer();
//        geomtry.getGeometry().outerWKT(sb);
//        return sb.toString();
//    }


    //@JsonBackReference
//    @Column(name="point",columnDefinition = "geometry(Point)")//,columnDefinition = "geometry(Point)"  geometry(Point,4326)
//    @Type(type = "jts_geometry")
//    //@Type(type = "org.hibernate.spatial.GeometryType")//nouse
//    public Point getPoint() {
//        return point;
//    }
//
//    public void setPoint(Point point) {
//        this.point = point;
//    }
}
