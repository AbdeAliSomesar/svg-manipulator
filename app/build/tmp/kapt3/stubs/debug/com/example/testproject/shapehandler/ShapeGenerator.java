package com.example.testproject.shapehandler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/testproject/shapehandler/ShapeGenerator;", "", "generateShape", "Lcom/example/svgdemo/shapehandler/Shape;", "svg", "", "app_debug"})
public abstract interface ShapeGenerator {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.svgdemo.shapehandler.Shape generateShape(@org.jetbrains.annotations.NotNull()
    java.lang.String svg);
}