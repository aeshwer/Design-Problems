package dmrc.com.sapient.metro.system.helper.api;

import dmrc.com.sapient.metro.system.SmartCard;

import java.util.List;

public class ApiTrigger {
    public static void main(String[] args) {

        // assumed that bean will be created
        //  ApplicationContext context =   new ClassPathContext("Beans.xml");

        try {
            //   TravelDetailsJDBCTemplate travelDetailsJDBCTemplate =    (TravelDetailsJDBCTemplate)context.getBean("TravelDetailsJDBCTemplate");
            dmrc.com.sapient.metro.system.helper.api.TravelDetailsJDBCTemplate travelDetailsJDBCTemplate = null;
            System.out.println("------Records Creation--------");
            // travelDetailsJDBCTemplate.create("","","");


            System.out.println("------Listing Multiple Records--------");
            List<SmartCard> SmCard = travelDetailsJDBCTemplate.listCardDetails();
            for (SmartCard record : SmCard) {
                // System.out.print("ID : " + record.getId() );

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
