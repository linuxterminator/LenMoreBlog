package com.huqingshan.LenMore.utils.JackSonUtil;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Map;

/**
 * 把Map序列化为对象数组
 */
public class CustomSerializer extends JsonSerializer<Map<String,String>> {

    @Override
    public void serialize(Map<String, String> stringStringMap, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

    }
}
