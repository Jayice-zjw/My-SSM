### 以下是几个一开始用Elicpse学习springMVC时遇到的问题

#### 1.maven项目无法被部署到tomcat上。解决办法：选择maven项目的properties，再选择Project facets，勾选Dynamic Web  Module和JavaScript。
#### 2.JSP中无法使用EL表达式。在对应的JSP文件开头加上  <%@ page isELIgnored="false" %>
#### 3.要在项目的Depolyment Assembly中，把test相关ermove掉。并添加一个src/main/webapp和一个Maven Denpendencies
#### 4.webapp下的文件才可以直接访问
#### 5.如果想通过前端的URL进行赋值，则在JSP界面运用EL表达式前需要在key前加上param. 如${param.id}
