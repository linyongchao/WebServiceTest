详细描述见[这里](http://linyongchao.github.io/2018/08/30/webservice/)

## Service
1. ```@WebService```注解指定服务
2. ```Endpoint.publish()```方法发布服务
3. ```@WebMethod(exclude= true)```注解指定的方法不会发布
4. 静态方法不会发布

## Client
1. Eclipse可以自动生成Client代码
2. Eclipse生成的代码通过```new ……ServiceLocator().get……Port()```获取调用类
3. wsimport命令可以自动生成Client代码
4. wsimport命令生成的代码通过```new ……Service().get……Port()```获取调用类