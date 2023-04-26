package main;

import action.SegmentAction;
import creator.TreeCreator;
import entity.Point;
import entity.Segment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(-3, -1);
        Point pt2 = new Point(2, 4);
        Segment seg1 = new Segment(pt1, pt2);
        Point pt3 = new Point(-3, 3);
        Point pt4 = new Point(1, -1);
        Segment seg2 = new Segment(pt3, pt4);
        Point pt5 = new Point(2, 2);
        Point pt6 = new Point(4, 2);
        Segment seg3 = new Segment(pt5, pt6);
        Point pt7 = new Point(3, 1);
        Point pt8 = new Point(3, 3);
        Segment seg4 = new Segment(pt7, pt8);
        Point pt9 = new Point(1, 5);
        Point pt10 = new Point(6, 0);
        Segment seg5 = new Segment(pt9, pt10);
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(seg1);
        segments.add(seg2);
        segments.add(seg3);
        segments.add(seg4);
        segments.add(seg5);
        TreeMap<Float, Point> points = new TreeMap<Float, Point>();
        TreeCreator.fillTreeWithAbscissa(points, segments);
        System.out.println(points.get(points.firstKey()));
        for(Map.Entry<Float, Point> entry: points.entrySet()) {
            Float k = entry.getKey();
            Point v = entry.getValue();
            System.out.println(k + " => " + v);
        }
    }
}