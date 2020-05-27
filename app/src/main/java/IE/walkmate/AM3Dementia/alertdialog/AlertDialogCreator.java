package IE.walkmate.AM3Dementia.alertdialog;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.speech.RecognizerIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

//import com.example.android.moodtracker.R;
//import com.example.android.moodtracker.database.DatabaseMoodHelper;

import java.util.ArrayList;
import java.util.Locale;

import IE.walkmate.AM3Dementia.R;
import IE.walkmate.AM3Dementia.Sql.DatabaseMoodHelper;


public class AlertDialogCreator extends Activity{

    /** AlertDialogCreator is used to create an alert dialog
     * when the user taps the custom_note_button
     * in any of the layouts that display face buttons */

    //METHOD USED TO CREATE THE ALERT DIALOG when the button is tapped
    public void createAlertDialog (final Context context, final DatabaseMoodHelper dbH) {

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);

        /** Getting a reference to the alert dialog inside the activity
         * */
        LayoutInflater inflater = LayoutInflater.from(context);
        View mView = inflater.inflate(R.layout.alert_dialog_comment, null);
        //Displays alert_dialog_comment layout

        /**Creating the references to each view
         * */
        TextView alertDialogTitle = (TextView) mView.findViewById(R.id.alertDialogTitle);
        final EditText alertDialogComment = (EditText) mView.findViewById(R.id.alertDialogComment);
        Button alertDialogButtonOK = (Button) mView.findViewById(R.id.alertDialogBoxOK);
        final Button alertDialogButtonCANCEL = (Button) mView.findViewById(R.id.alertDialogBoxCANCEL);

        Spinner spinner=(Spinner) mView.findViewById(R.id.aSpinner);
        final String[] item = new String[1];
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                item[0] =(parent.getItemAtPosition(pos)).toString();
                Toast.makeText(context,
                        item[0],
                        Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //You cannot reference directly without mView because you would be calling a TextView
        //in the Activity, which does not exist (and you'll get an exception).That is why you call
        //mView and then findViewById.

        /** SHOWING the Alert Dialog
         *  */
        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();


        /** SETTING WHAT OK BUTTON DOES
         * */
        alertDialogButtonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //We check is the comment box is not empty.
                if (!alertDialogComment.getText().toString().isEmpty()) {
                    Toast.makeText(context,
                            context.getString(R.string.quotation_marks)
                                    + alertDialogComment.getText().toString()
                                    + context.getString(R.string.has_been_saved),
                            Toast.LENGTH_SHORT).show();
                    dbH.updateDataDaysCommentInToday(item[0]+"-"+alertDialogComment.getText().toString());
                    dialog.dismiss();
                } else {
                    Toast.makeText(context,
                            context.getString(R.string.fill_empty_space),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        /** SETTING WHAT CANCEL BUTTON DOES
         *  */
        alertDialogButtonCANCEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,
                        context.getString(R.string.no_string_added),
                        Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });




    }



}