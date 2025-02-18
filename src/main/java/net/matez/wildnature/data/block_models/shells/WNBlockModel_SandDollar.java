/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.shells;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNBlockModel_SandDollar extends WNBlockModel {
    /**
     * Required: @texture
     */
    public WNBlockModel_SandDollar(String name) {
        super(name);
    }

    @Override
    public String getJSON() {
        return """
                {
                    	"textures": {
                    		"2": "%texture%",
                    		"particle": "%texture%"
                    	},
                    	"elements": [
                    		{
                    			"name": "sanddollar_1",
                    			"from": [9, 0, 3],
                    			"to": [12, 1, 4],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [9, 3, 12, 4], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [9, 0, 6],
                    			"to": [12, 1, 7],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [9, 6, 12, 7], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [9, 0, 9],
                    			"to": [12, 1, 10],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [9, 9, 12, 10], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [7, 0, 7],
                    			"to": [10, 1, 8],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [7, 7, 10, 8], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [11, 0, 7],
                    			"to": [14, 1, 8],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [11, 7, 14, 8], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [8, 0, 4],
                    			"to": [13, 1, 5],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [8, 4, 13, 5], "texture": "#2"},
                    				"down": {"uv": [0, 0, 5, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [7, 0, 5],
                    			"to": [14, 1, 6],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [7, 5, 14, 6], "texture": "#2"},
                    				"down": {"uv": [0, 0, 7, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [7, 0, 6],
                    			"to": [8, 1, 7],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [7, 6, 8, 7], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [8, 0, 8],
                    			"to": [9, 1, 9],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [8, 8, 9, 9], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [12, 0, 8],
                    			"to": [13, 1, 9],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [12, 8, 13, 9], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [10, 0, 8],
                    			"to": [11, 1, 9],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [10, 8, 11, 9], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_1",
                    			"from": [13, 0, 6],
                    			"to": [14, 1, 7],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [13, 6, 14, 7], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [3, 0, 9],
                    			"to": [6, 1, 10],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [3, 9, 6, 10], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [3, 0, 13],
                    			"to": [6, 1, 14],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [3, 13, 6, 14], "texture": "#2"},
                    				"down": {"uv": [0, 0, 3, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [2, 0, 11],
                    			"to": [4, 1, 12],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [2, 11, 4, 12], "texture": "#2"},
                    				"down": {"uv": [0, 0, 2, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [5, 0, 11],
                    			"to": [7, 1, 12],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [5, 11, 7, 12], "texture": "#2"},
                    				"down": {"uv": [0, 0, 2, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [6, 0, 12],
                    			"to": [7, 1, 13],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [6, 12, 7, 13], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [4, 0, 12],
                    			"to": [5, 1, 13],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [4, 12, 5, 13], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [2, 0, 12],
                    			"to": [3, 1, 13],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [2, 12, 3, 13], "texture": "#2"},
                    				"down": {"uv": [0, 0, 1, 1], "texture": "#2"}
                    			}
                    		},
                    		{
                    			"name": "sanddollar_2",
                    			"from": [2, 0, 10],
                    			"to": [7, 1, 11],
                    			"faces": {
                    				"north": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"east": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"south": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"west": {"uv": [8, 4, 9, 5], "texture": "#2"},
                    				"up": {"uv": [2, 10, 7, 11], "texture": "#2"},
                    				"down": {"uv": [0, 0, 5, 1], "texture": "#2"}
                    			}
                    		}
                    	],
                    	"groups": [
                    		{
                    			"name": "shell_1",
                    			"origin": [8, 8, 8],
                    			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
                    		},
                    		{
                    			"name": "shell_2",
                    			"origin": [8, 8, 8],
                    			"children": [12, 13, 14, 15, 16, 17, 18, 19]
                    		}
                    	]
                    }
                """;
    }
}
