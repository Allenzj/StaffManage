package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 接收者id
     */
    @Column(name = "recevie_id")
    private String recevieId;

    /**
     * 发送者id
     */
    @Column(name = "send_id")
    private String sendId;

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
     * 获取接收者id
     *
     * @return recevie_id - 接收者id
     */
    public String getRecevieId() {
        return recevieId;
    }

    /**
     * 设置接收者id
     *
     * @param recevieId 接收者id
     */
    public void setRecevieId(String recevieId) {
        this.recevieId = recevieId;
    }

    /**
     * 获取发送者id
     *
     * @return send_id - 发送者id
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * 设置发送者id
     *
     * @param sendId 发送者id
     */
    public void setSendId(String sendId) {
        this.sendId = sendId;
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