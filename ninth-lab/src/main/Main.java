package main;

import action.SegmentAction;
import entity.Point;
import entity.Segment;

public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(0, 2);
        Point pt2 = new Point(3, -1);
        Segment seg1 = new Segment(pt1, pt2);
        Point pt3 = new Point(2, 0);
        Point pt4 = new Point(5, 0);
        Segment seg2 = new Segment(pt3, pt4);
        // Point pt5 = SegmentAction.getPoint(seg1, seg2);
        // System.out.print(pt5);
        // System.out.print(SegmentAction.isInSegment(seg1, pt3));
    }
}