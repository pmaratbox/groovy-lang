@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
def rs = c.createStatement().executeQuery('select 42')
while (rs.next()) println(rs.getInt(1))
c.close()
