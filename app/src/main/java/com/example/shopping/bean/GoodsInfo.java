package com.example.shopping.bean;

import com.example.shopping.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "华为", "vivo", "苹果", "魅族", "小米", "oppo","金立","三星"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "华为 ：中国制造 ",
            "vivo ：更快 更小",
            "苹果：无所不能",
            "魅族：颜值 第一",
            "小米：为发烧而生",
            "oppo：持久 迅速",
            "金立：商业 便捷",
            "三星：防摔 防偷"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {2900,3999, 3499, 1299, 1579, 1779,1999,1669};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.aike, R.drawable.huaweis, R.drawable.pinguo,
            R.drawable.meizu, R.drawable.jinli, R.drawable.vivo1,R.drawable.sanxin,R.drawable.xiaomi1
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.aike, R.drawable.huaweis, R.drawable.pinguo,
            R.drawable.meizu, R.drawable.jinli, R.drawable.vivo1,R.drawable.sanxin,R.drawable.xiaomi1
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
