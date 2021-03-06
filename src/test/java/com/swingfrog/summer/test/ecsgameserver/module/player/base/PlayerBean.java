package com.swingfrog.summer.test.ecsgameserver.module.player.base;

import com.swingfrog.summer.db.repository.annotation.Column;
import com.swingfrog.summer.db.repository.annotation.PrimaryKey;
import com.swingfrog.summer.ecs.bean.Bean;

public abstract class PlayerBean implements Bean<Long> {

    @PrimaryKey(auto = false)
    @Column
    private long playerId;

    @Override
    public Long getEntityId() {
        return playerId;
    }

    @Override
    public void setEntityId(Long aLong) {
        playerId = aLong;
    }

}
