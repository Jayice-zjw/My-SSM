### 以下是几个一开始用Elicpse学习springMVC时遇到的问题

#### 1.maven项目无法被部署到tomcat上。解决办法：选择maven项目的properties，再选择Project facets，勾选Dynamic Web  Module和JavaScript。
#### 2.JSP中无法使用EL表达式。在对应的JSP文件开头加上  <%@ page isELIgnored="false" %>
