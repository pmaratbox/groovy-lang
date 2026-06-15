@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager

def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table t(n integer)')

c.setAutoCommit(false)
def ins = c.prepareStatement('insert into t values(?)')
(1..1000).each { n ->
    ins.setInt(1, n)
    ins.addBatch()
}
ins.executeBatch()
c.commit()
c.setAutoCommit(true)

def rs = c.createStatement().executeQuery('select count(*) from t')
rs.next()
println(rs.getInt(1))
