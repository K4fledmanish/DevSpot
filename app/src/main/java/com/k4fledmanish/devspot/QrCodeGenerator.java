package com.k4fledmanish.devspot;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;




public class QrCodeGenerator extends AppCompatActivity {


    private EditText etInput;
    private Button btnCreateQr;
    private ImageView imageView;
    private Button btnSave;


    OutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code_generator);


        etInput = findViewById(R.id.etInput);
        btnCreateQr = findViewById(R.id.btnCreateQr);
        imageView = findViewById(R.id.imageView);
        btnSave = findViewById(R.id.btnSave);





        btnCreateQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // hide keyboard after click on button

                etInput.onEditorAction(EditorInfo.IME_ACTION_DONE);

                String text = etInput.getText().toString().trim();

                if(TextUtils.isEmpty(text)){
                   etInput.setError("Required");
                    return;
                }



                if(text !=null ){
                    MultiFormatWriter multiFormatWriter = new MultiFormatWriter();





                    try{
                        BitMatrix bitMatrix = multiFormatWriter.encode(text, BarcodeFormat.QR_CODE, 800 ,800);


                        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                        Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                        imageView.setImageBitmap(bitmap);
                    }
                        catch (WriterException e){
                        e.printStackTrace();
                        }


                }


            }
        });





    }

}
