package com.example.jeff.soccerstats;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    sql myDB;

    TableRow selected;
    TableRow rowJeffrey;
    TableRow rowEric;
    TableRow rowOmar;
    TableRow rowJessy;
    TableRow rowHB;
    TableRow rowMatt;
    TableRow rowTom;
    TableRow rowCal;
    TableRow rowNestor;
    TableRow rowRohit;
    TableRow rowJack;
    TableRow rowGuest;


    TextView jeffrey;
    TextView jGoal;
    TextView jAssist;
    TextView jYC;
    TextView jRC;
    TextView jApp;


    TextView eric;
    TextView eGoal;
    TextView eAssist;
    TextView eYC;
    TextView eRC;
    TextView eApp;


    TextView omar;
    TextView oGoal;
    TextView oAssist;
    TextView oYC;
    TextView oRC;
    TextView oApp;


    TextView jessy;
    TextView jessyGoal;
    TextView jessyAssist;
    TextView jessyYC;
    TextView jessyRC;
    TextView jessyApp;


    TextView hb;
    TextView hbGoal;
    TextView hbAssist;
    TextView hbYC;
    TextView hbRC;
    TextView hbApp;


    TextView matt;
    TextView mGoal;
    TextView mAssist;
    TextView mYC;
    TextView mRC;
    TextView mApp;

    TextView tom;
    TextView tGoal;
    TextView tAssist;
    TextView tYC;
    TextView tRC;
    TextView tApp;

    TextView cal;
    TextView cGoal;
    TextView cAssist;
    TextView cYC;
    TextView cRC;
    TextView cApp;


    TextView nestor;
    TextView nGoal;
    TextView nAssist;
    TextView nYC;
    TextView nRC;
    TextView nApp;


    TextView rohit;
    TextView rGoal;
    TextView rAssist;
    TextView rYC;
    TextView rRC;
    TextView rApp;

    TextView jack;
    TextView jackGoal;
    TextView jackAssist;
    TextView jackYC;
    TextView jackRC;
    TextView jackApp;


    TextView guest;
    TextView gGoal;
    TextView gAssist;
    TextView gYC;
    TextView gRC;
    TextView gApp;


    Button goalB;
    Button assistB;
    Button ycB;
    Button rcB;
    Button appB;

    Button btnSave;
    Button btnviewAll;
    Button btnReset;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        myDB = new sql(this);


        //System.out.println("asdfasdfasdfads");
        //System.out.println(this.getDatabasePath("Stats.db"));

        //JEFFREY
        rowJeffrey = (TableRow) findViewById((R.id.rowJeffrey));
        rowJeffrey.setOnClickListener(tablerowOnClickListener);
        rowJeffrey.setPadding(5, 10, 5, 10);
        jeffrey = (TextView) findViewById(R.id.name1);
        jGoal = (TextView) findViewById(R.id.goal1);
        jAssist = (TextView) findViewById(R.id.assist1);
        jYC = (TextView) findViewById(R.id.yc1);
        jRC = (TextView) findViewById(R.id.rc1);
        jApp = (TextView) findViewById(R.id.app1);

        //ERIC
        rowEric = (TableRow) findViewById((R.id.rowEric));
        rowEric.setOnClickListener(tablerowOnClickListener);
        rowEric.setPadding(5, 10, 5, 10);
        eric = (TextView) findViewById(R.id.name2);
        eGoal = (TextView) findViewById(R.id.goal2);
        eAssist = (TextView) findViewById(R.id.assist2);
        eYC = (TextView) findViewById(R.id.yc2);
        eRC = (TextView) findViewById(R.id.rc2);
        eApp = (TextView) findViewById(R.id.app2);

        //OMAR
        rowOmar = (TableRow) findViewById((R.id.rowOmar));
        rowOmar.setOnClickListener(tablerowOnClickListener);
        rowOmar.setPadding(5, 10, 5, 10);
        omar = (TextView) findViewById(R.id.name3);
        oGoal = (TextView) findViewById(R.id.goal3);
        oAssist = (TextView) findViewById(R.id.assist3);
        oYC = (TextView) findViewById(R.id.yc3);
        oRC = (TextView) findViewById(R.id.rc3);
        oApp = (TextView) findViewById(R.id.app3);

        //JESSY
        rowJessy = (TableRow) findViewById((R.id.rowJessy));
        rowJessy.setOnClickListener(tablerowOnClickListener);
        rowJessy.setPadding(5, 10, 5, 10);
        jessy = (TextView) findViewById(R.id.name4);
        jessyGoal = (TextView) findViewById(R.id.goal4);
        jessyAssist = (TextView) findViewById(R.id.assist4);
        jessyYC = (TextView) findViewById(R.id.yc4);
        jessyRC = (TextView) findViewById(R.id.rc4);
        jessyApp = (TextView) findViewById(R.id.app4);


        //HANBIN
        rowHB = (TableRow) findViewById((R.id.rowHB));
        rowHB.setOnClickListener(tablerowOnClickListener);
        rowHB.setPadding(5, 10, 5, 10);
        hb = (TextView) findViewById(R.id.name5);
        hbGoal = (TextView) findViewById(R.id.goal5);
        hbAssist = (TextView) findViewById(R.id.assist5);
        hbYC = (TextView) findViewById(R.id.yc5);
        hbRC = (TextView) findViewById(R.id.rc5);
        hbApp = (TextView) findViewById(R.id.app5);


        //MATT
        rowMatt = (TableRow) findViewById((R.id.rowMatt));
        rowMatt.setOnClickListener(tablerowOnClickListener);
        rowMatt.setPadding(5, 10, 5, 10);
        matt = (TextView) findViewById(R.id.name6);
        mGoal = (TextView) findViewById(R.id.goal6);
        mAssist = (TextView) findViewById(R.id.assist6);
        mYC = (TextView) findViewById(R.id.yc6);
        mRC = (TextView) findViewById(R.id.rc6);
        mApp = (TextView) findViewById(R.id.app6);


        //Thomas
        rowTom = (TableRow) findViewById((R.id.rowTom));
        rowTom.setOnClickListener(tablerowOnClickListener);
        rowTom.setPadding(5, 10, 5, 10);
        tom = (TextView) findViewById(R.id.name7);
        tGoal = (TextView) findViewById(R.id.goal7);
        tAssist = (TextView) findViewById(R.id.assist7);
        tYC = (TextView) findViewById(R.id.yc7);
        tRC = (TextView) findViewById(R.id.rc7);
        tApp = (TextView) findViewById(R.id.app7);


        //Cal
        rowCal = (TableRow) findViewById((R.id.rowCal));
        rowCal.setOnClickListener(tablerowOnClickListener);
        rowCal.setPadding(5, 10, 5, 10);
        cal = (TextView) findViewById(R.id.name8);
        cGoal = (TextView) findViewById(R.id.goal8);
        cAssist = (TextView) findViewById(R.id.assist8);
        cYC = (TextView) findViewById(R.id.yc8);
        cRC = (TextView) findViewById(R.id.rc8);
        cApp = (TextView) findViewById(R.id.app8);


        //Nestor
        rowNestor = (TableRow) findViewById((R.id.rowNestor));
        rowNestor.setOnClickListener(tablerowOnClickListener);
        rowNestor.setPadding(5, 10, 5, 10);
        nestor = (TextView) findViewById(R.id.name9);
        nGoal = (TextView) findViewById(R.id.goal9);
        nAssist = (TextView) findViewById(R.id.assist9);
        nYC = (TextView) findViewById(R.id.yc9);
        nRC = (TextView) findViewById(R.id.rc9);
        nApp = (TextView) findViewById(R.id.app9);


        //Rohit
        rowRohit = (TableRow) findViewById((R.id.rowRohit));
        rowRohit.setOnClickListener(tablerowOnClickListener);
        rowRohit.setPadding(5, 10, 5, 10);
        rohit = (TextView) findViewById(R.id.name10);
        rGoal = (TextView) findViewById(R.id.goal10);
        rAssist = (TextView) findViewById(R.id.assist10);
        rYC = (TextView) findViewById(R.id.yc10);
        rRC = (TextView) findViewById(R.id.rc10);
        rApp = (TextView) findViewById(R.id.app10);



        //Jack
        rowJack = (TableRow) findViewById((R.id.rowJack));
        rowJack.setOnClickListener(tablerowOnClickListener);
        rowJack.setPadding(5, 10, 5, 10);
        jack = (TextView) findViewById(R.id.name11);
        jackGoal = (TextView) findViewById(R.id.goal11);
        jackAssist = (TextView) findViewById(R.id.assist11);
        jackYC = (TextView) findViewById(R.id.yc11);
        jackRC = (TextView) findViewById(R.id.rc11);
        jackApp = (TextView) findViewById(R.id.app11);



        //Guest
        rowGuest = (TableRow) findViewById((R.id.rowGuest));
        rowGuest.setOnClickListener(tablerowOnClickListener);
        rowGuest.setPadding(5, 10, 5, 10);
        guest = (TextView) findViewById(R.id.name12);
        gGoal = (TextView) findViewById(R.id.goal12);
        gAssist = (TextView) findViewById(R.id.assist12);
        gYC = (TextView) findViewById(R.id.yc12);
        gRC = (TextView) findViewById(R.id.rc12);
        gApp = (TextView) findViewById(R.id.app12);

        goalB = (Button) findViewById(R.id.goal_button);
        assistB = (Button) findViewById(R.id.assist_button);
        ycB = (Button) findViewById(R.id.yc_button);
        rcB = (Button) findViewById(R.id.rc_button);
        appB = (Button) findViewById(R.id.app_button);
        goalB.setOnClickListener(buttonOnClickListener);
        assistB.setOnClickListener(buttonOnClickListener);
        ycB.setOnClickListener(buttonOnClickListener);
        rcB.setOnClickListener(buttonOnClickListener);
        appB.setOnClickListener(buttonOnClickListener);


        /*btnviewAll = (Button) findViewById(R.id.view_button);
        viewAll();*/
        btnReset = (Button) findViewById(R.id.reset_button);
        reset();
        btnSave = (Button) findViewById(R.id.save_button);
        UpdateData();

        //resetData();
        getData();

    }


    private View.OnClickListener tablerowOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            //GET TEXT HERE

            if (selected == null) {

            } else {
                selected.setBackgroundColor(Color.WHITE);
            }

            selected = (TableRow) v;

            selected.setBackgroundColor(Color.CYAN);


        }
    };


    private void increment(TextView stat) {
        int statNum = Integer.parseInt(stat.getText().toString());
        statNum++;
        stat.setText("" + statNum);
    }

    private View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Button b = (Button) v;
            //goals
            if (b.equals(goalB)) {

                if (selected.equals(rowJeffrey)) {
                    increment(jGoal);
                } else if (selected.equals(rowEric)) {
                    increment(eGoal);
                } else if (selected.equals(rowOmar)) {
                    increment(oGoal);
                } else if (selected.equals(rowJessy)) {
                    increment(jessyGoal);
                } else if (selected.equals(rowHB)) {
                    increment(hbGoal);
                } else if (selected.equals(rowMatt)) {
                    increment(mGoal);
                } else if (selected.equals(rowTom)) {
                    increment(tGoal);
                } else if (selected.equals(rowCal)) {
                    increment(cGoal);
                } else if (selected.equals(rowNestor)) {
                    increment(nGoal);
                } else if (selected.equals(rowRohit)) {
                    increment(rGoal);
                } else if (selected.equals(rowJack)) {
                    increment(jackGoal);
                } else if (selected.equals(rowGuest)) {
                    increment(gGoal);
                }
            }
            //assists
            else if (b.equals(assistB)) {
                int assist;
                if (selected.equals(rowJeffrey)) {
                    increment(jAssist);
                } else if (selected.equals(rowEric)) {
                    increment(eAssist);
                } else if (selected.equals(rowOmar)) {
                    increment(oAssist);
                } else if (selected.equals(rowJessy)) {
                    increment(jessyAssist);
                } else if (selected.equals(rowHB)) {
                    increment(hbAssist);
                } else if (selected.equals(rowMatt)) {
                    increment(mAssist);
                } else if (selected.equals(rowTom)) {
                    increment(tAssist);
                } else if (selected.equals(rowCal)) {
                    increment(cAssist);
                } else if (selected.equals(rowNestor)) {
                    increment(nAssist);
                } else if (selected.equals(rowRohit)) {
                    increment(rAssist);
                } else if (selected.equals(rowJack)) {
                    increment(jackAssist);
                } else if (selected.equals(rowGuest)) {
                    increment(gAssist);
                }
            }
            //yc
            else if (b.equals(ycB)) {
                if (selected.equals(rowJeffrey)) {
                    increment(jYC);
                } else if (selected.equals(rowEric)) {
                    increment(eYC);
                } else if (selected.equals(rowOmar)) {
                    increment(oYC);
                } else if (selected.equals(rowJessy)) {
                    increment(jessyYC);
                } else if (selected.equals(rowHB)) {
                    increment(hbYC);
                } else if (selected.equals(rowMatt)) {
                    increment(mYC);
                } else if (selected.equals(rowTom)) {
                    increment(tYC);
                } else if (selected.equals(rowCal)) {
                    increment(cYC);
                } else if (selected.equals(rowNestor)) {
                    increment(nYC);
                } else if (selected.equals(rowRohit)) {
                    increment(rYC);
                } else if (selected.equals(rowJack)) {
                    increment(jackYC);
                } else if (selected.equals(rowGuest)) {
                    increment(gYC);
                }
            }
            //rc
            else if (b.equals(rcB)) {
                if (selected.equals(rowJeffrey)) {
                    increment(jRC);
                } else if (selected.equals(rowEric)) {
                    increment(eRC);
                } else if (selected.equals(rowOmar)) {
                    increment(oRC);
                } else if (selected.equals(rowJessy)) {
                    increment(jessyRC);
                } else if (selected.equals(rowHB)) {
                    increment(hbRC);
                } else if (selected.equals(rowMatt)) {
                    increment(mRC);
                } else if (selected.equals(rowTom)) {
                    increment(tRC);
                } else if (selected.equals(rowCal)) {
                    increment(cRC);
                } else if (selected.equals(rowNestor)) {
                    increment(nRC);
                } else if (selected.equals(rowRohit)) {
                    increment(rRC);
                } else if (selected.equals(rowJack)) {
                    increment(jackRC);
                } else if (selected.equals(rowGuest)) {
                    increment(gRC);
                }

            }
            //apps
            else if (b.equals(appB)) {
                if (selected.equals(rowJeffrey)) {
                    increment(jApp);
                } else if (selected.equals(rowEric)) {
                    increment(eApp);
                } else if (selected.equals(rowOmar)) {
                    increment(oApp);
                } else if (selected.equals(rowJessy)) {
                    increment(jessyApp);
                } else if (selected.equals(rowHB)) {
                    increment(hbApp);
                } else if (selected.equals(rowMatt)) {
                    increment(mApp);
                } else if (selected.equals(rowTom)) {
                    increment(tApp);
                } else if (selected.equals(rowCal)) {
                    increment(cApp);
                } else if (selected.equals(rowNestor)) {
                    increment(nApp);
                } else if (selected.equals(rowRohit)) {
                    increment(rApp);
                } else if (selected.equals(rowJack)) {
                    increment(jackApp);
                } else if (selected.equals(rowGuest)) {
                    increment(gApp);
                }
            }

        }
    };

    public void getData() {

        //System.out.print("hellooooooooooooo");
        for(int i = 1; i < 13; i++){
            //System.out.println("name is " + myDB.getStat(i, "NAME"));
            switch (i) {
                case 1:
                    jeffrey.setText(myDB.getStat(i, "NAME"));
                    jGoal.setText(myDB.getStat(i, "GOALS"));
                    jAssist.setText(myDB.getStat(i, "ASSISTS"));
                    jYC.setText(myDB.getStat(i, "YC"));
                    jRC.setText(myDB.getStat(i, "RC"));
                    jApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 2:
                    eric.setText(myDB.getStat(i, "NAME"));
                    eGoal.setText(myDB.getStat(i, "GOALS"));
                    eAssist.setText(myDB.getStat(i, "ASSISTS"));
                    eYC.setText(myDB.getStat(i, "YC"));
                    eRC.setText(myDB.getStat(i, "RC"));
                    eApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 3:
                    omar.setText(myDB.getStat(i, "NAME"));
                    oGoal.setText(myDB.getStat(i, "GOALS"));
                    oAssist.setText(myDB.getStat(i, "ASSISTS"));
                    oYC.setText(myDB.getStat(i, "YC"));
                    oRC.setText(myDB.getStat(i, "RC"));
                    oApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 4:
                    jessy.setText(myDB.getStat(i, "NAME"));
                    jessyGoal.setText(myDB.getStat(i, "GOALS"));
                    jessyAssist.setText(myDB.getStat(i, "ASSISTS"));
                    jessyYC.setText(myDB.getStat(i, "YC"));
                    jessyRC.setText(myDB.getStat(i, "RC"));
                    jessyApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 5:
                    hb.setText(myDB.getStat(i, "NAME"));
                    hbGoal.setText(myDB.getStat(i, "GOALS"));
                    hbAssist.setText(myDB.getStat(i, "ASSISTS"));
                    hbYC.setText(myDB.getStat(i, "YC"));
                    hbRC.setText(myDB.getStat(i, "RC"));
                    hbApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 6:
                    matt.setText(myDB.getStat(i, "NAME"));
                    mGoal.setText(myDB.getStat(i, "GOALS"));
                    mAssist.setText(myDB.getStat(i, "ASSISTS"));
                    mYC.setText(myDB.getStat(i, "YC"));
                    mRC.setText(myDB.getStat(i, "RC"));
                    mApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 7:
                    tom.setText(myDB.getStat(i, "NAME"));
                    tGoal.setText(myDB.getStat(i, "GOALS"));
                    tAssist.setText(myDB.getStat(i, "ASSISTS"));
                    tYC.setText(myDB.getStat(i, "YC"));
                    tRC.setText(myDB.getStat(i, "RC"));
                    tApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 8:
                    cal.setText(myDB.getStat(i, "NAME"));
                    cGoal.setText(myDB.getStat(i, "GOALS"));
                    cAssist.setText(myDB.getStat(i, "ASSISTS"));
                    cYC.setText(myDB.getStat(i, "YC"));
                    cRC.setText(myDB.getStat(i, "RC"));
                    cApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;


                case 9:
                    nestor.setText(myDB.getStat(i, "NAME"));
                    nGoal.setText(myDB.getStat(i, "GOALS"));
                    nAssist.setText(myDB.getStat(i, "ASSISTS"));
                    nYC.setText(myDB.getStat(i, "YC"));
                    nRC.setText(myDB.getStat(i, "RC"));
                    nApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;


                case 10:
                    rohit.setText(myDB.getStat(i, "NAME"));
                    rGoal.setText(myDB.getStat(i, "GOALS"));
                    rAssist.setText(myDB.getStat(i, "ASSISTS"));
                    rYC.setText(myDB.getStat(i, "YC"));
                    rRC.setText(myDB.getStat(i, "RC"));
                    rApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 11:
                    jack.setText(myDB.getStat(i, "NAME"));
                    jackGoal.setText(myDB.getStat(i, "GOALS"));
                    jackAssist.setText(myDB.getStat(i, "ASSISTS"));
                    jackYC.setText(myDB.getStat(i, "YC"));
                    jackRC.setText(myDB.getStat(i, "RC"));
                    jackApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;

                case 12:
                    guest.setText(myDB.getStat(i, "NAME"));
                    gGoal.setText(myDB.getStat(i, "GOALS"));
                    gAssist.setText(myDB.getStat(i, "ASSISTS"));
                    gYC.setText(myDB.getStat(i, "YC"));
                    gRC.setText(myDB.getStat(i, "RC"));
                    gApp.setText(myDB.getStat(i, "APPEARANCES"));
                    break;
            }
        }



    }

    public void UpdateData() {
        btnSave.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name;
                        String goals;
                        String assists;
                        String yc;
                        String rc;
                        String apps;

                        name = ((TextView) selected.getChildAt(1)).getText().toString();
                        goals = ((TextView) selected.getChildAt(2)).getText().toString();
                        assists = ((TextView) selected.getChildAt(3)).getText().toString();
                        yc = ((TextView) selected.getChildAt(4)).getText().toString();
                        rc = ((TextView) selected.getChildAt(5)).getText().toString();
                        apps = ((TextView) selected.getChildAt(6)).getText().toString();

                        String idNum = "";
                        switch (name) {
                            case "Jeffrey":
                                idNum = "1";
                                break;
                            case "Eric":
                                idNum = "2";
                                break;
                            case "Omar":
                                idNum = "3";
                                break;
                            case "Jessy":
                                idNum = "4";
                                break;
                            case "Han Bin":
                                idNum = "5";
                                break;
                            case "Matt":
                                idNum = "6";
                                break;
                            case "Thomas":
                                idNum = "7";
                                break;
                            case "Cal":
                                idNum = "8";
                                break;
                            case "Nestor":
                                idNum = "9";
                                break;
                            case "Rohit":
                                idNum = "10";
                                break;
                            case "Jack":
                                idNum = "11";
                                break;
                            case "Guests":
                                idNum = "12";
                                break;

                        }


                        boolean isUpdate = myDB.updateData(idNum, name, goals, assists, yc, rc, apps);
                        if (isUpdate == true)
                            Toast.makeText(MainActivity.this, "Data Update", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Data not Updated", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void AddData() {

        TextView temp;
        for (int i = 1; i < selected.getVirtualChildCount(); i++) {
            temp = (TextView) selected.getChildAt(i);
            System.out.println("table row children::   " + temp.getText());
        }


    }

    public void reset() {
        btnReset.setOnClickListener(

            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetData();
                }
            }

        );

    }

    public void resetData(){
        myDB.deleteAll();

        myDB.insertData(1, "Jeffrey", "0", "0", "0", "0", "0");
        myDB.insertData(2, "Eric", "0", "0", "0", "0", "0");
        myDB.insertData(3, "Omar", "0", "0", "0", "0", "0");
        myDB.insertData(4, "Jessy", "0", "0", "0", "0", "0");
        myDB.insertData(5, "Han Bin", "0", "0", "0", "0", "0");
        myDB.insertData(6, "Matt", "0", "0", "0", "0", "0");
        myDB.insertData(7, "Thomas", "0", "0", "0", "0", "0");
        myDB.insertData(8, "Callam", "0", "0", "0", "0", "0");
        myDB.insertData(9, "Nestor", "0", "0", "0", "0", "0");
        myDB.insertData(10, "Rohit", "0", "0", "0", "0", "0");
        myDB.insertData(11, "Jack", "0", "0", "0", "0", "0");
        myDB.insertData(12, "Guests", "0", "0", "0", "0", "0");
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDB.getAllData();
                        if (res.getCount() == 0) {
                            // show message
                            showMessage("Error", "Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("Name :" + res.getString(1) + "\n");
                            buffer.append("Goals :" + res.getString(2) + "\n");
                            buffer.append("Assists :" + res.getString(3) + "\n");
                            buffer.append("YC :" + res.getString(4) + "\n");
                            buffer.append("RC :" + res.getString(5) + "\n");
                            buffer.append("Appearances :" + res.getString(6) + "\n\n");

                        }

                        // Show all data
                        showMessage("Data", buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

}
