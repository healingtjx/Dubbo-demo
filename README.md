# Dubbo-demo
springboot 整合 dubbo 注解模式 demo  


# 第一步安装zookeeper  

1.1镜像直接下载  
镜像链接:https://mirrors.tuna.tsinghua.edu.cn/apache/zookeeper/  
1.2官网入口  
官网地址:https://zookeeper.apache.org/  
一直在页面寻找 "Download"  最后下载  
  
2解压  
ZooKeeper软件的文件和目录  
bin目录  
zk的可执行脚本目录，包括zk服务进程，zk客户端，等脚本。其中，.sh是Linux环境下的脚本，.cmd是Windows环境下的脚本。 
  
conf目录  
配置文件目录。zoo_sample.cfg为样例配置文件，需要修改为自己的名称，一般为zoo.cfg。log4j.properties为日志配置文件。  
  
lib  
zk依赖的包。  
  
contrib目录  
一些用于操作zk的工具包。  
  
recipes目录  
zk某些用法的代码示例  
  
ps:%ZooKeeper% 是 安装目录   
3.修改 %ZooKeeper%/bin/zoo_sample.cfg 为 zoo.cfg (这个是配置文件需要该端口啥的都在这个里面)  

4.启动 服务  
windows 双击  %ZooKeeper%/bin/zkServer.cmd  
linux   执行  %ZooKeeper%/bin/zkServer.sh  
如果报错的话，根据错误去修改配置文件就好了  
  
  
# 第二步下载源码  




  
















