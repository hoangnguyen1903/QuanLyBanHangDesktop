package gui;

import bus.ThongKe_bus;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

public class DoanhSo_JPanel extends javax.swing.JPanel {

    private final ThongKe_bus tkbus;
    private DefaultTableModel model;
    private BarRenderer renderer;

    /**
     * Creates new form DoanhSo_JPanel
     */
    public DoanhSo_JPanel() {
        initComponents();
        setBounds(0, 0, 1000, 540);
        setVisible(true);
        tkbus = new ThongKe_bus();
        DocDuLieuLenTable();
        charAt();
        
    }

        public void DocDuLieuLenTable(){
        ArrayList<Object[]> ds = tkbus.getListThongKeDoanhSo();
        for(Object[] tk: ds){
//            System.out.println("Thong ke " + tk);
            model.addRow(tk);
        }
    }
        public void charAt(){
            DefaultCategoryDataset barchardata = new DefaultCategoryDataset();
//         barchardata.setValue(20000,"Số", "January");
//         barchardata.setValue(5000,"Amount", "February");
//         barchardata.setValue(10000,"Amount", "March");
//         barchardata.setValue(20000,"Amount", "April");
//         barchardata.setValue(5000,"Amount", "November");
//         barchardata.setValue(10000,"Amount", "October");
            try {
                int countRow = jTable1.getRowCount();
                 renderer = new BarRenderer();
                for(int i=0;i< countRow ;i++){
                    int value = Integer.parseInt(model.getValueAt(i, 2).toString());
                    barchardata.setValue(value, "Số lượng bán", model.getValueAt(i, 0).toString());
                    renderer.setSeriesPaint(i, Color.BLUE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            JFreeChart barchart = ChartFactory.createBarChart("Doanh Số", "Mã Sản Phẩm", "Số lượng bán", barchardata, PlotOrientation.VERTICAL, false, true, false);

            CategoryPlot barchst = barchart.getCategoryPlot();
         barchst.setRangeCrosshairPaint(Color.ORANGE);

         // Customization for BarChart
            CategoryAxis xAxis = barchst.getDomainAxis();
         xAxis.setLowerMargin(0.02);
         xAxis.setUpperMargin(0.02);

            NumberAxis yAxis = (NumberAxis) barchst.getRangeAxis();
         yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

         // Customize bar colors
//            BarRenderer renderer = new BarRenderer();
//         renderer.setSeriesPaint(0, Color.RED);    // January
//         renderer.setSeriesPaint(1, Color.GREEN);  // February
//         renderer.setSeriesPaint(2, Color.BLUE);   // March
//         renderer.setSeriesPaint(3, Color.PINK);   // April
//         renderer.setSeriesPaint(4, Color.YELLOW); // November
//         renderer.setSeriesPaint(5, Color.ORANGE); // October

         // Optional: Use StandardBarPainter to make the bars look smoother
         renderer.setBarPainter(new StandardBarPainter());

         // Set renderer for the plot
         barchst.setRenderer(renderer);

            ChartPanel barPanel = new ChartPanel(barchart);
         paneldoanhso.removeAll();
         paneldoanhso.setLayout(new BorderLayout());
         paneldoanhso.add(barPanel, BorderLayout.CENTER);
         paneldoanhso.validate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        paneldoanhso = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(187, 205, 197));

        jTable1.setModel(model = new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng Bán"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bảng", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paneldoanhsoLayout = new javax.swing.GroupLayout(paneldoanhso);
        paneldoanhso.setLayout(paneldoanhsoLayout);
        paneldoanhsoLayout.setHorizontalGroup(
            paneldoanhsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldoanhsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneldoanhsoLayout.setVerticalGroup(
            paneldoanhsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldoanhsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sơ đồ", paneldoanhso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel paneldoanhso;
    // End of variables declaration//GEN-END:variables
}
