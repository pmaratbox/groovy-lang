@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table sales(category text, amount integer)')
def ins = c.prepareStatement('insert into sales values(?,?)')
[['a',10],['b',20],['a',30],['b',5],['a',2]].each { row ->
    ins.setString(1, row[0]); ins.setInt(2, row[1]); ins.executeUpdate()
}
def rs = c.createStatement().executeQuery('select category,sum(amount) from sales group by category order by category')
while (rs.next()) println("${rs.getString(1)} ${rs.getInt(2)}")
