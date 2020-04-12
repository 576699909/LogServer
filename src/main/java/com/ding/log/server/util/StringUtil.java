package com.ding.log.server.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import java.util.HashMap;
import java.util.Map;
@Slf4j
public class StringUtil {
    /**
     *把请求参数转换成map
     * @param str
     * @return
     */
    public static Map<String,String> split(String str){
        if(Strings.isBlank(str)){
            return new HashMap<>();
        }
        Map<String,String> map = new HashMap<String,String>();
        String[] param =  str.split("&");
        for(String keyvalue:param){
            String[] pair = keyvalue.split("=");
            if(pair.length==2){
                map.put(pair[0], pair[1]);
            }
        }
        return map;
    }
}
