package com.dst.other;

/**
 * @author dushuaitong
 * @description: 星期枚举 --策略枚举
 * @date 2022/3/30
 */
public enum WeekEnum {
    /**
     * 周一
     */
    MON("周一", 1, WorkTime.FULL),
    /**
     * 周二
     */
    TUE("周二", 2, WorkTime.NOT_FULL),;

    private final String desc;
    private final Integer code;
    private final WorkTime workTime;

    WeekEnum(String desc, Integer code, WorkTime workTime) {
        this.code = code;
        this.desc = desc;
        this.workTime = workTime;
    }

    public Integer getWorkTime2() {
        return this.workTime.getWorkTime();
    }

    enum WorkTime {
        /**
         * 全天工作时长
         */
        FULL {
            @Override
            protected Integer getWorkTime() {
                return 1;
            }
        },
        /**
         * 非全天工作时长
         */
        NOT_FULL {
            @Override
            protected Integer getWorkTime() {
                return 0;
            }
        };

        protected abstract Integer getWorkTime();

    }
}
