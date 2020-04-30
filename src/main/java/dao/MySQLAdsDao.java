package dao;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import controllers.Config;
import models.Ad;
import models.Ads;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao() {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Ad> all() {
        List<Ad> newList = new ArrayList<>();
        String query = "SELECT * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                newList.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newList;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads(user_id, title, description) VALUES " +
                "(1,'"
                + ad.getTitle()
                + "','"
                + ad.getDescription()
                + "')";

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Test: You made it through the variables and statements: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }

    public static void main(String[] args) throws SQLException {
        Ads adsDao = new MySQLAdsDao();
        Ad test = new Ad(1, "Test Title", "Test Description");
        adsDao.insert(test);
        List<Ad> ads = DaoFactory.getAdsDao().all();
        for (Ad ad : ads) {
            System.out.println(ad);
        }
    }
}
