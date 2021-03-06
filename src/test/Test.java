//Nathan Burnham BCS345 10/13/21 Lab week 7


package test;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Test extends Application
{

    //Global Variables used to count number of times buttons are pressed
    int count = 0;
    Text textCount;
    
    public static void main(String[] args) 
    {
     
        launch(args);
        
    }
    
    @Override
    public void start(Stage stage)
    {
        
        //Image URLs that are displayed in program        
        Image img1 = new Image("https://lh3.googleusercontent.com/proxy/aLs8FN2qj_CCENjQZiz3KhTPF9BndRsQwwVfjGqmewB3ShCfd14SppF9HJ74Jo8cFhh292oBrfXglUMXLfvISrtrjdDcnwwnbIrEr1A"); 
        Image img2 = new Image("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxITEhUTExMVFRUXFRcVFxcXFRcXFhUXFRUWFhUXGBUYHSggGBolHRUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGxAQGy0lHyUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALcBEwMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAADBAIFAAEGB//EAEAQAAEDAgIHBAcGBAYDAAAAAAEAAhEDIQQxBRJBUWGBkRNxodEiMlKSscHwBhQVQmLhU3KCohYjQ5PS8TNjwv/EABoBAAMBAQEBAAAAAAAAAAAAAAIDBAEABQb/xAA2EQABBAADAwkIAwADAQAAAAABAAIDEQQhMRJBUQUTYXGBkaHR8BQiMkKxweHxFVKiYnKSI//aAAwDAQACEQMRAD8A8/DURq2GojGhenSgtaAXTfZ3H0A0067ZBkSBsMbuapjgHBocPSHDdvQ20zEwgkY2RtE92RTopHwv2gN2/Sl0OOx1Mse1rA5pEB2qGOtF3b7xldc4+iYBO1EaETUstjjEYoLppTLmUmWLHtlNdmoFieFKUACywBELFgaipLtDqhZqoz6Jlbc2FCCCSvSLSAEuWrWqjOahkIkBWmqWstBTDVQxgIUsjyHITloBE1VohTujoqlkttUHFYwLIU2LG1a12lreqpqOupNBOxOaWpLg/chlql2dkV1KFgYnJGhpB1FttNN9gOa3ToyQAhtGGm0tqLNRNupQYQixCjQC1RLUyWIZYsRIJataiaZRJKk6gL3E/V5QkhG1pOaTLUNwTDmqBaspagaqxEhYsWWthikGojWqQYnBJVponTTqbdQgObeJF2zuVrh2svUafRMwDeZtECY3LmQxEpkjaeqS/DtJJblevSqY8W9oAdnWnQrLS1FltRoaYvEwds8tyrw1O4fGODS2AZ2kXHcVAibpjAWiilyua47Q+iB2aiaacDFnZJlpBFpB1NQ1VYVKKC6mmNKQ4KAq2uFstaYWGmsDELo2AWjbPKSBd8ECrTMoRarBlTYRKjUojYpnR7xoq2yjR2RSEBaFxZGfTC1SbC2N1GlkzdoXSXbTKKaZ2pssAzMLbXWtHRDI2siUcLg4WAkCxa1E26mhuakWAqdklLhqKyoAtOCjC4PWGMpvtA6ywU0KgRtsrKhTDhIORjv4qmOYaKWXDn4kCnSRqbYMhMsoWyUjSRF1oWtIzS3Zg7ghOownW0JKlVw8bUvaANJoYS26VZ2Sl93TrKO1Sqiy4v4ImxirKrHMQ3NTrmKL6BbBsfFbYC7YPYkHNQ3BNvaguatS6pK6qxG1Vi6likwIrWqTaaKymm2k0QoCmphiOxiMKKzaRAWlWsTeFYJAdksNOLlQOIYN55JbpG1mUxsLzmAn/uRn0QXDMGNhR36MeG60CNsG4vF1HQ+kg1wg8j8ld4itSc30gWuGR2OjepX4gtIrMcR5fvqVkeFDmmwQeGg7/sVzxw6A/DLpMUWODdUAQIMRbjxQGYca0GChHKLKs68ETuSpC6t3HcuefhLSl30jbvV1pDCyYvHCM+5V/YEQE04sOBbaW3k8sIfWSSe2CtgIooOc6MlurhnQDGS4YtrHU1C7k6SRm0/VJVmXW6VFFqtQmPcmB4BspTo3EU1EbS9ojmVJ7NUpeq4uN/8AtSAJSJJATkqYYyBmpVBKCWpkNKJ2NlM6QKxsJKrjTWGmnHUjtCj2KHnAi5gpcU0xRDm5TCawODLnBdEcDS1YgSLJDsVTwxosngqWYIbBe80AqjD15ABTIpdFd0dBaoaQLuE8ACoYjR8GI/dEzH0S0pb8C19FpVO+kNjpUqeAJE2HPYn24KTkGhYaZZMHYOaY7G5ADVLbyfmdrTov75pSjTYD6bSRlYxzlK4im2bZbNyNVdvS7qhziRt7vkmiUCiSb68v2lmEusBordln1dSXqNAQHlEr4kOMxqicheEEOkEgEgZ2T2StIzyU0kLmmm59VoDwgvCnUedgSzmOKMzNCUIHlZKxD7I7liH2hF7KVf8A3FrsnR3oTsA5u3mpDEAbCmqePZGrv4GyBza+ZOa8OGbBfR5KFBoGZ8Fb4Wk0jfwQW6M7Roh7QDfj0VjgNClplrz0IXlYrHRtsbefroXrYfC1m9oA6/yUN+jKbhAMHcQqqvoF4vAI4LsXYc6t89p4eaj+HgjP91A3GSVZeaveL8iqDHCDk0fRcbR0M53q2K6DR9AFoY/VJ77qwdowBh1Wy6ELB6N123kOCnlxW2MyQOjX9Jw2A0kLKOBptMtyTH3Fkh0gRvsi0sERtyy4oz6Rt3IPcefdJ0zv1mlGV289yrdK4EH1Yk52XO4zC6rYEztPDguuqsO/PbCANGPysWm5lPGJ5mq+/rsWgNcPfK5rROEJIMZ8EbTVA6xAEAZRaeJXRdgKfowN881T6ZxrSdls4z5qzk+R82J50j3dPJR8oSBmH2I76K3/AIXLVqJzIjeUAMTuK0lFmskfq28lmHx1M+swg+F19IWsO9fNtllaM2pVlGUc0IRHEAx8EWq4bzC8+chpXsYYbWZQaVNaq0oi8c1ETsRGUJzULpADqvSayxVKLxrcVYaO0M55mLImBwGscrLrsJS1GgR6Khmnd8EeqeQGDackG6IFNnoi+9UlbAVH1AGmI2gwuvfVEWH13JfDMYAXEXn4qSISxyGznrmtE20w7WaHoulUYILi+d+zuT33HXzb4pfWm55ItOuRtVDcLJIdrd1qaWcMNXRQMXo8xlfckq+jzqzF1duxOuIydvhbq1dWzhzS5OciyWxzl261xlfBm5A74SHpNtsOyF21Y04JFuSq6mFaZOvY2stbi3HJw+qqaGnoVICAD6FyIadW8qTsCzVmCHEelqgH45K3ZQpt2yAJlao4hhyiONkt2Idq0H112ngDrXO1sJTAIgX2zl4JR+jw2HNMjir/AEm2nnbkVT1sdFmtA8VXBLI5ttvptZI2LVwHRlmq/sXbj0CxH+9laVdydCm/+XT3ItM70zTY3cENtNFYxfRuY12oXxDJZGaEqwwNbUMwSrnC6R1pktH1vXP0yjtUEvJ8D7JbnxV7OUpxVmwN36XR60kek2+7zKcFMRMlcxSqEKxoYoxElefNyXmC13gPsFbHynYoj12q5pUoiJg7rqFXCvvq7eRUcO95Egi1lplVwMmVH7AC4ixYVRxZaA6sigsfWbmJ7/NNUq5cD6MOjJHbipFwFJrmbko4aRp+EI+fY4IFGntJHcERwneEU6o2IOs7/oprIXOzdr05+u1A6UDRJ4hzhsBCpNK4OlBJMOzkSV0lerLdUwfiqV+jQXSckHMPhO3ZH/XenRzMeNkjsK46q4F0CI4hIvZDsl2GmNENp09drZ4/Cy5d/rbV6WHxLZW7TNEiaEgizdreFu5WJwxceCjo/CiVdBijxGIzoK2GENbmq+jgbwrDCaKcZIaIGclEGdl0OCwOtBcCBG+CSonSPdk0Jr3hgspPReB2hvMqx1CBAb37imWkNtAjgtGo3dtT44HAe8LUEmI23cEk5Cc0JmrBJIQXKmPCR5EhJfinDRDIUSYRDKgWWJnJVuAa3PRTgue6hr0qOuReFCvjSbG+5J1q7nk6smB3WFrT3pMucT6Rc0b+OxSvfGfib4+irWQSXbXeCPicRsISnbbNm5L1qu8oWIdG229ILWnQUvQaCBmi1qrPopSrWGwIdj+ZF+6i3pXOULvdbraYCTokKzyUsaTjkrCrU1cgDy+e1EqYkAAtAJgTaIO5HzjhoEJjDtSq/wDCavslaVr+PVP4f10WIedxHAd6Hm4un12IbWIrWojCEYMX0m2vjCwbkFrURrUZtJTFNdtodhapBWGH1NspENKzsnT6xA7gluG0E1h2Tu7VdMrAerPMplleRBAKpmPITNKqkOhbvT24h15JrEVgwSSAOO1M4TENeLEHfCq8ZQbUADjkmsC2m2whp71HK122DdBXwuj5o5WVaCERrwdgMcSgU3JhpskyNdYA07UTXCr39ihVoMde7TwVXpXDvYA5rjHlwV0GKFZkiLc9yU7I3Hd9qY1259Uucwry+C43ByjPxuud+0dAdoNS5JjLyXoLcLSbk2TO39kJmEp+w2ZmSJudqBkUoeZQO8+Q45p3tMVbGfQuCwQqFwEWG4WXQ4XRj3RIIV83RrLw2DnITdOnAhSFskklUAOjNPdigBY8VVYfRQaZm6sQFIrC1XxYdkehPaVDJM9+qG4oRCMWrUKkOASCCUuQolqO6FByIPWFqEx0bJW3U2uEEEc7LcKLkEjRJl68kcbizP15oVLBBhkXlarYZpvt8FNSbCgkwYq7NquPEkngqepogZnw2JGtod0WXSW2IVVxbmkOjkacn9V+qVjMSXbr9d65g6DdmZjgJRKOjqeUuJG8x0VzVrwJLh1VViMYTkZWDnzkXdyexwIukGrhtUeqOiQxFQbwe4ImKxjjaPkkKp3yFVExwFuXPcNAt/egsSDu9YqtgKXbcrTD4gHenaT1xQruAjWMLGVuK9k2V81sAar0Gm5GYuV0ZpoMbquBO4jMeacw2nxJ1gAIlsZngkbTrNhPMTcqN/ZdGGhTDBzXKu+0D5JgR7JEjzQsHpB2trcZ7lhLwsEMbsrXZdmtimg4LGOqD0mAWzmAYtdHpV5mREbZBB5qZuNjJIvMJsnJ0jd1oWIwQeIM8nEfBZgdF0mGQ2/EynGPByIMZwUQNTDI13SlBskZyJCZpuTLCkGgozHlLIbVBG1xvNPNcpFKsqJhtQb1K6QN1VjW3mo1AhA3TRCWqCCjjnBySpId4RaRTBCBQN0dyW+TNNa2go6qzVU1pz1geu2UMhRcVKpUtuS7qk5LNviF2ypkBQKg6c5gbZ81EvETn3XQ85G2zoi2HmlIsUSElisa4WZGWdx/0q6jpB4dDhInMkT1QDEhxyKcMI6rVw56GXJDH49w9VpI3iCqavjarwNUObFzEhObOD0ddLhg3kWukc9a7bmuYwul3izwXXz2jen8RpNuodSZ2Hcik2SKdmsZA8OyVhU1c9UIRMZBc8MVVEODieBPhdXlCoHtBG0TE5LBHE0aBG8zDeVjn8B4Kux2F1xuTlSuwGCYPGwPcUu/HU7jWHH6OaJrY9wWbUutqhdor/2NWK17ejvHUj5rE20Oa4FqkAuup/ZJu1/QIn+EGbHnmFn8vh+J7ilnkqTiO9ci1FBXVH7INi1Q9LIJ+yL9jgVw5Vwx+bwK7+NlHDvXOgmc05RrubuKtf8ACVXeOqwfZatu8QuPKOFd84RMwczcxXeh0tLENiwtBib3T2L0t/ltDcyLzeN+aX/wzX9nxb5qTfs5X9k/2+andNgiQdoZG9VW0YmiDWY4jJH0PpeLatyfe3Ce9XNfTJp+tSqd8AgcwVS0vs5WaQRmN3/aaq6GxD/Xe499/mkuxWGD9oPFb9fXoLuYe5lPq+NhXWC0syoCW61t7SOiVqfaNgkartYGCDAy4pPDfZ6q24fqneNYfBY77Kvz1we+UP8AIYUE2/LtSvZANa7/ACUGaXrPcSHATs2dPmuhwb36vpkPG4XjuVLS+yzh+Ycj+ytcLo2q1urriOPmLrz8djIJPgcO7715KtjGMbVjv/AV/SqNOR5blrF4MVGxfhBgE8VSYXRL2O1hUPUnkZzT7sTX1oFPWGw2nmCpHYxjjstdY7lMYqdbHD6fVR0ZRqtq6ry6CLAi1ovPcFcNpnMiEthTidWeznmJ+ChWrVhnTjhrNy48U4YpzWbTrrcSKHfv7EuS3v8AlHUQjVq4G5KMxzXSGm4QKj3PmaRE2JgT32+rIeFwmpN3Gd8W6BAzlKjnSaImhpvVOStgpZ0DY/faVF+MgWa/onjlHa0WDD8AmKr7Rv4Sh03naI7kAYpx/K4IYrPnh4pRxBLryTREQKRsSwPBG3JVtDR8O9JgI43TrqhURUWMmoZGk1oIFKFfBgixjugKqxGHdln3K311olE2YtNgo23oVzNWi7cehWmBwyaV0hIS9Siza1PGMJyIRtpUpYQ2Mp7vFVr3PbMO6LpzhaXs/FDOFpeyE2PFgXY9eKJzQ4ZLlHlxzKDUB3rrzRp+yOijDR+UDkqG8of8fEJTsKCNVxnZnitrsdZu4LEf8i7+vig9gYlm6SRRpJccNL8PE+S1+MDh737JR5MfwVH8hg/7eB8l2jdI8URuklxQ0yN3ifJEGlju8T5IP4t53LjjcF/bwPku0Gk+5S/EzwXGN0m7cPePkpjSDvZHvHyQnkt/DxHmu9qwR3+B8l1/4o7h0UvxN3Dp+65L8Qf7B6nyWhpR/wDDd1KA8mP/AKhd7Rg+P+XeS7AaTfw6fusGkKu9vT91yrNIu9k9VJ2lQPWt/UPNCeTZP6jwXc9hOP8Al3kuqGPq7x0UxjK3tDouRbp+n/EG/wBYeaNS07SP+o3mR5oHcmzD5R3BBz+F3Edy6sV63tjoptq1f4i5dum6UT2zPeHwRWabofx6fvQkO5PnHyj/AM/hbzkJ0Le5dfh6z9rgeSssNiI9hcRT0vSOWIp++Pgis02zZVpnudKkPJ0920eCQ+KN/wAwXo1PSFtiSxOKnIgLnMLi2lhLnPDtgDXQf7Us7G7yfcd5IphjZmhkjyQFKzBMabtXlXEcQlH1xwVYapPtc2uHyUIJMT4HyQM5Peq2xsbqVYurN4IbqoVdUYAJLiB/K7ySxrMmNe+6DPSFQ3k950TA6Ib1auqfqQzU/Uq8j9R913/FDc8e0eTHn/5TRgpPQ/CYJIq18FYmsfaQziHb1VOxbPbP+3U/4perpFo/Mf8AbqeSc3AyHd4fhbz+HHzfRXZxLt6icW7eqT8QHtD3XjxhDfpDc4dHJgwL+CIYjD8fXers4xy199KoXY52+n9c1F+NeNtPr+6MYJ3AIvaYPQV4cYUN2MVKcVU/R9c0J+Kqbm/XNGMH1LfaYenuV27FoT8UqR2Lq7h0PmhuxlX2f7T5powZ6O9CcbF09yuvvK2uf++1fZ/tPmsTPZD6KX7dF6CrQY2Hr+6M029U+9+6BTJ+gEVkm8nx817JXywCMD+k9f3WBvf1lQk7is1zunmhRikVj+/r+6I2Tlre9+6EDwCPTc7YPBAbTmKTMOTm53vHzW30o21D/WfNS7Qorav6ZS7cm+7xUGPyB7UAbdc/Jydo0mxZzvfJ+aHTrD2B8/FHZVGWq3mlEngmUOKmzDtkQTneNY+IyzTIw7WjL4yeZCXbXM21QOZJHBGGIGXpTwBj6ukutMaVI0WEXAaOUW4QUo7RzLuZr5/l144n1SAE8ysCYNO/LjmYUi8MM9k7nq5cEovLTQ+oTdkHM14+SUwuG9bWqvbsgPn5Ts3BM0aDj6ld5gyQ6I8WyUchxhwEDMgv1Qfdb81o1HGwYHX484JzSHv2rOXbSNoreUxTfUDSH1Gxtk0i4DZxCVOFp1IHaAHZBY423gjJXWE9W4aDEmXNM8ILc+JKUrtn8ogfrjwa6ISOcAI07K9eKNw3IdLRxAvWcDkfRpgR7psgP0dB/wDKdhgspnvNmKH3VjhDWsmJEkn4k25LfY1GwOzp98aoOzIEp7Tn8XZTQlnqPioVtG6/oGvIOw0qRB5aiA77PtaJLx/TSZ8mqxpUnyddrO8F1h3Rw3hGFMCwzzvJPij5zZyB8Ag2Nr0VQHRR2VSRewp056BnzWYfQTwDcNnIllPwsI6KzxNIuz7MAG+128ZxwW2U2HIif5p8UwymvwPwsEYJ/P7VFjtG1QZ7UtO06rBzJAuhg4gi1Zjv6R8RCtsbgi7MbLHXII8AkKeE1BLXuIm4D3HpATmyBw3HsH5Sywg7+8repiAJJok8Wv8A+SA+tVj1MMeo+JS+N0o5lhTqOvtgjmYkoVL7QNB9XVJ2ERlukkIubcc6v11rOeZdbVeupNf5mfZUT1UNer/ApdT5IbtLtcfzDj6MdNqJTxbXbbcWtHgLhdskat+vmjDgdD9PJRqYl7f9Ol7x8kIYt5yYw91RynWY2Zno1vzCWqAj839l/BEK4fXzWEuG8/58lOpVftpD33eSWc4/wz/uH5rQqHY5o79YE+KDUBO1hPe4/Epzctw8fNIcb3+DfJT7f9FT3j5rSD93f+nqtJnu9CVb+nuHkitqH6Kk2od/ihM4BTGeQRZJXvev0jtqb46D5rO0+oHxUDyWxUGRhDYTKdoSjNqd/RNNqcJStKo3ePrgmQ4HckvI4J8bTuP0/K2KvAdERlaPZ6KGuBnHMrbcSz2mfXFASDuTNkjVybbWGfmjsuJ+uVkrRxbDkWnnu3JhtYHIjjdKcaTA0u3hE1XDJ0cgsqViBJk/yjPqVJkqYOWfK6SZBacIHVv9dqXZXqGf8okbte/CRl4ozKuKIIYyBn6RnkM/hzTNOuRcm/H6zRTVqXjV4S1x3pL5LOTR2koxFl8Z7APslKGFxh/PqiLAE/OQFGtTxIIBqHh6TuWRbPdBTlN+ILv9EcSDJ6Qpu0g4SPRLgZgXcRwa3u3nNAZHX8LT2aeCDmxWru2/wkKWFqwZ7Q/zSWnbmKZIEyhYrGVWW7IPdaAGZne5zhccui6LC41z2f8AiG/NwcAeGa2+uL6xDQBtLi4cTb4ITO4HNgProzRGInLa+644YnEu9csotmSWlgcO+DIy704PtE2kAHhzs4OsHSNhEONu8iFd06tOo2PRqCYFgYPfELT8Oxst1GtnMgAH3gLJvtMRye2ujT8oBh5B8Dr8fIdyrsLpqnUBkFrYkEuD54Bo1jbuWVsThmkFxbJylpnm2JHfATDtFU33LngjK8dYuVVYv7M08yC8nNzi4OJ5GB0TWGInUj1xISpOdAzaD1/jyV5Tex9w8ncA4gDp5FBx9KlEujZJv19ELm2aGLCDTa4XzDpHxufq6cdjcQ2G6usYzaRrW3td5ouZId7jvsfuuErS33m14j7JyrhWO9VxA3tJPxsihuo29R0cQ2Sq2rpTY9jgTtGu3vysos0wwmIJ2CCHOJ5ifFaWSEZ5js8P0ua6MaGu8IuKrscfVkDIWB6qrr0Tn2bY463xgqzfj6RzJBOxzQD8Fr71SOVQdxAPyTGEt+U+Pkse0P8AmHh5qnfqgyWgd0k8rKX3sHKeYJCsnUwbyPDoIQXNadoJ3fJMEgOo+qDmnA5FU9fHAZah4gGSfgtM0sD/AKZ5QPAq1dQ3AdErUZ+kHhCYHMO5KLZQdfBLHSdPItI/p8pWffqW7qIW6zP0juj5ykqmGnIAdEYa0pbnPHDuT3bM3N6haVZ9zPt/FYi2G8UHOO/qgSd/iUxTqEbzzW1ieQpQUQVDu5z8lgqcY7gsWISjatvxJAEoX3xwMWjmVtYuAC4kjNMDEmM5MTy8Fpr3PE6o75IHQFbWJW5NBshaP6jHM/L5otCuadwZ2XkZbonxWLFuozWjImtyusPiXPbII6X+KmHVdYat7cI6FYsUjgBeStY5zqNlNPxdUBvohx23j4lGGlKoiaYIkZPgmbXGXitLEjmY3AW0KsSy5+8d3D7hXWDxDX52IExE/WafxmiHRLXatyAGmNoG6/NaWLyZW80HObuTJJCNnpSzdD1WgudUfqgTm2ByiSk9IYDtB67i3+aALW9GLrFiaHEEG/ouaA8EFUeIwmIEgVbDJoGqOe/mq4YgzYkub6x9UCM5aPWG1bWL1YXFwNqGQU8N49JT2E+0DpDXRG8CZjO9jPJXNF8yQeolbWIMRExo2gEeHle5wa42se4DO2eQzAz+SE5gzAIOy+xYsUoJrVWBjXGiFW4ylcDXcZEkCT11jHRIVsE0mNUC8SBB45OWlitheS2zwUE8bQ41xSuIwhbAaDH6oPhJSb6WqczO4wR5LSxVMcSpHiitjEOYYy22JnyTIxE+vfiYnqAsWIiARa7bLSRuRhXaRYnosdOYg9VixJOSpHvIFV7pyy22KC6rOUePksWJgCQ4la7M7vgsWLFtrNkL/9k=");

        //Setting up ImageView so that img can be properly displayed
        ImageView imgView = new ImageView();
        imgView.setX(100);
        imgView.setLayoutY(100);     
        
        count = 0;
        textCount = new Text("Times pushed: 0");        
        
        //Buttons set up and placed
        Button button1 = new Button("Image 1");
        button1.setLayoutX(50);
        button1.setLayoutY(250);
        Button button2 = new Button("Image 2");
        button2.setLayoutX(200);
        button2.setLayoutY(250);
        button1.setOnAction(event->{processButtonPress1(imgView, img1);});
        button2.setOnAction(event->{processButtonPress2(imgView, img2);});
      
        //Pane for project set up       
        FlowPane pane = new FlowPane(imgView, button1, button2, textCount);
        pane.setAlignment(Pos.BOTTOM_CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: lightgray");
       
        Scene scene = new Scene(pane, 350, 300);        
        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();
        
    }

    //Button event for button 1 created    
    private void processButtonPress1(ImageView imgView, Image img1)
    {
        
        count++;
        textCount.setText("Times pushed: " + count);
        imgView.setImage(img1);
    }
    
    //Button event for button 2 created        
    private void processButtonPress2(ImageView imgView, Image img2)
    {
        
        count++;
        textCount.setText("Times pushed: " + count);
        imgView.setImage(img2);
    }
    
    
}
