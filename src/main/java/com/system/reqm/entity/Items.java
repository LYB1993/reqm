package com.system.reqm.entity;

import java.util.Date;

public class Items {
        private Integer nItemsId;

        private String cItemsName;

        private Date dItemsCreatetime;

        private Date cItemsEndtime;

        private Integer nTiemsAt;

        private Integer nTimesEt;

        private String cTimesPrincipal;

        public Integer getnItemsId() {
            return nItemsId;
        }

        public void setnItemsId(Integer nItemsId) {
            this.nItemsId = nItemsId;
        }

        public String getcItemsName() {
            return cItemsName;
        }

        public void setcItemsName(String cItemsName) {
            this.cItemsName = cItemsName == null ? null : cItemsName.trim();
        }

        public Date getdItemsCreatetime() {
            return dItemsCreatetime;
        }

        public void setdItemsCreatetime(Date dItemsCreatetime) {
            this.dItemsCreatetime = dItemsCreatetime;
        }

        public Date getcItemsEndtime() {
            return cItemsEndtime;
        }

        public void setcItemsEndtime(Date cItemsEndtime) {
            this.cItemsEndtime = cItemsEndtime;
        }

        public Integer getnTiemsAt() {
            return nTiemsAt;
        }

        public void setnTiemsAt(Integer nTiemsAt) {
            this.nTiemsAt = nTiemsAt;
        }

        public Integer getnTimesEt() {
            return nTimesEt;
        }

        public void setnTimesEt(Integer nTimesEt) {
            this.nTimesEt = nTimesEt;
        }

        public String getcTimesPrincipal() {
            return cTimesPrincipal;
        }

        public void setcTimesPrincipal(String cTimesPrincipal) {
            this.cTimesPrincipal = cTimesPrincipal == null ? null : cTimesPrincipal.trim();
        }
}