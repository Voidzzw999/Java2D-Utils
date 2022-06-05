package me.github.2dutilities.pos;

import java.awt.geom.Point2D;
import java.util.Comparator;

/** The Class PointComparator order points
by their distance to the relative point */

public class PointComparator implements Comparator<Point2D> {
    
    private final Point2D relativePoint;

    public PointComparator(final Point2D relativePoint) {
        this.relativePoint = relativePoint;
    }

    @Override
    public int compare(final Point2D p1, final Point2D p2) {
        final double d1 = p1.distance(this.relativePoint);
        final double d2 = p2.distance(this.relativePoint);

        if (d1 < d2) return -1;
        if (d1 > d2) return 1;

        return 0;
    }
}
