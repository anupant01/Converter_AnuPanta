package com.e.converter_anupanta;

public class Converter_AnuPanta {

    private int number;
    private String words;
    private String[] numwords={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
            "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] wordstens={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


    public Converter_AnuPanta( int number) {
        this.number=number;

    }

    public String Words()
    {
        if (number<20)
        {
            words=(numwords[number]);
        }
        else if ((number/10)<10)
        {
            int first,second;
            first= number/10;
            second= number%10;

            words=(wordstens[first]+numwords[second]);

        }
        else if ((number/10)>10)
        {
            int first,second,third;
            String hundreds,tens,ones;
            first=number/100;
            number = number%100;
            second=number/10;
            third=number%10;

            hundreds= numwords[first]+" Hundred  and  ";
            tens= wordstens[second];
            ones= numwords[third];
            words=(hundreds+tens+ones);
        }
        return words;
    }
}












