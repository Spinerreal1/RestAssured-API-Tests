package specifications;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import model.Register;

public class SuccessReg{
    @JsonCreator
    private SuccessReg(@JsonProperty("id") Integer id,
                       @JsonProperty("token") String token) {
        this.id = id;
        this.token = token;
    }
    private Integer id;
    private String token;

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
