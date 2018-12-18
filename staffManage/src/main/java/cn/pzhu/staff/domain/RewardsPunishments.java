package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rewards_punishments")
public class RewardsPunishments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    private String reason;

    /**
     * 加减工资
     */
    private Integer money;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "refute_reason")
    private String refuteReason;

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
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取加减工资
     *
     * @return money - 加减工资
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 设置加减工资
     *
     * @param money 加减工资
     */
    public void setMoney(Integer money) {
        this.money = money;
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

    /**
     * @return refute_reason
     */
    public String getRefuteReason() {
        return refuteReason;
    }

    /**
     * @param refuteReason
     */
    public void setRefuteReason(String refuteReason) {
        this.refuteReason = refuteReason;
    }
}