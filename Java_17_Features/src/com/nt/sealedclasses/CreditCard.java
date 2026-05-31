package com.nt.sealedclasses;


public sealed class CreditCard extends Payment permits AmexCreditCard{

}
