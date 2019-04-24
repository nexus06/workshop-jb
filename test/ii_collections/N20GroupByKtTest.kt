package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.shop
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N20GroupByKtTest {
    @Test
    fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }

    @Test
    fun testGroupByFirstStringList() {
        val listStr = listOf("aa", "ab", "bc")
        val groupBy = listStr.groupBy { it.first()}
        println(groupBy)
    }
}
