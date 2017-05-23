package com.xj.dao;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.HashMap;
import java.util.Map;
    //测试git
/**
 * Created by XJTUSE-PC on 2017/5/22.
 */
public class TestHello {
    public static void main(String []args){
        int[]array={1,-1,2,7};
System.out.println("最适合的数字是"+getmax(array));

    }

    public static int getmax(int[]array){
        int result=0;

        for (int i = 0; i < array.length; i++) {
          if(result<array[i])result=array[i];

        }

             return result;



    }
}
