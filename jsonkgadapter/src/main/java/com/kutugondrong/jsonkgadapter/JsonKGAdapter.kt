package com.kutugondrong.jsonkgadapter


import com.kutugondrong.jsonkg.JsonKG
import com.kutugondrong.networkkgadapter.ConverterNetworkKGAdapter
import kotlin.reflect.KClass

/**
 * KG KutuGondrong
 * This is the main class for create DefaultConverterAdapter
 * For convert json to object using JsonParser
 * @see JsonKG
 *
 *
 */

class JsonKGAdapter: ConverterNetworkKGAdapter(JSONKGADAPTER) {

    companion object {
        fun create() : JsonKGAdapter{
            return JsonKGAdapter()
        }
    }

    override fun fromJson(json: String, classOf: KClass<*>, isList: Boolean): Any? {
        return JsonKG().fromJson(json, classOf, isList)
    }

    override fun toJson(value: Any): String? {
        return JsonKG().toJson(value)
    }

}