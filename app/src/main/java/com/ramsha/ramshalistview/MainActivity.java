package com.ramsha.ramshalistview;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import com.mutahir.ramshalistview.R;
public class MainActivity extends Activity {
    static String[] phoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] name= {"Ramsha Mustafa","Zaryab Fayaz","Taliya Mustafa","Mutahir kiani","Laraib Narasab","Faizan Raza",
                "Ali Atisham","Rukhsana Narasab","Rehana Manzor","Dure shahwar","Manahar Iftikhar","Dure Aiman","Ghamashia Iftikhar",
                "Hejab Mustafa", "Bhae Hafeez","Moid Mustafa","Ghulam Mustafa","Tahira mustafa","Shahnaz Ismail",
                "Ismail Chaudary","Saad Ismail", "Hania Ismail","Farzam Ismail","Bushra Manzoor","Asfand Abdullah",
                "Mahe Fazeen","Shabana Shakeel","Nael Ali","Rehab Ali", "Abdul Rasool","Rubab Rasool","Wahaj Khizar",
                "Mohammad Musa","Mohammad Kashir","Mohammad Farooq","Sidra Farooq", "Fatima Farooq","Rameen Farooq",
                "Alishba Naseer","Hira Altaf","Rimsha Tanveer","Ghulnaz Fayaz","Fayaz Mehmood", "Waris Fayaz","Haris Fayaz",
                "Aadarsh Fayaz","Mahnoor Azhar","Aqsa Saeed","Aqsa Iftikhar","Sadia Naseem", "Sadaf Iftikhar","Muneeba Mona"};
        phoneNo=new String[]{"+923360190384","+923337896578","+923088513397","+923365251888","+923215564882","+923315251484",
               "+923365988856", "+923410022384","+923044894323","+923322919956","+923378703922","+923217900775","+923417235053",
               "+923087525519","+923025275389", "+923360199348","+923345725108","+923014672908","+923366665557","+923347556642",
               "+923085776689","+923227548921","+923314555671","+923351502233","+923420130222","+923372224232", "+923410350079",
               "+923317837744","+923217542677","+923398489861","+923224554653","+923456776543","+923362313453","+923325443421",
               "+923239847653","+923362001995","+923312041995","+923249950420","+923321020004","+923072971992","+923021993456",
               "+923421211214","+923377272776","+923214565732","+923318789413","+923345218791","+923334987891","+923335223376",
               "+923235997989","+9230450000350","+9233770004545","+9233112225244"};
        final ArrayAdapter ramshaArray=new CustomView(getApplicationContext(),name);
        ListView list=(ListView)findViewById(R.id.List);
        list.setAdapter(ramshaArray);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Position=String.valueOf(parent.getItemAtPosition(position));
            String number1=phoneNo[position];
                String[] get=Position.toString().split(" ");
                String add="";
                for(String s:get) {
                    add += "" + s.charAt(0);
                }
                Intent intentNext = new Intent(MainActivity.this, Details.class);
                intentNext.putExtra("value",add);
                intentNext.putExtra("value1",number1);
                intentNext.putExtra("value2",Position);
                startActivity(intentNext);
            }
        }
        );
    }
}