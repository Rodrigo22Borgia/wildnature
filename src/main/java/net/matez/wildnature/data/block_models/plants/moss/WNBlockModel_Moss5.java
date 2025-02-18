package net.matez.wildnature.data.block_models.plants.moss;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNBlockModel_Moss5 extends WNBlockModel {
    /**
     * Required: texture
     */
    public WNBlockModel_Moss5(String name) {
        super(name);
    }

    @Override
    public String getJSON() {
        return """
                {
                	"textures": {
                		"texture": "%texture%",
                		"particle": "%texture%"
                	},
                	"elements": [
                		{
                			"name": "moss",
                			"from": [2, 0, 2],
                			"to": [14, 1, 14],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 14, 14], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [3, 0, 1],
                			"to": [8, 1, 2],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 7, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [3, 0, 14],
                			"to": [5, 1, 15],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 4, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [1, 0, 8],
                			"to": [2, 1, 11],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 3, 5], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [14, 0, 7],
                			"to": [15, 1, 12],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 3, 7], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [14, 0, 3],
                			"to": [15, 1, 4],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 3, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [1, 0, 3],
                			"to": [2, 1, 4],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 3, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [10, 0, 1],
                			"to": [13, 1, 2],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 5, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		},
                		{
                			"name": "moss",
                			"from": [10, 0, 14],
                			"to": [13, 1, 15],
                			"faces": {
                				"north": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"east": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"south": {"uv": [0, 0, 4, 1], "texture": "#texture"},
                				"west": {"uv": [0, 0, 1, 1], "texture": "#texture"},
                				"up": {"uv": [2, 2, 5, 3], "texture": "#texture"},
                				"down": {"uv": [0, 0, 4, 1], "texture": "#texture"}
                			}
                		}
                	],
                	"groups": [
                		{
                			"name": "moss_1",
                			"origin": [8, 8, 8],
                			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
                		}
                	]
                }
                """;
    }
}
