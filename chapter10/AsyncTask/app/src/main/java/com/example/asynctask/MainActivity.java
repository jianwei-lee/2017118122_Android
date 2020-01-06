package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    MyTask mTask;
    Button button, cancel;
    TextView text;
    ProgressBar progressBar;

@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button = (Button) findViewById(R.id.button);
    cancel = (Button) findViewById(R.id.cancel);
    text = (TextView) findViewById(R.id.text);
    progressBar = (ProgressBar) findViewById(R.id.progress_bar);

    mTask = new MyTask();

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mTask.execute();
        }
    });

    cancel = (Button) findViewById(R.id.cancel);
    cancel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mTask.cancel(true);
        }
    });


}

    private class MyTask extends AsyncTask<String, Integer, String> {


        @Override
        protected void onPreExecute() {
            text.setText("加载中");
        }

        @Override
        protected String doInBackground(String... params) {

            try {
                int count = 0;
                int length = 1;
                while (count < 99) {

                    count += length;
                    publishProgress(count);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... progresses) {

            progressBar.setProgress(progresses[0]);
            text.setText("loading..." + progresses[0] + "%");
        }
        @Override
        protected void onPostExecute(String result) {
            text.setText("加载完毕");
        }

        @Override
        protected void onCancelled() {

            text.setText("已取消");
            progressBar.setProgress(0);

        }
    }
}

