# bounter-springsession
一个用来演示Spring Session的简单的示例项目
1. **启动服务器**   
mvn jetty:run   
   
2. **初始化session数据**   
1)打开一个浏览器，访问：http://localhost:8080/put ,它会往session中存放一个数据，key为name，value为simon   
2)访问http://localhost:8080/get ,浏览器会显示session中key为name的值，即simon

3. **验证session的分布式**   
打开一个新的浏览器窗口，访问http://localhost:8080/get , 浏览器依然显示simon,说明成功实现了session的分布式

4. **验证session的持久化**   
重新启动服务器，访问http://localhost:8080/get ,浏览器依然显示simon,说明成功实现了session的持久化
