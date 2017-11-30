

package com.qa.tools.constants;

import com.google.common.collect.Maps;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Constants {
    public static final Set<String> MIAO_SITE = new HashSet<String>();
    public static final Map<String, String  > DEFAULT_LOGO_PATH = Maps.newHashMap();
    public static final float DEFAULT_PROBABILITY = 1.0f;
    public static final String QNF_DOMAIN = "qnf.trade.qunar.com";
    public static final String BOOKFILLJSP_ERROR_PATH = "/qnf/book/fill";
    public static final String QNF_BOOKFILLJSP_PATH = "/qnf/book/fill";
    public static final String OTA_LOGO_URI = "/site/images/logo.gif";
    public static final String TAG_BOOKFILLJSP_PATH = "/tag/book/fill";
    public static final String QNF_IATA = "08328121";
    public static final String CPF_BOOKINFOJSON_PATH = "/api/cpf/web/book_info.json";
    public static final String CPF_LOGO_PATH = "http://simg1.qunarzz.com/tts/products_logo/xjbw-logo.gif";
    public static final String UFF_LOGO_PATH = "http://simg1.qunarzz.com/tts/products_logo/yfb-logo.gif";
    public static final String LPF_LOGO_PATH = "http://simg1.qunarzz.com/tts/products_logo/djth-nlogo.gif";
    public static final String BTF_LOGO_PATH = "http://simg1.qunarzz.com/tts/products_logo/slyx-logo.gif";
    public static final String SOURCE_TYPE="sourceType";//存放扩展属性extMap key:系统来源类型（运价直连用）
    public static final String GROUP_ID="groupId";//存放扩展属性extMap key:接口组ID（运价直连用
    public static final String SOURCE_TYPE_YJZL="1";//sourceType 报价来源  0：默认   1：运价直连
    public static final String BILLING_PRICE="billingprice"; //政策价格
    public static final String WAP_PRIVILEGE_KEY = "WAP_PRIVILEGE_IDENTITY";
    public static final String HAVE_PRIVILEGE = "1";
    public static final String DO_NOT_HAVE_PRIVILEGE = "0";
    public static final String GLOBAL_SYSCONF_EXECUTE_AVFEED = "CHECKED_AVFEED_LIST";
    public static final String GLOBAL_SYSCONF_SITE = "ttm";
    public static final String AV_CHECK = "AV_CHECK";
    public static final String OFFICEID_PREFIX = "officeId_";
    public static final String SINGLE_AV_FAILED_USED_AVFEED = "single av failed used avfeed";
    public static final String SINGLE_AV_FAILED_BUT_OVER_TIMES = "single av failed but over times";
    public static final String SINGLE_AV_FAILED_BUT_NOT_IN_TIME = "single av failed but not in time";
    //pidAV的office是否从pnrservice接口拿
    public static String IS_OFFICE_FROM_PNRSERVICE = "IS_OFFICE_FROM_PNRSERVICE" ;
    // 退改签不友好航空公司, 优飞使用
    public static final String TGQ_LIMIT = "tgq_limit_flightcompany";
    public static String BID_STRATEGY = "1.000" ;
    public static String ANONYMOUS = "3";  //匿名代理商
    // 特惠和返现是否使用低价生单 -1表示不出现选择 1表示默认低价 0表示高价
    public static final String isLow_N = "-1";
    public static final String isLow_L = "1";
    public static final String isLow_H = "0";
    //TTS_SITE_TYPE	网站类型	1	网站类型：默认0表示TTS代理商，1表示旗舰店，2表示批发代理商
    public static final String TTS_SITE_TYPE_KEY = "TTS_SITE_TYPE";
    public static final String TTS_SITE_TYPE_FG = "1";
    public static final short TTS_CORE_SCHEDULE_TYPE = 0;
    
    public static final String NEED_TUI_PIAO_INSURANCE = "NEED_TUI_PIAO_INSURANCE";  //代理商退票险配置

    // booking URL中businessExt字段的各种key value常量
    public static final String BOOK_TYPE = "bookType";
    public static final String FUZZY_FLAG = "fuzzyFlag";
    public static final String FFD = "ffd";
    public static final String UFD = "ufd";
    public static final String WAP = "WAP";
    public static final String POSTED_PRICE = "postedPrice";
    public static final String USE_PANGOLIN = "usePangolin";

    public static final String IS_FUZZY = "1";
    public static final String NOT_FUZZY = "0";

    public static final String PANGOLIN_TTS_SOURCE_NAME = "ORI_TTS_PANGOLIN_PRODUCT";
    public static final String PANGOLIN_FUZZY_FLIGHT_SOURCE_NAME = "ORI_TTS_FUZZY_FLIGHT";
    public static final String PANGOLIN_BOOKING_INTERCEPT_SOURCE_NAME = "ORI_TTS_INTERCEPT";

    static {
        MIAO_SITE.add("miao.qunar.com");
        MIAO_SITE.add("okmiao.qunar.com");
        MIAO_SITE.add("miaosha.qunar.com");

//        DEFAULT_LOGO_PATH.put(ProductType.CPF.getCode(), CPF_LOGO_PATH);
//        DEFAULT_LOGO_PATH.put(ProductType.LPF.getCode(), LPF_LOGO_PATH);
//        DEFAULT_LOGO_PATH.put(ProductType.BTF.getCode(), BTF_LOGO_PATH);
//        DEFAULT_LOGO_PATH.put(ProductType.UFF.getCode(), UFF_LOGO_PATH);
    }

    public static final String SEPERATOR = "_";

    //不提示旅行发票，按照代理商的配置走
    public static final String NOT_SHOW_SPECIAL_INVOICE = "not.show.special.invoice";
    public static final String TRAVEL_INVOICE_VOUCHER = "travel_invoice_voucher";
    public static final String TRAVEL_INVOICE_POLICY = "travel_invoice_policy";
    public static final String WAP_TRAVEL_INVOICE_VOUCHER = "wap_travel_invoice_voucher";
    public static final String WAP_TRAVEL_INVOICE_POLICY = "wap_travel_invoice_policy";
    public static final String TRAVEL_INVOICE_PRICE = "travel_invoice_price";
    public static final String WAP_TRAVEL_INVOICE_PRICE = "wap_travel_invoice_price";
    public static  final int SALE_LIMIT_HIGH= 500;

    //代理商是否打开车车售卖开关
    public static String CAR_SELL_SWITCH = "CAR_SELL_SWITCH";
    public static final String TNL_TGQ_AIRCOMPANY_BOOKING = "tnl_tgq_aircompany_booking";
    public static final String IS_BOOKING = "isBooking";

    public static final String CLIENT_LOGO_OTA_FORMAT = "http://%s/site/images/logo.gif";
    public static final String CLIENT_LOGO_QNDJ = "http://simg1.qunarzz.com/tts/images/logo.gif";//去哪儿网度假
    public static final String CLIENT_LOGO_SLYX = "http://simg1.qunarzz.com/tts/products_logo/slyx-logo.gif";//商旅优选
    public static final String CLIENT_LOGO_YFB = "http://simg1.qunarzz.com/tts/products_logo/yfb-logo.gif";//优飞币专享
    public static final String CLIENT_LOGO_DJTH = "http://simg1.qunarzz.com/tts/products_logo/djth-nlogo.gif";//低价特惠

    public static final String CLIENT_NAME_QNJP = "去哪儿网机票";
    public static final String CLIENT_NAME_QNDJ = "去哪儿网度假";

    //运价直连年龄限制
    public static final int minAgeIndex = 0;
    public static final int maxAgeIndex = 1;

    //搭售骆驼基本价格
    public static final int CAMEL_DEFAULT_BASE_PRICE = 20;
}
