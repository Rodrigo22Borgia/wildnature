/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.plants;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNBlockModel_WaterPoppyFlowering extends WNBlockModel {
    /**
     * Required: texture
     */
    public WNBlockModel_WaterPoppyFlowering(String name) {
        super(name);
    }

    @Override
    public String getJSON() {
        return """
                {
                   	"textures": {
                   		"2": "%texture%_pad",
                   		"3": "%texture%_roots",
                   		"4": "%texture%_pedal",
                   		"particle": "%texture%_pedal"
                   	},
                   	"elements": [
                   		{
                   			"from": [0, 0, 0],
                   			"to": [16, 0, 16],
                   			"faces": {
                   				"north": {"uv": [0, 0, 16, 0], "texture": "#2"},
                   				"east": {"uv": [0, 0, 16, 0], "texture": "#2"},
                   				"south": {"uv": [0, 0, 16, 0], "texture": "#2"},
                   				"west": {"uv": [0, 0, 16, 0], "texture": "#2"},
                   				"up": {"uv": [0, 0, 16, 16], "texture": "#2"},
                   				"down": {"uv": [0, 0, 16, 16], "texture": "#2"}
                   			}
                   		},
                   		{
                   			"from": [0, -14, 8],
                   			"to": [16, 2, 8],
                   			"faces": {
                   				"north": {"uv": [0, 0, 16, 16], "texture": "#3"},
                   				"east": {"uv": [0, 0, 0, 16], "texture": "#3"},
                   				"south": {"uv": [0, 0, 16, 16], "texture": "#3"},
                   				"west": {"uv": [0, 0, 0, 16], "texture": "#3"},
                   				"up": {"uv": [0, 0, 16, 0], "texture": "#3"},
                   				"down": {"uv": [0, 0, 16, 0], "texture": "#3"}
                   			}
                   		},
                   		{
                   			"from": [8, -14, 0],
                   			"to": [8, 2, 16],
                   			"faces": {
                   				"north": {"uv": [0, 0, 0, 16], "texture": "#3"},
                   				"east": {"uv": [0, 0, 16, 16], "texture": "#3"},
                   				"south": {"uv": [0, 0, 0, 16], "texture": "#3"},
                   				"west": {"uv": [0, 0, 16, 16], "texture": "#3"},
                   				"up": {"uv": [0, 0, 0, 16], "texture": "#3"},
                   				"down": {"uv": [0, 0, 0, 16], "texture": "#3"}
                   			}
                   		},
                   		{
                   			"from": [0, 0.09285, -7.61521],
                   			"to": [16, 0.09285, 8.38479],
                   			"rotation": {"angle": 22.5, "axis": "x", "origin": [8, 0, 8]},
                   			"faces": {
                   				"north": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"east": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"south": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"west": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"up": {"uv": [0, 0, 16, 16], "texture": "#4"},
                   				"down": {"uv": [0, 0, 16, 16], "rotation": 180, "texture": "#4"}
                   			}
                   		},
                   		{
                   			"from": [0, 0.09285, 7.61521],
                   			"to": [16, 0.09285, 23.61521],
                   			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 0, 8]},
                   			"faces": {
                   				"north": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"east": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"south": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"west": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"up": {"uv": [0, 0, 16, 16], "rotation": 180, "texture": "#4"},
                   				"down": {"uv": [0, 0, 16, 16], "texture": "#4"}
                   			}
                   		},
                   		{
                   			"from": [7.61521, 0.09285, 0],
                   			"to": [23.61521, 0.09285, 16],
                   			"rotation": {"angle": 22.5, "axis": "z", "origin": [8, 0, 8]},
                   			"faces": {
                   				"north": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"east": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"south": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"west": {"uv": [0, 0, 16, 0], "texture": "#4"},
                   				"up": {"uv": [0, 0, 16, 16], "rotation": 90, "texture": "#4"},
                   				"down": {"uv": [0, 0, 16, 16], "rotation": 90, "texture": "#4"}
                   			}
                   		}
                   	]
                   }
                """;
    }
}
