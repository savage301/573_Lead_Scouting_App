package com.pppig236.scoutingappredo

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File

class CSVOperations {

    var teamDataList = ArrayList<String>()

    fun createCsv(fileName: String) {
        val file = File(fileName)

        // create a new file with headers
        // Update this
        file.writeText("Match Number,Alliance,Team Number,Auto High Cone,Auto Mid Cone,Auto Low Cone,Auto High Cube,Auto Mid Cube,Auto Low Cube,Auto Charge Station,Tele High Cone,Tele Mid Cone,Tele Low Cone,Tele High Cube,Tele Mid Cube,Tele Low Cube,Links,Tele Charge Station,Penalties,Robot Breakdown,Defense,Comment")
    }

    fun appendCsv(fileName: String, text: String) {
        val file = File(fileName)

        file.appendText(text)
    }

    fun readCsv(fileName: String) {
        val file = File(fileName)
        if (file.exists()) {
            val rows: List<Map<String, String>> = csvReader().readAllWithHeader(file)
            for (column in rows) {
                column["Match Number"]?.let { teamDataList.add(it) }
                column["Alliance"]?.let { teamDataList.add(it) }
                column["Team Number"]?.let { teamDataList.add(it) }
                column["Auto High Cone"]?.let { teamDataList.add(it) }
                column["Auto Mid Cone"]?.let { teamDataList.add(it) }
                column["Auto High Cone"]?.let { teamDataList.add(it) }
                column["Auto High Cube"]?.let { teamDataList.add(it) }
                column["Auto High Cube"]?.let { teamDataList.add(it) }
                column["Auto High Cube"]?.let { teamDataList.add(it) }
                column["Auto Charge Station"]?.let { teamDataList.add(it) }
                column["Tele High Cone"]?.let { teamDataList.add(it) }
                column["Tele Mid Cone"]?.let { teamDataList.add(it) }
                column["Tele High Cone"]?.let { teamDataList.add(it) }
                column["Tele High Cube"]?.let { teamDataList.add(it) }
                column["Tele High Cube"]?.let { teamDataList.add(it) }
                column["Tele High Cube"]?.let { teamDataList.add(it) }
                column["Links"]?.let { teamDataList.add(it) }
                column["Tele Charge Station"]?.let { teamDataList.add(it) }
                column["Penalties"]?.let { teamDataList.add(it) }
                column["Robot Breakdown"]?.let { teamDataList.add(it) }
                column["Defense"]?.let { teamDataList.add(it) }
                column["Comment"]?.let { teamDataList.add(it) }
            }
        }
    }

    fun deleteCsv(fileName: String) {
        val file = File(fileName)
        if (file.exists()) {
            file.delete()
        }
    }
}