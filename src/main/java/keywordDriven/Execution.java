package keywordDriven;

import java.io.IOException;

public class Execution {
    public static void main(String[] args) throws IOException {

        Eventcase eventcase = new Eventcase();
        //eventcase.FuncCOREEventCase("driverInit");
        //eventcase.FuncCOREEventCase("UIvalidations");

        ExcelReader excelReader = new ExcelReader();
        String[] data = excelReader.getValueByColumn("src/main/resources/data1.xls");
        for (int a = 1; a < data.length; a++) {
            eventcase.FuncCOREEventCase(data[a]);
        }

    }

}
