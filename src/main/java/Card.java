class Card implements Comparable<Card>{

    String name;
    String suit;
    
    public Card(String name, String suit){
        this.name = name;
        this.suit = suit;
    }

    public String getName(){
        return this.name;
    }

    public String getSuit(){
        return this.suit;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    @Override
    public String toString(){
        return this.name+" of "+this.suit;
    }

    @Override
    public int compareTo(Card cards){
        int storeName = 0;
        int storeSuit = 0;
        int storeCardSuit = 0;
        int store = 0;
        String[] suit = {"Hearts", "Clubs","Diamonds","Spades"};
        storeName = this.name.compareTo(cards.name);
        if (storeName == 0){
            for(int i =0; i<suit.length; i++){
                if(suit[i] == this.suit){
                    storeSuit = i;
                }
                if(suit[i] == cards.suit){
                    storeCardSuit = i;
                }
            }
            store = storeSuit - storeCardSuit;
        }
        return storeName + store;
    }
}