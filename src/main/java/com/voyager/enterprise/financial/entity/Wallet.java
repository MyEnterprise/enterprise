package com.voyager.enterprise.financial.entity;

import com.voyager.enterprise.financial.entity.enums.WalletEnum;

public class Wallet {
    public WalletEnum type;
    public boolean hasEncrypted;
    public String algorithmEncrypted;
    public String region;
    public String local;
}
