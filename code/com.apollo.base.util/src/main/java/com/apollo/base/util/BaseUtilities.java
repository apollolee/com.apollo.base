/*
 * 此代码创建于 2008-1-29 上午09:59:07。
 */
package com.apollo.base.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.CellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 * <p>文件名称：BaseUtilities.java</p>
 * <p>类型描述：基础工具类。</p>
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
@SuppressWarnings("all")
public class BaseUtilities implements IBaseConstants {

    /*------------------------------------- Public (Static) Inner Class -------------------------------------*/

    /**
     * 日期包装类。
     */
    public static class DateWrapper implements Comparable {

        /**
         * 日期。
         */
        protected Date m_date;

        /**
         * 描述。
         */
        protected String m_description;

        /**
         * 构造方法。
         */
        public DateWrapper() {
            this(null);
        }

        /**
         * 构造方法。
         * @param date 日期。
         */
        public DateWrapper(Date date) {
            m_date = date == null ? new Date() : date;
            m_description = DateFormat.getDateTimeInstance().format(m_date);
        }

        /**
         * @see java.lang.Object#toString()
         */
        public String toString() {
            return m_description;
        }

        /**
         * @see java.lang.Comparable#compareTo(java.lang.Object)
         */
        public int compareTo(Object obj) {
            return m_date.compareTo(((DateWrapper) obj).m_date);
        }

    }

    /**
     * 工作者视图。
     */
    public static class WorkerView extends JPanel {

        /**
         * 工作者视图。
         */
        private JComponent m_workerView;

        /**
         * 等待视图。
         */
        private JPanel m_waitingView;

        /**
         * 当前视图。
         */
        private JComponent m_current;

        /**
         * 构造方法。
         * @param waitingText 等待中文本。
         */
        public WorkerView(String waitingText) {
            this(null, waitingText);
        }

        /**
         * 构造方法。
         * @param workerView 工作者视图。
         * @param waitingText 等待中文本。
         */
        public WorkerView(JComponent workerView, String waitingText) {
            super(new GridBagLayout());

            m_workerView = workerView;
            m_waitingView = createWaitingView(waitingText);
            m_current = m_workerView == null ? m_waitingView : m_workerView;

            addComponentWithNoSpace(this, m_current, 0, 0, 1, 1, GBC_CENTER);
        }

        /**
         * 设置工作者视图。
         * @param workerView 工作者视图。
         */
        public void setWorkerView(JComponent workerView) {
            if (workerView == null) {
                throw new IllegalArgumentException("Worker view is null !");
            }

            m_workerView = workerView;
            if (m_current != m_waitingView && m_current != workerView) {
                changeToWorkerView();
            }
        }

        /**
         * 改变到工作者视图。
         */
        public void changeToWorkerView() {
            if (m_workerView == null) {
                throw new IllegalArgumentException("Worker view is null !");
            }

            changeTo(m_workerView);
        }

        /**
         * 改变到等待视图。
         */
        public void changeToWaitingView() {
            if (m_workerView != null) {
                m_waitingView.setPreferredSize(m_workerView.getPreferredSize());
            }

            changeTo(m_waitingView);
        }

        /**
         * 改变到。
         * @param view 视图。
         */
        private void changeTo(JComponent view) {
            if (m_current != view) {
                remove(m_current);
                addComponentWithNoSpace(this, view, 0, 0, 1, 1, GBC_CENTER);
                m_current = view;
                revalidate();
                repaint();
            }
        }

    }

    /*------------------------------------- Protected (Static) Inner Class -------------------------------------*/

    /* Add Protected (Static) Inner Class */

    /*------------------------------------- Friendly (Static) Inner Class -------------------------------------*/

    /* Add Friendly (Static) Inner Class */

    /*------------------------------------- Private (Static) Inner Class -------------------------------------*/

    /* Add Private (Static) Inner Class */

    /*------------------------------------- Public Static Field -------------------------------------*/

    /* Add Public Static Field */

    /*------------------------------------- Protected Static Field -------------------------------------*/

    /* Add Protected Static Field */

    /*------------------------------------- Friendly Static Field -------------------------------------*/

    /* Add Friendly Static Field */

    /*------------------------------------- Private Static Field -------------------------------------*/

    /* Add Private Static Field */

    /*------------------------------------- Static Initial Block -------------------------------------*/

    /* Add Static Initial Block */

    /*------------------------------------- Public Static Method -------------------------------------*/

    /**
     * 打印UIDefaults。
     */
    public static void printUIDefaults() {
        UIDefaults defaults = UIManager.getDefaults();
        Enumeration<Object> keys = defaults.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            System.out.println("[Key = " + key + "] , [Value = " + defaults.get(key) + "]");
        }
    }

    /**
     * 判断是否是素数。时间复杂度O(n)。
     * @param number 数字。
     * @return 标识是否是素数。
     */
    public static final boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 判断包涵关系。
     * @param values 全集。
     * @param value 子集。
     * @return 为true表示包涵，为false表示不包涵。
     */
    public static boolean contains(int[] values, int value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                return true;
            }
        }

        return false;
    }

    /**
     * 采用ResourceBundle机制获取i18n信息。
     * @param baseName 资源包的基本名称，是一个完全限定类名。
     * @param i18nKey 国际化信息关键字。
     * @return 国际化信息，如果指定的资源找不到将直接返回i18nKey。
     */
    public static String getI18nMessage(String baseName, String i18nKey) {
        try {
            return ResourceBundle.getBundle(baseName).getString(i18nKey);

        } catch (MissingResourceException ex) { //找不到指定的资源
            return i18nKey;
        }
    }

    /**
     * 回显消息。
     * @param msg 消息。
     */
    public static void echo(String msg) {
        System.out.println(msg);
    }

    /**
     * 当前线程睡眠指定时间。
     * @param millis 指定时间（单位：毫秒）。
     */
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 控制台中等待按下回车。
     */
    public static void waitForEnterPressed() {
        try {
            echo("\nPress <Enter> to continue...");
            System.in.read();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 载入属性集。
     * @param propertiesFile 属性文件。
     * @return 属性集。
     * @throws IOException 如果读属性文件时发生IO错误。
     */
    public static Properties loadProperties(File propertiesFile) throws IOException {
        Properties properties = new Properties();

        try (FileReader fr = new FileReader(propertiesFile)) {
            properties.load(fr);
        }

        return properties;
    }

    /**
     * 存储属性集。
     * @param properties 属性集。
     * @param propertiesFile 属性文件。
     * @throws IOException 如果写属性文件时发生IO错误。
     */
    public static void storeProperties(Properties properties, File propertiesFile) throws IOException {
        storeProperties(properties, propertiesFile, null);
    }

    /**
     * 存储属性集。
     * @param properties 属性集。
     * @param propertiesFile 属性文件。
     * @param comments 注释。
     * @throws IOException 如果写属性文件时发生IO错误。
     */
    public static void storeProperties(Properties properties, File propertiesFile, String comments) throws IOException {
        if (properties == null) {
            throw new NullPointerException("Properties is null !");
        }

        try (FileWriter fw = new FileWriter(propertiesFile)) {
            properties.store(fw, comments);
        }
    }

    /**
     * 获取图标。
     * @param type 图标文件所在类。
     * @param baseName 资源基本名称。
     * @param iconFilename 图标文件名。
     * @return 图标。
     */
    public static Icon getIcon(Class type, String baseName, String iconFilename) {
        URL icon = type.getClassLoader().getResource(baseName + iconFilename);
        return icon == null ? null : new ImageIcon(icon);
    }

    /**
     * 设置按钮图标集。
     * @param button 按钮。
     * @param defaultIcon 缺省图标。
     * @param pressedIcon 按下的图标。
     * @param rolloverIcon 经过的图标。
     */
    public static void setButtonIcons(AbstractButton button, Icon defaultIcon, Icon pressedIcon, Icon rolloverIcon) {
        setButtonIcons(button, defaultIcon, pressedIcon, rolloverIcon, null);
    }

    /**
     * 设置按钮图标集。
     * @param button 按钮。
     * @param defaultIcon 缺省图标。
     * @param pressedIcon 按下的图标。
     * @param rolloverIcon 经过的图标。
     * @param disabledIcon 非使能的图标。
     */
    public static void setButtonIcons(AbstractButton button, Icon defaultIcon, Icon pressedIcon, Icon rolloverIcon, Icon disabledIcon) {
        setButtonIcons(button, defaultIcon, pressedIcon, rolloverIcon, null, null, disabledIcon);
    }

    /**
     * 设置按钮图标集。
     * @param button 按钮。
     * @param defaultIcon 缺省图标。
     * @param pressedIcon 按下的图标。
     * @param rolloverIcon 经过的图标。
     * @param selectedIcon 选中的图标。
     * @param rolloverSelectedIcon 经过选中的图标。
     * @param disabledIcon 非使能的图标。
     */
    public static void setButtonIcons(AbstractButton button,
                                      Icon defaultIcon,
                                      Icon pressedIcon,
                                      Icon rolloverIcon,
                                      Icon selectedIcon,
                                      Icon rolloverSelectedIcon,
                                      Icon disabledIcon) {
        button.setIcon(defaultIcon);
        button.setPressedIcon(pressedIcon);
        button.setRolloverIcon(rolloverIcon);
        button.setSelectedIcon(selectedIcon);
        button.setRolloverSelectedIcon(rolloverSelectedIcon);
        button.setDisabledIcon(disabledIcon);

        Dimension size = new Dimension(defaultIcon.getIconWidth(), defaultIcon.getIconHeight());
        button.setPreferredSize(size);
        button.setMinimumSize(size);
        button.setMaximumSize(size);

        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);

        button.setText(null);
    }

    /**
     * 添加拖动选择。
     * @param list 列表。
     */
    public static void addDragSelection(final JList list) {
        final Point prePoint = new Point();
        list.addMouseListener(new MouseAdapter() {

            /**
             * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
             */
            public void mousePressed(MouseEvent evt) {
                prePoint.setLocation(evt.getPoint());
            }

        });
        list.addMouseMotionListener(new MouseMotionAdapter() {

            /**
             * @see java.awt.event.MouseMotionAdapter#mouseDragged(java.awt.event.MouseEvent)
             */
            public void mouseDragged(MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    list.setSelectionInterval(list.locationToIndex(prePoint), list.locationToIndex(evt.getPoint()));
                }
            }

        });
    }

    /**
     * 以不填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithNoneFill(JPanel view, JComponent component, int gridy) {
        addComponentWithNoneFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * 以不填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithNoneFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithNoneFill(view, component, gridx, gridy, GBC_WEST);
    }

    /**
     * 以不填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithNoneFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithNoneFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * 以不填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithNoneFill(JPanel view,
                                                JComponent component,
                                                int gridx,
                                                int gridy,
                                                int gridwidth,
                                                int gridheight,
                                                int anchor) {
        addComponent(view, component, gridx, gridy, gridwidth, gridheight, 0.0, 0.0, anchor, GBC_NONE);
    }

    /**
     * 以横向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithHorizontalFill(JPanel view, JComponent component, int gridy) {
        addComponentWithHorizontalFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * 以横向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithHorizontalFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithHorizontalFill(view, component, gridx, gridy, GBC_WEST);
    }

    /**
     * 以横向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithHorizontalFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithHorizontalFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * 以横向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithHorizontalFill(JPanel view,
                                                      JComponent component,
                                                      int gridx,
                                                      int gridy,
                                                      int gridwidth,
                                                      int gridheight,
                                                      int anchor) {
        addComponent(view, component, gridx, gridy, gridwidth, gridheight, 1.0, 0.0, anchor, GBC_HORIZONTAL);
    }

    /**
     * 以纵向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithVerticalFill(JPanel view, JComponent component, int gridy) {
        addComponentWithVerticalFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * 以纵向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithVerticalFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithVerticalFill(view, component, gridx, gridy, GBC_WEST);
    }

    /**
     * 以纵向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithVerticalFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithVerticalFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * 以纵向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithVerticalFill(JPanel view,
                                                    JComponent component,
                                                    int gridx,
                                                    int gridy,
                                                    int gridwidth,
                                                    int gridheight,
                                                    int anchor) {
        addComponent(view, component, gridx, gridy, gridwidth, gridheight, 0.0, 1.0, anchor, GBC_VERTICAL);
    }

    /**
     * 以双向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithBothFill(JPanel view, JComponent component, int gridy) {
        addComponentWithBothFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * 以双向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithBothFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithBothFill(view, component, gridx, gridy, GBC_CENTER);
    }

    /**
     * 以双向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithBothFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithBothFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * 以双向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithBothFill(JPanel view,
                                                JComponent component,
                                                int gridx,
                                                int gridy,
                                                int gridwidth,
                                                int gridheight,
                                                int anchor) {
        addComponent(view, component, gridx, gridy, gridwidth, gridheight, 1.0, 1.0, anchor, GBC_BOTH);
    }

    /**
     * 以无缝双向填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithNoSpace(JPanel view,
                                               JComponent component,
                                               int gridx,
                                               int gridy,
                                               int gridwidth,
                                               int gridheight,
                                               int anchor) {
        addComponentWithNoSpace(view, component, gridx, gridy, gridwidth, gridheight, 1.0, 1.0, anchor, GBC_BOTH);
    }

    /**
     * 以无缝填充的方式添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param weightx The initial weightx value.
     * @param weighty The initial weighty value.
     * @param anchor The initial anchor value.
     * @param fill The initial fill value.
     */
    public static void addComponentWithNoSpace(JPanel view,
                                               JComponent component,
                                               int gridx,
                                               int gridy,
                                               int gridwidth,
                                               int gridheight,
                                               double weightx,
                                               double weighty,
                                               int anchor,
                                               int fill) {
        addComponent(view,
                     component,
                     gridx,
                     gridy,
                     gridwidth,
                     gridheight,
                     weightx,
                     weighty,
                     anchor,
                     fill,
                     INSETS_NoSpace,
                     IPADX_NoSpace,
                     IPADY_NoSpace);
    }

    /**
     * 添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param weightx The initial weightx value.
     * @param weighty The initial weighty value.
     * @param anchor The initial anchor value.
     * @param fill The initial fill value.
     */
    public static void addComponent(JPanel view,
                                    JComponent component,
                                    int gridx,
                                    int gridy,
                                    int gridwidth,
                                    int gridheight,
                                    double weightx,
                                    double weighty,
                                    int anchor,
                                    int fill) {
        addComponent(view,
                     component,
                     gridx,
                     gridy,
                     gridwidth,
                     gridheight,
                     weightx,
                     weighty,
                     anchor,
                     fill,
                     INSETS_DEFAULT,
                     IPADX_DEFAULT,
                     IPADY_DEFAULT);
    }

    /**
     * 添加组件。
     * @param view 视图。
     * @param component 组件。
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param gridwidth The initial gridwidth value.
     * @param gridheight The initial gridheight value.
     * @param weightx The initial weightx value.
     * @param weighty The initial weighty value.
     * @param anchor The initial anchor value.
     * @param fill The initial fill value.
     * @param insets The initial insets value.
     * @param ipadx The initial ipadx value.
     * @param ipady The initial ipady value.
     * @see java.awt.GridBagConstraints#gridx
     * @see java.awt.GridBagConstraints#gridy
     * @see java.awt.GridBagConstraints#gridwidth
     * @see java.awt.GridBagConstraints#gridheight
     * @see java.awt.GridBagConstraints#weightx
     * @see java.awt.GridBagConstraints#weighty
     * @see java.awt.GridBagConstraints#anchor
     * @see java.awt.GridBagConstraints#fill
     * @see java.awt.GridBagConstraints#insets
     * @see java.awt.GridBagConstraints#ipadx
     * @see java.awt.GridBagConstraints#ipady
     */
    public static void addComponent(JPanel view,
                                    JComponent component,
                                    int gridx,
                                    int gridy,
                                    int gridwidth,
                                    int gridheight,
                                    double weightx,
                                    double weighty,
                                    int anchor,
                                    int fill,
                                    Insets insets,
                                    int ipadx,
                                    int ipady) {
        view.add(component, new GridBagConstraints(gridx,
                                                   gridy,
                                                   gridwidth,
                                                   gridheight,
                                                   weightx,
                                                   weighty,
                                                   anchor,
                                                   fill,
                                                   insets,
                                                   ipadx,
                                                   ipady));
    }

    /**
     * 创建等待视图。
     * @param waitingText 等待中文本。
     * @return 等待视图。
     */
    public static JPanel createWaitingView(String waitingText) {
        JProgressBar waitingBar = new JProgressBar();
        waitingBar.setIndeterminate(true);

        JLabel desc = new JLabel(waitingText);
        desc.setForeground(Color.BLUE);

        JPanel waitingView = new JPanel(new GridBagLayout());
        addComponentWithNoneFill(waitingView, desc, 0, 0, GBC_CENTER);
        addComponentWithHorizontalFill(waitingView, waitingBar, 0, 1, GBC_CENTER);

        return waitingView;
    }

    /**
     * 创建等待图片视图。
     * @return 等待图片视图。
     */
    public static JPanel createWaitingImageView() {
        JPanel waitingImageView = new JPanel(new GridBagLayout());
        addComponentWithBothFill(waitingImageView, new JLabel(ICON_WAITING), 0, 0);
        return waitingImageView;
    }

    /**
     * 创建尺寸限制器。
     * @return 尺寸限制器。
     */
    public static ComponentListener createSizeLimiter() {
        return new ComponentListener() {

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
                if (m_oldBounds != null) {
                    Rectangle bounds = evt.getComponent().getBounds();

                    if (bounds.getSize().equals(m_oldBounds.getSize())) {
                        m_oldBounds = bounds;
                    }
                }
            }

            /**
             * @see java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent)
             */
            public void componentResized(ComponentEvent evt) {
                if (m_oldBounds != null) {
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
            }

        };
    }

    /**
     * 对表格进行文本搜索定位。
     * @param text 文本。
     * @param table 表格。
     * @param parent 父组件。
     */
    public static void searchText(String text, JTable table, Component parent) {
        String oldText = text;
        text = text == null ? null : text.trim().toLowerCase();

        if (text == null || "".equals(text)) {
            JOptionPane.showMessageDialog(parent, I18N_SearchTextIsNull, I18N_INFO_ERROR, JOptionPane.ERROR_MESSAGE);

        } else {
            if (!searchText(text, table)) {
                String desc = "<html><font color=\"#ff0000\">" + oldText + "</font>" + I18N_IsNotFound;
                JOptionPane.showMessageDialog(parent, desc, I18N_Info, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    /**
     * 对表格进行文本搜索定位。
     * @param text 文本。
     * @param table 表格。
     * @return 标识是否搜索到指定的文本。
     */
    public static boolean searchText(String text, JTable table) {
        text = text == null ? null : text.trim().toLowerCase();

        if (text == null || table == null) {
            return false;
        }

        int[] selectedRows = table.getSelectedRows();
        int rowCount = table.getRowCount();

        if (selectedRows.length == 0) {
            for (int i = 0; i < rowCount; i++) {
                if (searchText(text, table, i, 0)) {
                    return true;
                }
            }

        } else {
            int[] selectedColumns = table.getSelectedColumns();
            int row = selectedRows[selectedRows.length - 1];
            int column = selectedColumns.length == 0 ? 0 : (selectedColumns[selectedColumns.length - 1] + 1);

            if (searchText(text, table, row, column)) {
                return true;
            }

            for (int i = row + 1; i < rowCount; i++) {
                if (searchText(text, table, i, 0)) {
                    return true;
                }
            }

            for (int i = 0; i <= row; i++) {
                if (searchText(text, table, i, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 对表格进行文本搜索定位（注意：此方法未进行参数过滤，谨慎使用）。
     * @param text 文本。
     * @param table 表格。
     * @param row 行。
     * @param column 列。
     * @return 标识是否搜索到指定的文本。
     */
    public static boolean searchText(String text, JTable table, int row, int column) {
        for (int i = column, size = table.getColumnCount(); i < size; i++) {
            Object value = table.getValueAt(row, i);
            if (value != null && value.toString().trim().toLowerCase().indexOf(text) > -1) {
                table.changeSelection(row, i, false, false);
                table.requestFocus();
                return true;
            }
        }
        return false;
    }

    /**
     * 对综合树进行文本搜索定位。
     * @param text 文本。
     * @param tree 树。
     * @param parent 父组件。
     */
    public static void searchText(String text, JTree tree, Component parent) {
        String oldText = text;
        text = text == null ? null : text.trim().toLowerCase();

        if (text == null || "".equals(text)) {
            JOptionPane.showMessageDialog(parent, I18N_SearchTextIsNull, I18N_INFO_ERROR, JOptionPane.ERROR_MESSAGE);

        } else {
            if (!searchText(text, tree)) {
                String desc = "<html><font color=\"#ff0000\">" + oldText + "</font>" + I18N_IsNotFound;
                JOptionPane.showMessageDialog(parent, desc, I18N_Info, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    /**
     * 对综合树进行文本搜索定位。
     * @param text 文本。
     * @param tree 树。
     * @return 标识是否搜索到指定的文本。
     */
    public static boolean searchText(String text, JTree tree) {
        text = text == null ? null : text.trim().toLowerCase();

        if (text == null || tree == null) {
            return false;
        }

        List<DefaultMutableTreeNode> nodes = getNodes((DefaultMutableTreeNode) tree.getModel().getRoot());
        TreePath[] paths = tree.getSelectionPaths();

        if (paths == null || paths.length == 0) {
            return searchText(text, tree, nodes);

        } else {
            Object node = paths[paths.length - 1].getLastPathComponent();
            int index = nodes.indexOf(node);

            if (searchText(text, tree, nodes.subList(index + 1, nodes.size()))) {
                return true;
            }

            if (searchText(text, tree, nodes.subList(0, index + 1))) {
                return true;
            }
        }

        return false;
    }

    /**
     * 获取节点集。
     * @param node 节点。
     * @return 节点集。
     */
    public static List<DefaultMutableTreeNode> getNodes(DefaultMutableTreeNode node) {
        List<DefaultMutableTreeNode> nodes = new ArrayList<DefaultMutableTreeNode>();
        nodes.add(node);

        if (!node.isLeaf()) {
            for (int i = 0, size = node.getChildCount(); i < size; i++) {
                nodes.addAll(getNodes((DefaultMutableTreeNode) node.getChildAt(i)));
            }
        }

        return nodes;
    }

    /**
     * 对综合树节点进行文本搜索定位。
     * @param text 文本。
     * @param tree 树。
     * @param nodes 节点集。
     * @return 标识是否搜索到指定的文本。
     */
    public static boolean searchText(String text, JTree tree, List<DefaultMutableTreeNode> nodes) {
        for (DefaultMutableTreeNode node : nodes) {
            Object value = node.getUserObject();

            if (value != null && value.toString().trim().toLowerCase().indexOf(text) > -1) {
                TreePath path = new TreePath(node.getPath());

                tree.setSelectionPath(path);
                tree.scrollPathToVisible(path);
                tree.requestFocus();

                return true;
            }
        }

        return false;
    }

    /**
     * 创建整型数组，从0开始且连续的。
     * @param length 长度。
     * @return 整型数组。
     */
    public static int[] createIntegers(int length) {
        int[] integers = new int[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }

        return integers;
    }

    /**
     * 置空指定的菜单。
     * @param menu 指定的菜单。
     */
    public static void emptyMenu(JMenu menu) {
        menu.removeAll();

        JMenuItem emptyMenuItem = new JMenuItem(I18N_INFO_EMPTYITEM);
        emptyMenuItem.setEnabled(false);

        menu.add(emptyMenuItem);
    }

    /**
     * 添加菜单项，添加前如果有空菜单项则移除。
     * @param menu 菜单。
     * @param menuItem 菜单项。
     */
    public static void addMenuItem(JMenu menu, JMenuItem menuItem) {
        if (menu.getItemCount() == 1 && I18N_INFO_EMPTYITEM.equals(menu.getItem(0).getText())) {
            menu.remove(0);
        }

        menu.add(menuItem);
    }

    /**
     * 移除菜单项，移除后如果菜单为空则添加空菜单项。
     * @param menu 菜单。
     * @param menuItem 菜单项。
     */
    public static void removeMenuItem(JMenu menu, JMenuItem menuItem) {
        menu.remove(menuItem);

        if (menu.getItemCount() == 0) {
            JMenuItem emptyMenuItem = new JMenuItem(I18N_INFO_EMPTYITEM);
            emptyMenuItem.setEnabled(false);

            menu.add(emptyMenuItem);
        }
    }

    /**
     * 创建菜单项集。
     * @param actions 动作集。
     * @return 菜单项集。
     */
    public static JMenuItem[] createMenuItems(Action[] actions) {
        if (actions == null) {
            return null;
        }

        JMenuItem[] menuItems = new JMenuItem[actions.length];

        for (int i = 0; i < menuItems.length; i++) {
            menuItems[i] = new JMenuItem(actions[i]);
        }

        return menuItems;
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param name 名字。
     */
    public static void setAction(Action action, String name) {
        setAction(action, name, '\0');
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param name 名字。
     * @param mnemonic 键盘助记符。
     */
    public static void setAction(Action action, String name, char mnemonic) {
        setAction(action, name, mnemonic, null);
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param icon 图标。
     */
    public static void setAction(Action action, Icon icon) {
        setAction(action, "", icon);
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param name 名字。
     * @param icon 图标。
     */
    public static void setAction(Action action, String name, Icon icon) {
        setAction(action, name, '\0', icon);
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param name 名字。
     * @param mnemonic 键盘助记符。
     * @param icon 图标。
     */
    public static void setAction(Action action, String name, char mnemonic, Icon icon) {
        setAction(action, name, mnemonic, icon, false);
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param name 名字。
     * @param mnemonic 键盘助记符。
     * @param isOpenWindow 标识是否为打开窗口动作。
     */
    public static void setAction(Action action, String name, char mnemonic, boolean isOpenWindow) {
        setAction(action, name, mnemonic, null, isOpenWindow);
    }

    /**
     * 设置动作。
     * @param action 动作。
     * @param name 名字。
     * @param mnemonic 键盘助记符。
     * @param icon 图标。
     * @param isOpenWindow 标识是否为打开窗口动作。
     */
    public static void setAction(Action action, String name, char mnemonic, Icon icon, boolean isOpenWindow) {
        name = name == null ? "" : name;

        action.putValue(Action.NAME, getMnemonicText(name, mnemonic, isOpenWindow));
        action.putValue(Action.MNEMONIC_KEY, new Integer(mnemonic));

        String description = name.trim().equals("") ? null : name;
        action.putValue(Action.SHORT_DESCRIPTION, description);
        action.putValue(Action.LONG_DESCRIPTION, description);
        action.putValue(Action.SMALL_ICON, icon);
    }

    /**
     * 获取带键盘助记符的文本。
     * @param text 指定文本。
     * @param mnemonic 指定键盘助记符。
     * @return 如果指定文本已包涵指定键盘助记符则返回指定文本本身，否则将加上指定键盘助记符后缀。
     */
    public static String getMnemonicText(String text, char mnemonic) {
        return getMnemonicText(text, mnemonic, false);
    }

    /**
     * 获取带键盘助记符的文本。
     * @param text 指定文本。
     * @param mnemonic 指定键盘助记符。
     * @param isOpenWindow 标识是否为打开窗口动作。
     * @return 如果指定文本已包涵指定键盘助记符则返回指定文本本身，否则将加上指定键盘助记符后缀。
     */
    public static String getMnemonicText(String text, char mnemonic, boolean isOpenWindow) {
        String openWindowDesc = isOpenWindow ? "..." : "";
        String mnemonicDesc = mnemonic != '\0' && text.indexOf(Character.toUpperCase(mnemonic)) == -1 && text.indexOf(Character.toLowerCase(mnemonic)) == -1 ? "(" + mnemonic + ")" : "";

        return text + mnemonicDesc + openWindowDesc;
    }

    /**
     * 获取只包涵图标的按钮。
     * @param action 动作。
     * @return 只包涵图标的按钮。
     */
    public static JButton getIconButton(Action action) {
        JButton btn = new JButton();
        setIconButton(btn, action);

        return btn;
    }

    /**
     * 设置只包涵图标的按钮。
     * @param btn 只包涵图标的按钮。
     * @param action 动作。
     */
    public static void setIconButton(JButton btn, Action action) {
        btn.setAction(action);
        btn.setText(null);
    }

    /**
     * 获取选择模型已选择的所有索引。
     * @param sm 选择模型。
     * @return 选择模型已选择的所有索引。
     */
    public static int[] getSelection(ListSelectionModel sm) {
        int min = sm.getMinSelectionIndex();
        int max = sm.getMaxSelectionIndex();

        if (min == -1 || max == -1) {
            return new int[0];
        }

        int[] temp = new int[max - min + 1];
        int cursor = 0;

        for (int i = min; i <= max; i++) {
            if (sm.isSelectedIndex(i)) {
                temp[cursor++] = i;
            }
        }

        int[] selection = new int[cursor];
        System.arraycopy(temp, 0, selection, 0, cursor);

        return selection;
    }

    /**
     * 设置选择模型已选择的所有索引。
     * @param sm 选择模型。
     * @param selection 选择模型已选择的所有索引。
     */
    public static void setSelection(ListSelectionModel sm, int[] selection) {
        for (int i = 0; i < selection.length; i++) {
            if (i == 0) {
                sm.setSelectionInterval(selection[i], selection[i]);

            } else {
                sm.addSelectionInterval(selection[i], selection[i]);
            }
        }
    }

    /**
     * 把指定的窗口居中。
     * @param window 指定的窗口。
     */
    public static void center(Window window) {
        /* 创建指定窗口放在屏幕中央时候的左上角坐标点 */
        Point location = new Point();

        /* 获取屏幕的尺寸和指定窗口的尺寸 */
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = window.getSize();

        /* 计算指定窗口放在屏幕中央时候的左上角坐标点 */
        location.x = screenSize.width / 2 - windowSize.width / 2;
        location.y = screenSize.height / 2 - windowSize.height / 2;

        /* 检测x轴坐标是否越界 */
        if (location.x < 0) {
            location.x = 0;
        }

        /* 检测y轴坐标是否越界 */
        if (location.y < 0) {
            location.y = 0;
        }

        /* 设置指定窗口放在屏幕中央时候的左上角坐标点 */
        window.setLocation(location);
    }

    /**
     * 自动停止编辑。
     * @param editor 编辑器。
     * @param editorComponent 编辑器组件。
     * @throws NullPointerException 如果参数为空则会抛出此异常。
     */
    public static synchronized void autoStopCellEditing(final CellEditor editor, final Component editorComponent) {
        if (editor == null) {
            throw new NullPointerException("Editor is null !");
        }

        if (editorComponent == null) {
            throw new NullPointerException("Editor component is null !");
        }

        editorComponent.addFocusListener(new FocusAdapter() {

            /**
             * @see java.awt.event.FocusAdapter#focusLost(java.awt.event.FocusEvent)
             */
            public void focusLost(FocusEvent evt) {
                if (!evt.isTemporary()) {
                    editor.stopCellEditing();
                }

                editorComponent.removeFocusListener(this);
            }

        });
    }

    /**
     * 获取组件所在的窗口。
     * @param component 组件。
     * @return 窗口。
     */
    public static Window getWindow(Component component) {
        Window aw = KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow();

        if (component == null) {
            return aw;

        } else {
            if (component instanceof Dialog || component instanceof Frame) {
                return (Window) component;

            } else {
                Window win = SwingUtilities.windowForComponent(component);
                return win == null ? aw : win;
            }
        }
    }

    /**
     * 如果当前线程是事件派发线程就直接执行code.run()，否则会调用SwingUtilities.invokeLater()把code放入事件队列执行。
     * @param code 需要运行的代码。
     */
    public static void safelyInvokeLater(Runnable code) {
        if (SwingUtilities.isEventDispatchThread()) {
            code.run();

        } else {
            SwingUtilities.invokeLater(code);
        }
    }

    /**
     * 如果当前线程是事件派发线程就直接执行code.run()，否则会调用SwingUtilities.invokeAndWait()把code放入事件队列执行。
     * @param code 需要运行的代码。
     * @throws InvocationTargetException 如果在运行 code 时则抛出此异常。
     * @throws InterruptedException 如果等待事件指派线程执完成执行 code.run() 时被中断则抛出此异常。
     */
    public static void safelyInvokeAndWait(Runnable code) throws InterruptedException, InvocationTargetException {
        if (SwingUtilities.isEventDispatchThread()) {
            code.run();

        } else {
            SwingUtilities.invokeAndWait(code);
        }
    }

    /**
     * 获取指定类的class文件所在的位置。
     * @param cls 目标类。
     * @return 如果获取成功则返回对应的文件，不成功则返回null。
     */
    public static File getClassLocation(Class cls) {
        try {
            return new File(cls.getProtectionDomain().getCodeSource().getLocation().toURI()).getCanonicalFile();

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * 获取指定类的class文件所在的位置。
     * @param cls 目标类。
     * @param isGetParent 为true返回的是class文件所在类路径的父目录；为false将直接返回类路径（注意：如果class文件在jar或zip中将返回的是jar文件或zip文件的路径）。
     * @param isRealSpace 为true将使用真实的空格来替换URL里面的转义空格，为false将直接使用URL里面规定的转义空格（注意：如果URL用于构建File，此参数需要设置为true）。
     * @return 标识位置，为null表示targetClass为null或构造URL失败了。
     */
    public static URL getClassLocation(Class cls, boolean isGetParent, boolean isRealSpace) {
        /* 目标类判空 */
        if (cls == null) {
            return null;
        }

        /*
         * 注意：这里可以直接调用Class.getProtectionDomain().getCodeSource().getLocation()方法来得到我们想要的Location，但
                         * 　　  　是这个方法有2个限制不太方便：
                         * 　 　 　1.此方法需要相应的安全权限，如果没有，会抛Java安全异常的。
                         * 　 　 　2.此方法的getCodeSource()在当Class为启动类加载器加载时会返回null，虽然很少会用到，但这还是我们不希望的。
                         * 　　  　基于以上两个缺点，我们不使用此方法来获取Location。
         */

        /* 获取目标类class文件的URL，并得到相关信息 */
        String clsName = cls.getName();
        String clsRes = "/" + clsName.replace('.', '/') + ".class";
        URL url = cls.getResource(clsRes);
        String protocol = url.getProtocol();
        String spec = url.toString();

        /* TODO 替换空格，URL中描述空格用"%20"，用这样的URL来构建File类将无法找到文件，必须替换到，但可能会存在平台差异性。 */
        if (isRealSpace) {
            spec = spec.replaceAll("%20", " ");
        }

        /* 获取类路径 */
        if (protocol.equals("jar") || protocol.equals("zip")) { //class文件是放在jar或zip中的
            spec = spec.substring(spec.indexOf(":") + 1, spec.lastIndexOf("!"));

        } else { //是普通的目录
            spec = spec.substring(0, spec.lastIndexOf(clsRes));
        }

        /* 获取类路径的父目录 */
        if (isGetParent) {
            spec = spec.substring(0, spec.lastIndexOf("/"));
        }

        /* 构造URL并返回 */
        try {
            return new URL(spec);

        } catch (MalformedURLException ex) {
            return null;
        }
    }

    /**
     * 获取必填信息（在字符串后面加一个蓝色的星号）。
     * @param mustInfo 必填信息。
     * @return 加上蓝色星号的必填信息。
     */
    public static String getMustInfo(String mustInfo) {
        return "<html>" + mustInfo + "<font color=\"#0000ff\">*</font>";
    }

    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date());
    }

    /*------------------------------------- Protected Static Method -------------------------------------*/

    /**
     * 采用ResourceBundle机制获取i18n信息。
     * @param i18nKey 国际化信息关键字。
     * @return 国际化信息，如果指定的资源找不到将直接返回i18nKey。
     */
    public static String getI18nMessage(String i18nKey) {
        return getI18nMessage("com.apollo.base.util.resource.Base", i18nKey);
    }

    /**
     * 获取图标。
     * @param iconFilename 图标文件名。
     * @return 图标。
     */
    public static Icon getIcon(String iconFilename) {
        Icon icon = getIcon(BaseUtilities.class, "com/apollo/base/util/resource/icon/", iconFilename);
        return icon;
    }

    /*------------------------------------- Friendly Static Method -------------------------------------*/

    /* Add Friendly Static Method */

    /*------------------------------------- Private Static Method -------------------------------------*/

    /* Add Private Static Method */

    /*------------------------------------- Public Field -------------------------------------*/

    /* Add Public Field */

    /*------------------------------------- Protected Field -------------------------------------*/

    /* Add Protected Field */

    /*------------------------------------- Friendly Field -------------------------------------*/

    /* Add Friendly Field */

    /*------------------------------------- Private Field -------------------------------------*/

    /* Add Private Field */

    /*------------------------------------- Initial Block -------------------------------------*/

    /* Add Initial Block */

    /*------------------------------------- Public Constructor -------------------------------------*/

    /* Add Public Constructor */

    /*------------------------------------- Protected Constructor -------------------------------------*/

    /* Add Protected Constructor */

    /*------------------------------------- Friendly Constructor -------------------------------------*/

    /* Add Friendly Constructor */

    /*------------------------------------- Private Constructor -------------------------------------*/

    /**
     * 构造方法。
     */
    private BaseUtilities() {
        /* 禁止从外部实例化此类 */
    }

    /*------------------------------------- Public Method -------------------------------------*/

    /* Add Public Method */

    /*------------------------------------- Protected Method -------------------------------------*/

    /* Add Protected Method */

    /*------------------------------------- Friendly Method -------------------------------------*/

    /* Add Friendly Method */

    /*------------------------------------- Private Method -------------------------------------*/

    /* Add Private Method */

}
