package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fun {
    private String funId;

    private String funName;

    public String getFunId() {
        return funId;
    }

}