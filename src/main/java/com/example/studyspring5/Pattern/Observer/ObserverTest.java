package com.example.studyspring5.Pattern.Observer;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 8:35
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer per = GPer.getInstance();
        Teacher teacher = new Teacher("tom");
        Teacher teacher1 = new Teacher("mike");

        //把per添加到被teacher和teacher1观察
        per.addObserver(teacher);
        per.addObserver(teacher1);

        Question question = new Question();
        question.setUserName("keke");
        question.setContent("1+1=?");

        per.publishQuestion(question);
    }
}
