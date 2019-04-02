package me.nithans.decoration.common.enums;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum UserStatusEnum {

    DISABLED(0, "已禁用"),
    ENABLED(1, "可使用");

    private int code;
    private String name;

    private static Map<Integer, UserStatusEnum> codeMap = Maps.newHashMap();


    UserStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    static {
        Arrays.stream(UserStatusEnum.values()).forEach(item -> codeMap.put(item.getCode(), item));
    }

    public static UserStatusEnum getUserStatusByCode(int code) {
        return codeMap.get(code);
    }
}
