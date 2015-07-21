package dmrc.com.sapient.metro.system.helper.api;

import dmrc.com.sapient.metro.system.SmartCard;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TravelDetailsJDBCTemplate implements TravelDetailsDAO {


    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String Cardname, int Balance, String StartStation, String EndStation, Double Fare) {

    }

    @Override
    public SmartCard getCard(String id) {
        return null;
    }

    @Override
    public List<SmartCard> listCardDetails() {
        return null;
    }


}
