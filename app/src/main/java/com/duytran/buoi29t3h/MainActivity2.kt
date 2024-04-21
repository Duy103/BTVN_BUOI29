package com.duytran.buoi29t3h


import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class MainActivity2 : AppCompatActivity() {

    /*private lateinit var recyclerView: RecyclerView
    private lateinit var fileAdapter: FileAdapter
    private val fileDataList = mutableListOf<FileData>()

    private val externalStoragePermissionCode = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recyclerView = findViewById(R.id.recycleView)
        fileAdapter = FileAdapter(fileDataList) { fileData ->
            readFileContent(fileData.filePath)
        }
        recyclerView.adapter = fileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

       // checkExternalStoragePermission()

        val saveButton: Button = findViewById(R.id.btnButtonSave)
        saveButton.setOnClickListener {
            val textView: TextView = findViewById(R.id.editText)
            val content = editText.text.toString()
            saveFileContent(content)
            editText.text.clear()
        }
    }

    *//*private fun checkExternalStoragePermission() {
        val permission = Manifest.permission.
        val permissionGranted = PackageManager.PERMISSION_GRANTED
        if (ContextCompat.checkSelfPermission(
                this,
                permission
            ) != permissionGranted
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(permission),
                externalStoragePermissionCode
            )
        } else {
            loadFileDataList()
        }
    }*//*

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == externalStoragePermissionCode) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                loadFileDataList()
            }
        }
    }

    private fun loadFileDataList() {
        val externalDir = Environment.getExternalStorageDirectory()
        val fileList = externalDir.listFiles()
        fileList?.forEach { file ->
            if (file.isFile) {
                val fileData = FileData(file.name, file.absolutePath)
                fileDataList.add(fileData)
            }
        }
        fileAdapter.notifyDataSetChanged()
    }

    private fun saveFileContent(content: String) {
        val fileName = "file.txt"
        val externalDir = Environment.getExternalStorageDirectory()
        val file = File(externalDir, fileName)
        val fileWriter = FileWriter(file)
        fileWriter.write(content)
        fileWriter.flush()
        fileWriter.close()

        val fileData = FileData(file.name, file.absolutePath)
        fileDataList.add(fileData)
        fileAdapter.notifyDataSetChanged()
    }

    private fun readFileContent(filePath: String) {
        val file = File(filePath)
        val fileReader = FileReader(file)
        val bufferedReader = BufferedReader(fileReader)
        val stringBuilder = StringBuilder()
        var line: String?
        while (bufferedReader.readLine().also { line = it } != null) {
            stringBuilder.append(line)
            stringBuilder.append('\n')
        }
        bufferedReader.close()

        val fileContent = stringBuilder.toString()

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("fileContent", fileContent)
        startActivity(intent)
    }*/
}


