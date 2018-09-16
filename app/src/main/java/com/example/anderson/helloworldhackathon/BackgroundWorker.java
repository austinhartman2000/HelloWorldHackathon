package com.example.anderson.helloworldhackathon;

import android.app.AlertDialog;
import android.content.Context;
<<<<<<< HEAD
import android.content.Intent;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.Button;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
=======
import android.os.AsyncTask;
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String,Void,String> {
    Context context;
    AlertDialog alertDialog;
<<<<<<< HEAD
    public String answer;
    TextView textView;
    Context view;

    public BackgroundWorker(Context ctx, TextView textView, Context view){
        context = ctx;
        answer = "";
        this.textView = textView;
        this.view = view;
    }
    @Override
    protected String doInBackground(String... params) {
        String result="";
        String type = params[0];
        String login_url = "http://10.186.162.233:80/login.php";
=======
    BackgroundWorker(Context ctx){
        context = ctx;
    }
    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String login_url = "http://12.34.56.78:80/login.php";
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
        if(type.equals("login")){
            try {
                String user_name = params[1];
                String password = params[2];
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String post_data = URLEncoder.encode("user_name", "UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"+URLEncoder.encode("password", "UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
<<<<<<< HEAD
                String line = "";
                while((line= bufferedReader.readLine()) != null){
                    result += line;
                    this.answer+=line;
=======
                String result = "";
                String line = "";
                while((line= bufferedReader.readLine()) != null){
                    result += line;
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
<<<<<<< HEAD
                System.out.println(result);
                //this.answer = result;
                //return result;
=======
                return result;
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
            }catch(MalformedURLException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
<<<<<<< HEAD
        //this.answer=result;
        return result;
        //return null;
=======
        return null;
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
    }
    protected void onPreExecute(){
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login Status");
    }
    protected void onPostExecute(String result){
<<<<<<< HEAD
        System.out.println("1:" + this.answer);
        alertDialog.setMessage(result);
        System.out.println("About to show");
        //alertDialog.show();
        System.out.println("2: " + this.answer);
        if(this.answer.equals("login success")){
            Intent intent = new Intent(this.view, BuySellPage.class);
            this.view.startActivity(intent);
        } else {

            textView.setVisibility((int) 1);
        }

=======
        alertDialog.setMessage(result);
        alertDialog.show();
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
    }
    protected void onProgressUpdate(Void... values){
        super.onProgressUpdate(values);
    }
<<<<<<< HEAD

    protected String getResult(){
        System.out.println("Getter says: " + this.answer);
        return this.answer;
    }


}


=======
}
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
