# springboot-外卖项目

**springboot+mybatisPlus的练手项目，一周完成。**

**code**：https://gitee.com/tianjiangyu/springboot-takeout-project/tree/master/code

**resource**：https://gitee.com/tianjiangyu/springboot-takeout-project/tree/master/resource

**视频地址：**https://www.bilibili.com/video/BV13a411q753?p=1



## 第一阶段：业务开发

#### Day1:项目创建及登陆

+ 项目整体需求介绍
+ 开发环境搭建：sql + maven
+ 前端静态界面导入 ：

学会@Configuration和静态资源映射的配置

+ 登陆操作功能实现： 

前端发送请求 + 后端controller + service + mapper完成功能

+ 退出功能实现



#### Day2:员工管理

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



#### Day3:分类管理

+ 公共字段自动填充

使用**Mybatis Plus**提供的公共字段自动填充功能。

1 - 在实体类的属性上加入@TableField注解，指定自动填充的策略。

2 - 按照框架要求编写元数据对象处理器，在此类中统一为公共字段赋值，此类需要实现 MetaObjectHandler接口。

+ 新增分类 - 菜品分类和套餐分类

+ 分类信息分页查询 - 与员工分类查询相似

+ 删除分类 - 功能测试与完善

涉及自定义异常、扩展ServiceImpl的使用

+ 修改分类 - 功能测试与完善



#### Day4:菜品管理

+ 文件上传下载

通过MultipartFile类型的参数即可接收上传的文件, 方法形参的名称需要与 页面的file域的name属性一致。

+ 菜品新增

DishServiceImpl中实现方法saveWithFlavor

在引导类上加注解 @EnableTransactionManagement

+ 菜品分页查询 - 与之前的page类似，多了一个图片栏目的设计

+ 菜品修改 - 与之前的update操作类似

**上述的新增菜品、分页查询、菜品修改用到了多表联查的知识，值的学习。**





#### Day5:套餐管理业务开发

+ 新增套餐 - 向套餐表和套餐关系表中添加关系

+ 套餐分页查询

+ 删除套餐

+ 短信发送

短信服务介绍、阿里云短信服务、代码开发

+ 手机验证码发送

需求分析、数据模型、代码开发、功能测试





#### Day6: 手机点单功能

+ 用户地址薄功能
+ 菜品展示

 即完成page功能

+ 购物车 

添加、查询、删除购物车

+ 下单功能 

移动端用户将菜品或者套餐加入购物车后，可以点击购物车中的 "去结算" 按钮，页面跳转到订单确 认页面，点击 "去支付" 按钮则完成下单操作。





## 第二阶段：Git

#### Git的常用指令

+ 设置用户信息

```git
git config --global user.name “itcast”
git config --global user.email “hello@itcast.cn”
```

+ 查看配置信息

```
git config --list
```

+ 仓库初始化

```
本地初始化 ： git init
从远程仓库克隆： git clone 【远程Git仓库地址】
```

+ 本地仓库常用指令

```
git status		查看文件状态
git add				将文件的修改加入暂存区
git reset			将暂存区的文件取消暂存或者是切换到指定版本
git commit		将暂存区的文件修改提交到版本库
git log 			查看日志
```

+ 远程仓库常用指令

```
 git remote -v	查看远程仓库
 git remote add	添加远程仓库
 git clone			从远程仓库克隆
 git pull				从远程仓库拉取  fatal: refusing to merge unrelated histories 加入参数--allow-unrelated-histories
 git push				推送到远程仓库
```

+ Git分支常用指令

```
git branch		列出所有本地分支
git branch -r	列出所有远程分支
git branch -a	列出所有本地分支和远程分支

git branch [name]						创建分支
git checkout [name]					切换分支
git push [shortName] [name]	推送至远程仓库分支
git merge [name]						合并分支
conflict：在文件中手动处理 commit -i
```

+ Git标签操作

```
git tag													列出已有的标签
git tag [name]									创建标签
git push [shortName] [name]			将标签推送至远程仓库
git checkout -b [branch] [name]	检出标签
```



#### IDEA中使用Git

+ 在IDEA中对Git进行配置

```
command + shift + G 显示隐藏目录
```

+ 初始化Git仓库

+ 本地仓库操作、远程仓库操作、分支操作
