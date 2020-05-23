package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayAccount {
    private String payAccountId;

    private String payId;

    private String userId;

    private String preferentialId;

    private String payAccountName;

    private String payAccountNumber;

}