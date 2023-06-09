<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".homepage">
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="150dp"
        android:gravity="top"
        >
        <Button
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:layout_centerInParent="true"
            android:background="@drawable/shape_circle"
            android:text="头像"
            tools:layout_editor_absoluteX="-1dp"
            tools:layout_editor_absoluteY="6dp" />
        <TextView
            android:id="@+id/textView3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/IDname"
            android:textAlignment="center"
            android:textSize="15dp"
            />

        <EditText
            android:id="@+id/editTextNumber"
            android:layout_width="100dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:autofillHints="username"
            android:background="#FFFFFF"
            android:ems="10"
            android:inputType="number" />

        <Button
            android:id="@+id/button9"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:layout_weight="1"
            android:gravity="top"
            android:text="@string/login" />
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="50dp">
        <TextView
            android:id="@+id/textView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/password"
            android:textAlignment="center"
            android:textSize="30dp"
            />
        <EditText
            android:autofillHints="password"
            android:id="@+id/editTextNumber2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="number" />
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="50dp">

        <Button
            android:id="@+id/button6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/login"
            android:layout_margin="5dp"
            />

        <Button
            android:id="@+id/button7"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="5dp"
            android:text="@string/create" />
    </LinearLayout>
</LinearLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   