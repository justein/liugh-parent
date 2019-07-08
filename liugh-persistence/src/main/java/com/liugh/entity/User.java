package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author liugh123
 * @since 2018-06-25
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;
    /**
     * 用户主键
     */
    @TableId("user_no")
    private String userNo;
    /**
     * 是电话号码，也是账号（登录用）
     */
    private String mobile;
    /**
     * 姓名
     */
    @TableField("user_name")
    private String username;
    /**
     * 为保证隐私，系统统一显示花名
     * */
    @TableField("nick_name")
    private String nickname;
    /**
     * 密码
     */
    @TableField("pass_word")
    private String password;
    /**
     * 单位
     */
    private String unit;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 状态值（1：启用，2：禁用，3：删除）
     */
    private Integer status;
    /**
     * 职位
     */
    private String job;


    @TableField(exist = false)
    private String token;

    @TableField(exist = false)
    private String roleName;
    /**
     * 邀请码
     * 默认000001为管理员邀请的用户
     * */
    private String inviteUserId;
    /**
     * 用于封禁账号
     * */
    private String isValid;
    /**
     * 当前所在公司
     * */
    private String currentCompanyId;

    /**已帮助到多少人*/
    private Integer helpUserNumber;

    private Double acquireStars;


    @Override
    protected Serializable pkVal() {
        return this.userNo;
    }

}
