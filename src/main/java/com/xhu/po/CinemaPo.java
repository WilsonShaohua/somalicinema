package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liu li
 * @date 2020/5/27 11:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CinemaPo {
    private Cinema cinema;
    private Company company;
    private City city;
}
