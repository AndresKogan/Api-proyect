package services;

import api.model.Id;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class IdService extends MethodsService {
    public static Response get(String getId) {

        return get(getId, Id.class);
    }




}
