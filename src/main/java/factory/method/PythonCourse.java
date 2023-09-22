package factory.method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/8 7:51
 */
public class PythonCourse implements ICoure {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
