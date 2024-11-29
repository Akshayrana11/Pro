
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".insert">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <EditText
            android:id="@+id/editText3"
            android:layout_width="match_parent"
            android:layout_height="62dp"
            android:ems="10"
            android:hint="ENTER USERNAME"
            android:inputType="textPersonName" />
        <EditText
            android:id="@+id/editText4"
            android:layout_width="match_parent"
            android:layout_height="62dp"
            android:ems="10"
            android:hint="ENTER PASSWORD"
            android:inputType="textPassword" />
        <Button
            android:id="@+id/button3"
            android:layout_width="match_parent"
            android:layout_height="74dp"
            android:text="REGISTER" />
    </LinearLayout>
</RelativeLayout>


package com.example.arrayadapter;
import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.widget.ArrayAdapter; import android.widget.ListView;

public class MainActivity extends AppCompatActivity { ListView s1;


@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); s1=findViewById(R.id.l1);
 
String courselist[]={"C-programming","Python","ANDROID","DBMS"};
ArrayAdapter<String> ad=new ArrayAdapter<String>(this,R.layout.item_view,R.id.t1,courselist); s1.setAdapter(ad);
}
}
