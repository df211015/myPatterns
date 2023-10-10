package com.example.factorypattern.service.v5;

import com.example.factorypattern.domain.dto.KeyPad;

public abstract class AbsKeyFactory {
    public abstract KeyPad create(Integer index);
}