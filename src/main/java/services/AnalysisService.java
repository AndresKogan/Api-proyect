package services;


import api.model.Analysis;
import api.model.UserCreated;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AnalysisService extends MethodsService {

            public static Response post(String jsonName) {        return post(jsonName, Analysis.class);
        }

    }




