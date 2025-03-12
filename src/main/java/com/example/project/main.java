package com.example.project;

public class main {
    public static void main(String[] args) {
        
        String message = "This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again.";
        int rows = 5;


        System.out.println("-------ENCRYPT----------");
        String encrpString = "re o=esns.ttoesliirra t e tplsnoyauanrn   codosnieteetzno aiidmtr  ouo,ndphtonmtxiaouetrcatp- nnyoeuirdl acubolneatpEsr   pets. doanain o s nisntwteouoascbnmu  kr ,s oyet,flmnnnleeoiahii ucptlssiaau cmn nerieorogmi fietonrhptiocy   srree cohhnntttoea  i nfstdiospeg eynincrgroccioians t eeead dhtnn-tnaal e  lyst,ebexsw ren dptoaeens driari aeovllrfoap  rn l,pioat gtcuyi iberkn kochy  aceeebekhh t ttt e  xrhhseottttF irr gwee.n vhrienposgoitsaccpes  esssacses romerep cet eohnthrpiutpi o  cehtsebtpid-iyh dwrTnl c auee.cogdn wa os syieaslti eiatomsmrt ara eeopth f ntnnde aiettc znp gioytnrcrnio cedheeiotldpcub inaioce gte yi rflle onlld oebes tizs,nsieyisrcl ooolephrah tpetsu d iaeIs  h etnt.iIA tn  sxe..iedmd t henrttroeuiiihbrutp oqpiegeycclrr na cse enarnre eaa nf  ,wrysyoeblhnt lpkndia iekrm tsgrta oonrdtfeenp vnayeee rvrgscip e t ycnaferInlku";
        System.out.println("OUTPUT: " + encrpString);
        

        System.out.println("-------DECRYPT----------");
        System.out.println("OUTPUT: " + Encryptor.decryptMessage(encrpString, rows));

    }
}
