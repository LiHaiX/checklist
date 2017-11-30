package com.qa.tools.enums;

/**
 * Created by chenguang.xu on 2016/1/10.
 */
public enum ClientType {

    TTS_NEW("tts_new", "自营"),
    TTS_OLD("tts_old", "代理商"),
    TTS_UNKNOW("unknow", "未知");

    public final String code;
    public final String name;
    private ClientType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ClientType fromCode(String code) {
        for (ClientType p : ClientType.values()){
            if (p.code.equals(code)){
                return p;
            }
        }
        return TTS_UNKNOW;
    }

}
