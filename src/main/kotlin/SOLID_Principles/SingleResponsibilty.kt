package SOLID_Principles

fun main(){

    val marker=Marker("Marker","Red",2,10)
    val invoice=Invoice(marker)
    invoice.DisplayTotalPrice()


    val invoiceDao=InvoiceDao(invoice,InvoiceSavedToFile())
    invoiceDao.performSave()

}

class Marker{
    val name:String
    val color:String
    var Quantity:Int
    val Price:Int

    constructor(mname:String,mcolor:String,mquantity:Int,mprice:Int){
        name=mname
        color=mcolor
        Quantity=mquantity
        Price=mprice
    }

}

//Invoice Have Single Responsibilty to changes like if displayChanges.
class Invoice{

    var marker:Marker



    constructor(mMarker:Marker){
        marker=mMarker
    }

    fun DisplayTotalPrice(){
        println(marker.Quantity*marker.Price)
    }

}

class InvoiceDao{

    var invoice:Invoice
    var invoiceIn:InvoiceIn

    constructor(minvoice:Invoice, minvoicein: InvoiceIn){
        invoice=minvoice
        invoiceIn=minvoicein
    }

    fun performSave(){
        invoiceIn.save(invoice)
    }

}

