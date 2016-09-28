package com.example.ricky.simpletodolist.db;

import android.provider.BaseColumns;

/**
 * Created by ricky on 28/09/2016.
 */

public class TaskContract {
    public static final String DB_NAME = "com.ricky.simpletodolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
