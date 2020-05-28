package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liu li
 * @date 2020/5/27 11:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeildInfomation {
    private Field field;
    private ScreeningRoomInfomation screeningRoomInfomation;
    private MovieInformation movieInformation;

}
