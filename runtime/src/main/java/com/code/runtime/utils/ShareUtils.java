package com.code.runtime.utils;

import java.io.Serializable;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.code.runtime.dialog.FullDialog;

public class ShareUtils {

    public static class Plat {

        public static final int WECHART = 0;
    }

    public static class Type {

        public static int IMAGE = 0;
    }

    public static void share(Context context, ShareBean shareBean) {
        if (shareBean == null || !(context instanceof FragmentActivity)) {
            return;
        }
        if (shareBean.plat == Plat.WECHART) {
            FullDialog fullDialog = FullDialog.newIntance(((FragmentActivity) context).getSupportFragmentManager());
        }
    }

    public static class ShareBean implements Serializable {

        public int plat;

        public int type;

        public String title;

        public String content;

        public String imageUrl;

        public String clickUrl;
    }

    public static class Builder {

        private int plat;

        private int type;

        private String title;

        private String content;

        private String imageUrl;

        private String clickUrl;

        public Builder setPlat(int plat) {
            this.plat = plat;
            return this;
        }

        public Builder setType(int type) {
            this.type = type;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setClickUrl(String clickUrl) {
            this.clickUrl = clickUrl;
            return this;
        }

        public ShareBean build() {
            ShareBean shareBean = new ShareBean();
            shareBean.plat = this.plat;
            shareBean.clickUrl = this.clickUrl;
            shareBean.content = this.content;
            shareBean.imageUrl = this.imageUrl;
            shareBean.title = this.title;
            shareBean.type = this.type;
            return shareBean;
        }
    }

    public static interface IShareResult {

        void shareResult(ShareReult shareReult);
    }

    public static class ShareReult {

        public int result;

        public int plat;

        public ShareReult(int result, int plat) {
            this.result = result;
            this.plat = plat;
        }
    }

}