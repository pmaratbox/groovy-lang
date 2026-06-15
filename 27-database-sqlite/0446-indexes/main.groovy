@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table products(id integer, sku text, price integer)')
def ins = c.prepareStatement('insert into products values(?,?,?)')
[[1,'A',100],[2,'B',200],[3,'C',300]].each { row ->
    ins.setInt(1, row[0]); ins.setString(2, row[1]); ins.setInt(3, row[2]); ins.executeUpdate()
}
c.createStatement().execute('create index idx_sku on products(sku)')
def ps = c.prepareStatement('select price from products where sku=?')
ps.setString(1, 'B')
def rs = ps.executeQuery()
while (rs.next()) println(rs.getInt(1))
