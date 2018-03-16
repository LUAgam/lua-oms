import org.lua.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AMGuo
 * @Description
 * @date 2018/03/15 16:38
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.err.println(hello); // 显示调用结果
    }
}
