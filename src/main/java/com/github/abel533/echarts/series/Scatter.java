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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

/**
 * 散点图、气泡图
 *
 * @author liuzh
 */
public class Scatter extends Series<Scatter> {
    /**
     * 大规模散点图
     */
    private Boolean large;
    /**
     * 大规模阀值，large为true且数据量>largeThreshold才启用大规模模式
     */
    private Long largeThreshold;

    public Scatter() {
        this.type(SeriesType.scatter);
    }

    public Scatter(String name) {
        super(name);
        this.type(SeriesType.scatter);
    }

    public Boolean large() {
        return this.large;
    }

    public Scatter large(Boolean large) {
        this.large = large;
        return this;
    }

    public Long largeThreshold() {
        return this.largeThreshold;
    }

    public Scatter largeThreshold(Long largeThreshold) {
        this.largeThreshold = largeThreshold;
        return this;
    }

    public Boolean getLarge() {
        return large;
    }

    public void setLarge(Boolean large) {
        this.large = large;
    }

    public Long getLargeThreshold() {
        return largeThreshold;
    }

    public void setLargeThreshold(Long largeThreshold) {
        this.largeThreshold = largeThreshold;
    }
}
