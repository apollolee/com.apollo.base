/*
 * �˴��봴���� 2008-1-29 ����09:59:07��
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
 * <p>�ļ����ƣ�BaseUtilities.java</p>
 * <p>�������������������ࡣ</p>
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
@SuppressWarnings("all")
public class BaseUtilities implements IBaseConstants {

    /*------------------------------------- Public (Static) Inner Class -------------------------------------*/

    /**
     * ���ڰ�װ�ࡣ
     */
    public static class DateWrapper implements Comparable {

        /**
         * ���ڡ�
         */
        protected Date m_date;

        /**
         * ������
         */
        protected String m_description;

        /**
         * ���췽����
         */
        public DateWrapper() {
            this(null);
        }

        /**
         * ���췽����
         * @param date ���ڡ�
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
     * ��������ͼ��
     */
    public static class WorkerView extends JPanel {

        /**
         * ��������ͼ��
         */
        private JComponent m_workerView;

        /**
         * �ȴ���ͼ��
         */
        private JPanel m_waitingView;

        /**
         * ��ǰ��ͼ��
         */
        private JComponent m_current;

        /**
         * ���췽����
         * @param waitingText �ȴ����ı���
         */
        public WorkerView(String waitingText) {
            this(null, waitingText);
        }

        /**
         * ���췽����
         * @param workerView ��������ͼ��
         * @param waitingText �ȴ����ı���
         */
        public WorkerView(JComponent workerView, String waitingText) {
            super(new GridBagLayout());

            m_workerView = workerView;
            m_waitingView = createWaitingView(waitingText);
            m_current = m_workerView == null ? m_waitingView : m_workerView;

            addComponentWithNoSpace(this, m_current, 0, 0, 1, 1, GBC_CENTER);
        }

        /**
         * ���ù�������ͼ��
         * @param workerView ��������ͼ��
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
         * �ı䵽��������ͼ��
         */
        public void changeToWorkerView() {
            if (m_workerView == null) {
                throw new IllegalArgumentException("Worker view is null !");
            }

            changeTo(m_workerView);
        }

        /**
         * �ı䵽�ȴ���ͼ��
         */
        public void changeToWaitingView() {
            if (m_workerView != null) {
                m_waitingView.setPreferredSize(m_workerView.getPreferredSize());
            }

            changeTo(m_waitingView);
        }

        /**
         * �ı䵽��
         * @param view ��ͼ��
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
     * ��ӡUIDefaults��
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
     * �ж��Ƿ���������ʱ�临�Ӷ�O(n)��
     * @param number ���֡�
     * @return ��ʶ�Ƿ���������
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
     * �жϰ�����ϵ��
     * @param values ȫ����
     * @param value �Ӽ���
     * @return Ϊtrue��ʾ������Ϊfalse��ʾ��������
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
     * ����ResourceBundle���ƻ�ȡi18n��Ϣ��
     * @param baseName ��Դ���Ļ������ƣ���һ����ȫ�޶�������
     * @param i18nKey ���ʻ���Ϣ�ؼ��֡�
     * @return ���ʻ���Ϣ�����ָ������Դ�Ҳ�����ֱ�ӷ���i18nKey��
     */
    public static String getI18nMessage(String baseName, String i18nKey) {
        try {
            return ResourceBundle.getBundle(baseName).getString(i18nKey);

        } catch (MissingResourceException ex) { //�Ҳ���ָ������Դ
            return i18nKey;
        }
    }

    /**
     * ������Ϣ��
     * @param msg ��Ϣ��
     */
    public static void echo(String msg) {
        System.out.println(msg);
    }

    /**
     * ��ǰ�߳�˯��ָ��ʱ�䡣
     * @param millis ָ��ʱ�䣨��λ�����룩��
     */
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * ����̨�еȴ����»س���
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
     * �������Լ���
     * @param propertiesFile �����ļ���
     * @return ���Լ���
     * @throws IOException ����������ļ�ʱ����IO����
     */
    public static Properties loadProperties(File propertiesFile) throws IOException {
        Properties properties = new Properties();

        try (FileReader fr = new FileReader(propertiesFile)) {
            properties.load(fr);
        }

        return properties;
    }

    /**
     * �洢���Լ���
     * @param properties ���Լ���
     * @param propertiesFile �����ļ���
     * @throws IOException ���д�����ļ�ʱ����IO����
     */
    public static void storeProperties(Properties properties, File propertiesFile) throws IOException {
        storeProperties(properties, propertiesFile, null);
    }

    /**
     * �洢���Լ���
     * @param properties ���Լ���
     * @param propertiesFile �����ļ���
     * @param comments ע�͡�
     * @throws IOException ���д�����ļ�ʱ����IO����
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
     * ��ȡͼ�ꡣ
     * @param type ͼ���ļ������ࡣ
     * @param baseName ��Դ�������ơ�
     * @param iconFilename ͼ���ļ�����
     * @return ͼ�ꡣ
     */
    public static Icon getIcon(Class type, String baseName, String iconFilename) {
        URL icon = type.getClassLoader().getResource(baseName + iconFilename);
        return icon == null ? null : new ImageIcon(icon);
    }

    /**
     * ���ð�ťͼ�꼯��
     * @param button ��ť��
     * @param defaultIcon ȱʡͼ�ꡣ
     * @param pressedIcon ���µ�ͼ�ꡣ
     * @param rolloverIcon ������ͼ�ꡣ
     */
    public static void setButtonIcons(AbstractButton button, Icon defaultIcon, Icon pressedIcon, Icon rolloverIcon) {
        setButtonIcons(button, defaultIcon, pressedIcon, rolloverIcon, null);
    }

    /**
     * ���ð�ťͼ�꼯��
     * @param button ��ť��
     * @param defaultIcon ȱʡͼ�ꡣ
     * @param pressedIcon ���µ�ͼ�ꡣ
     * @param rolloverIcon ������ͼ�ꡣ
     * @param disabledIcon ��ʹ�ܵ�ͼ�ꡣ
     */
    public static void setButtonIcons(AbstractButton button, Icon defaultIcon, Icon pressedIcon, Icon rolloverIcon, Icon disabledIcon) {
        setButtonIcons(button, defaultIcon, pressedIcon, rolloverIcon, null, null, disabledIcon);
    }

    /**
     * ���ð�ťͼ�꼯��
     * @param button ��ť��
     * @param defaultIcon ȱʡͼ�ꡣ
     * @param pressedIcon ���µ�ͼ�ꡣ
     * @param rolloverIcon ������ͼ�ꡣ
     * @param selectedIcon ѡ�е�ͼ�ꡣ
     * @param rolloverSelectedIcon ����ѡ�е�ͼ�ꡣ
     * @param disabledIcon ��ʹ�ܵ�ͼ�ꡣ
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
     * ����϶�ѡ��
     * @param list �б�
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
     * �Բ����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithNoneFill(JPanel view, JComponent component, int gridy) {
        addComponentWithNoneFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * �Բ����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithNoneFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithNoneFill(view, component, gridx, gridy, GBC_WEST);
    }

    /**
     * �Բ����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithNoneFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithNoneFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * �Բ����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
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
     * �Ժ������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithHorizontalFill(JPanel view, JComponent component, int gridy) {
        addComponentWithHorizontalFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * �Ժ������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithHorizontalFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithHorizontalFill(view, component, gridx, gridy, GBC_WEST);
    }

    /**
     * �Ժ������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithHorizontalFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithHorizontalFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * �Ժ������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
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
     * ���������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithVerticalFill(JPanel view, JComponent component, int gridy) {
        addComponentWithVerticalFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * ���������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithVerticalFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithVerticalFill(view, component, gridx, gridy, GBC_WEST);
    }

    /**
     * ���������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithVerticalFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithVerticalFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * ���������ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
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
     * ��˫�����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithBothFill(JPanel view, JComponent component, int gridy) {
        addComponentWithBothFill(view, component, GBC_RELATIVE, gridy);
    }

    /**
     * ��˫�����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     */
    public static void addComponentWithBothFill(JPanel view, JComponent component, int gridx, int gridy) {
        addComponentWithBothFill(view, component, gridx, gridy, GBC_CENTER);
    }

    /**
     * ��˫�����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
     * @param gridx The initial gridx value.
     * @param gridy The initial gridy value.
     * @param anchor The initial anchor value.
     */
    public static void addComponentWithBothFill(JPanel view, JComponent component, int gridx, int gridy, int anchor) {
        addComponentWithBothFill(view, component, gridx, gridy, 1, 1, anchor);
    }

    /**
     * ��˫�����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
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
     * ���޷�˫�����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
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
     * ���޷����ķ�ʽ��������
     * @param view ��ͼ��
     * @param component �����
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
     * ��������
     * @param view ��ͼ��
     * @param component �����
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
     * ��������
     * @param view ��ͼ��
     * @param component �����
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
     * �����ȴ���ͼ��
     * @param waitingText �ȴ����ı���
     * @return �ȴ���ͼ��
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
     * �����ȴ�ͼƬ��ͼ��
     * @return �ȴ�ͼƬ��ͼ��
     */
    public static JPanel createWaitingImageView() {
        JPanel waitingImageView = new JPanel(new GridBagLayout());
        addComponentWithBothFill(waitingImageView, new JLabel(ICON_WAITING), 0, 0);
        return waitingImageView;
    }

    /**
     * �����ߴ���������
     * @return �ߴ���������
     */
    public static ComponentListener createSizeLimiter() {
        return new ComponentListener() {

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
            }

        };
    }

    /**
     * �Ա������ı�������λ��
     * @param text �ı���
     * @param table ���
     * @param parent �������
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
     * �Ա������ı�������λ��
     * @param text �ı���
     * @param table ���
     * @return ��ʶ�Ƿ�������ָ�����ı���
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
     * �Ա������ı�������λ��ע�⣺�˷���δ���в������ˣ�����ʹ�ã���
     * @param text �ı���
     * @param table ���
     * @param row �С�
     * @param column �С�
     * @return ��ʶ�Ƿ�������ָ�����ı���
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
     * ���ۺ��������ı�������λ��
     * @param text �ı���
     * @param tree ����
     * @param parent �������
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
     * ���ۺ��������ı�������λ��
     * @param text �ı���
     * @param tree ����
     * @return ��ʶ�Ƿ�������ָ�����ı���
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
     * ��ȡ�ڵ㼯��
     * @param node �ڵ㡣
     * @return �ڵ㼯��
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
     * ���ۺ����ڵ�����ı�������λ��
     * @param text �ı���
     * @param tree ����
     * @param nodes �ڵ㼯��
     * @return ��ʶ�Ƿ�������ָ�����ı���
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
     * �����������飬��0��ʼ�������ġ�
     * @param length ���ȡ�
     * @return �������顣
     */
    public static int[] createIntegers(int length) {
        int[] integers = new int[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }

        return integers;
    }

    /**
     * �ÿ�ָ���Ĳ˵���
     * @param menu ָ���Ĳ˵���
     */
    public static void emptyMenu(JMenu menu) {
        menu.removeAll();

        JMenuItem emptyMenuItem = new JMenuItem(I18N_INFO_EMPTYITEM);
        emptyMenuItem.setEnabled(false);

        menu.add(emptyMenuItem);
    }

    /**
     * ��Ӳ˵�����ǰ����пղ˵������Ƴ���
     * @param menu �˵���
     * @param menuItem �˵��
     */
    public static void addMenuItem(JMenu menu, JMenuItem menuItem) {
        if (menu.getItemCount() == 1 && I18N_INFO_EMPTYITEM.equals(menu.getItem(0).getText())) {
            menu.remove(0);
        }

        menu.add(menuItem);
    }

    /**
     * �Ƴ��˵���Ƴ�������˵�Ϊ������ӿղ˵��
     * @param menu �˵���
     * @param menuItem �˵��
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
     * �����˵����
     * @param actions ��������
     * @return �˵����
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
     * ���ö�����
     * @param action ������
     * @param name ���֡�
     */
    public static void setAction(Action action, String name) {
        setAction(action, name, '\0');
    }

    /**
     * ���ö�����
     * @param action ������
     * @param name ���֡�
     * @param mnemonic �������Ƿ���
     */
    public static void setAction(Action action, String name, char mnemonic) {
        setAction(action, name, mnemonic, null);
    }

    /**
     * ���ö�����
     * @param action ������
     * @param icon ͼ�ꡣ
     */
    public static void setAction(Action action, Icon icon) {
        setAction(action, "", icon);
    }

    /**
     * ���ö�����
     * @param action ������
     * @param name ���֡�
     * @param icon ͼ�ꡣ
     */
    public static void setAction(Action action, String name, Icon icon) {
        setAction(action, name, '\0', icon);
    }

    /**
     * ���ö�����
     * @param action ������
     * @param name ���֡�
     * @param mnemonic �������Ƿ���
     * @param icon ͼ�ꡣ
     */
    public static void setAction(Action action, String name, char mnemonic, Icon icon) {
        setAction(action, name, mnemonic, icon, false);
    }

    /**
     * ���ö�����
     * @param action ������
     * @param name ���֡�
     * @param mnemonic �������Ƿ���
     * @param isOpenWindow ��ʶ�Ƿ�Ϊ�򿪴��ڶ�����
     */
    public static void setAction(Action action, String name, char mnemonic, boolean isOpenWindow) {
        setAction(action, name, mnemonic, null, isOpenWindow);
    }

    /**
     * ���ö�����
     * @param action ������
     * @param name ���֡�
     * @param mnemonic �������Ƿ���
     * @param icon ͼ�ꡣ
     * @param isOpenWindow ��ʶ�Ƿ�Ϊ�򿪴��ڶ�����
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
     * ��ȡ���������Ƿ����ı���
     * @param text ָ���ı���
     * @param mnemonic ָ���������Ƿ���
     * @return ���ָ���ı��Ѱ���ָ���������Ƿ��򷵻�ָ���ı��������򽫼���ָ���������Ƿ���׺��
     */
    public static String getMnemonicText(String text, char mnemonic) {
        return getMnemonicText(text, mnemonic, false);
    }

    /**
     * ��ȡ���������Ƿ����ı���
     * @param text ָ���ı���
     * @param mnemonic ָ���������Ƿ���
     * @param isOpenWindow ��ʶ�Ƿ�Ϊ�򿪴��ڶ�����
     * @return ���ָ���ı��Ѱ���ָ���������Ƿ��򷵻�ָ���ı��������򽫼���ָ���������Ƿ���׺��
     */
    public static String getMnemonicText(String text, char mnemonic, boolean isOpenWindow) {
        String openWindowDesc = isOpenWindow ? "..." : "";
        String mnemonicDesc = mnemonic != '\0' && text.indexOf(Character.toUpperCase(mnemonic)) == -1 && text.indexOf(Character.toLowerCase(mnemonic)) == -1 ? "(" + mnemonic + ")" : "";

        return text + mnemonicDesc + openWindowDesc;
    }

    /**
     * ��ȡֻ����ͼ��İ�ť��
     * @param action ������
     * @return ֻ����ͼ��İ�ť��
     */
    public static JButton getIconButton(Action action) {
        JButton btn = new JButton();
        setIconButton(btn, action);

        return btn;
    }

    /**
     * ����ֻ����ͼ��İ�ť��
     * @param btn ֻ����ͼ��İ�ť��
     * @param action ������
     */
    public static void setIconButton(JButton btn, Action action) {
        btn.setAction(action);
        btn.setText(null);
    }

    /**
     * ��ȡѡ��ģ����ѡ�������������
     * @param sm ѡ��ģ�͡�
     * @return ѡ��ģ����ѡ�������������
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
     * ����ѡ��ģ����ѡ�������������
     * @param sm ѡ��ģ�͡�
     * @param selection ѡ��ģ����ѡ�������������
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
     * ��ָ���Ĵ��ھ��С�
     * @param window ָ���Ĵ��ڡ�
     */
    public static void center(Window window) {
        /* ����ָ�����ڷ�����Ļ����ʱ������Ͻ������ */
        Point location = new Point();

        /* ��ȡ��Ļ�ĳߴ��ָ�����ڵĳߴ� */
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = window.getSize();

        /* ����ָ�����ڷ�����Ļ����ʱ������Ͻ������ */
        location.x = screenSize.width / 2 - windowSize.width / 2;
        location.y = screenSize.height / 2 - windowSize.height / 2;

        /* ���x�������Ƿ�Խ�� */
        if (location.x < 0) {
            location.x = 0;
        }

        /* ���y�������Ƿ�Խ�� */
        if (location.y < 0) {
            location.y = 0;
        }

        /* ����ָ�����ڷ�����Ļ����ʱ������Ͻ������ */
        window.setLocation(location);
    }

    /**
     * �Զ�ֹͣ�༭��
     * @param editor �༭����
     * @param editorComponent �༭�������
     * @throws NullPointerException �������Ϊ������׳����쳣��
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
     * ��ȡ������ڵĴ��ڡ�
     * @param component �����
     * @return ���ڡ�
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
     * �����ǰ�߳����¼��ɷ��߳̾�ֱ��ִ��code.run()����������SwingUtilities.invokeLater()��code�����¼�����ִ�С�
     * @param code ��Ҫ���еĴ��롣
     */
    public static void safelyInvokeLater(Runnable code) {
        if (SwingUtilities.isEventDispatchThread()) {
            code.run();

        } else {
            SwingUtilities.invokeLater(code);
        }
    }

    /**
     * �����ǰ�߳����¼��ɷ��߳̾�ֱ��ִ��code.run()����������SwingUtilities.invokeAndWait()��code�����¼�����ִ�С�
     * @param code ��Ҫ���еĴ��롣
     * @throws InvocationTargetException ��������� code ʱ���׳����쳣��
     * @throws InterruptedException ����ȴ��¼�ָ���߳�ִ���ִ�� code.run() ʱ���ж����׳����쳣��
     */
    public static void safelyInvokeAndWait(Runnable code) throws InterruptedException, InvocationTargetException {
        if (SwingUtilities.isEventDispatchThread()) {
            code.run();

        } else {
            SwingUtilities.invokeAndWait(code);
        }
    }

    /**
     * ��ȡָ�����class�ļ����ڵ�λ�á�
     * @param cls Ŀ���ࡣ
     * @return �����ȡ�ɹ��򷵻ض�Ӧ���ļ������ɹ��򷵻�null��
     */
    public static File getClassLocation(Class cls) {
        try {
            return new File(cls.getProtectionDomain().getCodeSource().getLocation().toURI()).getCanonicalFile();

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * ��ȡָ�����class�ļ����ڵ�λ�á�
     * @param cls Ŀ���ࡣ
     * @param isGetParent Ϊtrue���ص���class�ļ�������·���ĸ�Ŀ¼��Ϊfalse��ֱ�ӷ�����·����ע�⣺���class�ļ���jar��zip�н����ص���jar�ļ���zip�ļ���·������
     * @param isRealSpace Ϊtrue��ʹ����ʵ�Ŀո����滻URL�����ת��ո�Ϊfalse��ֱ��ʹ��URL����涨��ת��ո�ע�⣺���URL���ڹ���File���˲�����Ҫ����Ϊtrue����
     * @return ��ʶλ�ã�Ϊnull��ʾtargetClassΪnull����URLʧ���ˡ�
     */
    public static URL getClassLocation(Class cls, boolean isGetParent, boolean isRealSpace) {
        /* Ŀ�����п� */
        if (cls == null) {
            return null;
        }

        /*
         * ע�⣺�������ֱ�ӵ���Class.getProtectionDomain().getCodeSource().getLocation()�������õ�������Ҫ��Location����
                         * ����  �������������2�����Ʋ�̫���㣺
                         * �� �� ��1.�˷�����Ҫ��Ӧ�İ�ȫȨ�ޣ����û�У�����Java��ȫ�쳣�ġ�
                         * �� �� ��2.�˷�����getCodeSource()�ڵ�ClassΪ���������������ʱ�᷵��null����Ȼ���ٻ��õ������⻹�����ǲ�ϣ���ġ�
                         * ����  ��������������ȱ�㣬���ǲ�ʹ�ô˷�������ȡLocation��
         */

        /* ��ȡĿ����class�ļ���URL�����õ������Ϣ */
        String clsName = cls.getName();
        String clsRes = "/" + clsName.replace('.', '/') + ".class";
        URL url = cls.getResource(clsRes);
        String protocol = url.getProtocol();
        String spec = url.toString();

        /* TODO �滻�ո�URL�������ո���"%20"����������URL������File�ཫ�޷��ҵ��ļ��������滻���������ܻ����ƽ̨�����ԡ� */
        if (isRealSpace) {
            spec = spec.replaceAll("%20", " ");
        }

        /* ��ȡ��·�� */
        if (protocol.equals("jar") || protocol.equals("zip")) { //class�ļ��Ƿ���jar��zip�е�
            spec = spec.substring(spec.indexOf(":") + 1, spec.lastIndexOf("!"));

        } else { //����ͨ��Ŀ¼
            spec = spec.substring(0, spec.lastIndexOf(clsRes));
        }

        /* ��ȡ��·���ĸ�Ŀ¼ */
        if (isGetParent) {
            spec = spec.substring(0, spec.lastIndexOf("/"));
        }

        /* ����URL������ */
        try {
            return new URL(spec);

        } catch (MalformedURLException ex) {
            return null;
        }
    }

    /**
     * ��ȡ������Ϣ�����ַ��������һ����ɫ���Ǻţ���
     * @param mustInfo ������Ϣ��
     * @return ������ɫ�Ǻŵı�����Ϣ��
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
     * ����ResourceBundle���ƻ�ȡi18n��Ϣ��
     * @param i18nKey ���ʻ���Ϣ�ؼ��֡�
     * @return ���ʻ���Ϣ�����ָ������Դ�Ҳ�����ֱ�ӷ���i18nKey��
     */
    public static String getI18nMessage(String i18nKey) {
        return getI18nMessage("com.apollo.base.util.resource.Base", i18nKey);
    }

    /**
     * ��ȡͼ�ꡣ
     * @param iconFilename ͼ���ļ�����
     * @return ͼ�ꡣ
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
     * ���췽����
     */
    private BaseUtilities() {
        /* ��ֹ���ⲿʵ�������� */
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
