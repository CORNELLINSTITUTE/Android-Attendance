package nz.ac.cornell.cloudschoolattendance;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        createTable();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true; // returns true to menu to be shown
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void createTable() {
        final TableLayout table = (TableLayout) findViewById(R.id.table);
        final TableRow tr1 = (TableRow) getLayoutInflater().inflate(R.layout.tableitem, null);
        final TableRow tr2 = (TableRow) getLayoutInflater().inflate(R.layout.tableitem, null);
        TextView tv;


        // Draw separator
        tv = new TextView(this);
        tv.setBackgroundColor(Color.parseColor("#80808080"));
        tv.setHeight(2); /*height of separator line. 2dip will be enough*/
        table.addView(tv);

        table.addView(tr1);

        // Draw separator
        tv = new TextView(this);
        tv.setBackgroundColor(Color.parseColor("#80808080"));
        tv.setHeight(2); /*height of separator line. 2dip will be enough*/
        table.addView(tv);

        table.addView(tr2);
    }
}
