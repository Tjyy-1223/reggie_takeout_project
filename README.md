# springboot-外卖项目

**springboot+mybatisPlus的练手项目，一周完成。**

**code**：https://gitee.com/tianjiangyu/springboot-takeout-project/tree/master/code

**resource**：https://gitee.com/tianjiangyu/springboot-takeout-project/tree/master/resource

**视频地址：**https://www.bilibili.com/video/BV13a411q753?p=1



## 第一阶段：业务开发

#### Day1:

+ 项目整体需求介绍
+ 开发环境搭建：sql + maven
+ 前端静态界面导入 ：

学会@Configuration和静态资源映射的配置

+ 登陆操作功能实现： 

前端发送请求 + 后端controller + service + mapper完成功能

+ 退出功能实现



#### Day2:

+ 完善登录功能 - 使用过滤器或者拦截器判断用户是否完成登陆

@WebFilter + implements Filter

@ServletComponentScan

在Filter中编写过滤器逻辑

+ 新增员工 

使用save方法使用全局异常处理拦截进行异常处理（@ControllerAdvice）

@ExceptionHandler(SQLIntegrityConstraintViolationException.class)

@ControllerAdvice : 指定拦截那些类型的控制器;

@ResponseBody: 将方法的返回值 R 对象转换为json格式的数据, 响应给页面;

新增Id不按序排列时，注意修改navicat中的设计表 - 自动递增属性值

+ 员工信息分页查询

学会使用mybatisPlus的分页插件 @Configuration + @Bean ->获得mybatisPlusInterceptor

+ 启用/禁用员工账号

涉及到JS对Long型数据进行处理后丢失精度的问题 

引入JacksonObjectMapper

在WebMvcConfig中重写方法extendMessageConverters

+ 编辑员工信息



#### Day3:
