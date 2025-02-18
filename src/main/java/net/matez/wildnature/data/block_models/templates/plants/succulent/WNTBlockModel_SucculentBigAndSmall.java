/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.templates.plants.succulent;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNTBlockModel_SucculentBigAndSmall extends WNBlockModel {
    public WNTBlockModel_SucculentBigAndSmall() {
        super("succulent_big_and_small");
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
                			"from": [6.15224, 0.76537, 8],
                			"to": [10.15224, 1.26537, 11],
                			"rotation": {"angle": 22.5, "axis": "z", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 4, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 3], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [10.77164, -1.14805, 3],
                			"to": [13.77164, -0.64805, 6],
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
                			"from": [6.86639, 1.50532, 8.5],
                			"to": [10.36639, 2.00532, 10.5],
                			"rotation": {"angle": 45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3.5, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0.5, 0, 4, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 1, 4, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3.5, 2], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [10.40192, -2.03022, 3.5],
                			"to": [12.90192, -1.53022, 5.5],
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
                			"from": [7.57349, 2.21242, 8.75],
                			"to": [9.57349, 2.71242, 10.25],
                			"rotation": {"angle": 45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0.5, 2, 2], "texture": "#texture"},
                				"down": {"uv": [0, 0, 2, 1.5], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [11.10903, -1.32311, 3.75],
                			"to": [12.10903, -0.82311, 5.25],
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
                			"from": [4.99776, 1.50532, 5.13137],
                			"to": [6.99776, 2.00532, 8.63137],
                			"rotation": {"angle": 45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0.5, 0, 4, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3.5, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 2, 4, 4], "rotation": 270, "texture": "#texture"},
                				"down": {"uv": [0, 0, 3.5, 2], "rotation": 90, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [9.99776, -2.03022, 2.59584],
                			"to": [11.99776, -1.53022, 5.09584],
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
                			"from": [5.24776, 2.21242, 5.92426],
                			"to": [6.74776, 2.71242, 7.92426],
                			"rotation": {"angle": 45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0.5, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 2, 1.5], "rotation": 270, "texture": "#texture"},
                				"down": {"uv": [0, 0, 2, 1.5], "rotation": 90, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [10.24776, -1.32311, 3.38873],
                			"to": [11.74776, -0.82311, 4.38873],
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
                			"from": [2.8007, -1.32311, 8.5],
                			"to": [6.3007, -0.82311, 10.5],
                			"rotation": {"angle": -45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0.5, 0, 4, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3.5, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 1, 4, 3], "rotation": 180, "texture": "#texture"},
                				"down": {"uv": [0, 0, 3.5, 2], "rotation": 180, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [7.33624, 2.21242, 3.5],
                			"to": [9.83624, 2.71242, 5.5],
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
                			"from": [3.5936, -0.616, 8.75],
                			"to": [5.5936, -0.116, 10.25],
                			"rotation": {"angle": -45, "axis": "z", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0.5, 2, 2], "rotation": 180, "texture": "#texture"},
                				"down": {"uv": [0, 0, 2, 1.5], "rotation": 180, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [8.12913, 2.91953, 3.75],
                			"to": [9.12913, 3.41953, 5.25],
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
                			"from": [4.99776, -1.32311, 9.19706],
                			"to": [6.99776, -0.82311, 12.69706],
                			"rotation": {"angle": -45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3.5, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0.5, 0, 4, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 0, 4, 2], "rotation": 90, "texture": "#texture"},
                				"down": {"uv": [0, 0, 3.5, 2], "rotation": 270, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [9.99776, 2.21242, 5.66152],
                			"to": [11.99776, 2.71242, 8.16152],
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
                			"from": [5.24776, -0.616, 9.90416],
                			"to": [6.74776, -0.116, 11.90416],
                			"rotation": {"angle": -45, "axis": "x", "origin": [7.99776, 0.76537, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 1.5, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"south": {"uv": [0.5, 0, 2, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 2, 0.5], "texture": "#texture"},
                				"up": {"uv": [0.5, 0, 2.5, 1.5], "rotation": 90, "texture": "#texture"},
                				"down": {"uv": [0, 0, 2, 1.5], "rotation": 270, "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [10.24776, 2.91953, 6.36863],
                			"to": [11.74776, 3.41953, 7.36863],
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
                			"from": [4.5, -0.76537, 9.34776],
                			"to": [7.5, -0.26537, 13.34776],
                			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 3, 4], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3, 4], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [9.5, 1.14805, 4.72836],
                			"to": [12.5, 1.64805, 7.72836],
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
                			"from": [4.5, 0.76537, 5.34776],
                			"to": [7.5, 1.26537, 9.34776],
                			"rotation": {"angle": 22.5, "axis": "x", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 0, 3, 4], "texture": "#texture"},
                				"down": {"uv": [0, 0, 3, 4], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [9.5, -1.14805, 1.72836],
                			"to": [12.5, -0.64805, 4.72836],
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
                			"from": [2.15224, -0.76537, 8],
                			"to": [6.15224, -0.26537, 11],
                			"rotation": {"angle": -22.5, "axis": "z", "origin": [8, 0.25, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"east": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 0.5], "texture": "#texture"},
                				"west": {"uv": [0, 0, 3, 0.5], "texture": "#texture"},
                				"up": {"uv": [0, 1, 4, 4], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 3], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [7.77164, 1.14805, 3],
                			"to": [10.77164, 1.64805, 6],
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
                			"from": [5.5, 0, 9],
                			"to": [6.5, 3, 10],
                			"faces": {
                				"north": {"uv": [0, 0, 1, 3], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 3], "texture": "#texture"},
                				"south": {"uv": [0, 0, 1, 3], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 3], "texture": "#texture"},
                				"up": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"down": {"uv": [0, 0, 1, 1], "texture": "#texture"}
                			},
                			"shade": false
                		},
                		{
                			"from": [10.75, 0, 4.25],
                			"to": [11.25, 2.25, 4.75],
                			"faces": {
                				"north": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"east": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"south": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"west": {"uv": [0, 0, 0.5, 2.25], "texture": "#texture"},
                				"up": {"uv": [0, 0, 0.5, 0.5], "texture": "#texture"},
                				"down": {"uv": [0, 0, 0.5, 0.5], "texture": "#texture"}
                			}
                		}
                	]
                }
                """;
    }
}
