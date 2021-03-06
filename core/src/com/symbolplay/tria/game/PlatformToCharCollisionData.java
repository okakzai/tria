package com.symbolplay.tria.game;

import com.badlogic.gdx.math.Vector2;
import com.symbolplay.tria.game.platforms.Platform;

public final class PlatformToCharCollisionData {
    
    public boolean isCollision;
    public final Vector2 collisionPoint;
    public Platform collisionPlatform;
    public boolean isEnabled;
    
    public PlatformToCharCollisionData() {
        collisionPoint = new Vector2();
    }
    
    public void reset() {
        isCollision = false;
    }
}
