package net.matez.wildnature.data.block_models.templates.plants.wisteria;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNTBlockModel_WisteriaBottom extends WNBlockModel {
    public WNTBlockModel_WisteriaBottom() {
        super("wisteria_bottom");
    }

    @Override
    public String getJSON() {
        return """
                {
                 	"ambientocclusion": false,
                 	"elements": [
                 		{
                 			"shade": false,
                 			"from": [0, -16, 8],
                 			"to": [16, 0, 8],
                 			"faces": {
                 				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
                 				"east": {"uv": [0, 0, 0, 16], "texture": "#1"},
                 				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
                 				"west": {"uv": [0, 0, 0, 16], "texture": "#1"},
                 				"up": {"uv": [0, 0, 16, 0], "texture": "#1"},
                 				"down": {"uv": [0, 0, 16, 0], "texture": "#1"}
                 			}
                 		},
                 		{
                 			"shade": false,
                 			"from": [8, -16, 0],
                 			"to": [8, 0, 16],
                 			"faces": {
                 				"north": {"uv": [0, 0, 0, 16], "texture": "#2"},
                 				"east": {"uv": [0, 0, 16, 16], "texture": "#2"},
                 				"south": {"uv": [0, 0, 0, 16], "texture": "#2"},
                 				"west": {"uv": [0, 0, 16, 16], "texture": "#2"},
                 				"up": {"uv": [0, 0, 0, 16], "texture": "#2"},
                 				"down": {"uv": [0, 0, 0, 16], "texture": "#2"}
                 			}
                 		},
                 		{
                 			"shade": false,
                 			"from": [0, 0, 8],
                 			"to": [16, 16, 8],
                 			"faces": {
                 				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
                 				"east": {"uv": [0, 0, 0, 16], "texture": "#0"},
                 				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                 				"west": {"uv": [0, 0, 0, 16], "texture": "#0"},
                 				"up": {"uv": [0, 0, 16, 0], "texture": "#0"},
                 				"down": {"uv": [0, 0, 16, 0], "texture": "#0"}
                 			}
                 		},
                 		{
                 			"shade": false,
                 			"from": [8, 0, 0],
                 			"to": [8, 16, 16],
                 			"faces": {
                 				"north": {"uv": [0, 0, 0, 16], "texture": "#3"},
                 				"east": {"uv": [0, 0, 16, 16], "texture": "#3"},
                 				"south": {"uv": [0, 0, 0, 16], "texture": "#3"},
                 				"west": {"uv": [0, 0, 16, 16], "texture": "#3"},
                 				"up": {"uv": [0, 0, 0, 16], "texture": "#3"},
                 				"down": {"uv": [0, 0, 0, 16], "texture": "#3"}
                 			}
                 		}
                 	]
                 }
                """;
    }
}
