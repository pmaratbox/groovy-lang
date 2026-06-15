@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table t(amount integer)')
def ins = c.prepareStatement('insert into t values(?)')
[10, 20, 30, 40, 50].each { amount ->
    ins.setInt(1, amount); ins.executeUpdate()
}
def rs = c.createStatement().executeQuery('select count(*),sum(amount),min(amount),max(amount) from t')
rs.next()
println(rs.getInt(1))
println(rs.getInt(2))
println(rs.getInt(3))
println(rs.getInt(4))
