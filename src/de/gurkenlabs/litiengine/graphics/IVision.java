/***************************************************************
 * Copyright (c) 2014 - 2015 , gurkenlabs, All rights reserved *
 ***************************************************************/
package de.gurkenlabs.litiengine.graphics;

import java.awt.Graphics;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

// TODO: Auto-generated Javadoc
/**
 * The Interface IVision.
 */
public interface IVision {

  /**
   * Contains.
   *
   * @param x
   *          the x
   * @param y
   *          the y
   * @return true, if successful
   */
  public boolean contains(int x, int y);

  /**
   * Contains.
   *
   * @param point
   *          the point
   * @return true, if successful
   */
  public boolean contains(Point2D point);

  /**
   * Gets the render vision shape.
   *
   * @return the render vision shape
   */
  public Area getRenderVisionShape();
  
  public void updateVisionShape();
  
  /**
   * Intersects.
   *
   * @param shape
   *          the shape
   * @return true, if successful
   */
  public boolean intersects(Rectangle2D shape);

  /**
   * Render fog of war.
   *
   * @param g
   *          the g
   */
  public void renderFogOfWar(Graphics g);

  /**
   * Render minimap fog of war.
   *
   * @param g
   *          the g
   * @param minimapScale
   *          the minimap scale
   * @param x
   *          the x
   * @param y
   *          the y
   */
  public void renderMinimapFogOfWar(Graphics g, float minimapScale, int x, int y);
}
