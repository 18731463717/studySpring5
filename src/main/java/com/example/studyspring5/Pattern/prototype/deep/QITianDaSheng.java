package com.example.studyspring5.Pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 7:29
 */
public class QITianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QITianDaSheng(){
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return this.deepClone();
    }

    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QITianDaSheng copy = (QITianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public QITianDaSheng shallowClone(QITianDaSheng target){
        QITianDaSheng qiTianDaSheng = new QITianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = target.birthday;
        return qiTianDaSheng;
    }
}
