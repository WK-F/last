/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import java.awt.Color;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.chart.Bar3DChartBuilder;
import net.sf.dynamicreports.report.builder.chart.Pie3DChartBuilder;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.component.FillerBuilder;
import net.sf.dynamicreports.report.builder.component.ImageBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;

/**
 *
 * @author DILSHAN
 */
public class SalesReports extends javax.swing.JFrame {

public int thisYear=Calendar.getInstance().get(Calendar.YEAR);
    /**
     * Creates new form SalesReports
     */
    public SalesReports() {
        initComponents();
       setCombo();
       
       
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sales report of the selected Month : ");

        jLabel2.setText("Sold items details for selected month : ");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 190));

        jLabel3.setText("Current nventory status ");

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        generate1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      generate2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        generate3();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void generate1(){
    String y=(String)jComboBox1.getSelectedItem();
    String m=(String)jComboBox2.getSelectedItem();
    int mm=Integer.parseInt(m);
    String mn="";
    String[] molist={"January","February","March","April","May","June","July","August","September","October","November","December"};
    for(int i=1;i<13;i++){
    if(mm==i){
        mn=molist[i-1];
    }
    
    }
    
    
    String sql1="select of.order_no, cust.Name,op.total from order_ref of, customer cust, order_payments op where of.cust_nic= cust.NIC and of.order_no= op.order_no and MONTH(of.o_date)='"+m+"' and YEAR(of.o_date)='"+y+"'";
//    String sql2="select oi.type,SUM(oi.size) QTY,SUM(oi.item_price) Earning from order_ref of,order_items oi where of.order_no= oi.order_no and MONTH(of.o_date)='"+m+"' and YEAR(of.o_date)='"+y+"'  GROUP BY oi.type";
//       String sql2="select type,SUM(size) QTY,SUM(item_price) Earning from order_items where MONTH(o_date)='"+m+"' and YEAR(o_date)='"+y+"'  GROUP BY type";

// 
    try{
      
       Statement st=javaConnect.ConnectorDB();
       Statement st2=javaConnect.ConnectorDB();
        ResultSet rs=st.executeQuery(sql1);
//        ResultSet rs2=st2.executeQuery(sql2);
        
    JasperReportBuilder report = DynamicReports.report();
    StyleBuilder boldStyle=DynamicReports.stl.style().bold();
            StyleBuilder titleStyle=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER).setFontSize(18);
            StyleBuilder TableHeaderStyle=DynamicReports.stl.style(titleStyle).setBorder(
            
            DynamicReports.stl.pen1Point()
            ).setBackgroundColor(Color.LIGHT_GRAY);
            StyleBuilder boldRight=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.RIGHT).setFontSize(15);
            StyleBuilder boldLeft=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.LEFT).setFontSize(15);
             StyleBuilder boldCenter=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER).setFontSize(15);
            
             StyleBuilder normalRight=DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.RIGHT).setFontSize(13);
            StyleBuilder normalLeft=DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.LEFT).setFontSize(13);

            
            //image
            InputStream stream =Bill.class.getResourceAsStream("/IMG/Sr.png");
            ImageBuilder img=DynamicReports.cmp.image(stream).setFixedDimension(570, 210)
                    .setStyle(DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.CENTER));
            
            
            net.sf.dynamicreports.report.builder.component.TextFieldBuilder<String> title = DynamicReports.cmp.text("For Year : "+y+" Month : "+mn);
            title.setStyle(titleStyle);
            
            report.title(DynamicReports.cmp.horizontalFlowList(img));
            report.title(title);
            report.title(DynamicReports.cmp.text("Processed Orders for "+mn).setStyle(boldLeft));
            
            
            TextColumnBuilder<String> orderColumn=Columns.column("Order No", "order_no",DynamicReports.type.stringType());
            TextColumnBuilder<String> custColumn=Columns.column("Customer", "Name",DynamicReports.type.stringType());
            TextColumnBuilder<Integer> priceColumn=Columns.column("Price(Total)", "total",DynamicReports.type.integerType());
            
            TextColumnBuilder<Integer> rownumCol=Columns.reportRowNumberColumn("  No  ").setFixedColumns(5).setHorizontalAlignment(HorizontalAlignment.CENTER);
            
            report.subtotalsAtSummary(DynamicReports.sbt.sum(priceColumn).setStyle(boldStyle));
            
             report.columns(rownumCol,orderColumn,custColumn,priceColumn);
            
            
            
            report.setColumnTitleStyle(TableHeaderStyle);
            report.setDataSource(rs);
            
            FillerBuilder filler=DynamicReports.cmp.filler().setStyle(DynamicReports.stl.style().setBorder(
            DynamicReports.stl.pen2Point())).setFixedHeight(2);
            
          
            report.highlightDetailEvenRows();
            
            
            
            //report.setTitleOnANewPage(true);
            //report.title(DynamicReports.cmp.horizontalFlowList(img));
           
//            JasperReportBuilder report1 = DynamicReports.report();
//            JasperReportBuilder report2 = DynamicReports.report();
//       InputStream stream1 =Bill.class.getResourceAsStream("/IMG/Sr2.png");
//            ImageBuilder img2=DynamicReports.cmp.image(stream1).setFixedDimension(570, 210)
//                    .setStyle(DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.CENTER));
//            
//            report1.title(DynamicReports.cmp.horizontalFlowList(img2));
//            report1.title(title);
//            report1.title(DynamicReports.cmp.text("Items sold in "+mn).setStyle(boldLeft));
//            TextColumnBuilder<String> TypeColumn=Columns.column("Type", "type",DynamicReports.type.stringType());
//            TextColumnBuilder<Integer> QtyColumn=Columns.column("Qty", "QTY",DynamicReports.type.integerType());
//            TextColumnBuilder<Integer> ipriceColumn=Columns.column("Item Price(Total)", "Earning",DynamicReports.type.integerType());
//            TextColumnBuilder<Integer> rownumCol2=Columns.reportRowNumberColumn("  No  ").setFixedColumns(5).setHorizontalAlignment(HorizontalAlignment.CENTER);
//             report1.subtotalsAtSummary(DynamicReports.sbt.sum(ipriceColumn).setStyle(boldStyle));
//            report1.columns(rownumCol2,TypeColumn,QtyColumn,ipriceColumn);
//            
//            report1.setColumnTitleStyle(TableHeaderStyle);
//            report1.setDataSource(rs2);
//            report1.highlightDetailEvenRows();
            
            
            
//            Bar3DChartBuilder chart=DynamicReports.cht.bar3DChart().setTitle("Item sales for"+mn).setCategory(TypeColumn).addSerie(DynamicReports.cht.serie(ipriceColumn));
//            
//            Bar3DChartBuilder chart2=DynamicReports.cht.bar3DChart().setTitle("Item Quantity for"+mn).setCategory(TypeColumn).addSerie(DynamicReports.cht.serie(QtyColumn));
//            report1.summary(chart);
//           report1.summary(chart2);     
           
             report.show(false);
//             report1.show(false);
    }catch(Exception e){
    
    }
    }
    
    public void generate2(){
    String y=(String)jComboBox1.getSelectedItem();
    String m=(String)jComboBox2.getSelectedItem();
    int mm=Integer.parseInt(m);
    String mn="";
    String[] molist={"January","February","March","April","May","June","July","August","September","October","November","December"};
    for(int i=1;i<13;i++){
    if(mm==i){
        mn=molist[i-1];
    }
    
    }
    
    
//    String sql1="select of.order_no, cust.Name,op.total from order_ref of, customer cust, order_payments op where of.cust_nic= cust.NIC and of.order_no= op.order_no and MONTH(of.o_date)='"+m+"' and YEAR(of.o_date)='"+y+"'";
    String sql2="select oi.type,SUM(oi.size) QTY,SUM(oi.item_price) Earning from order_ref of,order_items oi where of.order_no= oi.order_no and MONTH(of.o_date)='"+m+"' and YEAR(of.o_date)='"+y+"'  GROUP BY oi.type";
//       String sql2="select type,SUM(size) QTY,SUM(item_price) Earning from order_items where MONTH(o_date)='"+m+"' and YEAR(o_date)='"+y+"'  GROUP BY type";

// 
    try{
      
       Statement st=javaConnect.ConnectorDB();
       Statement st2=javaConnect.ConnectorDB();
//        ResultSet rs=st.executeQuery(sql1);
        ResultSet rs2=st2.executeQuery(sql2);
        
//    JasperReportBuilder report = DynamicReports.report();
    StyleBuilder boldStyle=DynamicReports.stl.style().bold();
            StyleBuilder titleStyle=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER).setFontSize(18);
            StyleBuilder TableHeaderStyle=DynamicReports.stl.style(titleStyle).setBorder(
            
            DynamicReports.stl.pen1Point()
            ).setBackgroundColor(Color.LIGHT_GRAY);
            StyleBuilder boldRight=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.RIGHT).setFontSize(15);
            StyleBuilder boldLeft=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.LEFT).setFontSize(15);
             StyleBuilder boldCenter=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER).setFontSize(15);
            
             StyleBuilder normalRight=DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.RIGHT).setFontSize(13);
            StyleBuilder normalLeft=DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.LEFT).setFontSize(13);

            
            //image
//            InputStream stream =Bill.class.getResourceAsStream("/IMG/Sr.png");
//            ImageBuilder img=DynamicReports.cmp.image(stream).setFixedDimension(570, 210)
//                    .setStyle(DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.CENTER));
//            
//            
            net.sf.dynamicreports.report.builder.component.TextFieldBuilder<String> title = DynamicReports.cmp.text("For Year : "+y+" Month : "+mn);
            title.setStyle(titleStyle);
//            
//            report.title(DynamicReports.cmp.horizontalFlowList(img));
//            report.title(title);
//            report.title(DynamicReports.cmp.text("Processed Orders for "+mn).setStyle(boldLeft));
//            
//            
//            TextColumnBuilder<String> orderColumn=Columns.column("Order No", "order_no",DynamicReports.type.stringType());
//            TextColumnBuilder<String> custColumn=Columns.column("Customer", "Name",DynamicReports.type.stringType());
//            TextColumnBuilder<Integer> priceColumn=Columns.column("Price(Total)", "total",DynamicReports.type.integerType());
//            
//            TextColumnBuilder<Integer> rownumCol=Columns.reportRowNumberColumn("  No  ").setFixedColumns(5).setHorizontalAlignment(HorizontalAlignment.CENTER);
//            
//            report.subtotalsAtSummary(DynamicReports.sbt.sum(priceColumn).setStyle(boldStyle));
//            
//             report.columns(rownumCol,orderColumn,custColumn,priceColumn);
//            
//            
//            
//            report.setColumnTitleStyle(TableHeaderStyle);
//            report.setDataSource(rs);
            
//            FillerBuilder filler=DynamicReports.cmp.filler().setStyle(DynamicReports.stl.style().setBorder(
//            DynamicReports.stl.pen2Point())).setFixedHeight(2);
//            
//          
//            report.highlightDetailEvenRows();
            
            
            
            //report.setTitleOnANewPage(true);
            //report.title(DynamicReports.cmp.horizontalFlowList(img));
           
            JasperReportBuilder report1 = DynamicReports.report();
            JasperReportBuilder report2 = DynamicReports.report();
       InputStream stream1 =Bill.class.getResourceAsStream("/IMG/Sr2.png");
            ImageBuilder img2=DynamicReports.cmp.image(stream1).setFixedDimension(570, 210)
                    .setStyle(DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.CENTER));
            
            report1.title(DynamicReports.cmp.horizontalFlowList(img2));
            report1.title(title);
            report1.title(DynamicReports.cmp.text("Items sold in "+mn).setStyle(boldLeft));
            TextColumnBuilder<String> TypeColumn=Columns.column("Type", "type",DynamicReports.type.stringType());
            TextColumnBuilder<Integer> QtyColumn=Columns.column("Qty", "QTY",DynamicReports.type.integerType());
            TextColumnBuilder<Integer> ipriceColumn=Columns.column("Item Price(Total)", "Earning",DynamicReports.type.integerType());
            TextColumnBuilder<Integer> rownumCol2=Columns.reportRowNumberColumn("  No  ").setFixedColumns(5).setHorizontalAlignment(HorizontalAlignment.CENTER);
             report1.subtotalsAtSummary(DynamicReports.sbt.sum(ipriceColumn).setStyle(boldStyle));
            report1.columns(rownumCol2,TypeColumn,QtyColumn,ipriceColumn);
            
            report1.setColumnTitleStyle(TableHeaderStyle);
            report1.setDataSource(rs2);
            report1.highlightDetailEvenRows();
            
            
            
            Bar3DChartBuilder chart=DynamicReports.cht.bar3DChart()
                    .setTitle("Item sales for"+mn).setCategory(TypeColumn).addSerie(DynamicReports.cht.serie(ipriceColumn))
                    .setUseSeriesAsCategory(true);
            
            Bar3DChartBuilder chart2=DynamicReports.cht.bar3DChart()
                    .setTitle("Item Quantity for"+mn).setCategory(TypeColumn).addSerie(DynamicReports.cht.serie(QtyColumn))
                    .setUseSeriesAsCategory(true);;
            report1.summary(chart);
           report1.summary(chart2);     
           
//             report.show(false);
             report1.show(false);
    }catch(Exception e){
    
    }
    }
    
    
    
    
    
     public void generate3(){
    String y=(String)jComboBox1.getSelectedItem();
    String m=(String)jComboBox2.getSelectedItem();
    int mm=Integer.parseInt(m);
    String mn="";
    String[] molist={"January","February","March","April","May","June","July","August","September","October","November","December"};
    for(int i=1;i<13;i++){
    if(mm==i){
        mn=molist[i-1];
    }
    
    }
    
    
  String sql2="SELECT Item_Code,Type,Description,Unit_Price,Qty,Unit_limit from items";
      
 
    try{
      
  
       Statement st2=javaConnect.ConnectorDB();

        ResultSet rs2=st2.executeQuery(sql2);
        
    StyleBuilder boldStyle=DynamicReports.stl.style().bold();
            StyleBuilder titleStyle=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER).setFontSize(18);
            StyleBuilder TableHeaderStyle=DynamicReports.stl.style(titleStyle).setBorder(
            
            DynamicReports.stl.pen1Point()
            ).setBackgroundColor(Color.LIGHT_GRAY);
            StyleBuilder boldRight=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.RIGHT).setFontSize(15);
            StyleBuilder boldLeft=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.LEFT).setFontSize(15);
             StyleBuilder boldCenter=DynamicReports.stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER).setFontSize(15);
            
             StyleBuilder normalRight=DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.RIGHT).setFontSize(13);
            StyleBuilder normalLeft=DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.LEFT).setFontSize(13);
        
            net.sf.dynamicreports.report.builder.component.TextFieldBuilder<String> title = DynamicReports.cmp.text("For Year : "+y+" Month : "+mn);
            title.setStyle(titleStyle);
      
            JasperReportBuilder report1 = DynamicReports.report();
            JasperReportBuilder report2 = DynamicReports.report();
       InputStream stream1 =Bill.class.getResourceAsStream("/IMG/inventoryHeader.png");
            ImageBuilder img2=DynamicReports.cmp.image(stream1).setFixedDimension(570, 210)
                    .setStyle(DynamicReports.stl.style().setHorizontalAlignment(HorizontalAlignment.CENTER));
            
            report1.title(DynamicReports.cmp.horizontalFlowList(img2));
            report1.title(title);
            report1.title(DynamicReports.cmp.text("Items sold in "+mn).setStyle(boldLeft));
            
            TextColumnBuilder<String> codeColumn=Columns.column("Code", "Item_Code",DynamicReports.type.stringType());
            TextColumnBuilder<String> TypeColumn=Columns.column("Type", "Type",DynamicReports.type.stringType());
            TextColumnBuilder<String> descColumn=Columns.column("Desc.", "Description",DynamicReports.type.stringType());
            TextColumnBuilder<Integer> upColumn=Columns.column("Unit Price", "Unit_Price",DynamicReports.type.integerType());
            TextColumnBuilder<Integer> QtyColumn=Columns.column("Qty", "Qty",DynamicReports.type.integerType());
            TextColumnBuilder<Integer> limitColumn=Columns.column("Unit limit", "Unit_limit",DynamicReports.type.integerType());
            
            
            TextColumnBuilder<Integer> rownumCol2=Columns.reportRowNumberColumn("  No  ").setFixedColumns(5).setHorizontalAlignment(HorizontalAlignment.CENTER);
            // report1.subtotalsAtSummary(DynamicReports.sbt.sum(ipriceColumn).setStyle(boldStyle));
            report1.columns(rownumCol2,codeColumn,TypeColumn,descColumn,upColumn,QtyColumn,limitColumn);
            
            report1.setColumnTitleStyle(TableHeaderStyle);
            report1.setDataSource(rs2);
            report1.highlightDetailEvenRows();
            
            
            
            Bar3DChartBuilder chart=DynamicReports.cht.bar3DChart()
                    .setTitle("Item Stock Quantities").setCategory(codeColumn).addSerie(DynamicReports.cht.serie(QtyColumn))
                    .setUseSeriesAsCategory(true);
            
     
            report1.summary(chart);
//           report1.summary(chart2);     
           
//             report.show(false);
             report1.show(false);
    }catch(Exception e){
    
    }
    }
    
    
    
    
    
    
    
    
    
    public void setCombo(){
        System.out.println(thisYear);
        Vector v1 = new Vector();
        for(int ii=thisYear;ii>2009;ii--){
        String  a =Integer.toString(ii);
            
         v1.add(a);
        }
        
         jComboBox1.setModel(new DefaultComboBoxModel(v1));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
