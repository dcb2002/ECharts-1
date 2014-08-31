/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.LineStyle;

/**
 * 分隔线
 *
 * @author liuzh
 */
public class SplitLine {
    /**
     * 默认显示，属性show控制显示与否
     */
    private Boolean show;
    /**
     * 小标记是否显示为间隔，默认等于boundaryGap
     */
    private Boolean onGap;
    /**
     * 属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;

    public Boolean show() {
        return this.show;
    }

    public SplitLine show(Boolean show) {
        this.show = show;
        return this;
    }

    public Boolean onGap() {
        return this.onGap;
    }

    public SplitLine onGap(Boolean onGap) {
        this.onGap = onGap;
        return this;
    }

    public SplitLine lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * 属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    public LineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getOnGap() {
        return onGap;
    }

    public void setOnGap(Boolean onGap) {
        this.onGap = onGap;
    }
}
