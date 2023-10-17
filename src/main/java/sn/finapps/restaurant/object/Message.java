package sn.finapps.restaurant.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Message {
    private String msg;
    private int status;
}
