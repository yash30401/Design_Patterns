package SOLID_Principles

fun main(){



}

//Here We Can see that we Did not add savedtofile in invoice and create and interface and implement it.

interface InvoiceIn{
    fun save(invoice: Invoice)
}

class InvoiceSaveToDatabse:InvoiceIn{
    override fun save(invoice: Invoice) {
        println(invoice.marker.name+" Saved in DB")
    }

}

class InvoiceSavedToFile:InvoiceIn{
    override fun save(invoice: Invoice) {
        println(invoice.marker.name+" Saved To File")
    }

}