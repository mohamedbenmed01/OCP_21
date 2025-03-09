package chapiter07;

public enum SeasonWithTimes {
    AUTUMN {
        @Override
        public String getHours() {
            return "10am-3pm";
        }
    },
    SPRING {
        @Override
        public String getHours() {
            return "9am-5pm";
        }
    },
    SUMMER {
        @Override
        public String getHours() {
            return "9am-7pm";
        }
    },
    WINTER {
        @Override
        public String getHours() {
            return "9am-5pm";
        }
    };
    public abstract String getHours();
}
