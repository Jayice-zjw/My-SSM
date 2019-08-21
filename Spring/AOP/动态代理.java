import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//使用动态代理，无需再Object类中写非业务代码

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //记录日志
        MyLog.doLog(target.getClass());

        //业务逻辑
        Object invoke = method.invoke(target, args);

        //提交事务
        MyTransaction.doTransaction(target.getClass());

        return invoke;
    }
}
