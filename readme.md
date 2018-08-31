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
4. 命令形式为：wsimport -s [结果路径] -p [包名] -keep [服务路径]
5. 服务路径可以是URL，也可以是文件（URL内容的保存，以```wsdl:definitions```标签包含）
6. wsimport命令生成的代码通过```new ……Service().get……Port()```获取调用类
7. asmx后缀的URL，由wsimport命令生成的代码通过```new ……().get……Port()```获取调用类

