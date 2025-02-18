package net.matez.wildnature.data.block_models.templates.plants;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNTBlockModel_FloweringCross extends WNBlockModel {
    public WNTBlockModel_FloweringCross() {
        super("flowering_cross");
    }

    @Override
    public String getJSON() {
        return """
                {
                       "ambientocclusion": false,
                       "textures": {
                           "particle": "#particle"
                       },
                       "elements": [
                           {   "from": [ 0.8, 0, 8 ],
                               "to": [ 15.2, 16, 8 ],
                               "rotation": { "origin": [ 8, 8, 8 ], "axis": "y", "angle": 45, "rescale": true },
                               "shade": false,
                               "faces": {
                                   "north": { "uv": [ 0, 0, 16, 16 ], "texture": "#greyscale", "tintindex": 0 },
                                   "south": { "uv": [ 0, 0, 16, 16 ], "texture": "#greyscale", "tintindex": 0 }
                               }
                           },
                           {   "from": [ 8, 0, 0.8 ],
                               "to": [ 8, 16, 15.2 ],
                               "rotation": { "origin": [ 8, 8, 8 ], "axis": "y", "angle": 45, "rescale": true },
                               "shade": false,
                               "faces": {
                                   "west": { "uv": [ 0, 0, 16, 16 ], "texture": "#greyscale", "tintindex": 0 },
                                   "east": { "uv": [ 0, 0, 16, 16 ], "texture": "#greyscale", "tintindex": 0 }
                               }
                           },
                           {   "from": [ 0.8, 0, 8 ],
                               "to": [ 15.2, 16, 8 ],
                               "rotation": { "origin": [ 8, 8, 8 ], "axis": "y", "angle": 45, "rescale": true },
                               "shade": false,
                               "faces": {
                                   "north": { "uv": [ 0, 0, 16, 16 ], "texture": "#colored" },
                                   "south": { "uv": [ 0, 0, 16, 16 ], "texture": "#colored" }
                               }
                           },
                           {   "from": [ 8, 0, 0.8 ],
                               "to": [ 8, 16, 15.2 ],
                               "rotation": { "origin": [ 8, 8, 8 ], "axis": "y", "angle": 45, "rescale": true },
                               "shade": false,
                               "faces": {
                                   "west": { "uv": [ 0, 0, 16, 16 ], "texture": "#colored" },
                                   "east": { "uv": [ 0, 0, 16, 16 ], "texture": "#colored" }
                               }
                           }
                       ]
                   }
                """;
    }
}
