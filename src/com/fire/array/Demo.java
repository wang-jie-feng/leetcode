/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-09-24 14:53:25
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-10 11:42:17
 */
package com.fire.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/24 14:53
 * @histoty 2019/9/24 14:53 created by jiefeng
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        // 设置转换的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 开始时间
        Date startDate = sdf.parse("2016-01-01");
        // 结束时间
        Date endDate = sdf.parse("2015-01-01");
        Date a = sdf.parse("2015-01-02");

        Calendar cal = Calendar.getInstance();
        cal.setTime(endDate);
        cal.add(Calendar.YEAR, 1);

        // 得到相差的天数 betweenDate
        long betweenDate = (a.getTime() - endDate.getTime()) / (60 * 60 * 24 * 1000);

        // 打印控制台相差的天数
        System.out.println(betweenDate);
        System.out.println(cal.getTime());
    }
}
