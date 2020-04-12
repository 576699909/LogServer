package com.ding.log.server.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


@Slf4j
public class StringUtilTest {


    @Test
    public void split() {
        String str = "group=group1&systemId=1&systemName=Windows 10&memory.total=15.88G&memory.free=6.36G&memory.used=9.52G&C:\\.disk.total=188.5G&C:\\.disk.free=111.7G&C:\\.disk.used=76.9G&start.time=2020-04-13 05:48:49&host.name=DESKTOP-376SQUK&ip=192.168.31.192&systemId.disk.total=0";
        Map<String, String> map = StringUtil.split(str);
        log.info(map.get("group"));
        Assert.assertTrue(map.get("group").equals("group1"));
    }
}
