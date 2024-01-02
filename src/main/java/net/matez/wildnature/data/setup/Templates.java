package net.matez.wildnature.data.setup;

record Templates() {
    protected static final String shaped2 = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                    %s
                    ],
                    "key": {
                        "X": {
                            "item": "%s"
                        },
                        "O": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String string = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                    "X",
                    "O",
                    "/"
                    ],
                    "key": {
                        "X": {
                            "tag": "minecraft:wool"
                        },
                        "O": {
                            "tag": "minecraft:planks"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String boat = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                    "X X",
                    "XXX"
                    ],
                    "key": {
                        "X": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String crossbow = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                    "/I/",
                    "STS",
                    " / "
                    ],
                    "key": {
                        "T": {
                            "item": "minecraft:tripwire_hook"
                        },
                        "S": {
                            "item": "minecraft:string"
                        },
                        "I": {
                            "item": "wildnature:silver_ingot"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String stonecutter = """
                {
                "type": "minecraft:stonecutting",
                "ingredient": {
                    "item": "%s"
                },
                "result": "%s",
                "count": %d
                }
                """;
    protected static final String smelting = """
                {
                    "type": "minecraft:smelting",
                    "ingredient": {
                        "item": "%s"
                    },
                    "result": "%s",
                    "experience": 0.1,
                    "cookingtime": 200
                }
                """;
    protected static final String blasting = """
                {
                    "type": "minecraft:blasting",
                    "ingredient": {
                        "item": "%s"
                    },
                    "result": "%s",
                    "experience": 0.1,
                    "cookingtime": %d
                }
                """;
    protected static final String backpack = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        " # ",
                        "O O",
                        "#O#"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "O": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String twoByTwo = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "##",
                        "##"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String twoByone = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "##"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String threeByThree = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "###",
                        "###",
                        "###"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String stairs = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "#  ",
                        "## ",
                        "###"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String slabs = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "###"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String oneToOne = """
                {
                    "type": "minecraft:crafting_shapeless",
                    "ingredients": [
                        {
                            "item": "%s"
                        }
                    ],
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String smithing = """
                {
                     "type": "minecraft:smithing",
                     "base": {
                         "item": "%s"
                     },
                     "addition": {
                         "item": "%s"
                     },
                     "result": {
                         "item": "%s"
                     }
                 }
                """;
    protected static final String doors = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "##",
                        "##",
                        "##"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String gates = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "/#/",
                        "/#/"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String fences = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "#/#",
                        "#/#"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String trapdoors = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "###",
                        "###"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": %d
                    }
                }
                """;
    protected static final String axe = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "##",
                        "#/",
                        " /"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": 1
                    }
                }
                """;
    protected static final String hoe = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "##",
                        " /",
                        " /"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": 1
                    }
                }
                """;
    protected static final String shovel = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        " # ",
                        " / ",
                        " / "
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": 1
                    }
                }
                """;
    protected static final String pickaxe = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "###",
                        " / ",
                        " / "
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": 1
                    }
                }
                """;
    protected static final String sword = """
                {
                    "type": "minecraft:crafting_shaped",
                    "pattern": [
                        "#",
                        "#",
                        "/"
                    ],
                    "key": {
                        "#": {
                            "item": "%s"
                        },
                        "/": {
                            "item": "minecraft:stick"
                        }
                    },
                    "result": {
                        "item": "%s",
                        "count": 1
                    }
                }
                """;
}
