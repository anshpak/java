package action;

import entity.Point;
import entity.Segment;

import java.util.ArrayList;

public class SegmentAction {
    public static ArrayList<Point> getIntersectionPoints(ArrayList<Segment> segments) {
        ArrayList<Point> pts = new ArrayList<Point>();
        for (int i = 0; i < segments.size(); i++) {
            for (int j = 0; j < segments.size(); j++) {
                Point tmpPt = getPoint(segments.get(i), segments.get(j));
                if (isInSegment(segments.get(i), tmpPt) && isInSegment(segments.get(j), tmpPt)) {
                    pts.add(tmpPt);
                }
            }
        }
        return pts;
    }

    private static Point getPoint(Segment seg1, Segment seg2) {
        float x1 = seg1.getP1().getX();
        float y1 = seg1.getP1().getY();
        float x2 = seg1.getP2().getX();
        float y2 = seg1.getP2().getY();
        float x3 = seg2.getP1().getX();
        float y3 = seg2.getP1().getY();
        float x4 = seg2.getP2().getX();
        float y4 = seg2.getP2().getY();
        float x = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4));
        float y = ((x1 * y2 - y1 * x2) * (x3 - x4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4));
        return new Point(x, y);
    }

    private static float getDistance(Segment seg) {
        float x1 = seg.getP1().getX();
        float y1 = seg.getP1().getY();
        float x2 = seg.getP2().getX();
        float y2 = seg.getP2().getY();
        return (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private static float getDistance(Point p1, Point p2) {
        float x1 = p1.getX();
        float y1 = p1.getY();
        float x2 = p2.getX();
        float y2 = p2.getY();
        return (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private static boolean isInSegment(Segment seg, Point p) {
        float segDist = getDistance(seg);
        float dist1 = getDistance(seg.getP1(), p);
        float dist2 = getDistance(seg.getP2(), p);
        return segDist == (dist1 + dist2);
    }
}
