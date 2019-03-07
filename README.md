## Acmedcare+ 微服务模版项目

项目的基本介绍

### 功能模块

```

├── CHANGELOG.md                                            #   版本发布日志
├── LICENSE                                                 #   版权
├── README.md                                               #   项目描述文件
├── api                                                     #   项目基础模块:定义实体,接口等等
├── client                                                  #   客户端用于第三方调用/服务间通讯/SDK等等
│   ├── client-core                                         #   客户端核心实现
│   ├── client-samples                                      #   客户端使用案例集合
│   │   ├── client-sample                                       #   核心包使用案例
│   │   ├── spring-boot-starter-client-sample                   #   客户端Spring Boot Starter案例
│   │   └── spring-cloud-starter-client-sample                  #   客户端Spring Cloud Starter案例
│   ├── spring-boot-starter-microservices-template-client   #   客户端`Spring Boot Starter`模块
│   └── spring-cloud-openfeign-client                       #   客户端`Spring Cloud OpenFeign Client Starter`模块
│       
├── common                                                  #   项目公共模块:定义工具类,常量等等
│   
├── distribution                                            #   项目分发模块:支持区域/单体/云/离线等等模式
│   
├── doc                                                     #├── 项目文档
│   └── database                                             │   └── 数据库设计文档
│       └── account                                          │       └── 案例:通行证账号设计
│           ├── Account\ Model\ Design.ndm                   │           ├── ER图         
│           └── Account.sql                                  └───────────└── 脚本
│
├── endpoint                                                #   项目资源端口模块:RESTful
│   
├── repository                                              #├── 项目持久化模块
│   ├── repository-api                                       │   ├── 项目持久化接口模块
│   └── repository-jdbc                                      └───────└── 持久化 Simple JDBC 实现
│
│── test                                                    #   项目集成测试模块
└── pom.xml


```


### 快速开始

### 编译打包

### 文档介绍
