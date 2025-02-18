/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.templates.plants;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNTBlockModel_Sapling extends WNBlockModel {
    public WNTBlockModel_Sapling() {
        super("sapling");
    }

    @Override
    public String getJSON() {
        return """
                {
                    "parent": "block/block",
                    "display": {
                      "fixed": {
                        "rotation": [
                          0,
                          90,
                          0
                        ],
                        "translation": [
                          0,
                          0,
                          0
                        ],
                        "scale": [
                          0.25,
                          0.25,
                          0.25
                        ]
                      }
                    },
                    "elements": [
                      {
                        "from": [
                          4,
                          4,
                          4
                        ],
                        "to": [
                          12,
                          12,
                          12
                        ],
                        "faces": {
                          "down": {
                            "uv": [
                              4,
                              4,
                              12,
                              12
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "up": {
                            "uv": [
                              4,
                              4,
                              12,
                              12
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "north": {
                            "uv": [
                              4,
                              4,
                              12,
                              12
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "south": {
                            "uv": [
                              4,
                              4,
                              12,
                              12
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "west": {
                            "uv": [
                              4,
                              4,
                              12,
                              12
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "east": {
                            "uv": [
                              4,
                              4,
                              12,
                              12
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          }
                        }
                      },
                      {
                        "from": [
                          5,
                          3,
                          5
                        ],
                        "to": [
                          11,
                          13,
                          11
                        ],
                        "faces": {
                          "down": {
                            "uv": [
                              5,
                              5,
                              11,
                              11
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "up": {
                            "uv": [
                              5,
                              5,
                              11,
                              11
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "north": {
                            "uv": [
                              5,
                              5,
                              11,
                              11
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "south": {
                            "uv": [
                              5,
                              5,
                              11,
                              11
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "west": {
                            "uv": [
                              5,
                              5,
                              11,
                              11
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          },
                          "east": {
                            "uv": [
                              5,
                              5,
                              11,
                              11
                            ],
                            "texture": "#leaves",
                            "tintindex": 0
                          }
                        }
                      },
                      {
                        "from": [
                          7,
                          0,
                          7
                        ],
                        "to": [
                          9,
                          4,
                          9
                        ],
                        "faces": {
                          "down": {
                            "uv": [
                              7,
                              7,
                              9,
                              9
                            ],
                            "texture": "#log",
                            "cullface": "down"
                          },
                          "up": {
                            "uv": [
                              7,
                              7,
                              9,
                              9
                            ],
                            "texture": "#log"
                          },
                          "north": {
                            "uv": [
                              7,
                              0,
                              9,
                              5
                            ],
                            "texture": "#log"
                          },
                          "south": {
                            "uv": [
                              7,
                              0,
                              9,
                              5
                            ],
                            "texture": "#log"
                          },
                          "west": {
                            "uv": [
                              7,
                              0,
                              9,
                              5
                            ],
                            "texture": "#log"
                          },
                          "east": {
                            "uv": [
                              7,
                              0,
                              9,
                              5
                            ],
                            "texture": "#log"
                          }
                        }
                      }
                    ]
                  }
                  
                """;
    }
}
