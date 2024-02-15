import InfosUser.Address;
import InfosUser.AddressSearch;
import Utilities.FilesJson;
import Utilities.AddressRecord;

import java.io.File;

public class TestIntegrationViaCep {
    public static void main(String[] args) {




        try {
            String Search = AddressSearch.Search("02301100");

            Address address = new Address(AddressRecord.GsonAddress(Search));

            System.out.println(address);
            FilesJson filesJson = new FilesJson();
            File file =  filesJson.CreateDiretorio();
            filesJson.ToWrite(file,address);



        }catch (Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
