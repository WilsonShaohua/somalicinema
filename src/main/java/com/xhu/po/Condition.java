package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liu li
 * @date 2020/6/4 13:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condition {
    private int pageNo;
    private String areaId;
    private String typeId;
    private String yearsId;
}
