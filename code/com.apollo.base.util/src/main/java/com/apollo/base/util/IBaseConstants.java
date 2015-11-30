/*
 * �˴��봴���� 2008-1-29 ����10:00:03��
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
 * <p>�ļ����ƣ�IBaseConstants.java</p>
 * <p>�������������������ӿڡ�</p>
 * <p>��Ȩ���У���Ȩ����(C)2001-2004��</p>
 * <p>������˾�������档</p>
 * <p>����ժҪ��</p>
 * <p>����˵����</p>
 * <p>������ڣ�2008-1-29</p>
 * <p>�޸ļ�¼��</p>
 * <pre>
 *    �޸����ڣ�
 *    �� �� �ţ�
 *    �� �� �ˣ�
 *    �޸����ݣ�
 * </pre>
 * @version 1.0
 * @author ����
 */
public interface IBaseConstants {

    /*------------------------------------- Public Static Final Field -------------------------------------*/

    /**
     * ֵ------�������ܡ�
     */
    public static final String VALUE_LOCALEMS = "EMS{local}";

    /**
     * �и�------���ȱʡ���иߡ�
     */
    public static final int RowHeight_Table_Default = 23;

    /**
     * ��ɫ------��ֹ�༭�ı���ɫ��
     */
    public static final Color Color_Bg_Editable_False = new Color(241, 240, 227);

    /**
     * ��ɫ------�����еı���ɫ��
     */
    public static final Color Color_Bg_Row_Odd = new Color(247, 243, 231);//new Color(178, 216, 255);

    /**
     * ��ɫ------ż���еı���ɫ��
     */
    public static final Color Color_Bg_Row_Even = Color.WHITE;

    /**
     * ��ʽ------���ڡ�
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
     * ȱʡ��GridBagConstraints.insets�ֶ�ֵ��
     */
    public static final Insets INSETS_DEFAULT = new Insets(2, 2, 2, 2);

    /**
     * �޿ռ��GridBagConstraints.insets�ֶ�ֵ��
     */
    public static final Insets INSETS_NoSpace = new Insets(0, 0, 0, 0);

    /**
     * ����ͼ��GridBagConstraints.insets�ֶ�ֵ��
     */
    public static final Insets INSETS_SUBVIEW = new Insets(1, 18, 1, 2);

    /**
     * ������GridBagConstraints.insets�ֶ�ֵ��
     */
    public static final Insets INSETS_LEFT = new Insets(0, 2, 0, 0);

    /**
     * ������GridBagConstraints.insets�ֶ�ֵ��
     */
    public static final Insets INSETS_RIGHT = new Insets(0, 0, 0, 2);

    /**
     * ��������GridBagConstraints.insets�ֶ�ֵ��
     */
    public static final Insets INSETS_RIGHTANDLEFT = new Insets(0, 2, 0, 2);

    /**
     * ȱʡ��GridBagConstraints.ipadx�ֶ�ֵ��
     */
    public static final int IPADX_DEFAULT = 2;

    /**
     * �޿ռ��GridBagConstraints.ipadx�ֶ�ֵ��
     */
    public static final int IPADX_NoSpace = 0;

    /**
     * ȱʡ��GridBagConstraints.ipady�ֶ�ֵ��
     */
    public static final int IPADY_DEFAULT = 2;

    /**
     * �޿ռ��GridBagConstraints.ipady�ֶ�ֵ��
     */
    public static final int IPADY_NoSpace = 0;

    /**
     * ���ʻ���Ϣ------�롣
     */
    public static final String I18N_Second = BaseUtilities.getI18nMessage("Second");

    /**
     * ���ʻ���Ϣ------������
     */
    public static final String I18N_Operation = BaseUtilities.getI18nMessage("Operation");

    /**
     * ���ʻ���Ϣ------��ӡ��
     */
    public static final String I18N_Print = BaseUtilities.getI18nMessage("Print");

    /**
     * ���ʻ���Ϣ------��¼������
     */
    public static final String I18N_TotalCount = BaseUtilities.getI18nMessage("TotalCount");

    /**
     * ���ʻ���Ϣ------��ʱ��
     */
    public static final String I18N_ElapsedTime = BaseUtilities.getI18nMessage("ElapsedTime");

    /**
     * ���ʻ���Ϣ------��������������
     */
    public static final String I18N_BaseCondition = BaseUtilities.getI18nMessage("BaseCondition");

    /**
     * ���ʻ���Ϣ------�û���ǩ��
     */
    public static final String I18N_UserLabel = BaseUtilities.getI18nMessage("UserLabel");

    /**
     * ���ʻ���Ϣ------����λ�á�
     */
    public static final String I18N_Location = BaseUtilities.getI18nMessage("Location");

    /**
     * ���ʻ���Ϣ------����EMS��
     */
    public static final String I18N_ParentEms = BaseUtilities.getI18nMessage("ParentEms");

    /**
     * ���ʻ���Ϣ------�������̡�
     */
    public static final String I18N_Vendor = BaseUtilities.getI18nMessage("Vendor");

    /**
     * ���ʻ���Ϣ------�豸���͡�
     */
    public static final String I18N_DeviceType = BaseUtilities.getI18nMessage("DeviceType");

    /**
     * ���ʻ���Ϣ------��Ԫ���͡�
     */
    public static final String I18N_NeType = BaseUtilities.getI18nMessage("NeType");

    /**
     * ���ʻ���Ϣ------ѡ�����͡�
     */
    public static final String I18N_ChoiceType = BaseUtilities.getI18nMessage("ChoiceType");

    /**
     * ���ʻ���Ϣ------ģ�����͡�
     */
    public static final String I18N_ModelType = BaseUtilities.getI18nMessage("ModelType");

    /**
     * ���ʻ���Ϣ------��Ʒ���ơ�
     */
    public static final String I18N_ProductName = BaseUtilities.getI18nMessage("ProductName");

    /**
     * ���ʻ���Ϣ------�������ܡ�
     */
    public static final String I18N_LocalEms = BaseUtilities.getI18nMessage("LocalEms");

    /**
     * ���ʻ���Ϣ------��Ԫ��
     */
    public static final String I18N_Ne = BaseUtilities.getI18nMessage("Ne");

    /**
     * ���ʻ���Ϣ------EMS��
     */
    public static final String I18N_Ems = BaseUtilities.getI18nMessage("Ems");

    /**
     * ���ʻ���Ϣ------�������ӡ�
     */
    public static final String I18N_Link = BaseUtilities.getI18nMessage("Link");

    /**
     * ���ʻ���Ϣ------�ͻ���
     */
    public static final String I18N_Customer = BaseUtilities.getI18nMessage("Customer");

    /**
     * ���ʻ���Ϣ------ҵ��
     */
    public static final String I18N_Service = BaseUtilities.getI18nMessage("Service");

    /**
     * ���ʻ���Ϣ------ҵ�����͡�
     */
    public static final String I18N_ServiceType = BaseUtilities.getI18nMessage("ServiceType");

    /**
     * ���ʻ���Ϣ------�������ӡ�
     */
    public static final String I18N_SNC = BaseUtilities.getI18nMessage("SNC");

    /**
     * ���ʻ���Ϣ------FDFr��
     */
    public static final String I18N_FDFr = BaseUtilities.getI18nMessage("FDFr");

    /**
     * ���ʻ���Ϣ------��С����Ƭ�Ρ�
     */
    public static final String I18N_MFDFr = BaseUtilities.getI18nMessage("MFDFr");

    /**
     * ���ʻ���Ϣ------����
     */
    public static final String I18N_Direction = BaseUtilities.getI18nMessage("Direction");

    /**
     * ���ʻ���Ϣ------NA��
     */
    public static final String I18N_DirectionNa = BaseUtilities.getI18nMessage("DirectionNa");

    /**
     * ���ʻ���Ϣ------˫��˿ڡ�
     */
    public static final String I18N_DirectionBidirectional = BaseUtilities.getI18nMessage("DirectionBidirectional");

    /**
     * ���ʻ���Ϣ------Դ�˿ڡ�
     */
    public static final String I18N_DirectionSource = BaseUtilities.getI18nMessage("DirectionSource");

    /**
     * ���ʻ���Ϣ------�޶˿ڡ�
     */
    public static final String I18N_DirectionSink = BaseUtilities.getI18nMessage("DirectionSink");

    /**
     * ���ʻ���Ϣ------����״̬��
     */
    public static final String I18N_ActiveState = BaseUtilities.getI18nMessage("ActiveState");

    /**
     * ���ʻ���Ϣ------����״̬��
     */
    public static final String I18N_ServiceState = BaseUtilities.getI18nMessage("ServiceState");

    /**
     * ���ʻ���Ϣ------�̶�״̬��
     */
    public static final String I18N_FixState = BaseUtilities.getI18nMessage("FixState");

    /**
     * ���ʻ���Ϣ------�˵㡣
     */
    public static final String I18N_AOrZEnd = BaseUtilities.getI18nMessage("AOrZEnd");

    /**
     * ���ʻ���Ϣ------�˵���ϵ��
     */
    public static final String I18N_EndRelation = BaseUtilities.getI18nMessage("EndRelation");

    /**
     * ���ʻ���Ϣ------�롣
     */
    public static final String I18N_And = BaseUtilities.getI18nMessage("And");

    /**
     * ���ʻ���Ϣ------��
     */
    public static final String I18N_Or = BaseUtilities.getI18nMessage("Or");

    /**
     * ���ʻ���Ϣ------�������͡�
     */
    public static final String I18N_HoldType = BaseUtilities.getI18nMessage("HoldType");

    /**
     * ���ʻ���Ϣ------һ����״̬��
     */
    public static final String I18N_ConsistentState = BaseUtilities.getI18nMessage("ConsistentState");

    /**
     * ���ʻ���Ϣ------EVC���͡�
     */
    public static final String I18N_EvcType = BaseUtilities.getI18nMessage("EvcType");

    /**
     * ���ʻ���Ϣ------����������
     */
    public static final String I18N_Qos = BaseUtilities.getI18nMessage("Qos");

    /**
     * ���ʻ���Ϣ------�Զ���1��
     */
    public static final String I18N_SelfDefine1 = BaseUtilities.getI18nMessage("SelfDefine1");

    /**
     * ���ʻ���Ϣ------�Զ���2��
     */
    public static final String I18N_SelfDefine2 = BaseUtilities.getI18nMessage("SelfDefine2");

    /**
     * ���ʻ���Ϣ------�Զ���3��
     */
    public static final String I18N_SelfDefine3 = BaseUtilities.getI18nMessage("SelfDefine3");

    /**
     * ���ʻ���Ϣ------��ҳ��
     */
    public static final String I18N_First = BaseUtilities.getI18nMessage("First");

    /**
     * ���ʻ���Ϣ------��һҳ��
     */
    public static final String I18N_Previous = BaseUtilities.getI18nMessage("Previous");

    /**
     * ���ʻ���Ϣ------��һҳ��
     */
    public static final String I18N_Next = BaseUtilities.getI18nMessage("Next");

    /**
     * ���ʻ���Ϣ------ĩҳ��
     */
    public static final String I18N_Last = BaseUtilities.getI18nMessage("Last");

    /**
     * ���ʻ���Ϣ------�ͻ����ơ�
     */
    public static final String I18N_CustomerName = BaseUtilities.getI18nMessage("CustomerName");

    /**
     * ���ʻ���Ϣ------�ͻ�ȫ�ơ�
     */
    public static final String I18N_CustomerFullName = BaseUtilities.getI18nMessage("CustomerFullName");

    /**
     * ���ʻ���Ϣ------�ͻ��ȼ���
     */
    public static final String I18N_CustomerLevel = BaseUtilities.getI18nMessage("CustomerLevel");

    /**
     * ���ʻ���Ϣ------�ߵȼ���
     */
    public static final String I18N_HighLevel = BaseUtilities.getI18nMessage("HighLevel");

    /**
     * ���ʻ���Ϣ------�еȼ���
     */
    public static final String I18N_MiddleLevel = BaseUtilities.getI18nMessage("MiddleLevel");

    /**
     * ���ʻ���Ϣ------�͵ȼ���
     */
    public static final String I18N_LowLevel = BaseUtilities.getI18nMessage("LowLevel");

    /**
     * ���ʻ���Ϣ------���õȼ���
     */
    public static final String I18N_CreditLevel = BaseUtilities.getI18nMessage("CreditLevel");

    /**
     * ���ʻ���Ϣ------��ϵ��������
     */
    public static final String I18N_ContactName = BaseUtilities.getI18nMessage("ContactName");

    /**
     * ���ʻ���Ϣ------��ϵ�˵�ַ��
     */
    public static final String I18N_ContactAddress = BaseUtilities.getI18nMessage("ContactAddress");

    /**
     * ���ʻ���Ϣ------����·�����ơ�
     */
    public static final String I18N_TrailUser = BaseUtilities.getI18nMessage("TrailUser");

    /**
     * ���ʻ���Ϣ------����·��ҵ�����͡�
     */
    public static final String I18N_TrafficType = BaseUtilities.getI18nMessage("TrafficType");

    /**
     * ���ʻ���Ϣ------·������ʱ�䡣
     */
    public static final String I18N_RentTime = BaseUtilities.getI18nMessage("RentTime");

    /**
     * ���ʻ���Ϣ------������ʼʱ����ڽ���ʱ�䡣
     */
    public static final String I18N_CreateFromTimeAfterToTime = BaseUtilities.getI18nMessage("CreateFromTimeAfterToTime");

    /**
     * ���ʻ���Ϣ------·�����ÿ�ʼʱ����ڽ���ʱ�䡣
     */
    public static final String I18N_RentFromTimeAfterToTime = BaseUtilities.getI18nMessage("RentFromTimeAfterToTime");

    /**
     * ���ʻ���Ϣ------�ӡ�
     */
    public static final String I18N_From = BaseUtilities.getI18nMessage("From");

    /**
     * ���ʻ���Ϣ------����
     */
    public static final String I18N_To = BaseUtilities.getI18nMessage("To");

    /**
     * ���ʻ���Ϣ------���ݡ�
     */
    public static final String I18N_Data = BaseUtilities.getI18nMessage("Data");

    /**
     * ���ʻ���Ϣ------������
     */
    public static final String I18N_Voice = BaseUtilities.getI18nMessage("Voice");

    /**
     * ���ʻ���Ϣ------��Ƶ��
     */
    public static final String I18N_Video = BaseUtilities.getI18nMessage("Video");

    /**
     * ���ʻ���Ϣ------�ƶ���
     */
    public static final String I18N_Mobile = BaseUtilities.getI18nMessage("Mobile");

    /**
     * ���ʻ���Ϣ------Internet��
     */
    public static final String I18N_Internet = BaseUtilities.getI18nMessage("Internet");

    /**
     * ���ʻ���Ϣ------������Ϣ��
     */
    public static final String I18N_Description = BaseUtilities.getI18nMessage("Description");

    /**
     * ���ʻ���Ϣ------���ԡ�
     */
    public static final String I18N_Attribute = BaseUtilities.getI18nMessage("Attribute");

    /**
     * ���ʻ���Ϣ------A�˵㡣
     */
    public static final String I18N_ANode = BaseUtilities.getI18nMessage("ANode");

    /**
     * ���ʻ���Ϣ------Z�˵㡣
     */
    public static final String I18N_ZNode = BaseUtilities.getI18nMessage("ZNode");

    /**
     * ���ʻ���Ϣ------������Ԫ��
     */
    public static final String I18N_VirtualNe = BaseUtilities.getI18nMessage("VirtualNe");

    /**
     * ���ʻ���Ϣ------���塣
     */
    public static final String I18N_Board = BaseUtilities.getI18nMessage("Board");

    /**
     * ���ʻ���Ϣ------�������͡�
     */
    public static final String I18N_BoardType = BaseUtilities.getI18nMessage("BoardType");

    /**
     * ���ʻ���Ϣ------�˿�����
     */
    public static final String I18N_PortNumber = BaseUtilities.getI18nMessage("PortNumber");

    /**
     * ���ʻ���Ϣ------�ն˵㡣
     */
    public static final String I18N_Tp = BaseUtilities.getI18nMessage("Tp");

    /**
     * ���ʻ���Ϣ------�����ն˵㡣
     */
    public static final String I18N_Ptp = BaseUtilities.getI18nMessage("Ptp");

    /**
     * ���ʻ���Ϣ------�����ն˵㡣
     */
    public static final String I18N_Ftp = BaseUtilities.getI18nMessage("Ftp");

    /**
     * ���ʻ���Ϣ------���㡣
     */
    public static final String I18N_Fp = BaseUtilities.getI18nMessage("Fp");

    /**
     * ���ʻ���Ϣ------�߼��ն˵㡣
     */
    public static final String I18N_Ctp = BaseUtilities.getI18nMessage("Ctp");

    /**
     * ���ʻ���Ϣ------�߽�VC��
     */
    public static final String I18N_HighVc = BaseUtilities.getI18nMessage("HighVc");

    /**
     * ���ʻ���Ϣ------�ͽ�VC��
     */
    public static final String I18N_LowVc = BaseUtilities.getI18nMessage("LowVc");

    /**
     * ���ʻ���Ϣ------δ֪��
     */
    public static final String I18N_Unknown = BaseUtilities.getI18nMessage("Unknown");

    /**
     * ���ʻ���Ϣ------���ʡ�
     */
    public static final String I18N_Rate = BaseUtilities.getI18nMessage("Rate");

    /**
     * ���ʻ���Ϣ------���ʵȼ���
     */
    public static final String I18N_RateLevel = BaseUtilities.getI18nMessage("RateLevel");

    /**
     * ���ʻ���Ϣ------����ʱ�䡣
     */
    public static final String I18N_CreateTime = BaseUtilities.getI18nMessage("CreateTime");

    /**
     * ���ʻ���Ϣ------��Դ��
     */
    public static final String I18N_Resource = BaseUtilities.getI18nMessage("Resource");

    /**
     * ���ʻ���Ϣ------��Դ����
     */
    public static final String I18N_ResourceTree = BaseUtilities.getI18nMessage("ResourceTree");

    /**
     * ���ʻ���Ϣ------��Դѡ������
     */
    public static final String I18N_ResourceSelector = BaseUtilities.getI18nMessage("ResourceSelector");

    /**
     * ���ʻ���Ϣ------��ԴID��
     */
    public static final String I18N_ResourceId = BaseUtilities.getI18nMessage("ResourceId");

    /**
     * ���ʻ���Ϣ------��Դ������
     */
    public static final String I18N_ResourceCount = BaseUtilities.getI18nMessage("ResourceCount");

    /**
     * ���ʻ���Ϣ------��ѡ�����Դ������
     */
    public static final String I18N_SelectedResourceCount = BaseUtilities.getI18nMessage("SelectedResourceCount");

    /**
     * ���ʻ���Ϣ------��������
     */
    public static final String I18N_Filter = BaseUtilities.getI18nMessage("Filter");

    /**
     * ���ʻ���Ϣ------���ˡ�
     */
    public static final String I18N_Filtrate = BaseUtilities.getI18nMessage("Filtrate");

    /**
     * ���ʻ���Ϣ------ѡ������
     */
    public static final String I18N_SelectedResult = BaseUtilities.getI18nMessage("SelectedResult");

    /**
     * ���ʻ���Ϣ------���ҡ�
     */
    public static final String I18N_Find = BaseUtilities.getI18nMessage("Find");

    /**
     * ���ʻ���Ϣ------������
     */
    public static final String I18N_Search = BaseUtilities.getI18nMessage("Search");

    /**
     * ���ʻ���Ϣ------��Ϣ��
     */
    public static final String I18N_Info = BaseUtilities.getI18nMessage("Info");

    /**
     * ���ʻ���Ϣ------���������ڴ����У���ȴ�������
     */
    public static final String I18N_ServerProcessingPleaseWait = BaseUtilities.getI18nMessage("ServerProcessingPleaseWait");

    /**
     * ���ʻ���Ϣ------�����������Ѿ��������ˢ�£���
     */
    public static final String I18N_ServerDataChangedPleaseRefresh = BaseUtilities.getI18nMessage("ServerDataChangedPleaseRefresh");

    /**
     * ���ʻ���Ϣ------�������ı�������Ϊ�ա�
     */
    public static final String I18N_SearchTextIsNull = BaseUtilities.getI18nMessage("SearchTextIsNull");

    /**
     * ���ʻ���Ϣ------û�б��ҵ���
     */
    public static final String I18N_IsNotFound = BaseUtilities.getI18nMessage("IsNotFound");

    /**
     * ���ʻ���Ϣ------ѡ����Դ����������ڻ���ڡ�
     */
    public static final String I18N_CountMustMoreThanOrEqual = BaseUtilities.getI18nMessage("CountMustMoreThanOrEqual");

    /**
     * ���ʻ���Ϣ------ѡ����Դ��������С�ڻ���ڡ�
     */
    public static final String I18N_CountMustLessThanOrEqual = BaseUtilities.getI18nMessage("CountMustLessThanOrEqual");

    /**
     * ���ʻ���Ϣ------�ޡ�
     */
    public static final String I18N_INFO_NONE = BaseUtilities.getI18nMessage("none");

    /**
     * ���ʻ���Ϣ------ȫ����
     */
    public static final String I18N_INFO_ALL = BaseUtilities.getI18nMessage("all");

    /**
     * ���ʻ���Ϣ------�ɹ���
     */
    public static final String I18N_INFO_SUCCESS = BaseUtilities.getI18nMessage("success");

    /**
     * ���ʻ���Ϣ------ʧ�ܡ�
     */
    public static final String I18N_INFO_FAIL = BaseUtilities.getI18nMessage("fail");

    /**
     * ���ʻ���Ϣ------ʧ��ԭ��
     */
    public static final String I18N_INFO_FAILREASON = BaseUtilities.getI18nMessage("failReason");

    /**
     * ���ʻ���Ϣ------��ʼ��
     */
    public static final String I18N_INFO_START = BaseUtilities.getI18nMessage("start");

    /**
     * ���ʻ���Ϣ------��ʼʱ�䡣
     */
    public static final String I18N_INFO_STARTTIME = BaseUtilities.getI18nMessage("startTime");

    /**
     * ���ʻ���Ϣ------������
     */
    public static final String I18N_INFO_END = BaseUtilities.getI18nMessage("end");

    /**
     * ���ʻ���Ϣ------����ʱ�䡣
     */
    public static final String I18N_INFO_ENDTIME = BaseUtilities.getI18nMessage("endTime");

    /**
     * ���ʻ���Ϣ------�жϡ�
     */
    public static final String I18N_INFO_INTERRUPT = BaseUtilities.getI18nMessage("interrupt");

    /**
     * ���ʻ���Ϣ------����
     */
    public static final String I18N_INFO_ERROR = BaseUtilities.getI18nMessage("error");

    /**
     * ���ʻ���Ϣ------�ա�
     */
    public static final String I18N_INFO_EMPTY = BaseUtilities.getI18nMessage("empty");

    /**
     * ���ʻ���Ϣ------(��)��
     */
    public static final String I18N_INFO_EMPTYITEM = "(" + I18N_INFO_EMPTY + ")";

    /**
     * ���ʻ���Ϣ------�ǲ����ڵġ�
     */
    public static final String I18N_INFO_ISINEXISTENT = BaseUtilities.getI18nMessage("isInexistent");

    /**
     * ���ʻ���Ϣ------�ǡ�
     */
    public static final String I18N_INFO_YES = BaseUtilities.getI18nMessage("yes");

    /**
     * ���ʻ���Ϣ------��
     */
    public static final String I18N_INFO_NO = BaseUtilities.getI18nMessage("no");

    /**
     * ���ʻ���Ϣ------���롣
     */
    public static final String I18N_INFO_INPUT = BaseUtilities.getI18nMessage("input");

    /**
     * ���ʻ���Ϣ------�����
     */
    public static final String I18N_INFO_OUTPUT = BaseUtilities.getI18nMessage("output");

    /**
     * ���ʻ���Ϣ------���롣
     */
    public static final String I18N_INFO_IMPORT = BaseUtilities.getI18nMessage("import");

    /**
     * ���ʻ���Ϣ------������
     */
    public static final String I18N_INFO_EXPORT = BaseUtilities.getI18nMessage("export");

    /**
     * ���ʻ���Ϣ------�����
     */
    public static final String I18N_INFO_RESULT = BaseUtilities.getI18nMessage("result");

    /**
     * ���ʻ���Ϣ------ȷ����
     */
    public static final String I18N_INFO_OK = BaseUtilities.getI18nMessage("ok");

    /**
     * ���ʻ���Ϣ------Ӧ�á�
     */
    public static final String I18N_INFO_APPLY = BaseUtilities.getI18nMessage("apply");

    /**
     * ���ʻ���Ϣ------���á�
     */
    public static final String I18N_INFO_SET = BaseUtilities.getI18nMessage("set");

    /**
     * ���ʻ���Ϣ------ȡ����
     */
    public static final String I18N_INFO_CANCEL = BaseUtilities.getI18nMessage("cancel");

    /**
     * ���ʻ���Ϣ------�򿪡�
     */
    public static final String I18N_INFO_OPEN = BaseUtilities.getI18nMessage("open");

    /**
     * ���ʻ���Ϣ------�رա�
     */
    public static final String I18N_INFO_CLOSE = BaseUtilities.getI18nMessage("close");

    /**
     * ���ʻ���Ϣ------���档
     */
    public static final String I18N_INFO_SAVE = BaseUtilities.getI18nMessage("save");

    /**
     * ���ʻ���Ϣ------���Ϊ��
     */
    public static final String I18N_INFO_SAVEAS = BaseUtilities.getI18nMessage("saveAs");

    /**
     * ���ʻ���Ϣ------���롣
     */
    public static final String I18N_INFO_LOAD = BaseUtilities.getI18nMessage("load");

    /**
     * ���ʻ���Ϣ------�ָ���
     */
    public static final String I18N_INFO_RESTORE = BaseUtilities.getI18nMessage("restore");

    /**
     * ���ʻ���Ϣ------�ָ�ȱʡֵ��
     */
    public static final String I18N_INFO_RESTOREDEFAULTS = BaseUtilities.getI18nMessage("restoreDefaults");

    /**
     * ���ʻ���Ϣ------��ӡ�
     */
    public static final String I18N_INFO_ADD = BaseUtilities.getI18nMessage("add");

    /**
     * ���ʻ���Ϣ------��ӵ���
     */
    public static final String I18N_INFO_ADDTO = BaseUtilities.getI18nMessage("addTo");

    /**
     * ���ʻ���Ϣ------�Ѳ��롣
     */
    public static final String I18N_INFO_INSERTED = BaseUtilities.getI18nMessage("inserted");

    /**
     * ���ʻ���Ϣ------�Ƴ���
     */
    public static final String I18N_INFO_REMOVE = BaseUtilities.getI18nMessage("remove");

    /**
     * ���ʻ���Ϣ------���Ƴ���
     */
    public static final String I18N_INFO_REMOVED = BaseUtilities.getI18nMessage("removed");

    /**
     * ���ʻ���Ϣ------ɾ����
     */
    public static final String I18N_INFO_DELETE = BaseUtilities.getI18nMessage("delete");

    /**
     * ���ʻ���Ϣ------��ȷ��ɾ����
     */
    public static final String I18N_INFO_AREYOUSUREDELETE = BaseUtilities.getI18nMessage("areYouSureDelete");

    /**
     * ���ʻ���Ϣ------�޸ġ�
     */
    public static final String I18N_INFO_MODIFY = BaseUtilities.getI18nMessage("modify");

    /**
     * ���ʻ���Ϣ------�Ѹı䡣
     */
    public static final String I18N_INFO_CHANGED = BaseUtilities.getI18nMessage("changed");

    /**
     * ���ʻ���Ϣ------δ�ı䡣
     */
    public static final String I18N_INFO_UNCHANGED = BaseUtilities.getI18nMessage("unchanged");

    /**
     * ���ʻ���Ϣ------��������
     */
    public static final String I18N_INFO_RENAME = BaseUtilities.getI18nMessage("rename");

    /**
     * ���ʻ���Ϣ------��ѯ��
     */
    public static final String I18N_INFO_QUERY = BaseUtilities.getI18nMessage("query");

    /**
     * ���ʻ���Ϣ------��ѯ������
     */
    public static final String I18N_INFO_QUERYCONDITION = BaseUtilities.getI18nMessage("queryCondition");

    /**
     * ���ʻ���Ϣ------��ѯ�����
     */
    public static final String I18N_INFO_QUERYRESULT = BaseUtilities.getI18nMessage("queryResult");

    /**
     * ���ʻ���Ϣ------�С�
     */
    public static final String I18N_INFO_ROW = BaseUtilities.getI18nMessage("row");

    /**
     * ���ʻ���Ϣ------�С�
     */
    public static final String I18N_INFO_COLUMN = BaseUtilities.getI18nMessage("column");

    /**
     * ���ʻ���Ϣ------���¡�
     */
    public static final String I18N_INFO_UPDATE = BaseUtilities.getI18nMessage("update");

    /**
     * ���ʻ���Ϣ------ˢ�¡�
     */
    public static final String I18N_INFO_REFRESH = BaseUtilities.getI18nMessage("refresh");

    /**
     * ���ʻ���Ϣ------���ơ�
     */
    public static final String I18N_INFO_MOVETOUP = BaseUtilities.getI18nMessage("moveToUp");

    /**
     * ���ʻ���Ϣ------����ȫ����
     */
    public static final String I18N_INFO_MOVEALLTOUP = BaseUtilities.getI18nMessage("moveAllToUp");

    /**
     * ���ʻ���Ϣ------���ơ�
     */
    public static final String I18N_INFO_MOVETODOWN = BaseUtilities.getI18nMessage("moveToDown");

    /**
     * ���ʻ���Ϣ------����ȫ����
     */
    public static final String I18N_INFO_MOVEALLTODOWN = BaseUtilities.getI18nMessage("moveAllToDown");

    /**
     * ���ʻ���Ϣ------���ơ�
     */
    public static final String I18N_INFO_MOVETOLEFT = BaseUtilities.getI18nMessage("moveToLeft");

    /**
     * ���ʻ���Ϣ------����ȫ����
     */
    public static final String I18N_INFO_MOVEALLTOLEFT = BaseUtilities.getI18nMessage("moveAllToLeft");

    /**
     * ���ʻ���Ϣ------���ơ�
     */
    public static final String I18N_INFO_MOVETORIGHT = BaseUtilities.getI18nMessage("moveToRight");

    /**
     * ���ʻ���Ϣ------����ȫ����
     */
    public static final String I18N_INFO_MOVEALLTORIGHT = BaseUtilities.getI18nMessage("moveAllToRight");

    /**
     * ���ʻ���Ϣ------IP��ַ��
     */
    public static final String I18N_INFO_IP = BaseUtilities.getI18nMessage("ip");

    /**
     * ���ʻ���Ϣ------�˿ںš�
     */
    public static final String I18N_INFO_PORT = BaseUtilities.getI18nMessage("port");

    /**
     * ���ʻ���Ϣ------�û�����
     */
    public static final String I18N_INFO_USERNAME = BaseUtilities.getI18nMessage("username");

    /**
     * ���ʻ���Ϣ------���롣
     */
    public static final String I18N_INFO_PASSWORD = BaseUtilities.getI18nMessage("password");

    /**
     * ���ʻ���Ϣ------�ļ���
     */
    public static final String I18N_INFO_FILE = BaseUtilities.getI18nMessage("file");

    /**
     * ���ʻ���Ϣ------Ŀ¼��
     */
    public static final String I18N_INFO_DIRECTORY = BaseUtilities.getI18nMessage("directory");

    /**
     * ���ʻ���Ϣ------�ļ��С�
     */
    public static final String I18N_INFO_FOLDER = BaseUtilities.getI18nMessage("folder");

    /**
     * ���ʻ���Ϣ------�½��ļ��С�
     */
    public static final String I18N_INFO_NEWFOLDER = BaseUtilities.getI18nMessage("newFolder");

    /**
     * ���ʻ���Ϣ------�����ļ��С�
     */
    public static final String I18N_INFO_MOVETOFOLDER = BaseUtilities.getI18nMessage("moveToFolder");

    /**
     * ���ʻ���Ϣ------ѡ��
     */
    public static final String I18N_INFO_SELECT = BaseUtilities.getI18nMessage("select");

    /**
     * ���ʻ���Ϣ------����
     */
    public static final String I18N_INFO_SORT = BaseUtilities.getI18nMessage("sort");

    /**
     * ���ʻ���Ϣ------����
     */
    public static final String I18N_INFO_ASCENDING = BaseUtilities.getI18nMessage("ascending");

    /**
     * ���ʻ���Ϣ------����
     */
    public static final String I18N_INFO_DESCENDING = BaseUtilities.getI18nMessage("descending");

    /**
     * ���ʻ���Ϣ------������
     */
    public static final String I18N_INFO_INDEX = BaseUtilities.getI18nMessage("index");

    /**
     * ���ʻ���Ϣ------���ơ�
     */
    public static final String I18N_INFO_NAME = BaseUtilities.getI18nMessage("name");

    /**
     * ���ʻ���Ϣ------��ʽ��
     */
    public static final String I18N_INFO_FORMAT = BaseUtilities.getI18nMessage("format");

    /**
     * ���ʻ���Ϣ------Ԥ����
     */
    public static final String I18N_INFO_PREVIEW = BaseUtilities.getI18nMessage("preview");

    /**
     * ���ʻ���Ϣ------���š�
     */
    public static final String I18N_INFO_PLAY = BaseUtilities.getI18nMessage("play");

    /**
     * ���ʻ���Ϣ------ֹͣ��
     */
    public static final String I18N_INFO_STOP = BaseUtilities.getI18nMessage("stop");

    /**
     * ���ʻ���Ϣ------��ϸ��
     */
    public static final String I18N_INFO_DETAIL = BaseUtilities.getI18nMessage("detail");

    /**
     * ͼ��------���ҡ�
     */
    public static final Icon ICON_Find = BaseUtilities.getIcon("find.gif");

    /**
     * ͼ��------�򿪡�
     */
    public static final Icon ICON_Open = BaseUtilities.getIcon("open.gif");

    /**
     * ͼ��------�رա�
     */
    public static final Icon ICON_Close = BaseUtilities.getIcon("close.gif");

    /**
     * ͼ��------�رգ����£���
     */
    public static final Icon ICON_ClosePressed = BaseUtilities.getIcon("close-pressed.gif");

    /**
     * ͼ��------�رգ���������
     */
    public static final Icon ICON_CloseRollover = BaseUtilities.getIcon("close-rollover.gif");

    /**
     * ͼ��------�رգ���ʹ�ܣ���
     */
    public static final Icon ICON_CloseDisabled = BaseUtilities.getIcon("close-disabled.gif");

    /**
     * ͼ��------��ҳ��
     */
    public static final Icon ICON_First = BaseUtilities.getIcon("first.gif");

    /**
     * ͼ��------��ҳ�����£���
     */
    public static final Icon ICON_FirstPressed = BaseUtilities.getIcon("first-pressed.gif");

    /**
     * ͼ��------��ҳ����������
     */
    public static final Icon ICON_FirstRollover = BaseUtilities.getIcon("first-rollover.gif");

    /**
     * ͼ��------��ҳ����ʹ�ܣ���
     */
    public static final Icon ICON_FirstDisabled = BaseUtilities.getIcon("first-disabled.gif");

    /**
     * ͼ��------��һҳ��
     */
    public static final Icon ICON_Previous = BaseUtilities.getIcon("previous.gif");

    /**
     * ͼ��------��һҳ�����£���
     */
    public static final Icon ICON_PreviousPressed = BaseUtilities.getIcon("previous-pressed.gif");

    /**
     * ͼ��------��һҳ����������
     */
    public static final Icon ICON_PreviousRollover = BaseUtilities.getIcon("previous-rollover.gif");

    /**
     * ͼ��------��һҳ����ʹ�ܣ���
     */
    public static final Icon ICON_PreviousDisabled = BaseUtilities.getIcon("previous-disabled.gif");

    /**
     * ͼ��------��һҳ��
     */
    public static final Icon ICON_Next = BaseUtilities.getIcon("next.gif");

    /**
     * ͼ��------��һҳ�����£���
     */
    public static final Icon ICON_NextPressed = BaseUtilities.getIcon("next-pressed.gif");

    /**
     * ͼ��------��һҳ����������
     */
    public static final Icon ICON_NextRollover = BaseUtilities.getIcon("next-rollover.gif");

    /**
     * ͼ��------��һҳ����ʹ�ܣ���
     */
    public static final Icon ICON_NextDisabled = BaseUtilities.getIcon("next-disabled.gif");

    /**
     * ͼ��------ĩҳ��
     */
    public static final Icon ICON_Last = BaseUtilities.getIcon("last.gif");

    /**
     * ͼ��------ĩҳ�����£���
     */
    public static final Icon ICON_LastPressed = BaseUtilities.getIcon("last-pressed.gif");

    /**
     * ͼ��------ĩҳ����������
     */
    public static final Icon ICON_LastRollover = BaseUtilities.getIcon("last-rollover.gif");

    /**
     * ͼ��------ĩҳ����ʹ�ܣ���
     */
    public static final Icon ICON_LastDisabled = BaseUtilities.getIcon("last-disabled.gif");

    /**
     * ͼ��------ˢ�¡�
     */
    public static final Icon ICON_REFRESH = BaseUtilities.getIcon("refresh.gif");

    /**
     * ͼ��------�ȴ���
     */
    public static final Icon ICON_WAITING = BaseUtilities.getIcon("waiting.gif");

    /**
     * ͼ��------ɾ����
     */
    public static final Icon ICON_DELETE = BaseUtilities.getIcon("delete.gif");

    /**
     * ͼ��------��Ϣ��
     */
    public static final Icon ICON_INFO = BaseUtilities.getIcon("info.gif");

    /**
     * ͼ��------���档
     */
    public static final Icon ICON_WARNING = BaseUtilities.getIcon("warning.gif");

    /**
     * ͼ��------����
     */
    public static final Icon ICON_ERROR = BaseUtilities.getIcon("error.gif");

    /**
     * ͼ��------�ɹ���
     */
    public static final Icon ICON_SUCCESSFUL = BaseUtilities.getIcon("successful.gif");

    /**
     * ͼ��------ʧ�ܡ�
     */
    public static final Icon ICON_FAILED = BaseUtilities.getIcon("failed.gif");

    /**
     * ͼ��------�½��ļ��С�
     */
    public static final Icon ICON_NEWFOLDER = BaseUtilities.getIcon("new-folder.gif");

    /**
     * ͼ��------���롣
     */
    public static final Icon ICON_IMPORT = BaseUtilities.getIcon("import.gif");

    /**
     * ͼ��------������
     */
    public static final Icon ICON_EXPORT = BaseUtilities.getIcon("export.gif");

    /**
     * ͼ��------���ϡ�
     */
    public static final Icon ICON_UP = BaseUtilities.getIcon("up.gif");

    /**
     * ͼ��------���¡�
     */
    public static final Icon ICON_DOWN = BaseUtilities.getIcon("down.gif");

    /**
     * ͼ��------���ơ�
     */
    public static final Icon ICON_MOVETOUP = BaseUtilities.getIcon("move-to-up.gif");

    /**
     * ͼ��------����ȫ����
     */
    public static final Icon ICON_MOVEALLTOUP = BaseUtilities.getIcon("move-all-to-up.gif");

    /**
     * ͼ��------���ơ�
     */
    public static final Icon ICON_MOVETODOWN = BaseUtilities.getIcon("move-to-down.gif");

    /**
     * ͼ��------����ȫ����
     */
    public static final Icon ICON_MOVEALLTODOWN = BaseUtilities.getIcon("move-all-to-down.gif");

    /**
     * ͼ��------���ơ�
     */
    public static final Icon ICON_MOVETOLEFT = BaseUtilities.getIcon("move-to-left.gif");

    /**
     * ͼ��------����ȫ����
     */
    public static final Icon ICON_MOVEALLTOLEFT = BaseUtilities.getIcon("move-all-to-left.gif");

    /**
     * ͼ��------���ơ�
     */
    public static final Icon ICON_MOVETORIGHT = BaseUtilities.getIcon("move-to-right.gif");

    /**
     * ͼ��------����ȫ����
     */
    public static final Icon ICON_MOVEALLTORIGHT = BaseUtilities.getIcon("move-all-to-right.gif");

    /**
     * ���������------�ߴ�������������Frame��Dialog�������������ע�⣺������ͨ��������������岻�󣬶����п��ܻ����һ�����⡣
     * @deprecated �˼��������������жԻ��������������ģ����滻ΪBaseUtilities.createSizeLimiter()���������ĳߴ���������
     * @see BaseUtilities#createSizeLimiter()
     */
    public static final ComponentListener CL_SIZELIMITER = new ComponentAdapter() {

        /**
         * �ɵı߽硣
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
            /* ��ȡĿ����� */
            Component component = evt.getComponent();

            /* ��ȡĿ��������õı߽����С���ߴ� */
            Rectangle bounds = component.getBounds();
            Dimension minSize = component.getMinimumSize();
            Dimension maxSize = component.getMaximumSize();

            /* ȷ��Ŀ������µ�x�����꼰��� */
            if (bounds.width < minSize.width) {
                bounds.x -= (bounds.x == m_oldBounds.x ? 0 : minSize.width - bounds.width);
                bounds.width = minSize.width;

            } else if (bounds.width > maxSize.width) {
                bounds.x += (bounds.x == m_oldBounds.x ? 0 : bounds.width - maxSize.width);
                bounds.width = maxSize.width;
            }

            /* ȷ��Ŀ������µ�y�����꼰�߶� */
            if (bounds.height < minSize.height) {
                bounds.y -= (bounds.y == m_oldBounds.y ? 0 : minSize.height - bounds.height);
                bounds.height = minSize.height;

            } else if (bounds.height > maxSize.height) {
                bounds.y += (bounds.y == m_oldBounds.y ? 0 : bounds.height - maxSize.height);
                bounds.height = maxSize.height;
            }

            /* ����Ŀ��������±߽� */
            component.setBounds(bounds);

            /* �����µı߽� */
            m_oldBounds = bounds;
        }

    };

    /*------------------------------------- Public Abstract Method -------------------------------------*/

    /* Add Public Abstract Method */

}
