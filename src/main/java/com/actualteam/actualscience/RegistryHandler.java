package com.actualteam.actualscience;

import com.actualteam.actualscience.registries.items.PeriodicTableItem;

public class RegistryHandler {
    static void init() {
        initItems();
    }

    static void initItems() {
        PeriodicTableItem.register();
    }
}
