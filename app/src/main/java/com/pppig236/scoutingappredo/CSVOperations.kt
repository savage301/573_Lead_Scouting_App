package com.pppig236.scoutingappredo

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File

class CSVOperations {

    var teamDataList = ArrayList<String>()

    fun createCsv(fileName: String) {
        val file = File(fileName)

        // create a new file with headers
        // Update this
        file.writeText("Match Number,Alliance,Team Number,Auto Speaker,Auto AMP,Teleop Speaker,Teleop AMP,CoOp,Hang,Harmony,Robot Breakdown,Human Pickup,Floor Pickup,Mic,Trap,Defense,Comment")
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
                column["Team Number"]?.let { teamDataList.add(it) }
                column["Alliance"]?.let { teamDataList.add(it) }
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