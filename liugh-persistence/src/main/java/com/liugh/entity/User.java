package com.liugh.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    private LocalDateTime createTime;
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
    @TableField("invite_user_code")
    private String inviteUserCode;
    /**
     * 专属邀请码
     * */
    @TableField("user_code")
    private String userCode;
    /**
     * 当前所在公司
     * */
    @TableField("company_id")
    private String companyId;

    /**获得多少星*/
    @TableField("acquire_stars")
    private Double acquireStars;
    /**是否实名认证*/
    @TableField("nameauth_flag")
    private String nameauthFlag;
    /**账户余额*/
    @TableField("balance")
    private Double balance;



    @Override
    protected Serializable pkVal() {
        return this.userNo;
    }

}
