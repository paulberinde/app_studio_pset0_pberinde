package paulberinde_tampanariu.mrpotatohead;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void SelectItem(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.CheckBox:
                ImageView imgView = (ImageView) findViewById(R.id.Hat);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox2:
                imgView = (ImageView) findViewById(R.id.Eyebrows);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox3:
                imgView = (ImageView) findViewById(R.id.Ears);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox4:
                imgView = (ImageView) findViewById(R.id.Eyes);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox5:
                imgView = (ImageView) findViewById(R.id.Glasses);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox6:
                imgView = (ImageView) findViewById(R.id.Nose);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox7:
                imgView = (ImageView) findViewById(R.id.Mustache);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox8:
                imgView = (ImageView) findViewById(R.id.Mouth);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox9:
                imgView = (ImageView) findViewById(R.id.Arms);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.CheckBox10:
                imgView = (ImageView) findViewById(R.id.Shoes);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }

}

