package com.glennmall.member;

import com.glennmall.member.entity.MemberEntity;
import com.glennmall.member.service.MemberService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GlennmallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("林铭聪");

        memberService.save(memberEntity);
    }

}
