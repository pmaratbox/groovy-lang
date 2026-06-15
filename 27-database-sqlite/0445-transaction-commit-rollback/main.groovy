@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table t(n integer)')

c.setAutoCommit(false)
def ins = c.prepareStatement('insert into t values(?)')
ins.setInt(1, 1); ins.executeUpdate()
ins.setInt(1, 2); ins.executeUpdate()
c.commit()

ins.setInt(1, 3); ins.executeUpdate()
c.rollback()
c.setAutoCommit(true)

def rs = c.createStatement().executeQuery('select n from t order by n')
while (rs.next()) println(rs.getInt(1))
