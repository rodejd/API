package com.rodejd.api.res;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MemberRes {

    private final String name;
    private final String info;

}
