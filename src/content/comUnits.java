package idk.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.func.Prov;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
//import mindustry.annotations;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.UnitType;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;


public class EarthUnitTypes{

//L = light, M = medium, H = heavy, C = chasis, W = weapon, A = armoured, ex: MCLWA = medium chasis, light weapon, armoured
//LW = normal cannon, MW = laser cannon, HW = guided missile launcher
//LCLW = machine gun, MCMW = better cannon, HCHW = dual missiles
//units are defined in the order below
//ground
    public static UnitType T34;//, KV2, IS2;//, MCLW, MCLWA, HCLW, HCLWA, LCMW, LCMWA, MCMW, MCMWA, HCMW, HCMWA, LCHW, LCHWA, MCHW, MCHWA, HCHW, HCHWA, lightchasis, mediumchasis, heavychasis,
	//ground better
	//air
	//LF, MF, HF, LB, MB, HB, LS, MS, HS, smallbuilderdrone,
	//core units
	//delta, theta, zeta;

		
	
public static void load() {
        T34 = new TankUnitType("T-34"){{
            hitSize = 12f;
            treadPullOffset = 3;
            speed = 0.75f;
            rotateSpeed = 3.5f;
            health = 850;
            armor = 6f;
            itemCapacity = 0;
            //treadRects = new Rect[]{new Rect(12 - 32f, 7 - 32f, 14, 51)}; idk how to use this
            researchCostMultiplier = 0f;

            weapons.add(new Weapon("T-34-weapon"){{
                layerOffset = 0.0001f;
		damage = 48f;
                reload = 50f;
                shootY = 4.5f;
                recoil = 1f;
                rotate = true;
		
                rotateSpeed = 2.2f;
                mirror = false;
                x = 0f;
                y = -0.75f;
                heatColor = Color.valueOf("f9350f");
                cooldownTime = 30f;

                bullet = new RailBulletType(){{
                    //sprite = "missile-large";
                    lineEffect = Fx.shootBigSmoke;
                    smokeEffect = Fx.shootBigSmoke;
                    shootEffect = Fx.shootBigColor;
			hitColor = Color.valueOf("feb380");
                	hitEffect = endEffect = Fx.hitBulletColor;
                    //width = 5f;
                   // height = 7f;
                 //   lifetime = 40f;
                  length = 100f;
                   // hitSize = 4f;
                   // hitColor = backColor = trailColor = Color.valueOf("feb380");
                   // frontColor = Color.white;
                   // trailWidth = 1.7f;
                   // trailLength = 5;
                    //despawnEffect = hitEffect = Fx.hitBulletColor;
                }};
            }});
        }};


}
}
