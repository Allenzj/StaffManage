package cn.pzhu.staff.domain;

import javax.persistence.*;

@Table(name = "question_bank")
public class QuestionBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 题目
     */
    private String question;

    @Column(name = "choice_a")
    private String choiceA;

    @Column(name = "choice_b")
    private String choiceB;

    @Column(name = "choice_c")
    private String choiceC;

    @Column(name = "choice_d")
    private String choiceD;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取题目
     *
     * @return question - 题目
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置题目
     *
     * @param question 题目
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return choice_a
     */
    public String getChoiceA() {
        return choiceA;
    }

    /**
     * @param choiceA
     */
    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    /**
     * @return choice_b
     */
    public String getChoiceB() {
        return choiceB;
    }

    /**
     * @param choiceB
     */
    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    /**
     * @return choice_c
     */
    public String getChoiceC() {
        return choiceC;
    }

    /**
     * @param choiceC
     */
    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    /**
     * @return choice_d
     */
    public String getChoiceD() {
        return choiceD;
    }

    /**
     * @param choiceD
     */
    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }
}