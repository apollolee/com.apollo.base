/*
 * 此代码创建于 2008-1-29 上午10:00:03。
 */
package com.apollo.base.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.text.SimpleDateFormat;

import javax.swing.Icon;

/**
 * <p>文件名称：IBaseConstants.java</p>
 * <p>类型描述：基础常量接口。</p>
 * <p>版权所有：版权所有(C)2001-2004。</p>
 * <p>公　　司：菠萝梨。</p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2008-1-29</p>
 * <p>修改记录：</p>
 * <pre>
 *    修改日期：
 *    版 本 号：
 *    修 改 人：
 *    修改内容：
 * </pre>
 * @version 1.0
 * @author 李镇
 */
public interface IBaseConstants {

    /*------------------------------------- Public Static Final Field -------------------------------------*/

    /**
     * 值------本地网管。
     */
    public static final String VALUE_LOCALEMS = "EMS{local}";

    /**
     * 行高------表格缺省的行高。
     */
    public static final int RowHeight_Table_Default = 23;

    /**
     * 颜色------禁止编辑的背景色。
     */
    public static final Color Color_Bg_Editable_False = new Color(241, 240, 227);

    /**
     * 颜色------奇数行的背景色。
     */
    public static final Color Color_Bg_Row_Odd = new Color(247, 243, 231);//new Color(178, 216, 255);

    /**
     * 颜色------偶数行的背景色。
     */
    public static final Color Color_Bg_Row_Even = Color.WHITE;

    /**
     * 格式------日期。
     */
    public static final SimpleDateFormat Format_Date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * @see GridBagConstraints#RELATIVE
     */
    public static final int GBC_RELATIVE = GridBagConstraints.RELATIVE;

    /**
     * @see GridBagConstraints#REMAINDER
     */
    public static final int GBC_REMAINDER = GridBagConstraints.REMAINDER;

    /**
     * @see GridBagConstraints#NONE
     */
    public static final int GBC_NONE = GridBagConstraints.NONE;

    /**
     * @see GridBagConstraints#BOTH
     */
    public static final int GBC_BOTH = GridBagConstraints.BOTH;

    /**
     * @see GridBagConstraints#HORIZONTAL
     */
    public static final int GBC_HORIZONTAL = GridBagConstraints.HORIZONTAL;

    /**
     * @see GridBagConstraints#VERTICAL
     */
    public static final int GBC_VERTICAL = GridBagConstraints.VERTICAL;

    /**
     * @see GridBagConstraints#CENTER
     */
    public static final int GBC_CENTER = GridBagConstraints.CENTER;

    /**
     * @see GridBagConstraints#NORTH
     */
    public static final int GBC_NORTH = GridBagConstraints.NORTH;

    /**
     * @see GridBagConstraints#NORTHEAST
     */
    public static final int GBC_NORTHEAST = GridBagConstraints.NORTHEAST;

    /**
     * @see GridBagConstraints#EAST
     */
    public static final int GBC_EAST = GridBagConstraints.EAST;

    /**
     * @see GridBagConstraints#SOUTHEAST
     */
    public static final int GBC_SOUTHEAST = GridBagConstraints.SOUTHEAST;

    /**
     * @see GridBagConstraints#SOUTH
     */
    public static final int GBC_SOUTH = GridBagConstraints.SOUTH;

    /**
     * @see GridBagConstraints#SOUTHWEST
     */
    public static final int GBC_SOUTHWEST = GridBagConstraints.SOUTHWEST;

    /**
     * @see GridBagConstraints#WEST
     */
    public static final int GBC_WEST = GridBagConstraints.WEST;

    /**
     * @see GridBagConstraints#NORTHWEST
     */
    public static final int GBC_NORTHWEST = GridBagConstraints.NORTHWEST;

    /**
     * @see GridBagConstraints#PAGE_START
     */
    public static final int GBC_PAGE_START = GridBagConstraints.PAGE_START;

    /**
     * @see GridBagConstraints#PAGE_END
     */
    public static final int GBC_PAGE_END = GridBagConstraints.PAGE_END;

    /**
     * @see GridBagConstraints#LINE_START
     */
    public static final int GBC_LINE_START = GridBagConstraints.LINE_START;

    /**
     * @see GridBagConstraints#LINE_END
     */
    public static final int GBC_LINE_END = GridBagConstraints.LINE_END;

    /**
     * @see GridBagConstraints#FIRST_LINE_START
     */
    public static final int GBC_FIRST_LINE_START = GridBagConstraints.FIRST_LINE_START;

    /**
     * @see GridBagConstraints#FIRST_LINE_END
     */
    public static final int GBC_FIRST_LINE_END = GridBagConstraints.FIRST_LINE_END;

    /**
     * @see GridBagConstraints#LAST_LINE_START
     */
    public static final int GBC_LAST_LINE_START = GridBagConstraints.LAST_LINE_START;

    /**
     * @see GridBagConstraints#LAST_LINE_END
     */
    public static final int GBC_LAST_LINE_END = GridBagConstraints.LAST_LINE_END;

    /**
     * 缺省的GridBagConstraints.insets字段值。
     */
    public static final Insets INSETS_DEFAULT = new Insets(2, 2, 2, 2);

    /**
     * 无空间的GridBagConstraints.insets字段值。
     */
    public static final Insets INSETS_NoSpace = new Insets(0, 0, 0, 0);

    /**
     * 子视图的GridBagConstraints.insets字段值。
     */
    public static final Insets INSETS_SUBVIEW = new Insets(1, 18, 1, 2);

    /**
     * 左填充的GridBagConstraints.insets字段值。
     */
    public static final Insets INSETS_LEFT = new Insets(0, 2, 0, 0);

    /**
     * 右填充的GridBagConstraints.insets字段值。
     */
    public static final Insets INSETS_RIGHT = new Insets(0, 0, 0, 2);

    /**
     * 左右填充的GridBagConstraints.insets字段值。
     */
    public static final Insets INSETS_RIGHTANDLEFT = new Insets(0, 2, 0, 2);

    /**
     * 缺省的GridBagConstraints.ipadx字段值。
     */
    public static final int IPADX_DEFAULT = 2;

    /**
     * 无空间的GridBagConstraints.ipadx字段值。
     */
    public static final int IPADX_NoSpace = 0;

    /**
     * 缺省的GridBagConstraints.ipady字段值。
     */
    public static final int IPADY_DEFAULT = 2;

    /**
     * 无空间的GridBagConstraints.ipady字段值。
     */
    public static final int IPADY_NoSpace = 0;

    /**
     * 国际化信息------秒。
     */
    public static final String I18N_Second = BaseUtilities.getI18nMessage("Second");

    /**
     * 国际化信息------操作。
     */
    public static final String I18N_Operation = BaseUtilities.getI18nMessage("Operation");

    /**
     * 国际化信息------打印。
     */
    public static final String I18N_Print = BaseUtilities.getI18nMessage("Print");

    /**
     * 国际化信息------记录总数。
     */
    public static final String I18N_TotalCount = BaseUtilities.getI18nMessage("TotalCount");

    /**
     * 国际化信息------耗时。
     */
    public static final String I18N_ElapsedTime = BaseUtilities.getI18nMessage("ElapsedTime");

    /**
     * 国际化信息------基本过滤条件。
     */
    public static final String I18N_BaseCondition = BaseUtilities.getI18nMessage("BaseCondition");

    /**
     * 国际化信息------用户标签。
     */
    public static final String I18N_UserLabel = BaseUtilities.getI18nMessage("UserLabel");

    /**
     * 国际化信息------地理位置。
     */
    public static final String I18N_Location = BaseUtilities.getI18nMessage("Location");

    /**
     * 国际化信息------所属EMS。
     */
    public static final String I18N_ParentEms = BaseUtilities.getI18nMessage("ParentEms");

    /**
     * 国际化信息------生产厂商。
     */
    public static final String I18N_Vendor = BaseUtilities.getI18nMessage("Vendor");

    /**
     * 国际化信息------设备类型。
     */
    public static final String I18N_DeviceType = BaseUtilities.getI18nMessage("DeviceType");

    /**
     * 国际化信息------网元类型。
     */
    public static final String I18N_NeType = BaseUtilities.getI18nMessage("NeType");

    /**
     * 国际化信息------选择类型。
     */
    public static final String I18N_ChoiceType = BaseUtilities.getI18nMessage("ChoiceType");

    /**
     * 国际化信息------模型类型。
     */
    public static final String I18N_ModelType = BaseUtilities.getI18nMessage("ModelType");

    /**
     * 国际化信息------产品名称。
     */
    public static final String I18N_ProductName = BaseUtilities.getI18nMessage("ProductName");

    /**
     * 国际化信息------本地网管。
     */
    public static final String I18N_LocalEms = BaseUtilities.getI18nMessage("LocalEms");

    /**
     * 国际化信息------网元。
     */
    public static final String I18N_Ne = BaseUtilities.getI18nMessage("Ne");

    /**
     * 国际化信息------EMS。
     */
    public static final String I18N_Ems = BaseUtilities.getI18nMessage("Ems");

    /**
     * 国际化信息------拓扑链接。
     */
    public static final String I18N_Link = BaseUtilities.getI18nMessage("Link");

    /**
     * 国际化信息------客户。
     */
    public static final String I18N_Customer = BaseUtilities.getI18nMessage("Customer");

    /**
     * 国际化信息------业务。
     */
    public static final String I18N_Service = BaseUtilities.getI18nMessage("Service");

    /**
     * 国际化信息------业务类型。
     */
    public static final String I18N_ServiceType = BaseUtilities.getI18nMessage("ServiceType");

    /**
     * 国际化信息------子网连接。
     */
    public static final String I18N_SNC = BaseUtilities.getI18nMessage("SNC");

    /**
     * 国际化信息------FDFr。
     */
    public static final String I18N_FDFr = BaseUtilities.getI18nMessage("FDFr");

    /**
     * 国际化信息------最小流域片段。
     */
    public static final String I18N_MFDFr = BaseUtilities.getI18nMessage("MFDFr");

    /**
     * 国际化信息------方向。
     */
    public static final String I18N_Direction = BaseUtilities.getI18nMessage("Direction");

    /**
     * 国际化信息------NA。
     */
    public static final String I18N_DirectionNa = BaseUtilities.getI18nMessage("DirectionNa");

    /**
     * 国际化信息------双向端口。
     */
    public static final String I18N_DirectionBidirectional = BaseUtilities.getI18nMessage("DirectionBidirectional");

    /**
     * 国际化信息------源端口。
     */
    public static final String I18N_DirectionSource = BaseUtilities.getI18nMessage("DirectionSource");

    /**
     * 国际化信息------宿端口。
     */
    public static final String I18N_DirectionSink = BaseUtilities.getI18nMessage("DirectionSink");

    /**
     * 国际化信息------激活状态。
     */
    public static final String I18N_ActiveState = BaseUtilities.getI18nMessage("ActiveState");

    /**
     * 国际化信息------服务状态。
     */
    public static final String I18N_ServiceState = BaseUtilities.getI18nMessage("ServiceState");

    /**
     * 国际化信息------固定状态。
     */
    public static final String I18N_FixState = BaseUtilities.getI18nMessage("FixState");

    /**
     * 国际化信息------端点。
     */
    public static final String I18N_AOrZEnd = BaseUtilities.getI18nMessage("AOrZEnd");

    /**
     * 国际化信息------端点间关系。
     */
    public static final String I18N_EndRelation = BaseUtilities.getI18nMessage("EndRelation");

    /**
     * 国际化信息------与。
     */
    public static final String I18N_And = BaseUtilities.getI18nMessage("And");

    /**
     * 国际化信息------或。
     */
    public static final String I18N_Or = BaseUtilities.getI18nMessage("Or");

    /**
     * 国际化信息------建立类型。
     */
    public static final String I18N_HoldType = BaseUtilities.getI18nMessage("HoldType");

    /**
     * 国际化信息------一致性状态。
     */
    public static final String I18N_ConsistentState = BaseUtilities.getI18nMessage("ConsistentState");

    /**
     * 国际化信息------EVC类型。
     */
    public static final String I18N_EvcType = BaseUtilities.getI18nMessage("EvcType");

    /**
     * 国际化信息------服务质量。
     */
    public static final String I18N_Qos = BaseUtilities.getI18nMessage("Qos");

    /**
     * 国际化信息------自定义1。
     */
    public static final String I18N_SelfDefine1 = BaseUtilities.getI18nMessage("SelfDefine1");

    /**
     * 国际化信息------自定义2。
     */
    public static final String I18N_SelfDefine2 = BaseUtilities.getI18nMessage("SelfDefine2");

    /**
     * 国际化信息------自定义3。
     */
    public static final String I18N_SelfDefine3 = BaseUtilities.getI18nMessage("SelfDefine3");

    /**
     * 国际化信息------首页。
     */
    public static final String I18N_First = BaseUtilities.getI18nMessage("First");

    /**
     * 国际化信息------上一页。
     */
    public static final String I18N_Previous = BaseUtilities.getI18nMessage("Previous");

    /**
     * 国际化信息------下一页。
     */
    public static final String I18N_Next = BaseUtilities.getI18nMessage("Next");

    /**
     * 国际化信息------末页。
     */
    public static final String I18N_Last = BaseUtilities.getI18nMessage("Last");

    /**
     * 国际化信息------客户名称。
     */
    public static final String I18N_CustomerName = BaseUtilities.getI18nMessage("CustomerName");

    /**
     * 国际化信息------客户全称。
     */
    public static final String I18N_CustomerFullName = BaseUtilities.getI18nMessage("CustomerFullName");

    /**
     * 国际化信息------客户等级。
     */
    public static final String I18N_CustomerLevel = BaseUtilities.getI18nMessage("CustomerLevel");

    /**
     * 国际化信息------高等级。
     */
    public static final String I18N_HighLevel = BaseUtilities.getI18nMessage("HighLevel");

    /**
     * 国际化信息------中等级。
     */
    public static final String I18N_MiddleLevel = BaseUtilities.getI18nMessage("MiddleLevel");

    /**
     * 国际化信息------低等级。
     */
    public static final String I18N_LowLevel = BaseUtilities.getI18nMessage("LowLevel");

    /**
     * 国际化信息------信用等级。
     */
    public static final String I18N_CreditLevel = BaseUtilities.getI18nMessage("CreditLevel");

    /**
     * 国际化信息------联系人姓名。
     */
    public static final String I18N_ContactName = BaseUtilities.getI18nMessage("ContactName");

    /**
     * 国际化信息------联系人地址。
     */
    public static final String I18N_ContactAddress = BaseUtilities.getI18nMessage("ContactAddress");

    /**
     * 国际化信息------租用路径名称。
     */
    public static final String I18N_TrailUser = BaseUtilities.getI18nMessage("TrailUser");

    /**
     * 国际化信息------租用路径业务类型。
     */
    public static final String I18N_TrafficType = BaseUtilities.getI18nMessage("TrafficType");

    /**
     * 国际化信息------路径租用时间。
     */
    public static final String I18N_RentTime = BaseUtilities.getI18nMessage("RentTime");

    /**
     * 国际化信息------创建开始时间大于结束时间。
     */
    public static final String I18N_CreateFromTimeAfterToTime = BaseUtilities.getI18nMessage("CreateFromTimeAfterToTime");

    /**
     * 国际化信息------路径租用开始时间大于结束时间。
     */
    public static final String I18N_RentFromTimeAfterToTime = BaseUtilities.getI18nMessage("RentFromTimeAfterToTime");

    /**
     * 国际化信息------从。
     */
    public static final String I18N_From = BaseUtilities.getI18nMessage("From");

    /**
     * 国际化信息------到。
     */
    public static final String I18N_To = BaseUtilities.getI18nMessage("To");

    /**
     * 国际化信息------数据。
     */
    public static final String I18N_Data = BaseUtilities.getI18nMessage("Data");

    /**
     * 国际化信息------语音。
     */
    public static final String I18N_Voice = BaseUtilities.getI18nMessage("Voice");

    /**
     * 国际化信息------视频。
     */
    public static final String I18N_Video = BaseUtilities.getI18nMessage("Video");

    /**
     * 国际化信息------移动。
     */
    public static final String I18N_Mobile = BaseUtilities.getI18nMessage("Mobile");

    /**
     * 国际化信息------Internet。
     */
    public static final String I18N_Internet = BaseUtilities.getI18nMessage("Internet");

    /**
     * 国际化信息------描述信息。
     */
    public static final String I18N_Description = BaseUtilities.getI18nMessage("Description");

    /**
     * 国际化信息------属性。
     */
    public static final String I18N_Attribute = BaseUtilities.getI18nMessage("Attribute");

    /**
     * 国际化信息------A端点。
     */
    public static final String I18N_ANode = BaseUtilities.getI18nMessage("ANode");

    /**
     * 国际化信息------Z端点。
     */
    public static final String I18N_ZNode = BaseUtilities.getI18nMessage("ZNode");

    /**
     * 国际化信息------虚拟网元。
     */
    public static final String I18N_VirtualNe = BaseUtilities.getI18nMessage("VirtualNe");

    /**
     * 国际化信息------单板。
     */
    public static final String I18N_Board = BaseUtilities.getI18nMessage("Board");

    /**
     * 国际化信息------单板类型。
     */
    public static final String I18N_BoardType = BaseUtilities.getI18nMessage("BoardType");

    /**
     * 国际化信息------端口数。
     */
    public static final String I18N_PortNumber = BaseUtilities.getI18nMessage("PortNumber");

    /**
     * 国际化信息------终端点。
     */
    public static final String I18N_Tp = BaseUtilities.getI18nMessage("Tp");

    /**
     * 国际化信息------物理终端点。
     */
    public static final String I18N_Ptp = BaseUtilities.getI18nMessage("Ptp");

    /**
     * 国际化信息------浮动终端点。
     */
    public static final String I18N_Ftp = BaseUtilities.getI18nMessage("Ftp");

    /**
     * 国际化信息------流点。
     */
    public static final String I18N_Fp = BaseUtilities.getI18nMessage("Fp");

    /**
     * 国际化信息------逻辑终端点。
     */
    public static final String I18N_Ctp = BaseUtilities.getI18nMessage("Ctp");

    /**
     * 国际化信息------高阶VC。
     */
    public static final String I18N_HighVc = BaseUtilities.getI18nMessage("HighVc");

    /**
     * 国际化信息------低阶VC。
     */
    public static final String I18N_LowVc = BaseUtilities.getI18nMessage("LowVc");

    /**
     * 国际化信息------未知。
     */
    public static final String I18N_Unknown = BaseUtilities.getI18nMessage("Unknown");

    /**
     * 国际化信息------速率。
     */
    public static final String I18N_Rate = BaseUtilities.getI18nMessage("Rate");

    /**
     * 国际化信息------速率等级。
     */
    public static final String I18N_RateLevel = BaseUtilities.getI18nMessage("RateLevel");

    /**
     * 国际化信息------创建时间。
     */
    public static final String I18N_CreateTime = BaseUtilities.getI18nMessage("CreateTime");

    /**
     * 国际化信息------资源。
     */
    public static final String I18N_Resource = BaseUtilities.getI18nMessage("Resource");

    /**
     * 国际化信息------资源树。
     */
    public static final String I18N_ResourceTree = BaseUtilities.getI18nMessage("ResourceTree");

    /**
     * 国际化信息------资源选择器。
     */
    public static final String I18N_ResourceSelector = BaseUtilities.getI18nMessage("ResourceSelector");

    /**
     * 国际化信息------资源ID。
     */
    public static final String I18N_ResourceId = BaseUtilities.getI18nMessage("ResourceId");

    /**
     * 国际化信息------资源总数。
     */
    public static final String I18N_ResourceCount = BaseUtilities.getI18nMessage("ResourceCount");

    /**
     * 国际化信息------已选择的资源总数。
     */
    public static final String I18N_SelectedResourceCount = BaseUtilities.getI18nMessage("SelectedResourceCount");

    /**
     * 国际化信息------过滤器。
     */
    public static final String I18N_Filter = BaseUtilities.getI18nMessage("Filter");

    /**
     * 国际化信息------过滤。
     */
    public static final String I18N_Filtrate = BaseUtilities.getI18nMessage("Filtrate");

    /**
     * 国际化信息------选择结果。
     */
    public static final String I18N_SelectedResult = BaseUtilities.getI18nMessage("SelectedResult");

    /**
     * 国际化信息------查找。
     */
    public static final String I18N_Find = BaseUtilities.getI18nMessage("Find");

    /**
     * 国际化信息------搜索。
     */
    public static final String I18N_Search = BaseUtilities.getI18nMessage("Search");

    /**
     * 国际化信息------信息。
     */
    public static final String I18N_Info = BaseUtilities.getI18nMessage("Info");

    /**
     * 国际化信息------服务器正在处理中，请等待……。
     */
    public static final String I18N_ServerProcessingPleaseWait = BaseUtilities.getI18nMessage("ServerProcessingPleaseWait");

    /**
     * 国际化信息------服务器数据已经变更，请刷新！。
     */
    public static final String I18N_ServerDataChangedPleaseRefresh = BaseUtilities.getI18nMessage("ServerDataChangedPleaseRefresh");

    /**
     * 国际化信息------搜索的文本不允许为空。
     */
    public static final String I18N_SearchTextIsNull = BaseUtilities.getI18nMessage("SearchTextIsNull");

    /**
     * 国际化信息------没有被找到。
     */
    public static final String I18N_IsNotFound = BaseUtilities.getI18nMessage("IsNotFound");

    /**
     * 国际化信息------选择资源个数必须大于或等于。
     */
    public static final String I18N_CountMustMoreThanOrEqual = BaseUtilities.getI18nMessage("CountMustMoreThanOrEqual");

    /**
     * 国际化信息------选择资源个数必须小于或等于。
     */
    public static final String I18N_CountMustLessThanOrEqual = BaseUtilities.getI18nMessage("CountMustLessThanOrEqual");

    /**
     * 国际化信息------无。
     */
    public static final String I18N_INFO_NONE = BaseUtilities.getI18nMessage("none");

    /**
     * 国际化信息------全部。
     */
    public static final String I18N_INFO_ALL = BaseUtilities.getI18nMessage("all");

    /**
     * 国际化信息------成功。
     */
    public static final String I18N_INFO_SUCCESS = BaseUtilities.getI18nMessage("success");

    /**
     * 国际化信息------失败。
     */
    public static final String I18N_INFO_FAIL = BaseUtilities.getI18nMessage("fail");

    /**
     * 国际化信息------失败原因。
     */
    public static final String I18N_INFO_FAILREASON = BaseUtilities.getI18nMessage("failReason");

    /**
     * 国际化信息------开始。
     */
    public static final String I18N_INFO_START = BaseUtilities.getI18nMessage("start");

    /**
     * 国际化信息------开始时间。
     */
    public static final String I18N_INFO_STARTTIME = BaseUtilities.getI18nMessage("startTime");

    /**
     * 国际化信息------结束。
     */
    public static final String I18N_INFO_END = BaseUtilities.getI18nMessage("end");

    /**
     * 国际化信息------结束时间。
     */
    public static final String I18N_INFO_ENDTIME = BaseUtilities.getI18nMessage("endTime");

    /**
     * 国际化信息------中断。
     */
    public static final String I18N_INFO_INTERRUPT = BaseUtilities.getI18nMessage("interrupt");

    /**
     * 国际化信息------错误。
     */
    public static final String I18N_INFO_ERROR = BaseUtilities.getI18nMessage("error");

    /**
     * 国际化信息------空。
     */
    public static final String I18N_INFO_EMPTY = BaseUtilities.getI18nMessage("empty");

    /**
     * 国际化信息------(空)。
     */
    public static final String I18N_INFO_EMPTYITEM = "(" + I18N_INFO_EMPTY + ")";

    /**
     * 国际化信息------是不存在的。
     */
    public static final String I18N_INFO_ISINEXISTENT = BaseUtilities.getI18nMessage("isInexistent");

    /**
     * 国际化信息------是。
     */
    public static final String I18N_INFO_YES = BaseUtilities.getI18nMessage("yes");

    /**
     * 国际化信息------否。
     */
    public static final String I18N_INFO_NO = BaseUtilities.getI18nMessage("no");

    /**
     * 国际化信息------输入。
     */
    public static final String I18N_INFO_INPUT = BaseUtilities.getI18nMessage("input");

    /**
     * 国际化信息------输出。
     */
    public static final String I18N_INFO_OUTPUT = BaseUtilities.getI18nMessage("output");

    /**
     * 国际化信息------导入。
     */
    public static final String I18N_INFO_IMPORT = BaseUtilities.getI18nMessage("import");

    /**
     * 国际化信息------导出。
     */
    public static final String I18N_INFO_EXPORT = BaseUtilities.getI18nMessage("export");

    /**
     * 国际化信息------结果。
     */
    public static final String I18N_INFO_RESULT = BaseUtilities.getI18nMessage("result");

    /**
     * 国际化信息------确定。
     */
    public static final String I18N_INFO_OK = BaseUtilities.getI18nMessage("ok");

    /**
     * 国际化信息------应用。
     */
    public static final String I18N_INFO_APPLY = BaseUtilities.getI18nMessage("apply");

    /**
     * 国际化信息------设置。
     */
    public static final String I18N_INFO_SET = BaseUtilities.getI18nMessage("set");

    /**
     * 国际化信息------取消。
     */
    public static final String I18N_INFO_CANCEL = BaseUtilities.getI18nMessage("cancel");

    /**
     * 国际化信息------打开。
     */
    public static final String I18N_INFO_OPEN = BaseUtilities.getI18nMessage("open");

    /**
     * 国际化信息------关闭。
     */
    public static final String I18N_INFO_CLOSE = BaseUtilities.getI18nMessage("close");

    /**
     * 国际化信息------保存。
     */
    public static final String I18N_INFO_SAVE = BaseUtilities.getI18nMessage("save");

    /**
     * 国际化信息------另存为。
     */
    public static final String I18N_INFO_SAVEAS = BaseUtilities.getI18nMessage("saveAs");

    /**
     * 国际化信息------载入。
     */
    public static final String I18N_INFO_LOAD = BaseUtilities.getI18nMessage("load");

    /**
     * 国际化信息------恢复。
     */
    public static final String I18N_INFO_RESTORE = BaseUtilities.getI18nMessage("restore");

    /**
     * 国际化信息------恢复缺省值。
     */
    public static final String I18N_INFO_RESTOREDEFAULTS = BaseUtilities.getI18nMessage("restoreDefaults");

    /**
     * 国际化信息------添加。
     */
    public static final String I18N_INFO_ADD = BaseUtilities.getI18nMessage("add");

    /**
     * 国际化信息------添加到。
     */
    public static final String I18N_INFO_ADDTO = BaseUtilities.getI18nMessage("addTo");

    /**
     * 国际化信息------已插入。
     */
    public static final String I18N_INFO_INSERTED = BaseUtilities.getI18nMessage("inserted");

    /**
     * 国际化信息------移除。
     */
    public static final String I18N_INFO_REMOVE = BaseUtilities.getI18nMessage("remove");

    /**
     * 国际化信息------已移除。
     */
    public static final String I18N_INFO_REMOVED = BaseUtilities.getI18nMessage("removed");

    /**
     * 国际化信息------删除。
     */
    public static final String I18N_INFO_DELETE = BaseUtilities.getI18nMessage("delete");

    /**
     * 国际化信息------你确定删除吗。
     */
    public static final String I18N_INFO_AREYOUSUREDELETE = BaseUtilities.getI18nMessage("areYouSureDelete");

    /**
     * 国际化信息------修改。
     */
    public static final String I18N_INFO_MODIFY = BaseUtilities.getI18nMessage("modify");

    /**
     * 国际化信息------已改变。
     */
    public static final String I18N_INFO_CHANGED = BaseUtilities.getI18nMessage("changed");

    /**
     * 国际化信息------未改变。
     */
    public static final String I18N_INFO_UNCHANGED = BaseUtilities.getI18nMessage("unchanged");

    /**
     * 国际化信息------重命名。
     */
    public static final String I18N_INFO_RENAME = BaseUtilities.getI18nMessage("rename");

    /**
     * 国际化信息------查询。
     */
    public static final String I18N_INFO_QUERY = BaseUtilities.getI18nMessage("query");

    /**
     * 国际化信息------查询条件。
     */
    public static final String I18N_INFO_QUERYCONDITION = BaseUtilities.getI18nMessage("queryCondition");

    /**
     * 国际化信息------查询结果。
     */
    public static final String I18N_INFO_QUERYRESULT = BaseUtilities.getI18nMessage("queryResult");

    /**
     * 国际化信息------行。
     */
    public static final String I18N_INFO_ROW = BaseUtilities.getI18nMessage("row");

    /**
     * 国际化信息------列。
     */
    public static final String I18N_INFO_COLUMN = BaseUtilities.getI18nMessage("column");

    /**
     * 国际化信息------更新。
     */
    public static final String I18N_INFO_UPDATE = BaseUtilities.getI18nMessage("update");

    /**
     * 国际化信息------刷新。
     */
    public static final String I18N_INFO_REFRESH = BaseUtilities.getI18nMessage("refresh");

    /**
     * 国际化信息------上移。
     */
    public static final String I18N_INFO_MOVETOUP = BaseUtilities.getI18nMessage("moveToUp");

    /**
     * 国际化信息------上移全部。
     */
    public static final String I18N_INFO_MOVEALLTOUP = BaseUtilities.getI18nMessage("moveAllToUp");

    /**
     * 国际化信息------下移。
     */
    public static final String I18N_INFO_MOVETODOWN = BaseUtilities.getI18nMessage("moveToDown");

    /**
     * 国际化信息------下移全部。
     */
    public static final String I18N_INFO_MOVEALLTODOWN = BaseUtilities.getI18nMessage("moveAllToDown");

    /**
     * 国际化信息------左移。
     */
    public static final String I18N_INFO_MOVETOLEFT = BaseUtilities.getI18nMessage("moveToLeft");

    /**
     * 国际化信息------左移全部。
     */
    public static final String I18N_INFO_MOVEALLTOLEFT = BaseUtilities.getI18nMessage("moveAllToLeft");

    /**
     * 国际化信息------右移。
     */
    public static final String I18N_INFO_MOVETORIGHT = BaseUtilities.getI18nMessage("moveToRight");

    /**
     * 国际化信息------右移全部。
     */
    public static final String I18N_INFO_MOVEALLTORIGHT = BaseUtilities.getI18nMessage("moveAllToRight");

    /**
     * 国际化信息------IP地址。
     */
    public static final String I18N_INFO_IP = BaseUtilities.getI18nMessage("ip");

    /**
     * 国际化信息------端口号。
     */
    public static final String I18N_INFO_PORT = BaseUtilities.getI18nMessage("port");

    /**
     * 国际化信息------用户名。
     */
    public static final String I18N_INFO_USERNAME = BaseUtilities.getI18nMessage("username");

    /**
     * 国际化信息------密码。
     */
    public static final String I18N_INFO_PASSWORD = BaseUtilities.getI18nMessage("password");

    /**
     * 国际化信息------文件。
     */
    public static final String I18N_INFO_FILE = BaseUtilities.getI18nMessage("file");

    /**
     * 国际化信息------目录。
     */
    public static final String I18N_INFO_DIRECTORY = BaseUtilities.getI18nMessage("directory");

    /**
     * 国际化信息------文件夹。
     */
    public static final String I18N_INFO_FOLDER = BaseUtilities.getI18nMessage("folder");

    /**
     * 国际化信息------新建文件夹。
     */
    public static final String I18N_INFO_NEWFOLDER = BaseUtilities.getI18nMessage("newFolder");

    /**
     * 国际化信息------移至文件夹。
     */
    public static final String I18N_INFO_MOVETOFOLDER = BaseUtilities.getI18nMessage("moveToFolder");

    /**
     * 国际化信息------选择。
     */
    public static final String I18N_INFO_SELECT = BaseUtilities.getI18nMessage("select");

    /**
     * 国际化信息------排序。
     */
    public static final String I18N_INFO_SORT = BaseUtilities.getI18nMessage("sort");

    /**
     * 国际化信息------升序。
     */
    public static final String I18N_INFO_ASCENDING = BaseUtilities.getI18nMessage("ascending");

    /**
     * 国际化信息------降序。
     */
    public static final String I18N_INFO_DESCENDING = BaseUtilities.getI18nMessage("descending");

    /**
     * 国际化信息------索引。
     */
    public static final String I18N_INFO_INDEX = BaseUtilities.getI18nMessage("index");

    /**
     * 国际化信息------名称。
     */
    public static final String I18N_INFO_NAME = BaseUtilities.getI18nMessage("name");

    /**
     * 国际化信息------格式。
     */
    public static final String I18N_INFO_FORMAT = BaseUtilities.getI18nMessage("format");

    /**
     * 国际化信息------预览。
     */
    public static final String I18N_INFO_PREVIEW = BaseUtilities.getI18nMessage("preview");

    /**
     * 国际化信息------播放。
     */
    public static final String I18N_INFO_PLAY = BaseUtilities.getI18nMessage("play");

    /**
     * 国际化信息------停止。
     */
    public static final String I18N_INFO_STOP = BaseUtilities.getI18nMessage("stop");

    /**
     * 国际化信息------详细。
     */
    public static final String I18N_INFO_DETAIL = BaseUtilities.getI18nMessage("detail");

    /**
     * 图标------查找。
     */
    public static final Icon ICON_Find = BaseUtilities.getIcon("find.gif");

    /**
     * 图标------打开。
     */
    public static final Icon ICON_Open = BaseUtilities.getIcon("open.gif");

    /**
     * 图标------关闭。
     */
    public static final Icon ICON_Close = BaseUtilities.getIcon("close.gif");

    /**
     * 图标------关闭（按下）。
     */
    public static final Icon ICON_ClosePressed = BaseUtilities.getIcon("close-pressed.gif");

    /**
     * 图标------关闭（经过）。
     */
    public static final Icon ICON_CloseRollover = BaseUtilities.getIcon("close-rollover.gif");

    /**
     * 图标------关闭（非使能）。
     */
    public static final Icon ICON_CloseDisabled = BaseUtilities.getIcon("close-disabled.gif");

    /**
     * 图标------首页。
     */
    public static final Icon ICON_First = BaseUtilities.getIcon("first.gif");

    /**
     * 图标------首页（按下）。
     */
    public static final Icon ICON_FirstPressed = BaseUtilities.getIcon("first-pressed.gif");

    /**
     * 图标------首页（经过）。
     */
    public static final Icon ICON_FirstRollover = BaseUtilities.getIcon("first-rollover.gif");

    /**
     * 图标------首页（非使能）。
     */
    public static final Icon ICON_FirstDisabled = BaseUtilities.getIcon("first-disabled.gif");

    /**
     * 图标------上一页。
     */
    public static final Icon ICON_Previous = BaseUtilities.getIcon("previous.gif");

    /**
     * 图标------上一页（按下）。
     */
    public static final Icon ICON_PreviousPressed = BaseUtilities.getIcon("previous-pressed.gif");

    /**
     * 图标------上一页（经过）。
     */
    public static final Icon ICON_PreviousRollover = BaseUtilities.getIcon("previous-rollover.gif");

    /**
     * 图标------上一页（非使能）。
     */
    public static final Icon ICON_PreviousDisabled = BaseUtilities.getIcon("previous-disabled.gif");

    /**
     * 图标------下一页。
     */
    public static final Icon ICON_Next = BaseUtilities.getIcon("next.gif");

    /**
     * 图标------下一页（按下）。
     */
    public static final Icon ICON_NextPressed = BaseUtilities.getIcon("next-pressed.gif");

    /**
     * 图标------下一页（经过）。
     */
    public static final Icon ICON_NextRollover = BaseUtilities.getIcon("next-rollover.gif");

    /**
     * 图标------下一页（非使能）。
     */
    public static final Icon ICON_NextDisabled = BaseUtilities.getIcon("next-disabled.gif");

    /**
     * 图标------末页。
     */
    public static final Icon ICON_Last = BaseUtilities.getIcon("last.gif");

    /**
     * 图标------末页（按下）。
     */
    public static final Icon ICON_LastPressed = BaseUtilities.getIcon("last-pressed.gif");

    /**
     * 图标------末页（经过）。
     */
    public static final Icon ICON_LastRollover = BaseUtilities.getIcon("last-rollover.gif");

    /**
     * 图标------末页（非使能）。
     */
    public static final Icon ICON_LastDisabled = BaseUtilities.getIcon("last-disabled.gif");

    /**
     * 图标------刷新。
     */
    public static final Icon ICON_REFRESH = BaseUtilities.getIcon("refresh.gif");

    /**
     * 图标------等待。
     */
    public static final Icon ICON_WAITING = BaseUtilities.getIcon("waiting.gif");

    /**
     * 图标------删除。
     */
    public static final Icon ICON_DELETE = BaseUtilities.getIcon("delete.gif");

    /**
     * 图标------信息。
     */
    public static final Icon ICON_INFO = BaseUtilities.getIcon("info.gif");

    /**
     * 图标------警告。
     */
    public static final Icon ICON_WARNING = BaseUtilities.getIcon("warning.gif");

    /**
     * 图标------错误。
     */
    public static final Icon ICON_ERROR = BaseUtilities.getIcon("error.gif");

    /**
     * 图标------成功。
     */
    public static final Icon ICON_SUCCESSFUL = BaseUtilities.getIcon("successful.gif");

    /**
     * 图标------失败。
     */
    public static final Icon ICON_FAILED = BaseUtilities.getIcon("failed.gif");

    /**
     * 图标------新建文件夹。
     */
    public static final Icon ICON_NEWFOLDER = BaseUtilities.getIcon("new-folder.gif");

    /**
     * 图标------导入。
     */
    public static final Icon ICON_IMPORT = BaseUtilities.getIcon("import.gif");

    /**
     * 图标------导出。
     */
    public static final Icon ICON_EXPORT = BaseUtilities.getIcon("export.gif");

    /**
     * 图标------向上。
     */
    public static final Icon ICON_UP = BaseUtilities.getIcon("up.gif");

    /**
     * 图标------向下。
     */
    public static final Icon ICON_DOWN = BaseUtilities.getIcon("down.gif");

    /**
     * 图标------上移。
     */
    public static final Icon ICON_MOVETOUP = BaseUtilities.getIcon("move-to-up.gif");

    /**
     * 图标------上移全部。
     */
    public static final Icon ICON_MOVEALLTOUP = BaseUtilities.getIcon("move-all-to-up.gif");

    /**
     * 图标------下移。
     */
    public static final Icon ICON_MOVETODOWN = BaseUtilities.getIcon("move-to-down.gif");

    /**
     * 图标------下移全部。
     */
    public static final Icon ICON_MOVEALLTODOWN = BaseUtilities.getIcon("move-all-to-down.gif");

    /**
     * 图标------左移。
     */
    public static final Icon ICON_MOVETOLEFT = BaseUtilities.getIcon("move-to-left.gif");

    /**
     * 图标------左移全部。
     */
    public static final Icon ICON_MOVEALLTOLEFT = BaseUtilities.getIcon("move-all-to-left.gif");

    /**
     * 图标------右移。
     */
    public static final Icon ICON_MOVETORIGHT = BaseUtilities.getIcon("move-to-right.gif");

    /**
     * 图标------右移全部。
     */
    public static final Icon ICON_MOVEALLTORIGHT = BaseUtilities.getIcon("move-all-to-right.gif");

    /**
     * 组件监听器------尺寸限制器，用于Frame或Dialog等重量级组件，注意：用于普通的轻量级组件意义不大，而且有可能会带来一定问题。
     * @deprecated 此监听器共享于所有对话框组件是有问题的，请替换为BaseUtilities.createSizeLimiter()创建独立的尺寸限制器。
     * @see BaseUtilities#createSizeLimiter()
     */
    public static final ComponentListener CL_SIZELIMITER = new ComponentAdapter() {

        /**
         * 旧的边界。
         */
        protected Rectangle m_oldBounds;

        /**
         * @see java.awt.event.ComponentAdapter#componentShown(java.awt.event.ComponentEvent)
         */
        public void componentShown(ComponentEvent evt) {
            m_oldBounds = evt.getComponent().getBounds();
        }

        /**
         * @see java.awt.event.ComponentAdapter#componentHidden(java.awt.event.ComponentEvent)
         */
        public void componentHidden(ComponentEvent evt) {
            m_oldBounds = evt.getComponent().getBounds();
        }

        /**
         * @see java.awt.event.ComponentAdapter#componentMoved(java.awt.event.ComponentEvent)
         */
        public void componentMoved(ComponentEvent evt) {
            Rectangle bounds = evt.getComponent().getBounds();

            if (bounds.getSize().equals(m_oldBounds.getSize())) {
                m_oldBounds = bounds;
            }
        }

        /**
         * @see java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent)
         */
        public void componentResized(ComponentEvent evt) {
            /* 获取目标组件 */
            Component component = evt.getComponent();

            /* 获取目标组件设置的边界和最小最大尺寸 */
            Rectangle bounds = component.getBounds();
            Dimension minSize = component.getMinimumSize();
            Dimension maxSize = component.getMaximumSize();

            /* 确定目标组件新的x轴坐标及宽度 */
            if (bounds.width < minSize.width) {
                bounds.x -= (bounds.x == m_oldBounds.x ? 0 : minSize.width - bounds.width);
                bounds.width = minSize.width;

            } else if (bounds.width > maxSize.width) {
                bounds.x += (bounds.x == m_oldBounds.x ? 0 : bounds.width - maxSize.width);
                bounds.width = maxSize.width;
            }

            /* 确定目标组件新的y轴坐标及高度 */
            if (bounds.height < minSize.height) {
                bounds.y -= (bounds.y == m_oldBounds.y ? 0 : minSize.height - bounds.height);
                bounds.height = minSize.height;

            } else if (bounds.height > maxSize.height) {
                bounds.y += (bounds.y == m_oldBounds.y ? 0 : bounds.height - maxSize.height);
                bounds.height = maxSize.height;
            }

            /* 设置目标组件的新边界 */
            component.setBounds(bounds);

            /* 保存新的边界 */
            m_oldBounds = bounds;
        }

    };

    /*------------------------------------- Public Abstract Method -------------------------------------*/

    /* Add Public Abstract Method */

}
