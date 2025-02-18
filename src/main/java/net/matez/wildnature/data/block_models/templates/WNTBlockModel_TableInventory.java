/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.block_models.templates;

import net.matez.wildnature.data.setup.base.WNBlockModel;


public class WNTBlockModel_TableInventory extends WNBlockModel {
    public WNTBlockModel_TableInventory() {
        super("table_inventory");
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
                          "from": [
                            0,
                            0,
                            0
                          ],
                          "to": [
                            2,
                            13,
                            2
                          ],
                          "rotation": {
                            "angle": 0,
                            "axis": "y",
                            "origin": [
                              1,
                              6.5,
                              1
                            ]
                          },
                          "faces": {
                            "north": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "east": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "south": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "west": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "down": {
                              "uv": [
                                0,
                                0,
                                2,
                                2
                              ],
                              "texture": "#texture"
                            }
                          }
                        },
                        {
                          "from": [
                            14,
                            0,
                            0
                          ],
                          "to": [
                            16,
                            13,
                            2
                          ],
                          "rotation": {
                            "angle": 0,
                            "axis": "y",
                            "origin": [
                              1,
                              6.5,
                              1
                            ]
                          },
                          "faces": {
                            "north": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "east": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "south": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "west": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "down": {
                              "uv": [
                                0,
                                0,
                                2,
                                2
                              ],
                              "texture": "#texture"
                            }
                          }
                        },
                        {
                          "from": [
                            14,
                            0,
                            14
                          ],
                          "to": [
                            16,
                            13,
                            16
                          ],
                          "rotation": {
                            "angle": 0,
                            "axis": "y",
                            "origin": [
                              1,
                              6.5,
                              1
                            ]
                          },
                          "faces": {
                            "north": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "east": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "south": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "west": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "down": {
                              "uv": [
                                0,
                                0,
                                2,
                                2
                              ],
                              "texture": "#texture"
                            }
                          }
                        },
                        {
                          "from": [
                            0,
                            0,
                            14
                          ],
                          "to": [
                            2,
                            13,
                            16
                          ],
                          "rotation": {
                            "angle": 0,
                            "axis": "y",
                            "origin": [
                              1,
                              6.5,
                              1
                            ]
                          },
                          "faces": {
                            "north": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "east": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "south": {
                              "uv": [
                                0,
                                3,
                                2,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "west": {
                              "uv": [
                                14,
                                3,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "down": {
                              "uv": [
                                0,
                                0,
                                2,
                                2
                              ],
                              "texture": "#texture"
                            }
                          }
                        },
                        {
                          "from": [
                            0,
                            13,
                            0
                          ],
                          "to": [
                            16,
                            16,
                            16
                          ],
                          "faces": {
                            "north": {
                              "uv": [
                                12,
                                0,
                                15,
                                16
                              ],
                              "rotation": 90,
                              "texture": "#texture"
                            },
                            "east": {
                              "uv": [
                                13,
                                0,
                                16,
                                16
                              ],
                              "rotation": 90,
                              "texture": "#texture"
                            },
                            "south": {
                              "uv": [
                                13,
                                0,
                                16,
                                16
                              ],
                              "rotation": 90,
                              "texture": "#texture"
                            },
                            "west": {
                              "uv": [
                                3,
                                0,
                                0,
                                16
                              ],
                              "rotation": 90,
                              "texture": "#texture"
                            },
                            "up": {
                              "uv": [
                                0,
                                0,
                                16,
                                16
                              ],
                              "texture": "#texture"
                            },
                            "down": {
                              "uv": [
                                0,
                                0,
                                16,
                                16
                              ],
                              "texture": "#texture"
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
                      }
                    }
                """;
    }
}
