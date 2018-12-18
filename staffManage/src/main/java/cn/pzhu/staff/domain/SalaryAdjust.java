package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "salary_adjust")
public class SalaryAdjust {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    private Integer rise;

    /**
     * 理由
     */
    private String reason;

    /**
     * 人事意见
     */
    @Column(name = "hr_opinion")
    private String hrOpinion;

    /**
     * 领导意见
     */
    @Column(name = "leader_opinion")
    private String leaderOpinion;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
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
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return rise
     */
    public Integer getRise() {
        return rise;
    }

    /**
     * @param rise
     */
    public void setRise(Integer rise) {
        this.rise = rise;
    }

    /**
     * 获取理由
     *
     * @return reason - 理由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置理由
     *
     * @param reason 理由
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取人事意见
     *
     * @return hr_opinion - 人事意见
     */
    public String getHrOpinion() {
        return hrOpinion;
    }

    /**
     * 设置人事意见
     *
     * @param hrOpinion 人事意见
     */
    public void setHrOpinion(String hrOpinion) {
        this.hrOpinion = hrOpinion;
    }

    /**
     * 获取领导意见
     *
     * @return leader_opinion - 领导意见
     */
    public String getLeaderOpinion() {
        return leaderOpinion;
    }

    /**
     * 设置领导意见
     *
     * @param leaderOpinion 领导意见
     */
    public void setLeaderOpinion(String leaderOpinion) {
        this.leaderOpinion = leaderOpinion;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}