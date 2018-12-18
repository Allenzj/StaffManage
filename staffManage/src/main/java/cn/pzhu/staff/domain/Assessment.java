package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 被考核的人
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 成绩
     */
    private Integer score;

    /**
     * 评语
     */
    private String content;

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
     * 获取被考核的人
     *
     * @return user_id - 被考核的人
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置被考核的人
     *
     * @param userId 被考核的人
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取成绩
     *
     * @return score - 成绩
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置成绩
     *
     * @param score 成绩
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取评语
     *
     * @return content - 评语
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评语
     *
     * @param content 评语
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}