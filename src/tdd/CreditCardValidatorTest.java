package tdd;

import MrChibuzoAssignment.CreditCardValidatorServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardValidatorTest {


    @Test
    public void testThatCreditCardValidatorServerExist(){
        CreditCardValidatorServer creditCard = new CreditCardValidatorServer();
        Assertions.assertNotNull(creditCard);
    }

    @Test
    public void testThatCreditCardDigitsItUpTo13To16(){
        String digit = "4235678876432";
        Assertions.assertEquals(digit.length(), CreditCardValidatorServer.cardLength(digit));
    }
    @Test
    public void testThatVisaCardsMustStartWith4AndDigitMustBeUpTo13To16(){
        String digit = "4235678876432";
        Assertions.assertEquals(digit.length(), CreditCardValidatorServer.cardLength(digit));
        Assertions.assertEquals(4, CreditCardValidatorServer.visaCardFirstDigit(digit));
    }
    @Test
    public void testThatMasterCardsMustStartWith5AndDigitMustBeUpTo13To16(){
        String digit = "5235678876432";
        Assertions.assertEquals(digit.length(), CreditCardValidatorServer.cardLength(digit));
        Assertions.assertEquals(5, CreditCardValidatorServer.masterCardFirstDigit(digit));
    }

    @Test
    public void testThatAmericaExpressCardsMustStartWith37AndDigitMustBeUpTo13To16(){
        String digit = "37635678876432";
        Assertions.assertEquals(digit.length(), CreditCardValidatorServer.cardLength(digit));
        Assertions.assertEquals(37, CreditCardValidatorServer.americaExpressCardsFirstDigit(digit));
    }

    @Test
    public void testThatDiscoverCardsMustStartWith37AndDigitMustBeUpTo13To16(){
        String digit = "68635678876432";
        Assertions.assertEquals(digit.length(), CreditCardValidatorServer.cardLength(digit));
        Assertions.assertEquals(6, CreditCardValidatorServer.discoverCardsFirstDigit(digit));
    }
    @Test
    public void testEvenPlaceDigitAndAdd(){
      String digit = "4388576018402626";
      Assertions.assertEquals(37, CreditCardValidatorServer.evenPlace(digit));
   }
   @Test
    public void testOddPlaceDigitAndAdd(){
        String digit = "4388576018402626";
       Assertions.assertEquals(38, CreditCardValidatorServer.oddPlace(digit));
   }
   @Test
    public void testSumOddAndEvenPlacedDigit(){
        String digit = "4388576018402626";
        Assertions.assertEquals(75, CreditCardValidatorServer.sumOddAndEven(digit));
   }



}
