package prototype.deep;

import java.io.Serializable;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 7:26
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big(){
        this.h *= 2;
        this.d *= 2;
    }
    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
