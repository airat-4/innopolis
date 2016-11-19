/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testServlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import logic.Patronymic;

/**
 *
 * @author Александр
 */
public class Test {

    public static void main(String[] args) throws MalformedURLException, IOException {

        testColor();
        testAge();
        testBankCard();

        testZvanie();
        testIp("v4");
        testIp("v6");
        testTime();

        testPIN();
        testSNILS();
        testAcc();
        testLanguage();
        testLastName();
        testName();
        testPatronymic();
        testFIO();

        testBankName();
        testMaritalStatus();
        testRelationDegree();
        testCity();
        testStreetType();
        testINN("юр");
        testINN("физ");
        testRegion();
        testPhoneNumber();
        testEmail();
        testCountry();

        testNational();
        testCitizenship();
        testEducation();
        testLocality();
        testCvv();
        testMarkTC();
        testFormTC();
        testPropertyType();
        testWorship();
        testPropertyRights();
        testMaterialWall();
        testStateApartment();
        testMetal();
        testTypeBankCard();
        testUnit();
        testAppointment();
        testLivingRight();
        testTypeDoc();
        testContractor();
        testSeriaNumPas();
        testOGRN();
        testZagranPasport();
        testKPP();
        testCadastr();
        testKemVidan();
        testKoment();
        testKodPodrazdel();
        testOGRNWithParam();
        testDrive();
        testOKPO();
        testWorkBook();
        testNumberTC();
        testDate();
        testSex();
        testStreet();
        testCustomString();
        testOrganazeForma();
        testBC();
        testIndex();
        testCustomOption("a,b,c,d,e,f,g,h");
        testEducationQualif();
    }

    private static void testWorkBook() {
        print("GetWorkBook");
    }

    private static void testOKPO() {
        print("GetOKPO");
    }

    private static void testDrive() {
        print("GetDrivePas");
    }

    private static void testKodPodrazdel() {
        print("GetKodPodrazdelenia");
    }

    private static void testKoment() {
        print("GetKoment");
    }

    private static void testKemVidan() {
        print("GetKemVidan");
    }

    private static void testCadastr() {
        print("GetCadastr");
    }

    private static void testKPP() {
        print("GetKpp");
    }

    private static void testColor() {
        print("GetColor");
    }

    private static void print(String servletName) {
        TestServlet servlet = new TestServlet(servletName);
        servlet.print();
    }

    private static void testAge() {
        String servletName = "GetAge";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("beginYear", "1995");
        servlet.addParametr("endYear", "2016");

        servlet.print();
    }

    private static void testBankCard() {
        print("GetBankCard");
    }

    private static void testZvanie() {
        print("GetZvanie");
    }

    private static void testIp(String protocol) {
        String servletName = "GetIp";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("protocolVersion", protocol);
        servlet.print();
    }

    private static void testOGRNWithParam() {
        String face = "юр.лицо";
        String servletName = "GetOGRNWithParametrs";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("face", face);
        servlet.print();
        face = "ип";
        servlet = new TestServlet(servletName);
        servlet.addParametr("face", face);
        servlet.print();
    }

    private static void testNumberTC() {
        String tc = "автомобиль";
        String servletName = "GetRegisterNumTC";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("tc", tc);
        servlet.print();
        tc = "мотоцикл";
        servlet = new TestServlet(servletName);
        servlet.addParametr("tc", tc);
        servlet.print();
        tc = "автобус";
        servlet = new TestServlet(servletName);
        servlet.addParametr("tc", tc);
        servlet.print();
    }

    private static void testTime() {
        print("GetTime");
    }

    private static void testZagranPasport() {
        print("GetRandomZagranPasport");
    }

    private static void testPIN() {
        print("GetPIN");
    }

    private static void testSNILS() {
        print("GetSNILS");
    }

    private static void testNational() {
        print("GetNational");
    }

    private static void testCitizenship() {
        print("GetCitizenship");
    }

    private static void testEducation() {
        print("GetEducationStatus");
    }

    private static void testLocality() {
        print("GetTypeLocality");
    }

    private static void testCvv() {
        print("GetCvv");
    }

    private static void testMarkTC() {
        print("GetMarkTC");
    }

    private static void testFormTC() {
        print("GetFormTC");
    }

    private static void testPropertyType() {
        print("GetPropertyType");
    }

    private static void testWorship() {
        print("GetWorship");
    }

    private static void testPropertyRights() {
        print("GetPropertyRights");
    }

    private static void testMaterialWall() {
        print("GetMaterialWall");
    }

    private static void testStateApartment() {
        print("GetStateApartment");
    }

    private static void testMetal() {
        print("getMetal");
    }

    private static void testTypeBankCard() {
        print("GetTypeBankCard");
    }

    private static void testUnit() {
        print("GetRandomUnit");
    }

    private static void testLivingRight() {
        print("GetLivingRight");
    }

    private static void testAppointment() {
        print("GetAppointment");
    }

    private static void testTypeDoc() {
        print("GetTypeDoc");
    }

    private static void testContractor() {
        print("GetContractor");
    }

    private static void testSeriaNumPas() {
        print("GetRandomSerialNumberPasport");
    }

    private static void testOGRN() {
        print("GetOGRN");
    }

    private static void testAcc() {
        print("GetAccount");
    }

    private static void testLanguage() {
        print("GetLanguage");
    }

    private static void testLastName() {
        String servletName = "GetLastName";
        testFIO(servletName);
    }

    private static void testName() {
        String servletName = "GetName";
        testFIO(servletName);
    }

    private static void testPatronymic() {
        String servletName = "GetPatronymic";
        testFIO(servletName);
    }

    private static void testFIO() {
        String servletName = "GetFIO";
        testFIO(servletName);
    }

    private static void testFIO(String servletName) {
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("language", "ru");
        servlet.addParametr("sex", "male");
        servlet.print();

        servlet = new TestServlet(servletName);
        servlet.addParametr("language", "en");
        servlet.addParametr("sex", "famale");
        servlet.print();
    }

    private static void testBankName() {
        print("GetBankName");
    }

    private static void testMaritalStatus() {
        print("GetMaritalStatus");
    }

    private static void testRelationDegree() {
        print("GetRelationDegree");
    }

    private static void testCity() {
        print("GetCity");
    }

    private static void testStreetType() {
        print("GetStreetType");
    }

    private static void testINN(String type) {
        String servletName = "GetINN";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("type", type);
        servlet.print();
    }

    private static void testRegion() {
        print("GetRegion");
    }

    private static void testPhoneNumber() {
        TestServlet servlet = new TestServlet("GetPhoneNumber");
        servlet.addParametr("countryNuber", "8");
        servlet.addParametr("operatorNumber", "927");
        servlet.print();

    }

    private static void testEmail() {
        TestServlet servlet = new TestServlet("GetEmail");
        servlet.addParametr("domen", "mail.ru");
        servlet.print();
    }

    private static void testCountry() {
        TestServlet servlet = new TestServlet("GetCountry");
        servlet.addParametr("abbreviature", "rus");
        servlet.print();
    }
    private static void testDate() {
        TestServlet servlet = new TestServlet("GetDate");
        servlet.addParametr("maska", "dd.MM.yyyy");
        servlet.addParametr("day", "завтра");
        servlet.addParametr("addDay", "2");
        servlet.print();
    }

    private static void testSex() {
        TestServlet servlet = new TestServlet("GetSex");
        servlet.addParametr("language", "Татарский");
        servlet.print();
    }

    private static void testStreet() {
        TestServlet servlet = new TestServlet("GetStreet");
        servlet.addParametr("city", "Самара");
        servlet.print();
    }

    private static void testCustomString() {
        TestServlet servlet = new TestServlet("GetCustomString");
        servlet.addParametr("chars", "врцшгчсдвг");
        servlet.addParametr("length", "6");
        servlet.print();
    }

    private static void testOrganazeForma() {
        TestServlet servlet = new TestServlet("GetOrganazeForma");
        servlet.addParametr("abbreviatura", "ОАО");
        servlet.print();
    }

    private static void testBC() {
        print("GetBC");
    }

    private static void testIndex() {
        print("GetIndex");
    }

    private static void testCustomOption(String pull) {
        TestServlet servlet = new TestServlet("GetOption");
        servlet.addParametr("pull", pull);
        servlet.print();
    }

    private static void testEducationQualif() {
        print("GetEducationQualif");
    }

}
