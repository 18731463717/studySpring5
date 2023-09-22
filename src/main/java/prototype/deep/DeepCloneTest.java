package prototype.deep;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 7:39
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QITianDaSheng qiTianDaSheng = new QITianDaSheng();
        try{
            QITianDaSheng clone = (QITianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }

        QITianDaSheng q = new QITianDaSheng();
        QITianDaSheng a = q.shallowClone(q);
        System.out.println("浅克隆:" + (q.jinGuBang == a.jinGuBang));
    }
}
