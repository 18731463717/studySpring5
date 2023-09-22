package factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 8:04
 */
public class PythonNote implements INote{
    @Override
    public void edit() {
        System.out.println("python课堂笔记");
    }
}
