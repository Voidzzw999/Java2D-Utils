package me.github.2dutilities.geom;

import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.AffineTranform;

public class GeometricUtilities {

    public static double getDeltaX(final double angle, final double delta) {
        return Math.sin(Math.toRadians(angle)) * delta * 100 / 100.0;
    }

    public static double getDeltaY(final double angle, final double delta) {
        return Math.cos(Math.toRadians(angle)) * delta * 100 / 100.0;
    }

    public static Shape translateShape(final Shape shape, final Point2D newLocation) {
        final AffineTranform t = new AffineTranform();

        t.translate(newLocation.getX() - shape.getBounds2D().getX(),
        newLocation.getY() - shape.getBounds2D().getY());

        return t.createTransformedShape(shape);
    }
    public static double normalizeAngle(final double angle) {
        double normalized = angle % 360;

        if (normalized < 0) normalized += 360;

        return normalized;
    }

}