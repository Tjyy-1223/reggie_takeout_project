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





## 第三阶段：Linux

#### Linux简介

+ 主流操作系统：桌面操作系统、服务器操作系统、移动设备操作系统、嵌入式操作系统
+ Linux发展历史

#### Linux安装

vmware fusion + centos7（好用）

https://blog.csdn.net/qq_24950043/article/details/122517521

+ 网卡设置
+ SSH设置

```
ssh root@192.168.3.61
```

+ Linux目录结构

#### Linux常用命令

+ Linux命令初体验

```
ls [目录名]				list											查看当前目录下的内容
pwd 							print work directory 			查看当前所在目录
cd [目录名]				change directory					切换目录
touch [文件名]			touch											如果文件不存在,创建文件
mkdir [目录名]			make directory						创建目录
rm [文件名]				remove										删除指定文件

乱码：
echo 'LANG="en_US.UTF-8"' >> /etc/profile
source /etc/profile
```

+ 文件目录操作命令

```
ls	显示指定目录下的内容 


-a 显示所有文件及目录 (. 开头的隐藏文件也会列出)
-l 除文件名称外，同时将文件型态(d表示目录，-表示文件)、权限、拥有者、文件大小等信息详细列出


ls -al 查看当前目录的所有文件及目录详细信息
ls -al /etc 查看/etc目录下所有文件及目录详细信息 
ll 查看当前目录文件及目录的详细信息
```

```
作用: 用于切换当前工作目录，即进入指定目录 
语法: cd [dirName]


特殊说明:
~ 表示用户的home目录
. 表示目前所在的目录
.. 表示目前目录位置的上级目录


举例:
cd .. 切换到当前目录的上级目录 
cd ~ 切换到用户的home目录
cd /usr/local 切换到/usr/local目录
```

```
作用: 用于显示文件内容 语法: cat [-n] fileName
说明:
-n: 由1开始对所有输出的行数编号
举例:
cat /etc/profile 查看/etc目录下的profile文件内容
```

```
rm -r itcast/			删除名为itcast的目录和目录中所有文件，删除前需确认
rm -rf itcast/		无需确认，直接删除名为itcast的目录和目录中所有文件
rm -f hello.txt		无需确认，直接删除hello.txt文件
```

+ 拷贝移动命令

```
cp hello.txt itcast/				将hello.txt复制到itcast目录中
cp hello.txt ./hi.txt				将hello.txt复制到当前目录，并改名为hi.txt
cp -r itcast/ ./itheima/ 		将itcast目录和目录下所有文件复制到itheima目录下
cp -r itcast/* ./itheima/		将itcast目录下所有文件复制到itheima目录下
```

```
mv hello.txt hi.txt							将hello.txt改名为hi.txt
mv hi.txt itheima/							将文件hi.txt移动到itheima目录中
mv hi.txt itheima/hello.txt 		将hi.txt移动到itheima目录中，并改名为hello.txt
mv itcast/ itheima/							如果itheima目录不存在，将itcast目录改名为itheima
mv itcast/ itheima/							如果itheima目录存在，将itcast目录移动到itheima目录中
```

+ 打包压缩命令

```
作用: 对文件进行打包、解包、压缩、解压
语法: tar [-zcxvf] fileName [files]
包文件后缀为.tar表示只是完成了打包，并没有压缩 包文件后缀为.tar.gz表示打包的同时还进行了压缩

z代表的是gzip，通过gzip命令处理文件，gzip可以对文件压缩或者解压 
c代表的是create，即创建新的包文件 
x代表的是extract，实现从包文件中还原文件 
v代表的是verbose，显示命令的执行过程 
f代表的是file，用于指定包文件的名称


tar -cvf hello.tar ./*								将当前目录下所有文件打包，打包后的文件名为hello.tar
tar -zcvf hello.tar.gz ./*						将当前目录下所有文件打包并压缩，打包后的文件名为hello.tar.gz
tar -xvf hello.tar										将hello.tar文件进行解包，并将解包后的文件放在当前目录
tar -zxvf hello.tar.gz								将hello.tar.gz文件进行解压，并将解压后的文件放在当前目录
tar -zxvf hello.tar.gz -C /usr/local	将hello.tar.gz文件进行解压，并将解压后的文件放在/usr/local目录
```

+ 文本编辑命令

+ 查找命令

```
作用: 在指定目录下查找文件
语法: find dirName -option fileName 

find . –name "*.java" 						在当前目录及其子目录下查找.java结尾文件
find /itcast -name "*.java" 			在/itcast目录及其子目录下查找.java结尾的文件
```

```
作用: 从指定文件中查找指定的文本内容 
语法: grep word fileName

grep Hello HelloWorld.java 				查找HelloWorld.java文件中出现的Hello字符串的位置
grep hello *.java 								查找当前目录中所有.java结尾的文件中包含hello字符串的位置
```

#### Linux软件安装

+ 软件安装方式
+ 安装jdk - jdk-8u171-linux-x64
+ 安装maven - apache-maven-3.5.4-bin

+ 安装Tomcat - apache-tomcat-7.0.57

```
systemctl stop firewalld 防火墙

systemctl start firewalld
firewall-cmd --zone=public --add-port=8080/tcp --permanent
firewall-cmd --reload
```

+ 安装MySQL - mysql-5.7.25-1.el7.x86_64.rpm-bundle

```
yum install openssl-devel -y
去官网下载mysql 采用redhat版本

systemctl status mysqld
systemctl start mysqld
systemctl stop mysqld

netstat -tunlp									查看已经启动的服务
netstat -tunlp | grep mysql			查看mysql的服务信息
ps –ef | grep mysql							查看mysql进程
```

+ 安装LRZSZ

#### 项目部署

+ 手动部署项目

```
&:让命令在后台运行
nohup java -jar boot工程.jar &> hello.log &
上述指令的含义为: 后台运行 java -jar 命令，并将日志输出到hello.log文件

nohup java -jar helloworld-0.0.1-SNAPSHOT.jar &> hello2.log &
ps -ef|grep java
kill -9 2240
```

+ 自动部署项目

借助git、maven打包、编写并运行shell脚本

+ Linux权限

```
chmod (英文全拼:change mode)命令是控制用户对文件的权限的命令
Linux中的权限分为三种 :读(r)、写(w)、执行(x)
Linux文件权限分为三级 : 文件所有者(Owner)、用户组(Group)、其它用户 (Other Users)
只有文件的所有者和超级用户可以修改文件或目录的权限
要执行Shell脚本需要有对此脚本文件的执行权限(x)，如果没有则不能执行

chmod 777 bootStart.sh			为所有用户授予读、写、执行权限
chmod 755 bootStart.sh			为文件拥有者授予读、写、执行权限，同组用户和其他用户授予读、执行权限
chmod 210 bootStart.sh			为文件拥有者授予写权限，同组用户授予执行权限，其他用户没有任何权限
```





## 第四阶段：Redis

#### Redis入门

+ Redis简介

Redis是一个开源的内存中的数据结构存储系统，它可以用作：数据库、缓存和消息中间件。

应用场景：缓存、任务队列、消息队列以及分布式锁

+ 下载与安装

Mac:https://blog.csdn.net/qq_43783527/article/details/124961930?spm=1001.2101.3001.6650.13&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EESLANDING%7Edefault-13-124961930-blog-114279202.pc_relevant_multi_platform_whitelistv4eslandingctr2&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EESLANDING%7Edefault-13-124961930-blog-114279202.pc_relevant_multi_platform_whitelistv4eslandingctr2&utm_relevant_index=17

linux(arm):https://icode.best/i/05202843307665

解决linux中gcc版本过低的问题：https://www.cnblogs.com/shook/p/12883742.html

+ Redis服务启动与停止

```
mac:cd /Users/tianjiangyu/config/redis/redis-stack-server-6.2.4-v1.monterey.arm64/bin
启动服务端：./redis-server
启动和关闭客户端：./redis-cli ./redis-cli shutdown

linux: 带着配置文件启动可以进行后台启动
/usr/local/redis-6.0.9/src/redis-server /usr/local/redis-6.0.9/redis.conf

后台运行：
src/redis-cli -h localhost -p 6379 -a 991116
```

#### 数据类型

Redis存储的是key-value结构的数据，其中key是字符串类型，value有5种常用的数据类型：String,hash,list,set,sorted set

#### 常用命令

+ 字符串string操作命令

```
SET key value									设置指定key的值
GET key												获取指定key的值
SETEX key seconds value				设置指定key的值，并将 key 的过期时间设为 seconds 秒
SETNX key value								只有在 key 不存在时设置 key 的值
```

+ 哈希hash操作命令

```
HSET key field value 	将哈希表 key 中的字段 field 的值设为 value
HGET key field 				获取存储在哈希表中指定字段的值
HDEL key field				删除存储在哈希表中的指定字段
HKEYS key 						获取哈希表中所有字段
HVALS key 						获取哈希表中所有值
HGETALL key 					获取在哈希表中指定 key 的所有字段和值
```

+ 列表list操作命令

```
LPUSH key value1 [value2] 	将一个或多个值插入到列表头部
LRANGE key start stop 			获取列表指定范围内的元素
RPOP key 										移除并获取列表最后一个元素
LLEN key 										获取列表长度
BRPOP key1 [key2 ] timeout 	移出并获取列表的最后一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
```

+ 集合 set 操作命令

```
SADD key member1 [member2] 		向集合添加一个或多个成员
SMEMBERS key 									返回集合中的所有成员
SCARD key 										获取集合的成员数
SINTER key1 [key2] 						返回给定所有集合的交集
SUNION key1 [key2] 						返回所有给定集合的并集
SDIFF key1 [key2] 						返回给定所有集合的差集
SREM key member1 [member2] 		移除集合中一个或多个成员
```

+ 有序集合 sorted set 操作命令

```
每个元素都会关联一个double类型的分数(score),redis正是通过分数来为集合中的成员进行从小到大排序。


ZADD key score1 member1 [score2 member2] 	向有序集合添加一个或多个成员，或者更新已存在成员的						分数
ZRANGE key start stop [WITHSCORES] 				通过索引区间返回有序集合中指定区间内的成员
ZINCRBY key increment member 							有序集合中对指定成员的分数加上增量 increment
ZREM key member [member ...] 							移除有序集合中的一个或多个成员
```

+ 通用命令

```
KEYS pattern 		查找所有符合给定模式( pattern)的 key 
EXISTS key 			检查给定 key 是否存在
TYPE key 				返回 key 所储存的值的类型
TTL key 				返回给定 key 的剩余生存时间(TTL, time to live)，以秒为单位
DEL key 				该命令用于在 key 存在时删除 key
```

#### 在JAVA中操作Redis

在Spring Boot 项目中，可以使用Spring Data Redis来简化Redis操作。

```
Spring Data Redis中提供了一个高度封装的类：RedisTemplate，针对jedis客户端中大量api进行了归类封装,将同一类型操作封装为operation接口，具体分类如下：

ValueOperations：简单K-V操作
SetOperations：set类型数据操作
ZSetOperations：zset类型数据操作
HashOperations：针对map类型的数据操作
ListOperations：针对list类型的数据操作
```





## 第五阶段：项目优化

#### Day1:数据缓存

问题：频繁访问数据库，数据库访问压力大，系统性能下降，用户体验较差。

解决方案：通过Redis来做缓存，从而降低数据库 的访问压力，提高系统的访问性能，从而提升用户体验。

+ 缓存短信验证码 

+ 缓存菜品信息

上面两个方法学习了如何使用RedisTemplate

+ SpringCache

**Spring Cache**是一个框架，实现了基于注解的缓存功能，只需要简单地加一个注解，就能实现缓存功能，大大简化我们在业务中操作缓存的代码，CacheManager是Spring提供的各种缓存技术抽象接口。

```
@EnableCaching   	开启缓存注解功能
@Cacheable				在方法执行前spring先查看缓存中是否有数据，如果有数据，则直接返回缓存数据;若 没有数据，调用方法并将方法返回值放到缓存中
@CachePut					将方法的返回值放到缓存中
@CacheEvict				将一条或多条数据从缓存中删除


谢谢，我已经解决了无法注入的问题。我在application.properties里面加了一个配置
spring.cache.jcache.provider=org.ehcache.jsr107.EhcacheCachingProvider
```

```
在使用上述默认的ConcurrentHashMap做缓存时，服务重启之后，之前缓存的数据就全部丢失了，操作起来并不友好。在项目中使用，我们会选择使用redis来做缓存，主要需要操作以下几步:

1）引入pom文件
2）配置application.yml
```

+ 缓存套餐数据

利用上述学习的 SpringCache框架 + Redis数据库，完成缓存套餐数据的优化任务。



#### 克隆虚拟机之后需要修改mac地址

#### Day2: Mysql主从复制

当前，MySQL服务器只有一台，那么就可能会存在如下问题:

1）读和写所有压力都由一台数据库承担，压力大
 2）数据库服务器磁盘损坏则数据丢失，单点故障

+ 读写分离案例 

我们可以准备两台MySQL，一台主(Master)服务器，一台从(Slave)服务器，主库的数据变更，需要同步到从库中(主从复制)。而用户在访问我们项目时，如果是写操作(insert、update、delete)，则 直接操作主库;如果是读(select)操作，则直接操作从库(在这种读写分离的结构中，从库是可以有多个的)，这种结构我们称为读写分离 。

+ **Mysql主从复制**实现读写分离 

MySQL主从复制是MySQL数据库自带功能，无需借助第三方工具。

**MySQL**复制过程分成三步:

1）MySQL master 将数据变更写入二进制日志( binary log)

2）slave将master的binary log拷⻉到它的中继日志(relay log) 

3）slave重做中继日志中的事件，将数据变更反映它自己的数据

```
使用虚拟机制作mysql主从库，根据ppt内容进行环境搭建
主库id 100 从库id 101

mysql -uroot -p991116
查看mysql的密码等级
show variables like 'validate_password%';
set global validate_password.policy=LOW;
set global validate_password.length=4;

创建mysql用户并赋予权限
create user 'xiaoming'@'%' identified with mysql_native_password by '123456';
grant all privileges ON *.* to 'xiaoming'@'%' with grant option;
flush privileges;

登录Mysql数据库，查看master同步状态,记录下结果中File和Position的值
show master status;

从库配置：
 
change master to master_host='192.168.3.61',master_user='xiaoming',master_password='123456',master_log_file='mysql-bin.000005',master_log_pos=1634;
start slave;
show slave status;
```

+ SharingJDBC

Sharding-JDBC定位为轻量级Java框架，在Java的JDBC层提供的额外服务。 它使用客户端直连数据库，以jar包形式提供服务，无需额外部署和依赖，可理解为增强版的JDBC驱动，完全兼容JDBC和各种ORM框架。 

使用Sharding-JDBC可以在程序中轻松的实现数据库读写分离。

```
1) 导入pom坐标
2）读写分离配置yml - 配置读写分离规则，配置文件中运行bean定义覆盖配置项
3) 测试读写分离
```



#### Day3:Nginx技术学习

+ Nginx-概述

Nginx是一款轻量级的Web服务器/反向代理服务器及电子邮件(IMAP/POP3)代理服务器。其特点是占有内存 少，并发能力强，事实上nginx的并发能力在同类型的网⻚服务器中表现较好，中国大陆使用nginx的网站有:百度、京东、新浪、网易、腾讯、淘宝等。

```
yum -y install gcc pcre-devel zlib-devel openssl openssl-devel
wget https://nginx.org/download/nginx-1.16.1.tar.gz
tar -zxvf nginx-1.16.1.tar.gz

 cd nginx-1.16.1
./configure --prefix=/usr/local/nginx

make & make install
```

+ Nginx-命令 

```
1) 查看版本号
./nginx -v

2) 检查配置文件
./nginx -t

3) 启动  nginx服务启动后，默认就会有两个进程。
./nginx
ps -ef|grep nginx
firewall-cmd --zone=public --add-port=80/tcp --permanent 
firewall-cmd --reload

4)停止 
./nginx -s stop

5). 重新加载
./nginx -s reload
```

+ Nginx配置文件结构

```
vim /etc/profile
PATH=/usr/local/nginx/sbin:$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH
source /etc/profile
```

全局块		配置和nginx运行相关的全局配置

events块	配置和网络连接相关的配置

http块		配置代理、缓存、日志记录、虚拟主机等配置

+ Nginx-应用

##### **1 部署静态资源**

Nginx可以作为静态web服务器来部署静态资源。这里所说的静态资源是指在服务端真实存在，并且能够直接展示的一些文件，比如常⻅的html⻚面、css文件、js文件、图片、视频等资源。

相对于Tomcat，Nginx处理静态资源的能力更加高效，所以在生产环境下，一般都会将静态资源部署到Nginx中。 将静态资源部署到Nginx非常简单，只需要将文件复制到Nginx安装目录下的html目录中即可。

```
server {
listen 80; 									#监听端口 
server_name localhost; 			#服务器名称 
  location / { 							#匹配客户端请求url
  root html; 								#指定静态资源根目录
  index index.html; 				#指定默认首⻚ 
  }
}
```

##### **2 反向代理**

正向代理一般是在客户端设置代理服务器，通过代理服务器转发请求，最终访问到目标服务器；反向代理服务器就相当于目标服务器，即用户直接访问反向代理服务器就可以获得目标服务器的资源，反向代理服务器负责将请求转发给目标服务器。**对于用户来说，访问反向代理服务器是完全无感知的。**

```
server {
    listen 82;
    server_name localhost;
    location / {
    	proxy_pass http://192.168.3.61:8080;	#反向代理配置，将请求转发到指定服务
    	} 
   	}	
当访问82端口时，根据反向代理配置，会讲请求转发到192.168.3.61:8080
```

##### **3 负载均衡**

单台服务器的性能及单点故障问题，因此需要多台服务器组成应用集群，进行性能的水平扩展以及避免单点故障出现。

**应用集群:**将同一应用部署到多台机器上，组成应用集群，接收负载均衡器分发的请求，进行业务处理并返回响应 数据

**负载均衡器:**将用户请求根据对应的负载均衡算法分发到应用集群中的一台服务器进行处理

```
nginx配置：

#upstream指令可以定义一组服务器 
upstream targetserver{
    server 192.168.3.61:8080;
    server 192.168.3.62:8081;
}
server {
    listen       8080;
    server_name  localhost;
    location / {
        proxy_pass http://targetserver;
    }
}

负载均衡策略 从课件中获取
upstream targetserver{
    server 192.168.3.61:8080 weight=10;
    server 192.168.3.62:8081 weight=5;
} 
```

