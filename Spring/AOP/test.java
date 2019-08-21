import com.monkey1024.dao.UserDao;
import com.monkey1024.dao.impl.UserDaoImpl;
import com.monkey1024.util.MyInvocationHandler;

import java.lang.reflect.Proxy;

public class Test02 {

    public static void main(String[] args) {

        //创建目标类对象
        UserDao userDao = new UserDaoImpl();

        //创建代理
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), new MyInvocationHandler(userDao));

        userDaoProxy.addUser();
    }
}
