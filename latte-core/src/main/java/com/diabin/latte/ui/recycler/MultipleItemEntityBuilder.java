package com.diabin.latte.ui.recycler;

import java.util.LinkedHashMap;


/**
 * Created by fei on 2017/8/3.
 */

public class MultipleItemEntityBuilder {

    private static final LinkedHashMap<Object,Object> FIELDS=new LinkedHashMap<>();

    public MultipleItemEntityBuilder(){
        //先清除之前的数据
        FIELDS.clear();
    }

    public final MultipleItemEntityBuilder setItemType(int itemType){
        FIELDS.put(MultipleFields.ITEM_TYPE,itemType);
        return this;
    }

    public final MultipleItemEntityBuilder setField(Object key,Object value){
        FIELDS.put(key, value);
        return this;
    }

    public final MultipleItemEntityBuilder setFields(LinkedHashMap<?,?> map){
        FIELDS.putAll(map);
        return this;
    }

    public final MultipleItemEntity build(){
        return new MultipleItemEntity(FIELDS);
    }

}
