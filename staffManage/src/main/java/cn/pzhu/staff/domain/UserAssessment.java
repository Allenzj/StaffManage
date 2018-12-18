package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_assessment")
public class UserAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 考核题的id
     */
    @Column(name = "ass_id")
    private String assId;

    /**
     * 答案
     */
    @Column(name = "ass_answer")
    private String assAnswer;

    /**
     * 考核时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取考核题的id
     *
     * @return ass_id - 考核题的id
     */
    public String getAssId() {
        return assId;
    }

    /**
     * 设置考核题的id
     *
     * @param assId 考核题的id
     */
    public void setAssId(String assId) {
        this.assId = assId;
    }

    /**
     * 获取答案
     *
     * @return ass_answer - 答案
     */
    public String getAssAnswer() {
        return assAnswer;
    }

    /**
     * 设置答案
     *
     * @param assAnswer 答案
     */
    public void setAssAnswer(String assAnswer) {
        this.assAnswer = assAnswer;
    }

    /**
     * 获取考核时间
     *
     * @return create_time - 考核时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置考核时间
     *
     * @param createTime 考核时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}