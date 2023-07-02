/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import Entity.SVgrademodel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;
/**
 *
 * @author AD
 */
public class ThongkeController {
    public void setDatatoChart(int id, JPanel jpnItem){
        GradeController grade = new GradeController();
        List<SVgrademodel>list = grade.Findgrade(id);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(SVgrademodel sv : list){
            dataset.addValue(sv.getDiemtong(), "Sinh viên", sv.getSubject());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bảng điểm sinh viên".toUpperCase(),
                "Tên môn", "Điểm",
                dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
     public void setDatatoChart1(int id, JPanel jpnItem){
        GradeController grade = new GradeController();
        List<SVgrademodel>list = grade.AVGbyclass(id);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(SVgrademodel sv : list){
            dataset.addValue(sv.getDiemTB(), "Sinh viên", sv.getSubject());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bảng điểm trung bình môn của lớp".toUpperCase(),
                "Tên môn", "Điểm",
                dataset, PlotOrientation.VERTICAL, false, true, false);
         ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
}
