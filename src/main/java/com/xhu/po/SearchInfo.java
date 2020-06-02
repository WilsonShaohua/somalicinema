package com.xhu.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liu li
 * @date 2020/5/31 20:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchInfo {
    private MovieType type;
    private WorldCountry worldCountry;
    private Year year;
}
