package IE.walkmate.AM3Dementia.Sql;

import android.provider.BaseColumns;





public class DatabaseContract {



    private DatabaseContract(){
    }

    public static class Database implements BaseColumns {

        //TABLE NAMES (there are 2 tables).
        public static final String DAYS_TABLE_NAME = "days_table";
        public static final String STATES_TABLE_NAME = "states_table";

        //SHARED COLUMNS, name of COLUMNS
        public static final String STATE_ID = "state_id";

        //DAYS TABLE, name of COLUMNS
        public static final String DAY_ID = "day_id";
        public static final String DAY = "day";
        public static String COMMENT = "comment";

        //STATE TABLE, name of COLUMNS
        public static final String STATE = "state";

    }
}

