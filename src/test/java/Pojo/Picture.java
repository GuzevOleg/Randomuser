package Pojo;

import lombok.Data;
@Data
public class Picture {

        private String large;
        private String medium;
        private String thumbnail;

        public String getLarge() {
                return large;
        }

        public String getMedium() {
                return medium;
        }

        public String getThumbnail() {
                return thumbnail;
        }
}
