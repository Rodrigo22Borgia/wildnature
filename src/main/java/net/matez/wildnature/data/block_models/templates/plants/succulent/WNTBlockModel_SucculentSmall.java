/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.templates.plants.succulent;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNTBlockModel_SucculentSmall extends WNBlockModel {
    public WNTBlockModel_SucculentSmall() {
        super("succulent_small");
    }

    @Override
    public String getJSON() {
        return """
                {
                	"textures": {
                		"particle": "#texture"
                	},
                	"elements": [
                		{
                			"from": [8, 0, 6.5],
                			"to": [11, 0.5, 9.5],
                			"rotation": {"angle": 22.5, "axis": "z", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 3, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3, 3], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [8.2806, 0.0911, 7],
                			"to": [10.7806, 0.5911, 9],
                			"rotation": {"angle": 45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2.5, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0.5, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 0, 3, 2], "texture": "#texture"},
                				"down": {"uv": [0, 0, 2.5, 2], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [8.98771, 0.79821, 7.25],
                			"to": [9.98771, 1.29821, 8.75],
                			"rotation": {"angle": 45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"east": {"uv": [0.5, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 1, 1.5], "texture": "#texture"},
                				"down": {"uv": [0, 0, 1, 1.5], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [6.99776, 0.44466, 5.07071],
                			"to": [8.99776, 0.94466, 7.57071],
                			"rotation": {"angle": 45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0.5, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2.5, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 0, 3, 2], "rotation": 270, "texture": "#texture"},
                				"down": {"uv": [0, 0, 2.5, 2], "rotation": 90, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [7.24776, 1.15176, 5.8636],
                			"to": [8.74776, 1.65176, 6.8636],
                			"rotation": {"angle": 45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0.5, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 1, 1.5], "rotation": 270, "texture": "#texture"},
                				"down": {"uv": [0, 0, 1, 1.5], "rotation": 90, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [5.21492, 0.0911, 7],
                			"to": [7.71492, 0.5911, 9],
                			"rotation": {"angle": -45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0.5, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2.5, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 0, 3, 2], "rotation": 180, "texture": "#texture"},
                				"down": {"uv": [0, 0, 2.5, 2], "rotation": 180, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [6.00781, 0.79821, 7.25],
                			"to": [7.00781, 1.29821, 8.75],
                			"rotation": {"angle": -45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"west": {"uv": [0.5, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 1, 1.5], "rotation": 180, "texture": "#texture"},
                				"down": {"uv": [0, 0, 1, 1.5], "rotation": 180, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [6.99776, -0.26245, 8.1364],
                			"to": [8.99776, 0.23755, 10.6364],
                			"rotation": {"angle": -45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2.5, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0.5, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 0, 3, 2], "rotation": 90, "texture": "#texture"},
                				"down": {"uv": [0, 0, 2.5, 2], "rotation": 270, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [7.24776, 0.44466, 8.8435],
                			"to": [8.74776, 0.94466, 9.8435],
                			"rotation": {"angle": -45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"south": {"uv": [0.5, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 1, 1.5], "rotation": 90, "texture": "#texture"},
                				"down": {"uv": [0, 0, 1, 1.5], "rotation": 270, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [6.5, -0.19134, 7.96194],
                			"to": [9.5, 0.30866, 10.96194],
                			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 3, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3, 3], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [6.5, 0.19134, 4.96194],
                			"to": [9.5, 0.69134, 7.96194],
                			"rotation": {"angle": 22.5, "axis": "x", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 3, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3, 3], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [5, 0, 6.5],
                			"to": [8, 0.5, 9.5],
                			"rotation": {"angle": -22.5, "axis": "z", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 3, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3, 3], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [7.75, 0, 7.75],
                			"to": [8.25, 2.25, 8.25],
                			"faces": {
                				"north": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"east": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"south": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"west": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"up": {"uv": [0, 0, 0.5, 0.5], "texture": "#texture"},
                				"down": {"uv": [0, 0, 0.5, 0.5], "texture": "#texture"}
                			},
                			"shade": false
                		}
                	]
                }
                """;
    }
}
