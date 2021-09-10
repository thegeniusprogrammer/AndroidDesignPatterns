package com.thegeniusprogrammer.androiddesignpatterns.BuilderPattern

class Hamburger private constructor(
    val cheese: Boolean,
    val onions: Boolean,
    val butter: Boolean
) {
     class Builder {
        private var cheese = true
        private var onions = true
        private var butter = true


        fun cheese(value: Boolean) = apply { cheese = value }
        fun onions(value: Boolean) = apply { onions = value }
        fun butter(value: Boolean) = apply { butter = value }

        fun build() = Hamburger(cheese, onions, butter)

    }

}