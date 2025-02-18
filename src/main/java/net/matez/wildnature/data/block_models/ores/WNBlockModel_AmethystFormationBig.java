/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.ores;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNBlockModel_AmethystFormationBig extends WNBlockModel {
    /**
     * Required: @texture
     */
    public WNBlockModel_AmethystFormationBig(String name) {
        super(name);
    }

    @Override
    public String getJSON() {
        return """
                {
                     "ambientocclusion": false,
                     "texture_size": [
                       32,
                       32
                     ],
                     "textures": {
                       "3": "%texture%_stone_big",
                       "4": "%texture%_crystals_big",
                       "particle": "%texture%_crystals_big"
                     },
                     "elements": [
                       {
                         "from": [
                           4.51656,
                           3.70991,
                           4.5
                         ],
                         "to": [
                           7.51656,
                           12.70991,
                           7.5
                         ],
                         "rotation": {
                           "angle": 22.5,
                           "axis": "z",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               11
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               0,
                               10,
                               1.5,
                               14.5
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               8.5,
                               10,
                               10,
                               14.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               11
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               11,
                               0,
                               12.5,
                               1.5
                             ],
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           2.46282,
                           2.50809,
                           8
                         ],
                         "to": [
                           5.46282,
                           16.50809,
                           11
                         ],
                         "rotation": {
                           "angle": 22.5,
                           "axis": "z",
                           "origin": [
                             7.04761,
                             2.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               7
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               7
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               7
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               13.5,
                               7.5,
                               15,
                               14.5
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               14,
                               0,
                               15.5,
                               1.5
                             ],
                             "rotation": 180,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           6.5,
                           1.57055,
                           10.79496
                         ],
                         "to": [
                           9.5,
                           18.57055,
                           13.79496
                         ],
                         "rotation": {
                           "angle": 22.5,
                           "axis": "x",
                           "origin": [
                             8,
                             10.07055,
                             12.29496
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               8.5
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               8.5
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               6.5,
                               0,
                               8,
                               8.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               8.5
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               14,
                               0,
                               15.5,
                               1.5
                             ],
                             "rotation": 90,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           7,
                           1,
                           5.5
                         ],
                         "to": [
                           10,
                           22,
                           8.5
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "y",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               11,
                               0,
                               12.5,
                               1.5
                             ],
                             "rotation": 90,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           12.40956,
                           0.13297,
                           7
                         ],
                         "to": [
                           15.40956,
                           15.13297,
                           10
                         ],
                         "rotation": {
                           "angle": -22.5,
                           "axis": "z",
                           "origin": [
                             13.90956,
                             6.13297,
                             8
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               13.5,
                               6.5,
                               15,
                               14
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               3,
                               3,
                               4.5,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               7.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               3,
                               0,
                               4.5,
                               7.5
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               14,
                               0,
                               15.5,
                               1.5
                             ],
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           10,
                           0.7933,
                           2.55583
                         ],
                         "to": [
                           13,
                           8.7933,
                           5.55583
                         ],
                         "rotation": {
                           "angle": -45,
                           "axis": "x",
                           "origin": [
                             11.5,
                             4.7933,
                             4.05583
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               8.5,
                               10,
                               10,
                               14
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               8.5,
                               10,
                               10,
                               14
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               13.5,
                               6.5,
                               15,
                               10.5
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               11,
                               0,
                               12.5,
                               1.5
                             ],
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           7.5,
                           2.52854,
                           4.98048
                         ],
                         "to": [
                           9.5,
                           14.52854,
                           6.98048
                         ],
                         "rotation": {
                           "angle": -22.5,
                           "axis": "x",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               0,
                               10,
                               1,
                               16
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               9,
                               10,
                               10,
                               16
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               0,
                               10,
                               1,
                               16
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               9,
                               10,
                               10,
                               16
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               11,
                               0.5,
                               12,
                               1.5
                             ],
                             "rotation": 90,
                             "texture": "#4"
                           },
                           "down": {
                             "uv": [
                               11,
                               0,
                               12,
                               1
                             ],
                             "rotation": 270,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           8,
                           3.97473,
                           10.56293
                         ],
                         "to": [
                           11,
                           14.97473,
                           13.56293
                         ],
                         "rotation": {
                           "angle": 45,
                           "axis": "x",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               12
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               13.5,
                               7.5,
                               15,
                               13
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               12
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               13.5,
                               6.5,
                               15,
                               12
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               14,
                               0,
                               15.5,
                               1.5
                             ],
                             "rotation": 180,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           3.75,
                           2.98085,
                           10.54528
                         ],
                         "to": [
                           6.75,
                           8.98085,
                           13.54528
                         ],
                         "rotation": {
                           "angle": 22.5,
                           "axis": "x",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               13.5,
                               6.5,
                               15,
                               9.5
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               9.5
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               13.5,
                               9.5,
                               15,
                               12.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               12,
                               8,
                               13.5,
                               11
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               8.5,
                               10,
                               10,
                               11.5
                             ],
                             "rotation": 180,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           10,
                           1.86588,
                           8.9497
                         ],
                         "to": [
                           13,
                           6.86588,
                           11.9497
                         ],
                         "rotation": {
                           "angle": 22.5,
                           "axis": "x",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               13.5,
                               6.5,
                               15,
                               9
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               13.5,
                               9.5,
                               15,
                               12
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               9
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               9
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               8.5,
                               10,
                               10,
                               11.5
                             ],
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           6.54295,
                           0.66872,
                           2.03137
                         ],
                         "to": [
                           9.54295,
                           12.66872,
                           5.03137
                         ],
                         "rotation": {
                           "angle": -45,
                           "axis": "x",
                           "origin": [
                             8.04295,
                             3.66872,
                             3.53137
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               12.5
                             ],
                             "texture": "#4"
                           },
                           "east": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               12.5
                             ],
                             "texture": "#4"
                           },
                           "south": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               12.5
                             ],
                             "texture": "#4"
                           },
                           "west": {
                             "uv": [
                               12,
                               6.5,
                               13.5,
                               12.5
                             ],
                             "texture": "#4"
                           },
                           "up": {
                             "uv": [
                               11,
                               0,
                               12.5,
                               1.5
                             ],
                             "rotation": 90,
                             "texture": "#4"
                           }
                         }
                       },
                       {
                         "from": [
                           3,
                           0,
                           12
                         ],
                         "to": [
                           7,
                           1,
                           15
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "x",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               2.5,
                               2.5,
                               4.5,
                               3
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               4.5,
                               5.5,
                               6,
                               6
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               5.5,
                               4,
                               7.5,
                               4.5
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3.5,
                               3.5,
                               5,
                               4
                             ],
                             "rotation": 180,
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               3,
                               0.5,
                               4.5,
                               2.5
                             ],
                             "rotation": 90,
                             "texture": "#3"
                           }
                         }
                       },
                       {
                         "from": [
                           7,
                           0,
                           12
                         ],
                         "to": [
                           13,
                           3,
                           14
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "y",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               2.5,
                               2.5,
                               5.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               7.5,
                               2.5,
                               6.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               4.5,
                               2.5,
                               7.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3.5,
                               3.5,
                               4.5,
                               5
                             ],
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               2.5,
                               1,
                               5.5,
                               2
                             ],
                             "texture": "#3"
                           }
                         }
                       },
                       {
                         "from": [
                           6,
                           0,
                           5
                         ],
                         "to": [
                           12,
                           3,
                           12
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "y",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               2.5,
                               2.5,
                               5.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               2.5,
                               2.5,
                               6,
                               4
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               4,
                               2.5,
                               7,
                               4
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3.5,
                               3.5,
                               7,
                               5
                             ],
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               2.5,
                               1,
                               5.5,
                               4.5
                             ],
                             "texture": "#3"
                           }
                         }
                       },
                       {
                         "from": [
                           12,
                           0,
                           5
                         ],
                         "to": [
                           15,
                           3,
                           11
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "y",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               5,
                               2.5,
                               6.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               2.5,
                               2,
                               5.5,
                               3.5
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               4.5,
                               3.5,
                               6,
                               5
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3.5,
                               3.5,
                               6.5,
                               5
                             ],
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               2.5,
                               1,
                               5.5,
                               2.5
                             ],
                             "rotation": 90,
                             "texture": "#3"
                           }
                         }
                       },
                       {
                         "from": [
                           6,
                           0,
                           2
                         ],
                         "to": [
                           12,
                           3,
                           5
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "x",
                           "origin": [
                             10,
                             1.5,
                             3.5
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               3.5,
                               2,
                               6.5,
                               3.5
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               2.5,
                               1.5,
                               4,
                               3
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               4,
                               2.5,
                               7,
                               4
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3.5,
                               3.5,
                               5,
                               5
                             ],
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               3,
                               1.5,
                               6,
                               3
                             ],
                             "texture": "#3"
                           }
                         }
                       },
                       {
                         "from": [
                           0,
                           0,
                           6
                         ],
                         "to": [
                           4,
                           2,
                           12
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "y",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               2.5,
                               2.5,
                               4.5,
                               3.5
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               4,
                               4.5,
                               7,
                               5.5
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               5.5,
                               3,
                               7.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3,
                               2.5,
                               6,
                               3.5
                             ],
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               3.5,
                               0,
                               5.5,
                               3
                             ],
                             "texture": "#3"
                           }
                         }
                       },
                       {
                         "from": [
                           4,
                           0,
                           3
                         ],
                         "to": [
                           6,
                           3,
                           12
                         ],
                         "rotation": {
                           "angle": 0,
                           "axis": "y",
                           "origin": [
                             8.04761,
                             3.57299,
                             8.12312
                           ]
                         },
                         "faces": {
                           "north": {
                             "uv": [
                               6.5,
                               2.5,
                               7.5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "east": {
                             "uv": [
                               4,
                               4,
                               8.5,
                               5.5
                             ],
                             "texture": "#3"
                           },
                           "south": {
                             "uv": [
                               4,
                               2.5,
                               5,
                               4
                             ],
                             "texture": "#3"
                           },
                           "west": {
                             "uv": [
                               3.5,
                               2,
                               8,
                               3.5
                             ],
                             "texture": "#3"
                           },
                           "up": {
                             "uv": [
                               2.5,
                               0.5,
                               7,
                               1.5
                             ],
                             "rotation": 90,
                             "texture": "#3"
                           }
                         }
                       }
                     ],
                     "display": {
                       "thirdperson_righthand": {
                         "rotation": [
                           75,
                           45,
                           0
                         ],
                         "translation": [
                           0,
                           2.5,
                           0
                         ],
                         "scale": [
                           0.375,
                           0.375,
                           0.375
                         ]
                       },
                       "thirdperson_lefthand": {
                         "rotation": [
                           75,
                           45,
                           0
                         ],
                         "translation": [
                           0,
                           2.5,
                           0
                         ],
                         "scale": [
                           0.375,
                           0.375,
                           0.375
                         ]
                       },
                       "firstperson_righthand": {
                         "rotation": [
                           0,
                           45,
                           0
                         ],
                         "scale": [
                           0.4,
                           0.4,
                           0.4
                         ]
                       },
                       "firstperson_lefthand": {
                         "rotation": [
                           0,
                           225,
                           0
                         ],
                         "scale": [
                           0.4,
                           0.4,
                           0.4
                         ]
                       },
                       "ground": {
                         "translation": [
                           0,
                           3,
                           0
                         ],
                         "scale": [
                           0.25,
                           0.25,
                           0.25
                         ]
                       },
                       "gui": {
                         "rotation": [
                           30,
                           225,
                           0
                         ],
                         "scale": [
                           0.625,
                           0.625,
                           0.625
                         ]
                       },
                       "head": {
                         "translation": [
                           0,
                           13.25,
                           0
                         ]
                       },
                       "fixed": {
                         "scale": [
                           0.5,
                           0.5,
                           0.5
                         ]
                       }
                     },
                     "groups": [
                       {
                         "name": "Amethyst biggus dickus",
                         "origin": [
                           8,
                           8,
                           8
                         ],
                         "color": 0,
                         "children": [
                           {
                             "name": "Crystals",
                             "origin": [
                               6.75,
                               3,
                               5.4375
                             ],
                             "color": 0,
                             "children": [
                               0,
                               1,
                               2,
                               3,
                               4,
                               5,
                               6,
                               7,
                               8,
                               9,
                               10
                             ]
                           },
                           {
                             "name": "Stone",
                             "origin": [
                               8,
                               8,
                               8
                             ],
                             "color": 0,
                             "children": [
                               11,
                               12,
                               13,
                               14,
                               15,
                               16,
                               17
                             ]
                           }
                         ]
                       }
                     ]
                   }
                """;
    }
}
