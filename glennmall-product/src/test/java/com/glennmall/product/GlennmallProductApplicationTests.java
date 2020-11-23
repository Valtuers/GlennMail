package com.glennmall.product;

import com.glennmall.product.entity.AttrEntity;
import com.glennmall.product.service.AttrService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GlennmallProductApplicationTests {
    @Autowired
    AttrService attrService;


    @Test
    void contextLoads() {
        AttrEntity attrEntity = new AttrEntity();
        attrEntity.setAttrName("lalala");
        attrEntity.setAttrType(1);
        attrService.save(attrEntity);
        attrService.updateById(new AttrEntity(){{
            setAttrId(1L);
            setAttrName("opoppppppo");
        }});
    }

}
