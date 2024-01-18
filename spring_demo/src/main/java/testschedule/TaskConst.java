package testschedule;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-19 19:51
 * @LastEditTime: 2023-07-19 19:51
 */

public class TaskConst {

    /** Schedule 账号 */
    public static final String SCHEDULE_USER = "schedule";
    /** 任务状态 0:初始化 */
    public static final String INIT_TASK_STATUS = "0";
    /** 任务状态 1:成功 */
    public static final String SUCCESS_TASK_STATUS = "1";
    /** 任务状态 2:失败 */
    public static final String FAIL_TASK_STATUS = "2";
    /** 平台注单任务 */
    public static final String PLATFORM_ORDER_TASK_TYPE = "PLATFORM-ORDER-TASK";
    /** 平台注单任务调度时间（每5分钟调度一次） */
    public static final String PLATFORM_ORDER_TASK_CRON = "0 0/5 * * * ?";
    /** 在线检查（每2分钟调度一次） */
    public static final String ON_LINE_CHECK = "0 0/2 * * * ?";
    /** 公司结算任务 */
    public static final String COMPANY_BILLING_TASK_TYPE = "COMPANY-BILLING-TASK";
    /** 公司结算任务调度时间（每5分钟调度一次） */
    public static final String COMPANY_BILLING_TASK_CRON = "30 0/2 * * * ?";
    /** 注单返水统计任务 */
    public static final String RETURN_POINT_TASK_TYPE = "RETURN-POINT-TASK";
    /** 注单返水统计任务调度时间（每天半夜12点30分调度一次） */
    public static final String RETURN_POINT_TASK_CRON = "0 30 0 * * ?";
    /** 公司抽水统计任务 */
    public static final String PUMP_TASK_TYPE = "RETURN-POINT-TASK";
    /** 公司抽水统计任务（每天半夜12点30分调度一次） */
    public static final String PUMP_TASK_CRON = "0 30 0 * * ?";

    /** 彩票定时建期号任务（每天半夜0点调度一次） */
    public static final String PERIODS_TASK_CRON = "5 0 0 * * ?";
    /** 彩票定时备份清理期号任务（每天半夜1点调度一次） */
    public static final String PERIODS_BACKUP_TASK_CRON = "0 5 20 * * ?";
    /** 注单中奖凭证表定时清理任务（每天半夜1点30分调度一次） */
    public static final String VOUCHER_CLEAN_TASK_CRON = "0 30 1 * * ?";

    /** 公司统计报表任务*/
    public static final String COMPANY_REPORT_TYPE = "COMPANY-REPORT-TASK";
    /** 公司统计报表调度时间（每天上午10调度一次）*/
    public static final String COMPANY_REPORT_CRON = "0 0 10 * * ?";

    /** 平台统计报表任务*/
    public static final String PLATFORM_REPORT_TYPE = "PLATFORM-REPORT-TASK";
    /** 平台统计报表调度时间（每天早上午10调度一次）*/
    public static final String PLATFORM_REPORT_CRON = "0 0 10 * * ?";

    /** 会员出入款统计任务*/
    public static final String PAYMENT_OUT_TYPE = "PAYMENT-OUT-TASK";
    /** 会员出入款统计调度时间（每天上午10点调度一次）*/
    public static final String PAYMENT_OUT_CRON = "0 0 1 * * ?";

    /** 统计会员优惠统计任务*/
    public static final String DISCOUNT_TYPE = "DISCOUNT-TASK";
    /** 统计会员优惠统计调度时间（每天上午10点调度一次）*/
    public static final String DISCOUNT_CRON = "0 0 10 * * ?";

    /** 统计会员下注统计任务*/
    public static final String MEMBER_BET_TYPE = "MEMBER-BET-TASK";
    /** 统计会员下注统计调度时间（每天上午10点调度一次）*/
    public static final String MEMBER_BET_CRON = "0 0 10 * * ?";

    /** 平台人数统计任务*/
    public static final String PLATFORM_BET_TYPE = "PLATFORM-BET-TASK";
    /** 平台人数统计调度时间（每天上午10点调度一次）*/
    public static final String PLATFORM_BET_CRON = "0 0 10 * * ?";

    /** 每个小时统计提现、彩金、充值数据定时任务d调度时间（每天早上5点调度一次）*/
    public static final String MARKET_OPENING_REPORT_TYPE = "MARKET-OPENING-REPORT-TASK";
    /** 每个小时统计提现、彩金、充值数据定时任务*/
    public static final String MARKET_OPENING_REPORT_CRON = "0 0 0-23 * * ?";

    /** 股东会员汇总报表任务*/
    public static final String SHAREHOLDER_REPORT_TYPE = "SHAREHOLDER-REPORT-TASK";
    /** 股东会员汇总报表调度时间（每天上午10调度一次）*/
    public static final String SHAREHOLDER_REPORT_CRON = "0 0 10 * * ?";

    /** 股东会员汇总报表任务*/
    public static final String SHAREHOLDER_MEMBER_REPORT_TYPE = "SHAREHOLDER-MEMBER-REPORT-TASK";
    /** 股东会员汇总报表调度时间（每天上午10调度一次）*/
    public static final String SHAREHOLDER_MEMBER_REPORT_CRON = "0 0 10 * * ?";

    /** 会员支付通道充值报表任务*/
    public static final String RECHARGE_REPORT_TYPE = "RECHARGE-REPORT-TASK";
    /** 会员支付通道充值报表调度时间（每天上午10调度一次）*/
    public static final String RECHARGE_REPORT_CRON = "0 0 10 * * ?";

    /**游戏分类统计汇总任务*/
    public static final String GAMETYPE_TOTAL_REPORT_TYPE = "GAME_TYPE_REPORT";
    /**游戏分类统计汇总任务定时器表达式 (每天晚上00:30点运行一次)*/
    public static final String GAMETYPE_TOTAL_REPORT_CRON = "0 30 0 * * ? ";

    /** 22点到24点，0点到2点，每5分钟运行一次：[0 0/5 0,1,22,23 * * ?]  */
    public static final String DRAWRESULT_TASK_CRON_FIVE = "0 0/5 0,1,22,23 * * ?";
    /** 每天从10点到22点，每10分钟运行一次：[0 0/10 10-21 * * ?]  */
    public static final String DRAWRESULT_TASK_CRON_TEN = "0 0/10 10-21 * * ?";
    /** 天津时时彩每天从9点10分到23点，每10分钟运行一次：[0 10/10 9-22 * * ?]  */
    public static final String TJSSC_DRAWRESULT_TASK_CRON_TEN = "0 10/10 9-22 * * ?";
    /***棋牌代理结算 ***/
    public static final String AGENT_BILLING_QPTASK="agent_billing_qptask";
    /***棋牌代理结算 ***/
    public static final String AGENT_BILLING_DZTASK="agent_billing_dztask";
    /***棋牌代理结算 ***/
    public static final String AGENT_BILLING_SXTASK="agent_billing_sxtask";
    /***棋牌代理结算 ***/
    public static final String AGENT_BILLING_CPTASK="agent_billing_cptask";
    /***棋牌代理结算 ***/
    public static final String AGENT_BILLING_TYTASK="agent_billing_tytask";
    /***棋牌代理结算 ***/
    public static final String AGENT_BILLING_BYTASK="agent_billing_bytask";
    /***批量佣金代理结算 ***/
    public static final String BATCH_BILLING_TYTASK="agent_billing_tytask";
    /***红包缓存定时清理 ***/
    public static final String CLEAR_RED_POCKET_CACHE_TASK="clear_red_pocket_cache_task";

    /**体育代理结算***/
    public static final String  AGENT_TY_BILLING_TIME="0 0 6 * * ?";
    /**真人代理结算***/
    public static final String  AGENT_ZR_BILLING_TIME="0 30 6 * * ?";
    /**电子代理结算***/
    public static final String  AGENT_DZ_BILLING_TIME="0 0 7 * * ?";
    /**棋牌代理结算***/
    public static final String  AGENT_QP_BILLING_TIME="0 30 7 * * ?";
    /**捕鱼代理结算***/
    public static final String  AGENT_BY_BILLING_TIME="0 0 8 * * ?";
    /**彩票代理结算***/
    public static final String  AGENT_CP_BILLING_TIME="0 30 8 * * ?";

    /**每周一凌晨5分***/
    public static final String  WEEK_INIT_TIME="0 05 00 ? * MON ";
    /**每月一号凌晨10分***/
    public static final String  MONTH_INIT_TIME="0 10 00 01 * ?";

    public static final String EQUIPMENT_REPORT_TYPE = "EQUIPMENT_REPORT_TASK";
    /** 设备统计报表调度时间（每半小时跑一次）*/
    public static final String EQUIPMENT_REPORT_CRON = "0 0/30 * * * ?";

    /** 红包状态更新任务 */
    public static final String REDPOCKET_STATUS_TASK_TYPE = "REDPOCKET-STATUS-TASK";
    /** 红包状态扫描调度时间（每5分钟调度一次） */
    public static final long REDPOCKET_STATUS_TASK_TEMPUS = 300000l;

    public static final String DEL_PLATFORM_BET_TEMP_TASK = "DEL_PLATFORM_BET_TEMP_TASK";

    public static final String DEL_PLATFORM_BET_TEMP_TASK_IM = "DEL_PLATFORM_BET_TEMP_TASK_IM";

    /** 每天凌晨3点清理注单临时表中的前天的数据 */
    public static final String DEL_PLATFORM_BET_TEMP_CRON = "0 0 3 * * ?";
    public static final String DEL_PLATFORM_BET_TEMP_CRON_IM = "0 0 2 * * ?";

    /** 批量佣金结算定时器 ***/
    public static final String  BATCH_TY_BILLING_TIME="0 0 2 * * ? ";

    /** 红包缓存定时清理器 ***/
    public static final String  CLEAR_RED_POCKET_CACHE_TIME="0 0/30 * * * ?";

    /** 每天4点执行删除7天之外的站内信数据 */
    public static final String DELETE_STATION_LATTER_TASK = "DELETE_STATION_LATTER_TASK";

    public static final String DELETE_STATION_LATTER_CRON = "0 0 4 * * ?";

    /**
     * 每天凌晨0点删除上一天失败的数据
     */
    public static final String DEL_MENBER_RECHARGE_ORDER_TASK = "DEL_MENBER_RECHARGE_ORDER_TASK";
    public static final String DEL_MENBER_RECHARGE_ORDER_CRON = "0 0 1 * * ?";

    /**
     * 每天凌晨0点清理用户任务缓存信息
     */
    public static final String DISCOUNT_TASK_CLEAR_TASK = "DISCOUNT_TASK_CLEAR_TASK";
    public static final String DISCOUNT_TASK_CLEAR_TASK_CRON = "0 0 1 * * ?";

    /**
     * 每天凌晨0点清理用户任务缓存信息
     */
    public static final String TABLE_DATA_CLEAN_TASK = "TABLE_DATA_CLEAN_TASK";
    public static final String TABLE_DATA_CLEAN_TASK_CRON = "0 0 5 20 * ?";

    /**
     *每天1:00,1:35处理报表调度问题
     */
    public static final String FINANCIAL_ONLINE_REINIT_CRON = "0 0/35 1 * * ?";
    public static final String FINANCIAL_ONLINE_REINIT_TYPE = "REINIT_ONLINE_FINANCIAL_REPORT";

    public static final String FINANCIAL_OFFLINE_REINIT_CRON = "0 0/35 1 * * ?";
    public static final String FINANCIAL_OFFLINE_REINIT_TYPE = "REINIT_OFFLINE_FINANCIAL_REPORT";

    public static final String BUNDLEVERSIONID_REPORT_REINIT_CRON = "0 0/35 1 * * ?";
    public static final String BUNDLEVERSIONID_REPORT_REINIT_TYPE = "REINIT_BUNDLEVERSIONID_REPORT";


    /** 借呗订单逾期检测 */
    public static final String CREDIT_ORDER_CHECK = "CREDIT_ORDER_CHECK";
    public static final String CREDIT_ORDER_CHECK_CRON = "0 55 23 * * ?";

    /**
     * 每间隔半小时上报在线人数
     */
    public static final String REPORT_ONLINE_NUMBER_CORN = "0 0/30 * * * ?";
    public static final String REPORT_ONLINE_NUMBER_TYPE = "REPORT_ONLINE_NUMBER_CORN";

    /**
     * 每天凌晨1点上报彩票报表数据
     */
    public static final String REPORT_LOTTERY_NUMBER_CORN = "0 0 1 * * ?";
    public static final String REPORT_LOTTERY_NUMBER_TYPE = "REPORT_LOTTERY_NUMBER_CORN";

    /**
     * 每天2:00,2:35处理游戏报表和分析系统数据调度
     */
    public static final String GAME_BET_REINIT_CRON = "0 0/35 2 * * ?";
    public static final String GAME_BET_PROCESS_TYPE = "GAME_BET_PROCESS_REPORT";

    public static final String MEMBER_ANALYZE_REINIT_REPORT_CRON  = "0 0/35 2 * * ?";
    public static final String MEMBER_ANALYZE_PROCESS_REPORT_TYPE  = "MEMBER_ANALYZE_PROCESS_REPORT";

    /** 删除导出记录（每天凌晨01:17:00调度一次）*/
    public static final String DEL_EXPORT_CRON = "0 17 1 * * ?";


    /** 体育玩法预测结果调度时间（每15分钟调度一次） */
    public static final String SPORT_PLAY_FORECAST_ORDER_TASK = "SPORT_PLAY_FORECAST_ORDER_TASK";
    public static final String SPORT_PLAY_FORECAST_ORDER_TASK_CRON = "0 0/15 * * * ? ";

    /** 体育推荐赛事获取比分调度时间（每5分钟调度一次） */
    public static final String SPORTS_PLANNING_RECOMMEND_SCORE_TASK = "SPORTS_PLANNING_RECOMMEND_SCORE_TASK";
    public static final String SPORTS_PLANNING_RECOMMEND_SCORE_TASK_CRON = "0 0/5 * * * ? ";
}
