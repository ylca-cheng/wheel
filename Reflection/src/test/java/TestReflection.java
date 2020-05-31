import static org.junit.Assert.*;

/**
 * 使用反射机制加载类
 * @author: guangxush
 * @create: 2020/05/31
 */
public class TestReflection {

    @org.junit.Test
    public void testFunction() throws Exception{
        Class cls = Class.forName("Children");
        Parents parents = (Parents)cls.newInstance();
        parents.function();
    }
}