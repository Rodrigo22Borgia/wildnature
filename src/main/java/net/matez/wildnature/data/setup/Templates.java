package net.matez.wildnature.data.setup;

record Templates() {
    protected static final String stonecutter = """
                {
                "type": "minecraft:stonecutting",
                "ingredient": {
                    "item": "%s"
                },
                "result": "%s",
                "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
                        "count": %x
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
