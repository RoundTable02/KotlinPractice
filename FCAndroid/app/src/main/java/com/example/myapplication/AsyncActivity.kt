package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_async_task.*

class AsyncActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)

        var task : BackgroundAsyncTask? = null
        start.setOnClickListener {
            task = BackgroundAsyncTask(progressbar, ment)
            task?.execute()
            }
        stop.setOnClickListener {
            task?.cancel(true)
        }
    }
}

class BackgroundAsyncTask(
    val progressBar: ProgressBar,
    val progressText: TextView
): AsyncTask<Int, Int, Int>() {
    // params > doInBackground에서 사용할 타입
    // progress > onProgressUpdate에서 사용할 타입
    // result > onPostExecute에서 사용할 타입
    var percent:Int = 0
    override fun onPreExecute() {
        percent = 0
        progressBar.setProgress(percent)
    }

    override fun doInBackground(vararg p0: Int?): Int {
        while(isCancelled()==false){
            percent++
            if (percent>100){
                break
            } else {
                publishProgress(percent)
            }
            try {
                Thread.sleep(100)
            } catch(e:Exception){
                e.printStackTrace()
            }
        }
        return percent
    }

    override fun onProgressUpdate(vararg values: Int?) {
        progressBar.setProgress(values[0] ?: 0)
        progressText.setText("퍼센트: "+ values[0])
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Int?) {
        progressText.setText("작업이 종료되었습니다")    }

    override fun onCancelled() {
        progressBar.setProgress(0)
        progressText.setText("작업이 취소되었습니다")
    }
}
