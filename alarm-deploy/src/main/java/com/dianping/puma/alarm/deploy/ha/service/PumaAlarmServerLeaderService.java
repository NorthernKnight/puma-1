package com.dianping.puma.alarm.deploy.ha.service;

import com.dianping.puma.alarm.deploy.ha.model.AlarmServerLeader;
import com.dianping.puma.common.exception.PumaServiceException;

/**
 * Created by xiaotian.li on 16/4/5.
 * Email: lixiaotian07@gmail.com
 */
public interface PumaAlarmServerLeaderService {

    void takeLeader(AlarmServerLeader leader) throws PumaServiceException;

    void releaseLeader(AlarmServerLeader leader) throws PumaServiceException;
}