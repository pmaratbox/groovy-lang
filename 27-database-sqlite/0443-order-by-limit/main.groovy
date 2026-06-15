@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table scores(value integer)')
def ins = c.prepareStatement('insert into scores values(?)')
[50, 90, 70, 30, 100, 20].each { v ->
    ins.setInt(1, v); ins.executeUpdate()
}
def rs = c.createStatement().executeQuery('select value from scores order by value desc limit 3')
while (rs.next()) println(rs.getInt(1))
