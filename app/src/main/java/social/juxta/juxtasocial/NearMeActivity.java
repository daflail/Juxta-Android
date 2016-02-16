package social.juxta.juxtasocial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NearMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_me);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_nearme:
                startActivity(new Intent(this, NearMeActivity.class));
                break;
            case R.id.action_timeline:
                startActivity(new Intent(this, TimelineActivity.class));
                break;
            case R.id.action_profile:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            case R.id.action_followers:
                startActivity(new Intent(this, FollowersActivity.class));
                break;
            case R.id.action_chat:
                startActivity(new Intent(this, ChatActivity.class));
                break;
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.action_contactUs:
                startActivity(new Intent(this, ContactUsActivity.class));
                break;
            case R.id.action_shareJuxta:
                startActivity(new Intent(this, ShareJuxtaActivity.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
