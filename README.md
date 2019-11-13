# spring_cloud_learn
spring cloud的一些简单笔记例子


eureka_config_client_git
spring cloud 配置中心client端可以向eureka中心进行注册
eureka_config_server_git
       srping cloud config  server端，配合git使用，可以向eureka中心注册
eureka_config_server_git_2
         这个代码与 eureka_config_server_git服务的代码一样，二者都注册到注册中心去，形成高可用的服务


spring_cloud_config_client
 	spring cloud config client端，与 spring_cloud_config_server服务配合从本地读取配置文件
spring_cloud_config_server
 spring cloud config server端，config server从本地读取配置文件


spring_cloud_config_client_git
spring  cloud config client端，配合config server从git远程仓库读取配置文件，不带有refresh功能
spring_cloud_config_client_git_refresh
   	spring cloud config client端，从git读取配置文件，客户端使用命令更新的时候，client不用启动即可读取到   						       最新的git远程仓库中改动的数据
spring_cloud_config_server_git
  spring cloud config server端，config server从git远程仓库读取配置文件


spring_cloud_eureka_client_2
eureka client简单的一个demo书写

spring_cloud_eureka_consumer
--eureka client ，消费者--使用了feignclient进行微服务之间的调用
spring_cloud_eureka_server
--eureka server单体应用部署
spring_cloud_eureka_three_server_1
--eureka server集群高可用，三台eureka server互相注册
spring_cloud_eureka_three_server_2
--eureka server集群高可用，三台eureka server互相注册
spring_cloud_eureka_three_server_3
--eureka server集群高可用，三台eureka server互相注册

spring_cloud_feign_hystrix
--微服务在使用feign进行微服务之间调用的基础上，加上了熔断器
spring_cloud_resttemplate_hystrix
---微服务在使用resttemplate进行微服务之间调用的基础上，加上了熔断器

spring_cloud_hystrix_dashborad_turbine
--对多个使用了熔断器的微服务通过 tubine聚合熔断信息进行实时监控
spring_cloud_resttemplate_hystrix_dashborad
--对使用了resttmlate 和熔断器的微服务 通过 dashboard进行单体应用的熔断信息监控

spring_cloud_resttemplate_ribbon
--微服务通过resttmpalte进行负载均衡

spring_clound_eureka_producer
spring_clound_eureka_producer_2
--同名的两个生产者微服务，实现微服务的高可用，二者除了端口不一样，剩下的代码都一样
--在eureka server中展示的时候，在实力列表的同一行上面。

spring_cloud_zuul_simple_demo
--zuul的入门级别的简单实例
zuul_demo2
---zuul将请求转发到其他微服务上面

