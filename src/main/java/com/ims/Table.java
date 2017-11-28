package com.ims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kubaw on 28/11/17.
 */
public class Table {
    private final List<Column> columns = new ArrayList<Column>();

    public Table(Column[] columns) {
        this.columns.addAll(Arrays.asList(columns));
    }

    public List<Column> getColumns() {
        return columns;
    }
}
