package creator;

import action.SegmentAction;
import entity.Point;
import entity.Segment;

import java.util.ArrayList;
import java.util.TreeMap;

public class TreeCreator {
    public static void fillTreeWithAbscissa(TreeMap<Float, Point> tree, ArrayList<Segment> segments) {
        ArrayList<Point> intersPoints;
        intersPoints = SegmentAction.getIntersectionPoints(segments);
        for (Point pt: intersPoints
             ) {
            tree.put(pt.getX(), pt);
        }
    }
}
