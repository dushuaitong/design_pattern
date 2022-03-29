package com.dst.design.builder.simple;

/**
 * @author dushuaitong
 * @description: 活动demo
 * @date 2022/3/29
 */
public class ActivityDemo {
    private String name;
    private String date;

    private String money;
    private String img;
    private String logo;

    public static class ActivityDemoBuilder {
        private String name;
        private String date;

        private String money;
        private String img;
        private String logo;

        public ActivityDemoBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public ActivityDemoBuilder buildDate(String date) {
            this.date = date;
            return this;
        }

        public ActivityDemoBuilder buildMoney(String money) {
            this.money = money;
            return this;
        }

        public ActivityDemoBuilder buildImg(String img) {
            this.img = img;
            return this;
        }

        public ActivityDemoBuilder buildLogo(String logo) {
            this.logo = logo;
            return this;
        }

        public ActivityDemo build() {
            return new ActivityDemo(this);
        }
    }

    private ActivityDemo(ActivityDemoBuilder activityDemoBuilder) {
        name = activityDemoBuilder.name;
        date = activityDemoBuilder.date;
        money = activityDemoBuilder.money;
        img = activityDemoBuilder.img;
        logo = activityDemoBuilder.logo;
    }
}
