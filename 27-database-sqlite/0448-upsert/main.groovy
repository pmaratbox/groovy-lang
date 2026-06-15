@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table inv(item text primary key, qty integer)')
def up = c.prepareStatement('insert into inv(item, qty) values(?,?) on conflict(item) do update set qty=qty+excluded.qty')
[['apple', 5], ['apple', 5], ['banana', 3]].each { row ->
    up.setString(1, row[0]); up.setInt(2, row[1]); up.executeUpdate()
}
def rs = c.createStatement().executeQuery('select item,qty from inv order by item')
while (rs.next()) println("${rs.getString(1)} ${rs.getInt(2)}")
