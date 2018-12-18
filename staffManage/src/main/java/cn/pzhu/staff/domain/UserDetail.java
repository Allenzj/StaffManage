package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_detail")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 名字
     */
    private String name;

    /**
     * 身份证号
     */
    @Column(name = "card_num")
    private String cardNum;

    /**
     * 用户状态
     */
    @Column(name = "user_status")
    private String userStatus;

    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期
     */
    private Date borth;

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
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取身份证号
     *
     * @return card_num - 身份证号
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * 设置身份证号
     *
     * @param cardNum 身份证号
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    /**
     * 获取用户状态
     *
     * @return user_status - 用户状态
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 设置用户状态
     *
     * @param userStatus 用户状态
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取出生日期
     *
     * @return borth - 出生日期
     */
    public Date getBorth() {
        return borth;
    }

    /**
     * 设置出生日期
     *
     * @param borth 出生日期
     */
    public void setBorth(Date borth) {
        this.borth = borth;
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