**项目说明** 
- 前后端分离的Java快速开发平台
- 支持MySQL、Oracle、SQL Server、PostgreSQL等主流数据库


<br>
 

**具有如下特点** 
- 巴拉巴拉
- 实现前后端分离，通过token进行数据交互
- 灵活的权限控制，可控制到页面或按钮，满足绝大部分的权限需求
- 引入swagger文档支持，方便编写API接口文档
<br> 

**项目结构** 
```
blabla-comp
├─db  项目SQL语句
│
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─app API接口模块(APP调用)
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─zmapApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  └─static 静态资源

```
<br> 

**如何交流、反馈、参与贡献？** 
- 开发文档：https://
- Git仓库：https://gitee.com/
- [开源社区]


<br>

![输入图片说明](http://bpic.588ku.com/back_list_pic/20/05/20/e7b42e7bdfff1501dd7dc4d34cecf508.jpg "fuck U")


<br> 


**技术选型：** 
- 核心框架：Spring Boot 2.1
- 安全框架：Apache Shiro 1.4
- 视图框架：Spring MVC 5.0
- 持久层框架：MyBatis 3.3
- 定时器：Quartz 2.3
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
- 页面交互：Vue2.x 
<br> 


 **后端部署**
- 通过git下载源码
- idea、eclipse需安装lombok插件，不然会提示找不到entity的get set方法
- 创建数据库zmap_fast，数据库编码为UTF-8
- 执行db/mysql.sql文件，初始化数据
- 修改application-dev.yml，更新MySQL账号和密码
- Eclipse、IDEA运行zmapApplication.java，则可启动项目
- Swagger文档路径：http://localhost:8080/xxx/swagger/index.html
- Swagger注解路径：http://localhost:8080/xxx/swagger-ui.html

<br> 

 **前端部署**
 - 本项目是前后端分离的，还需要部署前端，才能运行起来
 - 前端下载地址：https://gitee.com/
 - 前端部署文档：https://gitee.com/
 - 前端部署完毕，就可以访问项目了，账号：admin，密码：admin
 
 <br>

 **项目演示**
- 演示地址：http://demo
- 账号密码：admin/admin
<br> 

**接口文档效果图：**
![输入图片说明](https://img.tupianzj.com/uploads/allimg/150624/9-1506241025460-L.jpg "在这里输入图片标题")

<br> <br> <br> 


**效果图：**
![输入图片说明](https://img.tupianzj.com/uploads/allimg/202003/9999/rnbbe93ad557.jpg "在这里输入图片标题")
![输入图片说明](https://img.tupianzj.com/uploads/allimg/202001/9999/rn5458eda50d.jpg "在这里输入图片标题")


<br>
