package com.liugh.model;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

/**
 * @author : Lyn
 * @version V1.0
 * @Project: liugh-parent
 * @Package com.liugh.entity
 * @Description: TODO
 * @date Date : 2019-07-20 15:47
 * @copyright http://www.jhhg.net.cn/
 */

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserToCom {

    private String userNo;
    private String mobile;
    private String nickName;
    private String avatar;
    private String job;
    private String companyName;
    private Double acquireStars;
    private String nameauthFlag;
    private Double balance;
    private Long personNubmer;


}
