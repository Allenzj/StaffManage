package cn.pzhu.staff.domain;

import java.util.Date;
import javax.persistence.*;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 部门名字
     */
    private String name;

    /**
     * 领导
     */
    private String leader;

    /**
     * 建立时间
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
     * 获取部门名字
     *
     * @return name - 部门名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名字
     *
     * @param name 部门名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取领导
     *
     * @return leader - 领导
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置领导
     *
     * @param leader 领导
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取建立时间
     *
     * @return create_time - 建立时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置建立时间
     *
     * @param createTime 建立时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}