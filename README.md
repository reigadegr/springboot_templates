# springboot_templates
springboot项目简陋的模板(自用)
## 部署说明
- 进入项目的src/main/resources,修改application.yml的数据库MySQL的密码
- 创建uniselect表，执行项目里的uniselect.sql
- 启动方式：执行命令：
```cmd
mvn clean spring-boot:run
```
- 本项目，请你启动后访问:
http://127.0.0.1:9090/login/1/1
即可看到返回的结果，这就是springboot后端做的事情
- 至于怎么华丽的显示到前端，那就跟后端无关了，归前端管

## 其他说明
- 本项目为实际项目拆解，已经进行了部分必要配置
- 获得构建好的jar包：mvn clean install 后，去target目录寻找
- 不建议使用idea内的右键主类启动的方法，存在bug
- bug解决办法：关闭idea，删除项目目录的.idea文件夹，大部分问题基本可以解决
- 强制关闭idea：
```cmd
taskkill /F /IM idea64.exe
```
