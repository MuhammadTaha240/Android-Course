package com.example.lecture29recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    ArrayList<Item> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        itemArray();


    }

    private void itemArray() {
        itemAdapter = new ItemAdapter(this, arrayList);
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        arrayList.add(new Item("Pakistan", R.drawable.pakistan, "اسلامی جمہوریہ پاکستان جنوبی ایشیا کے شمال مغرب وسطی ایشیا اور مغربی ایشیا کے لیے دفاعی طور پر اہم حصے میں واقع ایک خود مختار اسلامی ملک ہے۔ 21 کروڑ کی آبادی کے ساتھ یہ دنیا کا پانچواں بڑی آبادی والا ملک ہے۔ 881,913 مربع کلومیٹر (340,509 مربع میل) کے ساتھ یہ دنیا کا تینتیسواں بڑے رقبے والا ملک ہے۔ اس کے جنوب میں 1046 کلومیٹر (650 میل) کی ساحلی پٹی ہے جو بحیرہ عرب سے ملتی ہے۔پاکستان کے مشرق ميں بھارت، شمال مشرق ميں چین اور مغرب ميں افغانستان اور ايران واقع ہيں۔ پاکستان کو شمال میں ایک تنگ واخان راہداری تاجکستان سے جدا کرتی ہے جبکہ اس ملک کی سمندری سرحدی حدود عمان کے سمندری حدود سے بھی ملتی ہیں۔"));
        arrayList.add(new Item("Turkey", R.drawable.turkey, "ترکیہ یا ترکی (انگریزی: Turkey یا Republic of Turkey) (سرکاری نام: Türkiye Cumhuriyeti یعنی جمہوریہ ترکیہ) یوریشیائی ملک ہے جو جنوب مغربی ایشیا میں جزیرہ نما اناطولیہ اور جنوبی مشرقی یورپ کے علاقہ بلقان تک پھیلا ہوا ہے۔\n" +
                "\n" +
                "ترکی کی سرحدیں8 ممالک سے ملتی ہیں جن میں شمال مغرب میں بلغاریہ، مغرب میں یونان، شمال مشرق میں گرجستان (جارجیا)، مشرق میں آرمینیا، ایران اور آذربائیجان کا علاقہ نخچوان اور جنوب مشرق میں عراق اور شام شامل ہیں۔ علاوہ ازیں شمال میں ملکی سرحدیں بحیرہ اسود، مغرب میں بحیرہ ایجیئن اور بحیرہ مرمرہ اور جنوب میں بحیرہ روم سے ملتی ہیں۔"));
        arrayList.add(new Item("Canada", R.drawable.canada, "کینیڈا یا کاناڈا رقبے کے لحاظ سے دنیا کا دوسرا سب سے بڑا ملک ہے۔ یہ براعظم شمالی امریکا کے بڑے حصے پر محیط ہے۔ بحر اوقیانوس سے لے کر بحر منجمد شمالی تک پھیلا ہوا ہے۔ کینیڈا کی زمینی سرحدیں امریکا کے ساتھ جنوب اور شمال مغرب کی طرف سے ملتی ہیں۔\n" +
                "\n" +
                "برطانوی اور فرانسیسی کالونی بننے سے قبل کینیڈا میں قدیم مقامی لوگ رہتے تھے۔ کینیڈا نے برطانیہ سے بتدریج آزادی حاصل کی۔ یہ عمل 1867 سے شروع ہوا اور 1982 میں مکمل ہوا۔"));
        arrayList.add(new Item("UAE", R.drawable.unitedarabemirates, "متحدہ عرب امارات (عربی: دولة الإمارات العربية المتحدة) جزیرہ نمائے عرب کے جنوب مشرقی ساحلوں پر واقع ایک ملک ہے جو 7 امارات: ابوظہبی، عجمان، دبئی، فجیرہ، راس الخیمہ، شارجہ اور ام القوین پر مشتمل ہے۔ 1971ء سے پہلے یہ ریاستیں ریاستہائے ساحل متصالح (Trucial States) کہلاتی تھیں۔\n" +
                "\n" +
                "متحدہ عرب امارات کی سرحدیں سلطنة عُمان اور سعودی عرب سے ملتی ہیں۔ یہ ملک تیل اور قدرتی گیس کی دولت سے مالامال ہے اور اس کا انکشاف 1970ء میں ہونے والی براہ ِ راست بیرونی سرمایہ کاری کے نتیجہ میں ہونے والی دریافتوں میں ہوا۔ جس کی بدولت متحدہ عرب امارات کا شمارجلد ہی نہایت امیر ریاستوں میں ہونے لگا۔ متحدہ عرب امارات انسانی فلاح و بہبود کے جدول میں ایشیا کے بہت بہتر ملکوں میں سے ایک اور دنیا کا 39 واں ملک ہے۔"));
        arrayList.add(new Item("UK", R.drawable.unitedkingdom, "مملکت متحدہ برطانیہ عظمی و شمالی آئرلینڈ (United Kingdom of Great Britain and Northern Ireland)، جسے عام طور پر مملکت متحدہ (United Kingdom) یا برطانیہ (Britain) کے طور پر جانا جاتا ہے، شمال مغربی یورپ کا ایک ملک ہے۔ یہ جزیرہ برطانیہ اور شمالی آئرلینڈ کے علاوہ ملحقہ سمندر کے مختلف جزائر پر پھیلا ہوا ہے۔"));
        arrayList.add(new Item("Netherland", R.drawable.netherlands, "نیدرلینڈز یا نیدرلانت (Netherlands) یا جسے ہالینڈ (Holland) بھی کہا جاتا ہے مملکت نیدرلینڈز (Kingdom of the Netherlands) کا جزو ملک ہے۔\n" +
                "\n" +
                "اس کا دار الحکومت شہر ایمسٹرڈیم ہے۔\n" +
                "\n"));
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

    private void init() {
        recyclerView = findViewById(R.id.rec);
        arrayList = new ArrayList<>();

    }

}