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

package com.github.abel533.echarts.data;

/**
 * LineData
 *
 * @author liuzh
 */
public class LineData extends BasicData<LineData> {
    /**
     * 可以通过valueIndex:0指定为横轴特殊点
     */
    private Integer valueIndex;

    public LineData() {
    }

    public LineData(String name, Object value) {
        super(name, value);
    }

    public LineData(String name, Object symbol, Object symbolSize) {
        super(name, symbol, symbolSize);
    }

    public LineData(Object value, Object symbol) {
        super(value, symbol);
    }

    public LineData(Object value, Object symbol, Object symbolSize) {
        super(value, symbol, symbolSize);
    }

    public Integer valueIndex() {
        return this.valueIndex;
    }

    public LineData valueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }

    public Integer getValueIndex() {
        return valueIndex;
    }

    public LineData setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
}
