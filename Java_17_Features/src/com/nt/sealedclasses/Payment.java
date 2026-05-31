package com.nt.sealedclasses;


public sealed class Payment permits Cash,CreditCard,Upi{

}
