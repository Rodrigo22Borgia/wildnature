package net.matez.wildnature.data.block_models.plants;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNBlockModel_CloverShort extends WNBlockModel {
    /**
     * Required: @texture, @color
     */
    public WNBlockModel_CloverShort(String name) {
        super(name);
    }

    @Override
    public String getJSON() {
        return """
                {
                  "ambientocclusion": false,
                  "textures": {
                      "0": "%texture%_cable",
                      "1": "%texture%_top",
                      "2": "%texture%_flower_%color%",
                      "particle": "%texture%_top"
                  },
                  "elements": [
                    {
                      "shade": false,
                      "from": [
                        0,
                        3,
                        0
                      ],
                      "to": [
                        16,
                        3,
                        16
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          8,
                          1.5,
                          8
                        ]
                      },
                      "faces": {
                        "east": {
                          "uv": [
                            0,
                            0,
                            16,
                            0
                          ],
                          "texture": "#1"
                        },
                        "up": {
                          "uv": [
                            0,
                            0,
                            16,
                            16
                          ],
                          "rotation": 90,
                          "texture": "#1"
                        },
                        "down": {
                          "uv": [
                            0,
                            0,
                            16,
                            16
                          ],
                          "rotation": 270,
                          "texture": "#1"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        5,
                        0,
                        1
                      ],
                      "to": [
                        5,
                        3,
                        15
                      ],
                      "faces": {
                        "east": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        11,
                        0,
                        1
                      ],
                      "to": [
                        11,
                        3,
                        15
                      ],
                      "faces": {
                        "east": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        1,
                        0,
                        11
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
                          8,
                          1.5,
                          8
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#0"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        1,
                        0,
                        5
                      ],
                      "to": [
                        15,
                        3,
                        5
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          8,
                          1.5,
                          8
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#0"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            14,
                            3
                          ],
                          "texture": "#0"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        3,
                        3,
                        5
                      ],
                      "to": [
                        6,
                        6,
                        5
                      ],
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        4.5,
                        3,
                        3.5
                      ],
                      "to": [
                        4.5,
                        6,
                        6.5
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          20.5,
                          9.5,
                          -10
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        10,
                        3,
                        14
                      ],
                      "to": [
                        13,
                        6,
                        14
                      ],
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        11.5,
                        3,
                        12.5
                      ],
                      "to": [
                        11.5,
                        6,
                        15.5
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          20.5,
                          9.5,
                          -10
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        10,
                        3,
                        4
                      ],
                      "to": [
                        13,
                        6,
                        4
                      ],
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        11.5,
                        3,
                        2.5
                      ],
                      "to": [
                        11.5,
                        6,
                        5.5
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          20.5,
                          9.5,
                          -10
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        2,
                        3,
                        12
                      ],
                      "to": [
                        5,
                        6,
                        12
                      ],
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        3.5,
                        3,
                        10.5
                      ],
                      "to": [
                        3.5,
                        6,
                        13.5
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          20.5,
                          9.5,
                          -10
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        7,
                        3,
                        7
                      ],
                      "to": [
                        10,
                        6,
                        7
                      ],
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        }
                      }
                    },
                    {
                      "shade": false,
                      "from": [
                        8.5,
                        3,
                        5.5
                      ],
                      "to": [
                        8.5,
                        6,
                        8.5
                      ],
                      "rotation": {
                        "angle": 0,
                        "axis": "y",
                        "origin": [
                          20.5,
                          9.5,
                          -10
                        ]
                      },
                      "faces": {
                        "north": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "east": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
                        },
                        "south": {
                          "uv": [
                            0,
                            0,
                            0,
                            3
                          ],
                          "texture": "#2"
                        },
                        "west": {
                          "uv": [
                            0,
                            0,
                            3,
                            3
                          ],
                          "texture": "#2"
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
                      "name": "clover_low",
                      "origin": [
                        8,
                        1.5,
                        8
                      ],
                      "color": 0,
                      "children": [
                        0,
                        1,
                        2,
                        3,
                        4
                      ]
                    },
                    {
                      "name": "flower",
                      "origin": [
                        20.5,
                        9.5,
                        -10
                      ],
                      "color": 0,
                      "children": [
                        5,
                        6
                      ]
                    },
                    {
                      "name": "flower",
                      "origin": [
                        20.5,
                        9.5,
                        -10
                      ],
                      "color": 0,
                      "children": [
                        7,
                        8
                      ]
                    },
                    {
                      "name": "flower",
                      "origin": [
                        20.5,
                        9.5,
                        -10
                      ],
                      "color": 0,
                      "children": [
                        9,
                        10
                      ]
                    },
                    {
                      "name": "flower",
                      "origin": [
                        20.5,
                        9.5,
                        -10
                      ],
                      "color": 0,
                      "children": [
                        11,
                        12
                      ]
                    },
                    {
                      "name": "flower",
                      "origin": [
                        20.5,
                        9.5,
                        -10
                      ],
                      "color": 0,
                      "children": [
                        13,
                        14
                      ]
                    }
                  ]
                }
                """;
    }
}
