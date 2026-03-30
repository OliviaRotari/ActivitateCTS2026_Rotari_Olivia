public interface ICont {
        ICont clone();
        void setNumeClient(String numeClient);
        void setIBAN(String IBAN);
        void setValuta(Valuta valuta);
        void setSold(float sold);
}
