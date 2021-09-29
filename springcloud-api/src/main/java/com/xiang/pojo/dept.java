package com.xiang.pojo;

import lombok.*;

/**
 * @author zyx
 * @date 2021/8/16 12:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class dept {

    private Long deptId;

    private String dname;

    private String dsource;
}
