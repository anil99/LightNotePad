<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.anil.mynotes.MainActivity">

    <RelativeLayout
        android:layout_width="368dp"
        android:layout_height="495dp"
        tools:layout_editor_absoluteX="8dp"
        tools:layout_editor_absoluteY="8dp">
        <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txtInput"
        android:layout_alignParentTop="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true"
        android:hint="Write Something To Save"
        android:gravity="top" />

        <Button
            android:id="@+id/btnSave"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignBaseline="@+id/txtContent"
            android:layout_alignBottom="@+id/txtContent"
            android:layout_centerHorizontal="true"
            android:text="Save" />

        <TextView
            android:id="@+id/txtContent"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/btnRead"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="80dp"
            android:editable="false"
            android:ems="10"
            android:inputType="textMultiLine"
            android:scrollIndicators="bottom|right" />
    </RelativeLayout>
</android.support.constraint.ConstraintLayout>
